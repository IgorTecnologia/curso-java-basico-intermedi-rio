package com.igor.cursojava.aula43Licao.Exer02;

public class PessoaFisica extends Contribuinte {
	
	private String cpf;

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	
	public double calcularImposto() {
		double renda = this.getRendaBruta();
		if ( renda <= 1400) {
			return 0;
		}
		else if (renda >=1400.01 && renda <= 2100){
				return (renda * 0.1 - 100);	
		}
		
		else if (renda>= 2100.01 && renda <= 2800) {
			return (renda * 0.15 - 270 );
		}
		
		else if (renda >= 2800.01 && renda <= 3600) {
			return (renda * 0.25 - 500);
		}
			// Maior que 3600.
			return (renda * 0.3 - 700);
		}
		
		
		public String toString() {
			String s ="Pessoa Fisica[";
			s +=  super.toString();
			s += "; CPF: " + cpf;
			s += "; imposto a ser pago: " + calcularImposto();
			s += "]";
			return s;
		}
		
	}
	

