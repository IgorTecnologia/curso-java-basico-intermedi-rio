package com.igor.cursojava.aula85_100;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import com.igor.cursojava.aula54.Data;

public class Aula89SimpleDateFormat {

	public static void main(String[] args) {
			
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MMM/yyyy - kk:mm:ss a z");
			
		Calendar data = new GregorianCalendar(2022, 8, 28, 13, 18, 25);
		
		System.out.println(sdf.format(data.getTime()));
		
		Date hoje = new Date();
		System.out.println(sdf.format(hoje));
		
		
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		String minhaData = "28/09/2023";
		try {
			Date minhaDataEmDate = sdf1.parse(minhaData);
			System.out.println(minhaDataEmDate);
			
			System.out.println(sdf.format(minhaDataEmDate));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
