package com.igor.cursojava.aula54;

public class Data {
	
	private int dia;
	private int mes;
	private int ano;
	
	public Data() {
		super();
		
	}
	public Data(int dia, int mes, int ano, com.igor.cursojava.aula54.DiaSemana diaSemana) {
		super();
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
		DiaSemana = diaSemana;
	}
	public int getDia() {
		return dia;
	}
	public void setDia(int dia) {
		this.dia = dia;
	}
	public int getMes() {
		return mes;
	}
	public void setMes(int mes) {
		this.mes = mes;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public DiaSemana getDiaSemana() {
		return DiaSemana;
	}
	public void setDiaSemana(DiaSemana diaSemana) {
		DiaSemana = diaSemana;
	}
	private DiaSemana DiaSemana;
}
