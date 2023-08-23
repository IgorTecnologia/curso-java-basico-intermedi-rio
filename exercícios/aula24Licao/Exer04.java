package com.igor.cursojava.aula24Licao;

import java.util.Date;

public class Exer04 {

	public static void main(String[] args) {
		
		LivroDeBiblioteca livro = new LivroDeBiblioteca();

		livro.nome = "Mestre SweepPinckg";
		livro.autor = "Igor Gonçalves";
		livro.anoLancamento = 2023;
		livro.preco = 99.99;
		livro.emprestado = true;
		livro.dataEntrega = new Date();
		livro.emprestadoA = "Vitoria";
	
		System.out.println("Nome do livro: " + livro.nome);
		System.out.println("Data de entrega: " + livro.dataEntrega);
	
	}

}
