package com.igor.cursojava.aula24Licao;

public class Exer06 {

	public static void main(String[] args) {
		
		Contato contato1 = new Contato();
		contato1.nome = "Igor";
		contato1.email = "igorgcf@outlook.com.br";
		contato1.endereco = "Sumaré/SP";
		
		contato1.telefones = new String [5];
		contato1.telefones[0] = "9999-9999";
		contato1.telefones[1] = "9999-8888";
		contato1.telefones[2] = "9999-7777";
		contato1.telefones[3] = "9999-6666";
		contato1.telefones[4] = "9999-5555";
	
		System.out.println("Contato 1 de Igor: " + contato1.telefones[0]);
		System.out.println("Contato 2 de Igor: " + contato1.telefones[1]);
		System.out.println("Contato 3 de Igor: " + contato1.telefones[2]);
		System.out.println("Contato 4 de Igor: " + contato1.telefones[3]);
		System.out.println("Contato 5 de Igor: " + contato1.telefones[4]);
	}

}
