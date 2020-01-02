package com.algaworks.listeners;

import java.util.List;

import com.algaworks.model.Lancamento;
import com.algaworks.model.Produto;
import com.algaworks.notifier.Notificador;

public class CasasBahiaListener implements Listener {

	private Notificador notificador;
	
	public CasasBahiaListener(Notificador notificador) {
		this.notificador = notificador;
		this.notificador.registrarListener(this);
    }

	@Override
    public void atualizar() {
		List<Produto> listaProdutos = this.notificador.getListaProdutos();
		
		for (Produto produto : listaProdutos) {
			if(produto.getEstabelecimento().contentEquals("CasasBahia")) {
				System.out.println("Enviando e-mail para caminhao Casas Bahia " + produto.getNome() + " " + produto.getPreco());
			}
		}
		
		// this.notificador.removerListener(this);
    }

}
