package com.igor.cursojava.aula27Licao;

import com.igor.cursojava.aula27Licao.ContaCorrente;

public class Exer02 {

	public static void main(String[] args) {
		
		ContaCorrente contaCorrente = new ContaCorrente();
		
		contaCorrente.numConta = "001.002.003";
		contaCorrente.agencia = "002.002.002";
		contaCorrente.especial = true;
		contaCorrente.limiteEspecial = 500;
		contaCorrente.saldo = -10;
		contaCorrente.valorEspecialUsado = 0;
		
		System.out.println("Saldo da conta " + contaCorrente.numConta + " = " + contaCorrente.saldo);
	
		boolean saqueEfetuado = contaCorrente.realizarSaque(10);
		
		if ( saqueEfetuado) {
			System.out.println("Saque efetuado com sucesso");
			contaCorrente.consultarSaldo();
		}else {
			System.out.println("Não foi possível realizar saque. Saldo insuficiente");
		}
		saqueEfetuado = contaCorrente.realizarSaque(500);
		System.out.println("Tentativa de saque de 500 reais");
		if ( saqueEfetuado) {
			System.out.println("Saque efetuado com sucesso");
			contaCorrente.consultarSaldo();
		}else {
			System.out.println("Não foi possível realizar saque. Saldo insuficiente");
		}
		System.out.println("Depósito de 500 reais");
		contaCorrente.depositar(500);
		contaCorrente.consultarSaldo();
	
		if(contaCorrente.verificarUsoChequeEspecial()) {
			System.out.println("Está usando cheque especial");
		}else {
			System.out.println("Não está usando cheque especial");
}
		saqueEfetuado = contaCorrente.realizarSaque(600);
		contaCorrente.consultarSaldo();
		if(contaCorrente.verificarUsoChequeEspecial()) {
			System.out.println("Está usando cheque especial");
		}else {
			System.out.println("Não está usando cheque especial");
	}
}
}
