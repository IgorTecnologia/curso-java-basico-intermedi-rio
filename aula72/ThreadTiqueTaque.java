package com.igor.cursojava.aula72;

public class ThreadTiqueTaque implements Runnable {

	TiqueTaque tt ;
	Thread t;
	
	final int NUM = 5;
	
	public ThreadTiqueTaque (String nome, TiqueTaque tt) {
		this.tt = tt;
		t = new Thread(this, nome);
		t.start();
	}
	
	public void run() {
		
		if (t.getName().equalsIgnoreCase("tique")){
			for ( int i=0; i <NUM; i++ ) {
				tt.tique(true);
			}
			tt.tique(false);
		}else {
			for ( int i=0; i <NUM; i++ ) {
				tt.taque(true);
			}
			tt.taque(false);
		}
		
	}
	}
