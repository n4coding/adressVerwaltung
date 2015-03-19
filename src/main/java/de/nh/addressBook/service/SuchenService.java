package de.nh.addressBook.service;

import java.util.List;

import de.nh.addressBook.model.User;

public interface SuchenService {

	List<User> adresseSuchen(String name, String vorname, String strasse, String plz, String ort, String telefon);

}
