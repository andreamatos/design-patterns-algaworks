package com.algaworks;

import static org.quartz.CronScheduleBuilder.cronSchedule;
import static org.quartz.JobBuilder.newJob;
import static org.quartz.TriggerBuilder.newTrigger;

import org.quartz.CronTrigger;
import org.quartz.JobDataMap;
import org.quartz.JobDetail;
import org.quartz.Scheduler;
import org.quartz.impl.StdSchedulerFactory;

import com.algaworks.job.ListaDeProdutosJob;
import com.algaworks.listeners.CasasBahiaListener;
import com.algaworks.listeners.Listener;
import com.algaworks.listeners.MarabrazListener;
import com.algaworks.notifier.Notificador;
import com.algaworks.notifier.NotificadorListaProdutos;
import com.algaworks.repository.Produtos;

public class Principal {

	public static void main(String[] args) throws Exception {
		Notificador notificador = new NotificadorListaProdutos();
		
		Listener marabrazEmail = new MarabrazListener(notificador);
		Listener casasBahiaEmail = new CasasBahiaListener(notificador);
		
		JobDataMap jobDataMap = new JobDataMap();
		Produtos produtos = new Produtos();
		
		Scheduler scheduler = StdSchedulerFactory.getDefaultScheduler();
		
		jobDataMap.put("produtos", produtos);
		jobDataMap.put("notificador", notificador);
		
		JobDetail job = newJob(ListaDeProdutosJob.class)
						.setJobData(jobDataMap)
						.withIdentity("listaDeProdutosJob", "listaDeProdutosGroup")
						.build();

		CronTrigger trigger = newTrigger()
				.withIdentity("trigger1", "group1")
				.withSchedule(cronSchedule("0 * * * * ?"))
		        .build();

		scheduler.scheduleJob(job, trigger);

		scheduler.start();

		Thread.sleep(220000);

		scheduler.shutdown(true);
	}

}
