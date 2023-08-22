package com.igor.cursojava.aula15Licao;

import java.util.Scanner;

public class Exer12 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
	
		System.out.println("Digite o valor da hora: ");
		double valorHora = scan.nextDouble();
		
		System.out.println("Digite a quantidade de hora (s) :");
		double qtdHoras = scan.nextDouble();
		
		double salarioBruto = valorHora * qtdHoras;
		
		int percentualIR = 0;
		
		if (salarioBruto <= 900) {
			percentualIR = 0;
		}else if (salarioBruto > 900 && salarioBruto <= 1500) {
			percentualIR = 5;
		}else if (salarioBruto > 1500 && salarioBruto <= 2500) {
			percentualIR = 10;
		}else if (salarioBruto > 2500 ) {
			percentualIR = 20;
		}
		double ir = salarioBruto / 100 * percentualIR;
		double inss = salarioBruto / 100 * 10;
		double fgts = salarioBruto / 100 * 11;
		double totalDescontos = ir + inss;
		double salarioLiquido = salarioBruto - totalDescontos;
		
		System.out.println("Salario Bruto: " +"[ValorHora: " + valorHora + " R$" + " * " + "QtdHoras: " + qtdHoras + " h  = " + salarioBruto + " R$");
		System.out.println("(-) IR (" + percentualIR + "% ):" + ir + " R$"); 
		System.out.println("(-) INSS (10%): " + inss + " R$");
		System.out.println("FGTS (11%): " + fgts + " R$");
		System.out.println("Total de descontos:" + totalDescontos + " R$");
		System.out.println("Salário liquido: " + salarioLiquido + " R$");
	}
}


