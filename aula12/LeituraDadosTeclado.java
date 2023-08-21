package com.igor.cursojava.aula12;

import java.util.Scanner;

public class LeituraDadosTeclado {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite seu nome completo:");
		String nomeCompleto = scan.nextLine(); // nextLine lê a linha inteira.
		System.out.println("Seu Nome completo é: " + nomeCompleto);
		
		System.out.println("Digite seu nome primeiro nome:");
		String primeiroNome = scan.next(); // next lê apenas uma palavra.
		System.out.println("Seu primeiro nome é: " + primeiroNome);
		
		System.out.println("Digite seu nome segundo nome:");
		String segundoNome = scan.next(); //
		System.out.println("Seu segundo nome é: " + segundoNome);
		
		System.out.println("Digite a sua idade: ");
		int idade = scan.nextInt();
		System.out.println("Sua idade é: " + idade);
		
		System.out.println("Digite sua altuta: ");
		double altura = scan.nextDouble();
		System.out.println("A sua altura é: "+ altura);
		
		System.out.println(" Digite o seu primeiro nome, idade. quantidade de filhos, altura, se te, bichinhos de estimação");
		String primeiroNome2 = scan.next();
		int idade2 = scan.nextInt();
		byte qtdFilhos = scan.nextByte();
		float altura2 = scan.nextFloat();
		boolean temPet = scan.nextBoolean();
		
		System.out.println("Você digitou os seguintes valores:");
		System.out.println("primeiroNome: " + primeiroNome2);
		System.out.println("idade: " + idade2);
		System.out.println("Quantidade de filhos: " + qtdFilhos);
		System.out.println("Altura: " + altura2);
		System.out.println("Tem bichinhho de estimação?"+ temPet);
		
	}

}
