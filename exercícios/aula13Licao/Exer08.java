package com.igor.cursojava.aula13Licao;
import java.util.Scanner;
public class Exer08 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Quanto você ganha por hora ? ");
		double valorPorHora = scan.nextDouble();
		
		System.out.println("Quantidade de horas trabalhadas no mês: ");
		double horasTrabalhadasPorMes = scan.nextDouble();
		
		double salarioMensal = (valorPorHora * horasTrabalhadasPorMes);
		System.out.println("Seu salário mensal é de : $ " + salarioMensal );
		
		// Corrigido !!!
		
	
	
	
	
	}

}
