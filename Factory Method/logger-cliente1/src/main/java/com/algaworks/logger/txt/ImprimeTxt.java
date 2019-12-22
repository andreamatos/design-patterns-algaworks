package com.algaworks.logger.txt;

import com.algaworks.geradorlogs.GeraLog;
import com.algaworks.logs.Logs;

public class ImprimeTxt extends GeraLog{

	private String mensagemLog;
	
	public ImprimeTxt(String mensagemLog) {
	    this.mensagemLog = mensagemLog;
	}

	@Override
	protected Logs gerarLogs() {
		return new LogsTxt(mensagemLog);
	}
	
}
