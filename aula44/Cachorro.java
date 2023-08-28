package com.igor.cursojava.aula44;

public class Cachorro extends Mamifero implements AnimalDomesticado, AnimalEstimacao{
	
	private int tamanho;
	private String raça;
	
	public int getTamanho() {
		return tamanho;
	}
	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}
	public String getRaça() {
		return raça;
	}
	public void setRaça(String raça) {
		this.raça = raça;
	}

	public void amamentar() {
	}
	
	public void emitirSom() {
	}
	@Override
	public void levarVeterinario() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void alimentar() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void brincar() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void levarPassear() {
		// TODO Auto-generated method stub
		
	}
}
