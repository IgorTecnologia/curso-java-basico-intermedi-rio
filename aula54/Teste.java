package com.igor.cursojava.aula54;

import com.igor.cursojava.aula54.Formulário.Genero;

public class Teste {

	public static void main(String[] args) {
		
		DiaSemana dia = DiaSemana.DOMINGO;
		System.out.println(dia.toString()+ " - " + dia.getValor());
		
		Data data = new Data(06, 9, 2023, DiaSemana.QUARTA);
		
		System.out.println(data);
		
		
	}

}
