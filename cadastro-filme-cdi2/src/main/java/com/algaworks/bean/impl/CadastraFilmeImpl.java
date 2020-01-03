package com.algaworks.bean.impl;

import javax.inject.Inject;

import com.algaworks.bean.CadastraFilmeService;
import com.algaworks.bean.CalculaData;
import com.algaworks.model.Filme;
import com.algaworks.repository.FilmeRepository;

public class CadastraFilmeImpl implements CadastraFilmeService {

	@Inject
	private FilmeRepository pedidosVendas;
	
	@Inject
	private CalculaData calculaData;

	@Override
    public void salvar(Filme pedidoVenda) {
		
		String tipo = calculaData.calcular(pedidoVenda.getData());
		pedidoVenda.setTipo(tipo);
		
		pedidosVendas.salvar(pedidoVenda);
	}

}
