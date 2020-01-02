package com.algaworks.repository;

import java.util.ArrayList;
import java.util.List;

import com.algaworks.model.Produto;
import com.thoughtworks.xstream.XStream;

public class Produtos {

	@SuppressWarnings("rawtypes")
	private List listaProdutos = new ArrayList<Produto>();
	
	@SuppressWarnings("unchecked")
    public List<Produto> listaProdutos() {
		XStream xstream = new XStream();
	    xstream.alias("produtos", List.class);
	    xstream.alias("produto", Produto.class);
	    
    	System.out.println("Carregando arquivo: " + "lista_compras.xml");
    	List<Produto> produtosCarregados = (List<Produto>) xstream.fromXML(this.getClass().getResource("/" + "lista_compras.xml"));
    	
    	for (Produto produto : produtosCarregados) {
    		listaProdutos.add(new Produto(produto.getEstabelecimento(), produto.getNome(), produto.getPreco()));
    	}
    	
		return listaProdutos;
	}
}
