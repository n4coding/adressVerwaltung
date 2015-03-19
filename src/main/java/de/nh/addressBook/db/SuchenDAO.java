package de.nh.addressBook.db;

import java.util.List;

import de.nh.addressBook.model.User;

public interface SuchenDAO {

	List<User> suchen(String name, String vorname, String strasse, String plz, String ort, String telefon);

}
