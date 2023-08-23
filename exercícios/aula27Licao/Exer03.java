package com.igor.cursojava.aula27Licao;

import java.util.Scanner;

public class Exer03 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		Aluno aluno = new Aluno();
		
		System.out.println("Entre com o nome do aluno");
		aluno.nome = scan.next();
		
		System.out.println("Entre com o nome do curso");
		aluno.nomeCurso = scan.next();
		
		System.out.println("Entre com a matricula");
		aluno.matricula = scan.next();
		
		//aluno.nomeDiciplinas = new String [3];
		for ( int i=0; i<aluno.nomeDiciplinas.length; i++) {
			System.out.println("Entre com o nome da diciplina " + i);
			aluno.nomeDiciplinas[i] = scan.next();
		}
		
		for ( int i=0; i<aluno.notasDiciplinas.length; i++) {
			System.out.println("Obtendo notas da diciplina " + aluno.nomeDiciplinas[i]);
		for ( int j=0; j<aluno.notasDiciplinas[i].length; j++) {
			System.out.println("Entre com a nota " + (j+1));
			aluno.notasDiciplinas[i][j] = scan.nextDouble();
		}
		}
		aluno.mostrarInfo();
		
		for (int i =0; i<aluno.notasDiciplinas.length; i++) {
			if (aluno.verificarAprovado(i)) {
				System.out.println("Diciplina " + aluno.nomeDiciplinas[i] + " - foi aprovado");
			}else {
				System.out.println("Diciplina " + aluno.nomeDiciplinas [i] + " - reprovado");
			}
		}
	}

}
