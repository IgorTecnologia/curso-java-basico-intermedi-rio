package com.igor.cursojava.aula43Licao.Exer01;

import java.util.Calendar;

public class ContaPoupanca  extends ContaBancaria {
	
	private int diaRendimento;

	public int getDiaRendimento() {
		return diaRendimento;
	}

	public void setDiaRendimento(int diaRendimento) {
		this.diaRendimento = diaRendimento;
	}
	
	@Override
	public String toString() {
		String s ="Conta Poupança[";
		s += " Dia rendimento: " + diaRendimento +"; ";
		s += super.toString();
		s += "]";
		return s;		
	}
	public boolean calcularNovoSaldo(double taxaRendimento) {
		Calendar hoje = Calendar.getInstance(); // 'getInstance' é para obter a data de hoje no java.
		
		if(diaRendimento == hoje.get(Calendar.DAY_OF_MONTH)) {
			this.setSaldo(this.getSaldo() + this.getSaldo() * taxaRendimento);
			return true;
		}
		return false;
	}
}
