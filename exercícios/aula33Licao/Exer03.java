package com.igor.cursojava.aula33Licao;

import java.util.Scanner;

public class Exer03 {

	public static void main(String[] args) {
		
		Aluno03 aluno03 = new Aluno03();
		
		Scanner scan = new Scanner (System.in);
		
		
		
		System.out.println("Entre com o nome do aluno");
		aluno03.setNome(scan.next());
		
		System.out.println("Entre com o nome do curso");
		aluno03.setNomeCurso (scan.next());
		
		System.out.println("Entre com a matricula");
		aluno03.setMatricula (scan.next());
		
		//aluno.nomeDiciplinas = new String [3];
		for ( int i=0; i<aluno03.getNomeDiciplinas().length; i++) {
			System.out.println("Entre com o nome da diciplina " + i);
			aluno03.setNomeDiciplinaPos(i, scan.next());
		}
		
		for ( int i=0; i<aluno03.getNotasDiciplinas().length; i++) {
			System.out.println("Obtendo notas da diciplina " + aluno03.getNomeDiciplinas()[i]);
		for ( int j=0; j<aluno03.getNotasDiciplinas()[i].length; j++) {
			System.out.println("Entre com a nota " + (j+1));
			aluno03.setNomePosIJ(i, j, scan.nextDouble());
		}
		}
		aluno03.mostrarInfo();
		
		for (int i =0; i<aluno03.getNotasDiciplinas().length; i++) {
			if (aluno03.verificarAprovado(i)) {
				System.out.println("Diciplina " + aluno03.getNomeDiciplinas()[i] + " - foi aprovado");
			}else {
				System.out.println("Diciplina " + aluno03.getNomeDiciplinas() [i] + " - reprovado");
			}
		}
	}
	}


