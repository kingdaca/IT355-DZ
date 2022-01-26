package com.domaciZadatak2.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.domaciZadatak2.config.AppConfig;
import com.domaciZadatak2.service.ZivotinjaService;

public class Main {

	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		
		ZivotinjaService zs = (ZivotinjaService) context.getBean("zivotinjaService");
		
		System.out.println(zs.getnacinOglasavanaPas());
		System.out.println(zs.getNahraniOvcu());
		System.out.println(zs.getNacinOglasavanjaKokoska());

	}

}
