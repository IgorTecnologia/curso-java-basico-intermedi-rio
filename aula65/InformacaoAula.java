package com.igor.cursojava.aula65;

@interface InformacaoAula {

	String autor();
	
	int aulaNumero();
	
	String blog() default "http://igor.com";
	
	String site() default "http://igor.com.br";
	
}
