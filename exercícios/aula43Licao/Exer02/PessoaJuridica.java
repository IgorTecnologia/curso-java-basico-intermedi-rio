package com.igor.cursojava.aula43Licao.Exer02;

public class PessoaJuridica extends Contribuinte {
	
	private String cnpj;

	public String getCnpj() {
		return cnpj;
	}

	public void setCpj(String cnpj) {
		this.cnpj = cnpj;
	}

	@Override
	public double calcularImposto() {
		return this.getRendaBruta() * 0.1;
		// return (this.getRendaBruta()/100 * 10; assim também está certo.
	}
	
	public String toString() {
		String s = "Pessoa Jurídica[";
		s += super.toString();
		s += "; CNPJ: " + cnpj;
		s += "; imposto a ser pago: " + calcularImposto();
		s += "]";
		return s;
}
}