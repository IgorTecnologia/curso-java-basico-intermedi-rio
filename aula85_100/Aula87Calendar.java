package com.igor.cursojava.aula85_100;

import java.time.Month;
import java.util.Calendar;

public class Aula87Calendar {

	public static void main(String[] args) {
												// singleton
		Calendar hoje = Calendar.getInstance(); // getInstance ja retorna um new Calendar.
		
		int ano = hoje.get(Calendar.YEAR);
		int mes = hoje.get(Calendar.MONTH);
		int dia = hoje.get(Calendar.DAY_OF_MONTH);
		int hora = hoje.get(Calendar.HOUR_OF_DAY);
		int minutos = hoje.get(Calendar.MINUTE);
		int segundos = hoje.get(Calendar.SECOND);
		
		
		System.out.println(ano);
		System.out.println(mes);
		System.out.println(dia);
		System.out.println(hora);
		System.out.println(minutos);
		System.out.println(segundos);
		
		System.out.println(Calendar.JULY);
		
		System.out.printf("hoje é : %d/%02d/%d %02d:%02d:%02d",
				dia, (mes + 1),ano, hora, minutos, segundos);
		
		hoje.add(Calendar.DAY_OF_MONTH,1);
		hoje.add(Calendar.DAY_OF_MONTH,6);
		
		System.out.println();
		
		System.out.println(hoje.get(Calendar.DAY_OF_MONTH));
		
	}

}
