package com.igor.cursojava.aula66;

public class Teste {

	public static void main(String[] args) {
		
		MinhaThread thread = new MinhaThread("thread #1", 600);
		
		MinhaThread thread2 = new MinhaThread("Thread #2", 900);
		
		MinhaThread thread3 = new MinhaThread("Thread #3", 500);
	}
	
	
}
