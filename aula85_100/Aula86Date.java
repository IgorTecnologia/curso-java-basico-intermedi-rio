package com.igor.cursojava.aula85_100;

import java.util.Date;

public class Aula86Date {

	public static void main(String[] args) {
		
		Date hoje = new Date();
		
		System.out.println(hoje); // dia, mes, data, hora, ano
		
		System.out.println("Milisegundos desde 1 Jan 1970 " + hoje.getTime());
		
		System.out.println(hoje.getDate()); // data de hoje
		
	}

}
