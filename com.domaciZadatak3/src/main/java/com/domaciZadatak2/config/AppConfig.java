package com.domaciZadatak2.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import com.domaciZadatak2.impl.Ovca;
import com.domaciZadatak2.impl.Pas;
import com.domaciZadatak2.aop.ZivotinjaLoggingAspect;
import com.domaciZadatak2.impl.Kokoska;
import com.domaciZadatak2.inter.Zivotinja;
import com.domaciZadatak2.service.ZivotinjaService;

@Configuration
@EnableAspectJAutoProxy
public class AppConfig {

	@Bean(name = "zivotinjaService")
	public ZivotinjaService zivotinjaService() {
		return new ZivotinjaService();
	}

	@Bean(name = "Ovca")
	public Zivotinja ovca() {
		return new Ovca();
	}

	@Bean(name = "Pas")
	public Zivotinja pas() {
		return new Pas();
	}

	@Bean(name = "Kokoska")
	public Zivotinja Kokoska() {
		return new Kokoska();
	}
	
	@Bean(name = "ZivotinjaLoggingAspect")
	public ZivotinjaLoggingAspect zivotinjaLoggingAspect() {
		return new ZivotinjaLoggingAspect();
	}
}
