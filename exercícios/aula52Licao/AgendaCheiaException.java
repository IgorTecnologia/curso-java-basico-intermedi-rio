package com.igor.cursojava.aula52Licao;

public class AgendaCheiaException extends Exception {
	
	public String getMessage() {
		return "Agenda já está cheia";
	}
}
