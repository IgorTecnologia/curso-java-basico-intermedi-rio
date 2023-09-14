package com.igor.cursojava.aula64;

public class Externa {
	
	private String texto = "texto externo";
	
	public class Interna {
		
		private String texto = "texto interno";
		
		public void imprimeTexto() {
			System.out.println(texto);
			
			System.out.println(Externa.this.texto);
		}
	}

	public static void main(String[] args) {
		Externa externa = new Externa();
		Interna interna = externa.new Interna();
		
		interna.imprimeTexto();
	}
	
	
}
