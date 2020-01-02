package com.algaworks.job;

import java.util.List;

import org.quartz.Job;
import org.quartz.JobDataMap;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

import com.algaworks.model.Lancamento;
import com.algaworks.model.Produto;
import com.algaworks.notifier.Notificador;
import com.algaworks.repository.Produtos;

public class ListaDeProdutosJob implements Job {

	@Override
	public void execute(JobExecutionContext context) throws JobExecutionException {
		JobDataMap jobDataMap = context.getJobDetail().getJobDataMap();
		
		Produtos produtos = (Produtos) jobDataMap.get("produtos");
		Notificador notificador = (Notificador) jobDataMap.get("notificador");

		List<Produto> listaProdutos = produtos.listaProdutos();
		notificador.novosProdutos(listaProdutos);
	}

}
