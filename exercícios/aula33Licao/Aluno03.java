package com.igor.cursojava.aula33Licao;

public class Aluno03 {
	
	private String nome;
	private String matricula;
	private String nomeCurso;
	private String[] nomeDiciplinas;
	private double[][] notasDiciplinas;
	
	public Aluno03() {
		nomeDiciplinas = new String [3];
		notasDiciplinas = new double [3][4];
	}
	public Aluno03 (String nome, String matricula, String nomeCurso) {
		this.nome = nome;
		this.matricula = matricula;
		this.nomeCurso = nomeCurso;
		this.nomeDiciplinas = new String [3];
		this.notasDiciplinas = new double [3][4];
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getNomeCurso() {
		return nomeCurso;
	}
	public void setNomeCurso(String nomeCurso) {
		this.nomeCurso = nomeCurso;
	}
	public String[] getNomeDiciplinas() {
		return nomeDiciplinas;
	}
	public void setNomeDiciplinas(String[] nomeDiciplinas) {
		this.nomeDiciplinas = nomeDiciplinas;
	}
	public double[][] getNotasDiciplinas() {
		return notasDiciplinas;
	}
	public void setNotasDiciplinas(double[][] notasDiciplinas) {
		this.notasDiciplinas = notasDiciplinas;
	}
	
	public void mostrarInfo() {
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
	
	public boolean verificarAprovado(int indice) {
		if (obterMedia(indice) >=7) {
			return true;
		}
			return false;
		}
		
		private double obterMedia(int indice) {
		
		double soma = 0;
		
		for (int i=0; i<notasDiciplinas[indice].length; i++)	{
			soma += notasDiciplinas[indice][i];
		}
		
		double media = soma / 4;
		
		return media;
	}
	
	public void setNomeDiciplinaPos(int pos, String nomeDiciplina) {
		this.nomeDiciplinas [pos] = nomeDiciplina;
	}
	
	public void setNomePosIJ (int posI, int posJ, double nota) {
		this.notasDiciplinas[posI][posJ] = nota;
	}

}
	


		

