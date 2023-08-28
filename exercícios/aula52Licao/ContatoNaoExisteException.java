package com.igor.cursojava.aula52Licao;

public class ContatoNaoExisteException extends Exception {
	
	private String nomeContato;
		
	public ContatoNaoExisteException(String nomeContato) {
		this.nomeContato = nomeContato;
	}
	public String getMessage() {
		return "Contato: " + nomeContato + " Não existe na agenda !";
	}
	
}
