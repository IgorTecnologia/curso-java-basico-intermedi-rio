package com.igor.cursojava.aula17Licao;

import java.util.Scanner;

public class Exer25 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Lojas Tabajara ");
		
		boolean sair = false;
		String continuarCompra;
		int qtdProdutos;
		double preco;
		double total;
		double valorPago;
		double troco;
		String output;
		
		
		do {
			
			System.out.println("Deseja informar uma nova compra ? S/N");
			continuarCompra = scan.next();
			
			if (continuarCompra.equalsIgnoreCase("S")) {
				
				output = "Lojas Tabajara \n";
				
				System.out.println("Digite a quantidade de produtos da compra: ");
			qtdProdutos = scan.nextInt();
			
			total =0;
			
			for (int i=1; i <=qtdProdutos; i++) {
			System.out.println("informe preço do produtos " + i);
			preco = scan.nextDouble();
			total += preco;
			output += "Produto " + i + ": R$ " + preco + "\n";
			}
			
			output += "Total: R$ " + total + "\n";
			
			System.out.println("Total: R$ " + total);
			
			System.out.println("Entre com o valor pago: " );
			valorPago = scan.nextDouble();
			
			output += "Dinheiro: R$ " + valorPago + "\n" ;
			troco = total - valorPago;
			
			output += "Troco: R$ " + troco + "\n";
			
			System.out.println(output);
			
			} else {
				sair = true;
			}
			
			}while(!sair);
		
		
	}

}
