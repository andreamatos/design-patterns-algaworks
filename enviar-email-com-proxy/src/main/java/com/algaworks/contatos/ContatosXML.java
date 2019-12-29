package com.algaworks.contatos;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.algaworks.model.Email;
import com.algaworks.repository.Contatos;
import com.thoughtworks.xstream.XStream;

public class ContatosXML implements Contatos {

	private Map<String, String> contatosEmCache = new HashMap<>();
	String listaNegra ="nao";
	Email contato = new Email();
	
	@SuppressWarnings("unchecked")
    public ContatosXML(String emails) {
		XStream xstream = new XStream();
	    xstream.alias("contatos", List.class);
	    xstream.alias("contato", Email.class);
	    
    	System.out.println("Carregando arquivo: " + emails);
    	
    	List<Email> contatosCarregados = (List<Email>) xstream.fromXML(this.getClass().getResource("/" + "listaNegra.xml"));
    	for (Email contato : contatosCarregados) {
    		this.contato = contato;
    		if (emails.equals(contato.getEmail())) {
    			System.out.println(emails + ": esta na lista negra de e-mails");
    			listaNegra = "sim";
    			break;
    		}
    	}
    	
    	if (listaNegra.equals("nao")) {
    		contatosEmCache.put(emails, emails);
    	}
    	
	}
	
	@Override
    public String enviarEmail(String... nomesArquivo) {
		System.out.println("enviar email: " + nomesArquivo);
	    return contatosEmCache.get(nomesArquivo);
    }

}
