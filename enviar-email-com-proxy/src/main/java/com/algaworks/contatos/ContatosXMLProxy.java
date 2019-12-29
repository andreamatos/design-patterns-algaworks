package com.algaworks.contatos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

import com.algaworks.repository.Contatos;

public class ContatosXMLProxy implements Contatos {

	private ContatosXML contatosXML;
	private List<String> emailsParaEnvio;
	
	public ContatosXMLProxy() {
	}

	public ContatosXMLProxy(String... emails) {
		this.emailsParaEnvio = new ArrayList<>(Arrays.asList(emails));
	}
	
	@Override
	public String enviarEmail(String... emails) {
		String nome = null;
		Random random = new Random();
		
		this.emailsParaEnvio = new ArrayList<>(Arrays.asList(emails));
		
		int quantidadeEmails = emailsParaEnvio.size();
		for (int i = 0; i < quantidadeEmails; i++) {
			int indiceParaPesquisa = random.nextInt(emailsParaEnvio.size());
			String email = emailsParaEnvio.remove(indiceParaPesquisa);
			
			this.contatosXML = new ContatosXML(email);
			
			if (this.contatosXML.listaNegra.equals("nao")) {
				nome = this.contatosXML.enviarEmail(emails);
			}
			
			if (nome != null) break;
		}
		
		return nome;
	}

}
