package com.algaworks.logger.console;

import com.algaworks.logs.Log;
import com.algaworks.logs.Logs;

public class LogsConsole implements Logs {

	private String mensagemLog;
	
	public LogsConsole(String mensagemLog) {
		this.mensagemLog = mensagemLog;
	}

	public Log criar() {
		Log logs = new Log();
		logs.setLog(mensagemLog);
		logs.setTipoLog("Console");
		System.out.println(logs.getLog() + " " + " " + logs.getTipoLog());
		return logs;
	}
}
