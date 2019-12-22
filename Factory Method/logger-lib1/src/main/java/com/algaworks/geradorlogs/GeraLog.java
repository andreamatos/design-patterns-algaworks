package com.algaworks.geradorlogs;

import com.algaworks.logs.Log;
import com.algaworks.logs.Logs;

public abstract class GeraLog {
	
	protected abstract Logs gerarLogs();

	public final boolean gerarLog(String mensagemLog) {
		Log logs = gerarLogs().criar();
		return true;
	}
}
