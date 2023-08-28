package com.igor.cursojava.aula41;

public  class Aluno extends Pessoa { // extends é a palavra chave para uso de herança.
	
	public Aluno() {
		super(); // Super faz referência a super classe, neste caso a classe pessoa.
	}
	
	private String curso;
	private double[] notas;
	
	
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	public double[] getNotas() {
		return notas;
	}
	public void setNotas(double[] notas) {
		this.notas = notas;
	}
	
	public double calcularMedia() {
	return 0;
	}
	public boolean  verificarAprovado() {
		return true;
	}
	public void metodoQualquer() {
		super.setCPF("000000");
		this.setCPF("111111");
	}
	public Aluno(String nome, String endereco, String telefone, String curso) {
		super(nome, endereco, telefone);
		this.curso = curso; // this faz referência a própria classe.
	}
	public String obterEtiquetaEndereco() {
		//return endereco;
		String s = "Endereço do Aluno: ";
		s += this.getEndereco();
		return s;
	}
	@Override
	public void imprimirEtiquetaEndereco() {
		
		System.out.println(this.obterEtiquetaEndereco());
	}
}
