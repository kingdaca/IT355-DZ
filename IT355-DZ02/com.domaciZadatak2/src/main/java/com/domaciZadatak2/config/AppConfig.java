package com.domaciZadatak2.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.domaciZadatak2.impl.Ovca;
import com.domaciZadatak2.impl.Pas;
import com.domaciZadatak2.impl.Kokoska;
import com.domaciZadatak2.inter.Zivotinja;
import com.domaciZadatak2.service.ZivotinjaService;

@Configuration
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
}
