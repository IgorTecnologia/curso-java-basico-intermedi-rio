package com.igor.cursojava.aula27Licao;

public class Aluno {
	
	String nome;
	String matricula;
	String nomeCurso;
	String[] nomeDiciplinas = new String [3];
	double[][] notasDiciplinas = new double [3][4];
	
	void mostrarInfo() {
		System.out.println("Nome: " + nome);
		System.out.println("Matrícula: " + matricula);
		System.out.println("nome do curso: " + nomeCurso);
	
		for (int i=0; i<notasDiciplinas.length; i++) {
			System.out.println("Notas da diciplina " + nomeDiciplinas[i]);
			for(int j=0; j<notasDiciplinas[i].length; j++) {
				System.out.print(notasDiciplinas [i] [j] + " ");
			}
			System.out.println();
		}
	}
		
		boolean verificarAprovado(int indice) {
		
		double soma = 0;
		
		for (int i=0; i<notasDiciplinas[indice].length; i++)	{
			soma += notasDiciplinas[indice][i];
		}
		
		double media = soma / 4;
	
		if (obterMedia(indice) >=7) {
			return true;
			// System.out.println("Aprovado e essa msg não será impresso"); não retorna, porque está abaixo do return true;
		}	// tudo que está abaixo do return não é executado, neste caso, não faz o output. 
			return false;
		}
	
		double obterMedia(int indice) {
			
			double soma = 0;
			
			for (int i=0; i<notasDiciplinas[indice].length; i++)	{
				soma += notasDiciplinas[indice][i];
			}
			
			double media = soma / 4;
			
			return media;
		}
}

