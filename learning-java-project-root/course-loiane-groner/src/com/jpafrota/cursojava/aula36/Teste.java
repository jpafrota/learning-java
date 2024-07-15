package com.jpafrota.cursojava.aula36;

public class Teste {

	public static void imprimir(String variavel) {
		
		System.out.println(variavel);
		
	}
	
	public static void main(String[] args) {

		Contato contato = new Contato();
		
		contato.setNome("Jorge");
		
		Telefone telefone1 = new Telefone();
		
		telefone1.setDdd("92");
		telefone1.setTipo("casa");
		telefone1.setNumero("98419-1630");
		
		Telefone telefone2 = new Telefone();
		
		telefone2.setDdd("92");
		telefone2.setTipo("comercial");
		telefone2.setNumero("98116-0826");
		
		Telefone[] telefones = new Telefone[2];
		telefones[0] = telefone1;
		telefones[1] = telefone2;
		
		contato.setTelefones(telefones);
		
		Endereco end = new Endereco();
		
		end.setNomeRua("Game of thrones");
		end.setNumero("2");
		end.setComplemento("teste");
		end.setCidade("Kingslanding");
		end.setEstado("Westeros");
		end.setCep("99999999");
		
		contato.setEndereco(end );
		
		imprimir(contato.getNome());
		
		if(contato != null && contato.getEndereco() != null) {
			imprimir(contato.getEndereco().getCep());
		}
		
		if(contato != null & contato.getTelefones() != null) {
			for(Telefone t : contato.getTelefones()) {
				imprimir(t.getNumero());
			}
		}
		
	}

}
