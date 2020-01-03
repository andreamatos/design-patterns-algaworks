package com.algaworks.repository.xml;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;

import com.algaworks.model.Filme;
import com.algaworks.repository.FilmeRepository;
import com.thoughtworks.xstream.XStream;

public class XMLCadastroFilmeRepository implements FilmeRepository {

	@Override
    public void salvar(Filme pedidoVenda) {
		XStream xstream = new XStream();
	    xstream.alias("cadastro-filme", Filme.class);
	    OutputStream out = null;
        try {
	        out = new FileOutputStream(pedidoVenda.getNome() + ".xml");
	        xstream.toXML(pedidoVenda, out);
        } catch (FileNotFoundException e) {
	        throw new RuntimeException("Erro salvando arquivo", e);
        }
    }

}
