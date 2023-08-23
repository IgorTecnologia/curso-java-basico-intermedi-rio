package com.igor.cursojava.aula27Licao;

public class ContaCorrente {
	
	String numConta;
	String agencia;
	double saldo;
	boolean especial = true;
	double limiteEspecial;
	double valorEspecialUsado;
	
	boolean realizarSaque(double quantiaASacar) {
		
		// tem saldo na conta.
		
		if (saldo >= quantiaASacar) {
			saldo -= quantiaASacar;
			return true;
		}else {
			if(especial) {
				//verificar se o limite especial tem saldo.
			double limite = limiteEspecial + saldo;
			if(limite >= quantiaASacar ) {
			saldo -= quantiaASacar;
				return true;
			}else {
				return false;
			}
			}else { 
				return false; // não é especial e não tem saldo suficiente.
			}
		}
	}
	void depositar(double valorDepositado) {
		saldo += valorDepositado;
	
}
	void consultarSaldo() {
		System.out.println("Saldo atual da conta = " + saldo);
	}
	boolean verificarUsoChequeEspecial() {
		return saldo < 0;
	}
}