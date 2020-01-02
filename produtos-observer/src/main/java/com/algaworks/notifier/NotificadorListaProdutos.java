package com.algaworks.notifier;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.algaworks.listeners.Listener;
import com.algaworks.model.Produto;

public class NotificadorListaProdutos implements Notificador {

	private Set<Listener> listeners;
	private List<Produto> listaProdutos;
	
	public NotificadorListaProdutos() {
		this.listeners = new HashSet<>();
	}
	
	@Override
    public void registrarListener(Listener listener) {
	    this.listeners.add(listener);
    }

	@Override
    public void removerListener(Listener listener) {
	    this.listeners.remove(listener);
    }

	@Override
    public void notificarListeners() {
		for (Listener listener : listeners) {
			listener.atualizar();
		}
    }

	@Override
    public void novosProdutos(List<Produto> listaProdutos){
		this.listaProdutos = listaProdutos;
		this.notificarListeners();
    }

	@Override
    public List<Produto> getListaProdutos() {
	    return this.listaProdutos;
    }

}
