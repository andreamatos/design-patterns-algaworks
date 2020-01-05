package com.algaworks.cobranca.service;

import java.util.HashMap;
import java.util.Map;

public class CacheAgendaDAO implements AgendaDAO {
	
// no construtor receber o codigo da agenda e o cliente, este seria o cache
// para saber qual foi o ultimo codigo inserido, o codigo sera inserido incrementalmente

	private AgendaDAO agenda;

	
	private Map<Integer, String> mapa = new HashMap<>();
	
	public CacheAgendaDAO(AgendaDAO agenda) {
		this.agenda = agenda;
	}

	@Override
	public void inserir(AgendaDAO agenda) {
		agenda.inserir(agenda);
	}

	@Override
	public void buscar(AgendaDAO agenda) {
		agenda.buscar(agenda);
	}

	public AgendaDAO getAgenda() {
		return agenda;
	}

	public void setAgenda(AgendaDAO agenda) {
		this.agenda = agenda;
	}
	
}
