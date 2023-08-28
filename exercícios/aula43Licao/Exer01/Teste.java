package com.igor.cursojava.aula43Licao.Exer01;

public class Teste {
	
	public static void main (String [] args) {
		
		
		System.out.println("*** Teste ContaBancaria ***");
	
		ContaBancaria contaSimples = new ContaBancaria();
		contaSimples.setNomeCliente("Igor");
		contaSimples.setNumConta("111.222.333");
		
		
		contaSimples.depositar(100);
		
		realizarSaque(contaSimples, 50);
		
		realizarSaque(contaSimples, 70);
		
		System.out.println(contaSimples);
		
		System.out.println("*** Teste ContaPoupança ***");
		
		ContaPoupanca contaPoupança = new ContaPoupanca();
		contaPoupança.setNomeCliente("Tomás");
		contaPoupança.setNumConta("222.333.444");
		contaPoupança.setDiaRendimento(27);
		
		contaPoupança.depositar(100);
		
		realizarSaque(contaPoupança, 50);
		
		realizarSaque(contaPoupança, 70);
		
		if(contaPoupança.calcularNovoSaldo(0.5)) {
			System.out.println("Rendimento aplicado, novo saldo é de = " + contaPoupança.getSaldo());
		}else {
			System.out.println("Hoje não é dia de rendimento, novo saldo não calculado");
		}
		System.out.println(contaPoupança);
		
		System.out.println("*** Teste ContaEspecial ***");
		
		ContaEspecial contaEspecial = new ContaEspecial();
		
		contaEspecial.setNomeCliente("Nanci");
		contaEspecial.setNumConta("333.444.555");
		contaEspecial.setLimite(50);
		
		contaEspecial.depositar(100);
		
		realizarSaque(contaEspecial, 50);
		
		realizarSaque(contaEspecial, 70);
		
		realizarSaque(contaEspecial, 80);
		
		System.out.println(contaEspecial);
	}
		private static void realizarSaque(ContaBancaria conta, double valor) {
			if (conta.sacar(valor)) {
				System.out.println("Saque efetuado com sucesso, novo saldo = " + conta.getSaldo());
			}else {
				System.out.println("Saldo insuficiente para saque de " + valor + "; saldo de = " + conta.getSaldo());
			}
			}
		
		
	}

