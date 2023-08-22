package com.igor.cursojava.aula15Licao;

import java.util.Scanner;
public class Exer13 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um número:");
		int diaSemana = scan.nextInt();
		
		if (diaSemana == 1) {
		System.out.println("Domingo !");
			
		}else if (diaSemana == 2) {
		System.out.println("Segunda - feira !");
		}else if (diaSemana == 3) {
		System.out.println("Terça - feira !");
			
		}else if (diaSemana == 4) {
		System.out.println("Quarta - feira !");
			
		}else if (diaSemana == 5) {
		System.out.println("Quinta - feira !");
			
		}else if (diaSemana == 6) {
		System.out.println("Sexta - feira !");
			
		}else if (diaSemana == 7) {
		System.out.println("Sábado !");
		}else { 
		System.out.println("Valor Inválido");
		}
		}
	
}


		
	
