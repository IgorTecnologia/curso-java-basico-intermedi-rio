package com.igor.cursojava.aula15Licao;

import java.util.Scanner;

public class PraticandoExer10 {
	
	public static void main (String [] args) {
		
	
	Scanner scan = new 	Scanner (System.in);
	
	System.out.println("Entre com o seu turno de estudo ou trabalho");
	String turno = scan.next();
	
	switch(turno) {
	case "m":
	case "M": System.out.println("Bom dia !"); break;
	case "v": 
	case "V": System.out.println("Boa tarde !"); break;
	case "n": 
	case "N": System.out.println("Boa noite !"); break;
	default : System.out.println("Turno inválido");
	}
}
}