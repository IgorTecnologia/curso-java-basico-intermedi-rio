package com.igor.cursojava.aula15;
import java.util.Scanner;
public class SwitchCase {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite um dia da semana: ");
		int diaSemana = scan.nextInt();
		
		if (diaSemana == 1) {
			System.out.println("Domingo!");
		} else if (diaSemana == 2) {
			System.out.println("segunda!");
		}else if (diaSemana == 3) {
			System.out.println("terça!");
		}else if (diaSemana == 4) {
			System.out.println("quarta!");
		}else if (diaSemana == 5) {
			System.out.println("quinta!");
		}else if (diaSemana == 6) {
			System.out.println("sexta!");
		}else if (diaSemana == 7) {
			System.out.println("sábado!");
		}else if(diaSemana >=8) {
			System.out.println("Dia de semana inválido!");
											
		}
	
		switch (diaSemana) {
		case 1: System.out.println("domingo!"); break; // o break é como se fosse fechar o parênteses.
		case 2: System.out.println("segunda!"); break; // o programa é executado até encontrar um break.
		case 3: System.out.println("terça!"); break;
		case 4: System.out.println("quarta!"); break;
		case 5: System.out.println("quinta!"); break;
		case 6: System.out.println("sexta!"); break;
		case 7: System.out.println("sábado!"); break;
		default: System.out.println("Dia da semana inválido!");
		
		}
		
		switch (diaSemana) {
		case 2: 
		case 3: 
		case 4: 
		case 5: 
		case 6: System.out.println("Dia útil!"); break;
		case 1:
		case 7: System.out.println("Fim de semana!"); break;
		default: System.out.println("Dia da semana inválido!");
		
		}
		
	
	}
			
}


			
			
								
	
					

