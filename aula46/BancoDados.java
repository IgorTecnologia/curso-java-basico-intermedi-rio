package com.igor.cursojava.aula46;

public interface BancoDados  extends SqlDCL, SqlDML, SqlDDL{
	
	void abrirConexao();
	void fecharConexao();
}
