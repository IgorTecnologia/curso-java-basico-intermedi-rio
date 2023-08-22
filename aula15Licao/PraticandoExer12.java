package com.igor.cursojava.aula15Licao;

import java.util.Scanner;

public class PraticandoExer12 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com o valor da hora");
		double valorHora = scan.nextDouble();
		
		System.out.println("Entre com a quantidade de horas");
		double qtdHoras = scan.nextDouble();
		
		double salarioBruto = valorHora * qtdHoras;
		
		double percentualIR = 0;
		
		if (salarioBruto <= 900) {
			percentualIR = 0;
		}else if(salarioBruto >900 && salarioBruto <= 1500) {
			percentualIR = 5;
		}else if ( salarioBruto <= 1500 && salarioBruto <= 2500) {
			percentualIR = 10;
		}else if (salarioBruto > 2500) {
			percentualIR = 20;
		}
		double ir = salarioBruto / 100 * percentualIR;
		double inss = salarioBruto / 100 * 10;
		double fgts = salarioBruto / 100 * 11;
		double totalDescontos = ir + inss;
		double salarioLiquido = salarioBruto - totalDescontos;
		
		System.out.println("Salário bruto: [ ValorHora: " + valorHora +" R$" + " qtdHoras: " + qtdHoras + " h" + " salárioBruto: " + salarioBruto + " R$");
		System.out.println("(-) IR (" + percentualIR + " % ) " + ir +" R$");
		System.out.println("(-) INSS (10%) " + inss + " R$");
		System.out.println("FGTS (11%) " + fgts + " R$");
		System.out.println("Total de descontos: " + totalDescontos);
		System.out.println("Salário liquído: " + salarioLiquido);
	}
}
