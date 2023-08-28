package com.igor.cursojava.aula46Licao;

public class Circulo extends Figura2D {
		
	private double  raio;

	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}

	@Override
	public double calcularArea() {
		return (raio * raio * Math.PI);
 		// return Math.pow(raio, 2) * Math.PI;
		
	}


}
