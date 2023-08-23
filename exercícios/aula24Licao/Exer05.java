package com.igor.cursojava.aula24Licao;

public class Exer05 {

	public static void main(String[] args) {
		
		ContaCorrente contaCorrente = new ContaCorrente();
		
		contaCorrente.numConta = "001.002.003";
		contaCorrente.agencia = "002.002.002";
		contaCorrente.especial = true;
		contaCorrente.limiteEspecial = 5.000;
		contaCorrente.saldo = -10;
	
		System.out.println("Saldo da conta " + contaCorrente.numConta + " = " + contaCorrente.saldo);
	} 

}
