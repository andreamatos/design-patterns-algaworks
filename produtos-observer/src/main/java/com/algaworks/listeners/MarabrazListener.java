package com.algaworks.listeners;

import java.util.List;

import com.algaworks.model.Lancamento;
import com.algaworks.model.Produto;
import com.algaworks.notifier.Notificador;

public class MarabrazListener implements Listener {

	private Notificador notificador;
	
	public MarabrazListener(Notificador notificador) {
		this.notificador = notificador;
		this.notificador.registrarListener(this);
    }

	@Override
    public void atualizar() {
		List<Produto> listaProdutos = this.notificador.getListaProdutos();
		
		for (Produto produto : listaProdutos) {
			if(produto.getEstabelecimento().equals("Marabraz")) {
			System.out.println("Enviando e-mail para caminhao Marabraz " + produto.getNome() + " " + produto.getPreco());
			}
		}
		
		// this.notificador.removerListener(this);
    }

}
