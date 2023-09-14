package com.igor.cursojava.aula54;

public class Formulário {

		enum Genero {
			FEMENINO('F'), MASCULINO('M');
			
			private char valor;
			
			Genero(char valor){
				this.valor = valor;
				
				
			}
		}
	
	
	
	private String nome;
	private Genero genero;
}
