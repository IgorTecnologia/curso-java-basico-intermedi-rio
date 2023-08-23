package com.igor.cursojava.aula20Licao;

import java.util.Scanner;

public class Exer05 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String [] [] [] compromissos = new String [12] [32] [8];
	
		boolean sair = false;
		byte opcao;
		
		while(!sair) {
			
			System.out.println("Digite 1 para adicionar compromisso.");
			System.out.println("Digite 2 para verificar compromisso.");
			System.out.println("Digite 0 para para sair.");
			
			opcao = scan.nextByte();
		
			if(opcao == 1) { // adicionar comprmisso
				
				boolean mesValido = false;
				int mes =0;
				while(!mesValido) {
					System.out.println("Entre com o mês");
					mes = scan.nextInt();
					if (mes >0 && mes<= 12) {
						mesValido = true;
					}else {
						System.out.println("Mês inválido, digite novamente");
					}
				}
				
				boolean diaValido = false;
				int dia =0;
				while(!diaValido) {
					System.out.println("Entre com o dia do mês");
					dia = scan.nextInt();
					if (dia >0 && dia<= 31) {
						diaValido = true;
					}else {
						System.out.println("Dia inválido, digite novamente");
					}
				}
					boolean horaValida = false;
					int hora =0;
					while(!horaValida) {
						System.out.println("Entre com a hora do compromisso");
						hora = scan.nextInt();
						if (hora >=0 && hora<= 8) {
							horaValida = true;
						}else {
							System.out.println("hora inválida, digite novamente");
						}
			
					}
						
						mes--;
						System.out.println("Digite o compromisso");
						compromissos[mes][dia][hora] = scan.next();
		
					}else if (opcao ==2) { // vetificar compromisso
						
						boolean mesValido = false;
						int mes =0;
						while(!mesValido) {
							System.out.println("Entre com o mês");
							mes = scan.nextInt();
							if (mes >0 && mes<= 12) {
								mesValido = true;
							}else {
								System.out.println("Mês inválido, digite novamente");
							}
						}
						
						boolean diaValido = false;
						int dia =0;
						while(!diaValido) {
							System.out.println("Entre com o dia do mês");
							dia = scan.nextInt();
							if (dia >0 && dia<= 31) {
								diaValido = true;
							}else {
								System.out.println("Dia inválido, digite novamente");
							}
						}
							boolean horaValida = false;
							int hora =0;
							while(!horaValida) {
								System.out.println("Entre com a hora do compromisso");
								hora = scan.nextInt();
								if (hora >=0 && hora<= 24) {
									horaValida = true;
								}else {
									System.out.println("hora inválida, digite novamente");
								}
					
							}
					
						mes --;
						System.out.println("O compromisso agendado é:");
						System.out.println(compromissos[mes] [dia][hora] ) ;
						System.out.println("Dia " + dia  +" Hora " + hora);
					
					}else if (opcao ==0) {
						sair = true;
					}else {
						System.out.println("Opção inválida, digite novamente");
			
					
		}
	}
	}
}
