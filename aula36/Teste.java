package com.igor.cursojava.aula36;

public class Teste {

	public static void main(String[] args) {
		
		Contato contato = new Contato ();
		contato.setNome("Tyrion");
		// contato.setEndereco("Kings landing");
		// contato.setTelefone("11 99999 - 9999");
		
		// criar objeto endereco
		Endereco end =  new Endereco();
		end.setNomeRua("Rua Game of Thrones");
		end.setNumero("n/a");
		end.setComplemento(" - ");
		end.setCidade("kings Landing");
		end.setEstado("Westeros");
		end.setCep("9999999");
		
		contato.setEndereco(end);
		
		// Relacionamento tem-um telefone
		Telefone tel = new Telefone ();
		tel.setTipo(" Celular ");
		tel.setDdd("11 ");
		tel.setNumero("99999 - 9999");
		
		Telefone tel2 = new Telefone ();
		tel2.setTipo(" Celular ");
		tel2.setDdd("11 ");
		tel2.setNumero("88888 - 8888");
		
		Telefone [] telefones = new Telefone[2];
		telefones[0] =  tel;
		telefones[1] =  tel2;
		
		//contato.setTelefone(tel);
		contato.setTelefones(telefones);
		
		// Teste saída no console
		System.out.println(contato.getNome());
		
		System.out.println(end.getNomeRua());
		
		if (contato != null && contato.getEndereco() != null) {
			System.out.println(contato.getEndereco().getCidade());
		}
		
	/*	if (contato != null && contato.getTelefone() != null) {
			System.out.println(contato.getTelefone().getDdd()  + contato.getTelefone().getNumero());
		}*/
		
		if (contato != null && contato.getTelefones() != null) {
			for ( Telefone t: contato.getTelefones()) {
				System.out.println(t.getDdd() + " " + t.getNumero());
				
			}
		}
	}

}
