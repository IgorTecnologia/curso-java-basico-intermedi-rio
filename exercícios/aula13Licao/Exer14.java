package com.igor.cursojava.aula13Licao;
import java.util.Scanner;
public class Exer14 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o tamanho do arquivo: ");
		double tamanhoArquivo = scan.nextDouble();
		
		System.out.println("Digite a velocidade da internet: ");
		double velocidadeNet = scan.nextDouble();
		
		
		double tempoDownload = (tamanhoArquivo / velocidadeNet);
		
		System.out.println("Tempo de donwload: " + tempoDownload);
	}

}
