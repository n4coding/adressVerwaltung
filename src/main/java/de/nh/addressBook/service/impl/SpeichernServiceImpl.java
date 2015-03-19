package de.nh.addressBook.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import de.nh.addressBook.db.SpeichernDAO;
import de.nh.addressBook.service.SpeicherService;

@Component
public class SpeichernServiceImpl implements SpeicherService{

	@Autowired
	SpeichernDAO speichernDAO;
	
	@Override
	public void adresseSpeichern(String name, String vorname, String strasse, String plz, String ort, String telefon) {

		speichernDAO.adresseSpeichern(name,vorname,strasse,plz,ort,telefon);
		
		
	}

}
