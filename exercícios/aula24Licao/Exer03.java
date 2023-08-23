package com.igor.cursojava.aula24Licao;

public class Exer03 {

	public static void main(String[] args) {
		
		LivroLivraria livro = new LivroLivraria ();
		
		livro.nome = "Mestre SweepPinckg";
		livro.autor = "Igor Gonçalves";
		livro.anoLancamento = 2023;
		livro.preco = 99.99;
		
		System.out.println("Nome do livro: " + livro.nome);
	}	

}
