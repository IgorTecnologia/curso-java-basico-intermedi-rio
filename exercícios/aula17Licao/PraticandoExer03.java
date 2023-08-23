package com.igor.cursojava.aula17Licao;

import java.util.Scanner;

public class PraticandoExer03 {

	public static void main(String[] args) {
		
	Scanner scan = new Scanner (System.in);
	
	boolean infoValida = false;
	String  nome, sexo, estado;
	int idade;
	double salario;
	
	do {
		System.out.println("Entre com o nome: ");
		nome = scan.next();
		if (nome.length() > 3) {
		infoValida = true;
		}else {
			System.out.println("Informação inválida, nome maior que 3 caracteres!");
		}
	}while(!infoValida);
	
	infoValida = false;
	do {
		System.out.println("Entre com a idade:");
		idade = scan.nextInt();
		if(idade >0) {
			infoValida = true;
		}else {
			System.out.println("Idade inválida, digite uma idade maior ou igual a 0");
		}
	}while(!infoValida);
		
	infoValida = false;
	do {
		System.out.println("Entre com o sexo 'm' ou 'f':");
		sexo = scan.next();
		if(sexo.equalsIgnoreCase("m") || sexo.equalsIgnoreCase("f")) {
			infoValida = true;
		}else {
			System.out.println("Informação invalida entre com 'm' ou 'f'");
		}
	}while(!infoValida);
	
	infoValida = false;
	do {
		System.out.println("Entre com estado civil 's' 'c' 'v' 'd':");
		estado = scan.next();
		if (estado.equalsIgnoreCase("s") || estado.equalsIgnoreCase("c") || estado.equalsIgnoreCase("v") || estado.equalsIgnoreCase("d")) {
			infoValida = true;
		}else {
			System.out.println("Informação inválida, entre com estado civil 's' 'c' 'v' 'd': ");
		}
	}while(!infoValida);
	
	infoValida = false;
	do {
		System.out.println("Entre com o salário:");
		salario= scan.nextDouble();
		if(salario >0) {
			infoValida = true;
		}else {
			System.out.println("Informação inválida, entre com um valor maior que 0");
		}
	}while (!infoValida);
	
		System.out.println("Informações adquiridas:");
		System.out.println("Nome: " + nome);
		System.out.println("Idade: " + idade);
		System.out.println("Sexo: " + sexo);
		System.out.println("Estado: " + estado);
		System.out.println("Salário: " + salario + " R$");
	} 

}
