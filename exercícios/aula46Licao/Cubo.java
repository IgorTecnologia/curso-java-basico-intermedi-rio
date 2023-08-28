package com.igor.cursojava.aula46Licao;

public class Cubo extends Figura3D {
	
	private int lado;

	
	public double calcularArea() {
		return 6 * (lado * lado);
		// return 6 * (Math.pow(lado, 2);
	}

	
	public int getLado() {
		return lado;
	}


	public void setLado(int lado) {
		this.lado = lado;
	}


	public double calcularVolume() {
		return lado * lado * lado;
		// return Math.pow(lado, 3);
	}

}
