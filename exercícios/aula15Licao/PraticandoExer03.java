package com.igor.cursojava.aula15Licao;

import java.util.Scanner;

public class PraticandoExer03 {

	public static void main(String [] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com 'f' para femenino ou 'm' para masculino");
		String output = scan.next();
		
		if(output.equalsIgnoreCase("f")) {
			System.out.println("Femenino");
		}else if (output.equalsIgnoreCase("m")){
			System.out.println("Masculino");
			}else {
				System.out.println("Comando inválido");
			}
		}
	}

