package com.domaciZadatak2.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.domaciZadatak2.impl.Pas;
import com.domaciZadatak2.inter.Zivotinja;

@Service
public class ZivotinjaService {

	@Autowired
	@Qualifier("Pas")
	Zivotinja pas;
	
	@Autowired
	@Qualifier("Ovca")
	Zivotinja ovca;
	
	@Autowired
	@Qualifier("Kokoska")
	Zivotinja kokoska;

	public String getnacinOglasavanaPas() {
		return pas.NacinOglasavanja();
	}
	
	public String getNahraniOvcu() {
		return ovca.NahraniZivotinju();
	}
	
	public String getNacinOglasavanjaKokoska() {
		return kokoska.NacinOglasavanja();
	}
	
	

}
