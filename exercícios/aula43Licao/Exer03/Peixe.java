package com.igor.cursojava.aula43Licao.Exer03;

public class Peixe extends Animal{
	
	private String caracteristica;
	
	public Peixe() {
		super();
		this.setPatas(0);
		this.setAmbiente("Mar");
		this.setCor("Cinzenta");
		this.caracteristica = "Barbatanas e ccauda";
	}

	public String getCaracteristica() {
		return caracteristica;
	}

	public void setCaracteristica(String caracteristica) {
		this.caracteristica = caracteristica;
	}

	public String toString() {
		String s = super.toString();
		s += "\nCaracteristica: " + caracteristica;
		return s;
				
	}
}
