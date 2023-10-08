package com.igor.cursojava.aula72;

public class Teste {

	public static void main(String[] args) {
		
		TiqueTaque tt = new TiqueTaque();
		ThreadTiqueTaque tique = new ThreadTiqueTaque("tique", tt);
		ThreadTiqueTaque taque = new ThreadTiqueTaque("taque", tt);
		
		try {
			tique.t.join();
			taque.t.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

}
