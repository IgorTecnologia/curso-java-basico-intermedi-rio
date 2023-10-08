package com.igor.cursojava.aula85_100;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Aula94DiferencaEntreDatas {

	public static void main(String[] args) {
		
		try {
			diferencaDataAteJava7();
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		System.out.println("----------");
		diferencaDateJava8();
		
		System.out.println("------------");
		diferencaDataJava8ComTempo();
		
		System.out.println("------------");
		diferencaDataJava8ComChronoUnit();
	}
	
	public static void diferencaDataAteJava7() throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Date primeiroDt = sdf.parse("01/10/2023");
		Date segundaDt = sdf.parse("01/11/2023");
		
		long diffEmMill = Math.abs(segundaDt.getTime() - primeiroDt.getTime());
		
		long diff = TimeUnit.DAYS.convert(diffEmMill, TimeUnit.MILLISECONDS);
		
		int dias =(int) (diffEmMill / (1000 * 60 * 60 * 24));
		
		System.out.println(diff);
		System.out.println(dias);
	}
	
	public static void diferencaDateJava8() {
		LocalDate data1 = LocalDate.of(2023, 10, 01);
		LocalDate data2 = LocalDate.of(2023, 11, 10);
		
		Period periodo = Period.between(data1, data2);
		
		int dias = periodo.getDays();
		int meses = periodo.getMonths();
		int anos = periodo.getYears();
		
		System.out.println("Dias: " + dias);
		System.out.println("Meses: " + meses);
		System.out.println("Anos: " + anos);
	}
	
	public static void diferencaDataJava8ComTempo() {
		LocalDateTime data1 = LocalDateTime.of(2023, 10 , 1, 21, 44, 40);
		LocalDateTime data2 = LocalDateTime.of(2023, 10 , 1, 23, 44, 40);
		
		Duration duracao = Duration.between(data1, data2);
		long diffH = duracao.toHours();
		long diffM = duracao.toMinutes();
		System.out.println("Horas: " + diffH);
		System.out.println("Minutos: " + diffM);
		
	}
	
	public static void diferencaDataJava8ComChronoUnit() {
		LocalDateTime data1 = LocalDateTime.of(2023, 10 , 1, 21, 44, 40);
		LocalDateTime data2 = LocalDateTime.of(2023, 10 , 1, 23, 44, 40);
		
		long diff = ChronoUnit.HOURS.between(data1, data2);
		long diffDias = ChronoUnit.DAYS.between(data1, data2);
		
		System.out.println(diff);
		System.out.println(diffDias);
				
	}
}	
