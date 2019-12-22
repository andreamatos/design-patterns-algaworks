package com.algaworks.imposto.pj;

import com.algaworks.interfaces.Cobranca;

public class PessoaJuridica implements Cobranca{
	public Double valorImposto;
	
	@Override
	public Double porcentual() {
		valorImposto = 4.0 / 100;
		return valorImposto;
	}

}
