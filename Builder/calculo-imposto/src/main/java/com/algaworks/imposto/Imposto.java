package com.algaworks.imposto;

import com.algaworks.interfaces.Cobranca;

public abstract class Imposto{

	protected abstract Cobranca imposto();
	
	public final Double cobrarImposto(Double valor) {
		Double percentual = imposto().porcentual();
		Double valorCalculado = valor + valor * percentual;
		return valorCalculado;
	}
}
