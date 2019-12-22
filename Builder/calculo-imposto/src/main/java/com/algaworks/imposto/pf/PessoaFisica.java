package com.algaworks.imposto.pf;

import com.algaworks.interfaces.Cobranca;

public class PessoaFisica implements Cobranca{
	public Double valorImposto;
	
	@Override
	public Double porcentual() {
		valorImposto = 7.00 / 100;
		return valorImposto;
	}

}
