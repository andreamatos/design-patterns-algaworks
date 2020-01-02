package com.algaworks.notifier;

import java.util.List;

import com.algaworks.listeners.Listener;
import com.algaworks.model.Lancamento;
import com.algaworks.model.Produto;

public interface Notificador {

	public void registrarListener(Listener listener);
	public void removerListener(Listener listener);
	public void notificarListeners();
	public void novosProdutos(List<Produto> listaProdutos);
	public List<Produto> getListaProdutos();
	
}
