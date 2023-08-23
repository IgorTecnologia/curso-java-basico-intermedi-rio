package com.igor.cursojava.aula17Licao;

import java.util.Scanner;

public class PraticandoExer02 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String usuario;
		String senha;
		boolean valida = false;
		
		
		do {
			System.out.println("Usuário: ");
			usuario = scan.next();
			
			System.out.println("Senha: ");
			senha = scan.next();
			
			if (usuario.equalsIgnoreCase(senha)){
				System.out.println("Usuario e senha incompativel, tente novamente !");
			valida = false;
			}else {
				valida = true;
				System.out.println("Usuário: " + usuario);
				System.out.println("Senha: " + senha);
				System.out.println("Informações validas !");
			}
		}while(!valida);
		}
	}

	


