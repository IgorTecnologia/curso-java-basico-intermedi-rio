package com.igor.cursojava.aula17Licao;

import java.util.Scanner;

public class Exer02 {

	public static void main(String[] args) {
			
		Scanner scan = new Scanner(System.in);
		
		boolean infoValidas = false;
		String usuario; // posso declarar aqui e usar apenas o nome la embaixo.
		String senha;
		do {
			
		
		System.out.println("Usuário:");
		usuario = scan.next();
		
		System.out.println("Senha: ");
		senha = scan.next();
		
		if ( usuario.equalsIgnoreCase(senha)) {
			//infoValidas = false;
			System.out.println("Imcompativel, digite novamente: ");
		}else {
			infoValidas = true;
			System.out.println("usuario: " + usuario);
		 	System.out.println("Senha: " + senha);
		 	System.out.println("Senha e usuário validos !");
		}
		} while (!infoValidas);
		
	}
}
		