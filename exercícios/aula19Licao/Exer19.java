package com.igor.cursojava.aula19Licao;

import java.util.Scanner;

public class Exer19 {

	public static void main(String[] args) {
		
		Scanner scan = new  Scanner (System.in);
	
		double[] nota1 = new double [10];
		double[] nota2 = new double [nota1.length];
		double[] resultados = new double [nota1.length];
		
		for(int i=0; i<nota1.length; i++) {
			System.out.println("Entre com a nota 1 do aluno "+ (i+1));
			nota1[i] = scan.nextDouble();
		
			System.out.println("Entre com a nota 2 do aluno "+ (i+1));
			nota2[i] = scan.nextDouble();
		
			resultados[i] = (nota1[i] + nota2[i]) /2;
		}
		
			System.out.print("Notas 1 = ");
		for(int i=0; i<nota1.length; i++) {
			System.out.print(nota1[i] + " ");
		}
	
			System.out.println();
			
			System.out.print("Notas 2 = ");
		for(int i=0; i<nota1.length; i++) {
				System.out.print(nota2[i] + " ");
	
		}
		System.out.println();
		
		System.out.println("Resultados: ");
		for(int i=0; i<resultados.length; i++) {
			if(resultados[i] >=7) {
				System.out.println("Média: " + resultados[i] + " Aluno " + (i+1) +" - Aprovado !");
			}else 
				System.out.println("Média: " + resultados[i] + " Aluno " + (i+1) +" Reprovado !");
			}
		
	
	}
}
