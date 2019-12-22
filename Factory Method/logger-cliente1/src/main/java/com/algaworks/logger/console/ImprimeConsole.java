package com.algaworks.logger.console;

import com.algaworks.geradorlogs.GeraLog;
import com.algaworks.logs.Logs;

public class ImprimeConsole extends GeraLog{
	
	private String mensagemLog;
	
	public ImprimeConsole(String mensagemLog) {
	    this.mensagemLog = mensagemLog;
	}

	@Override
	protected Logs gerarLogs() {
		return new LogsConsole(mensagemLog);
	}


}
