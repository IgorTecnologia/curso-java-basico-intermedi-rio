package com.igor.cursojava.aula74Licao;

import com.igor.cursojava.aula15.SwitchCase;

public class ThreadSemafaro implements Runnable {

	private CorSemafaro cor;
	private boolean parar; // por padrão todo atributo boolean é iniciado com false.
	private boolean corMudou;
	
	public ThreadSemafaro() {

		this.cor = CorSemafaro.VERMELHO;

		new Thread(this).start();
	}

	@Override
	public void run() {

		while(!parar) {
			try {
				
				Thread.sleep(this.cor.getTempoEspera());
				this.mudarCor();
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
		}
	}
	
	public CorSemafaro getCor() {
		return cor;
	}

	public void setCor(CorSemafaro cor) {
		this.cor = cor;
	}

	private synchronized void mudarCor() {
		
		switch (this.cor) {
		case VERMELHO:
			this.cor = CorSemafaro.VERDE;
			break;
		case AMARELO:
			this.cor = CorSemafaro.VERMELHO;
			break;
		case VERDE:
			this.cor = CorSemafaro.AMARELO;
			break;
			default:
				break;
		}
		this.corMudou = true;
		notify();
	}
	
	public synchronized void esperaCorMudar() {
		while(!this.corMudou) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		this.corMudou = false;
	}
		
	public synchronized void desligarSemafaro() {
		this.parar = true;
	}
}
