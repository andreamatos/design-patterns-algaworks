package com.algaworks.contatos;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.algaworks.repository.Contatos;

public class ContatosXMLTest {

	@Test
	public void deveRetornarContato() {
		Contatos contatos = new ContatosXMLProxy();
	    String nome = contatos.enviarEmail("ageofempires@gmail.com", "witcher3@gmail.com","fifa@uol.com.br", "mario@gmail.com.br");
	    assertEquals("José Santos", nome);
	}
	
}
