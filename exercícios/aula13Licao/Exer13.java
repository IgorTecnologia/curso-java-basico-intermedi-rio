package com.igor.cursojava.aula13Licao;
import java.util.Scanner;
public class Exer13 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Quanto você ganha por hora ? ");
		double valorPorHora = scan.nextDouble();
		
		System.out.println("Quantidade de horas trabalhadas no mês: ");
		double horasTrabalhadasPorMes = scan.nextDouble();
		
		double salarioBruto = (valorPorHora * horasTrabalhadasPorMes);
		
		double inss = (salarioBruto /100) * 8;
		double sindicato = (salarioBruto / 100) * 5;
		double ir = (salarioBruto / 100) * 11;
		double totalDescontos = inss + sindicato + ir;
		double salarioLiquido = salarioBruto - totalDescontos;
		
		System.out.println("salário bruto: " + salarioBruto);
		System.out.println("INSS: " + inss);
		System.out.println("Sindicato: " + sindicato);
		System.out.println("IR: " + ir); // imposto de renda
		System.out.println("Total descontos: " + totalDescontos);
		System.out.println("salário líquido: " + salarioLiquido);
		

	
	
	}

}
