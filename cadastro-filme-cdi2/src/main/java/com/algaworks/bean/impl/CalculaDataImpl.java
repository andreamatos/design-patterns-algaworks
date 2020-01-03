package com.algaworks.bean.impl;

import java.util.Date;

import com.algaworks.bean.CalculaData;

public class CalculaDataImpl implements CalculaData {

	@Override
    public String calcular(String data) {
		Date dataAtual = new Date();
		return "Antigo";
    }

}
