package de.nh.addressBook.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import de.nh.addressBook.db.SuchenDAO;
import de.nh.addressBook.model.User;
import de.nh.addressBook.service.SuchenService;

@Component
public class SuchenServiceImpl implements SuchenService{
	
	@Autowired
	private SuchenDAO suchenDAO;

	@Override
	public List<User> adresseSuchen(String name, String vorname, String strasse, String plz, String ort, String telefon) {
		return suchenDAO.suchen(name, vorname, strasse, plz, ort, telefon);
	}

}
