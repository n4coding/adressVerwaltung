package de.nh.addressBook.db;

public interface SpeichernDAO {

	void adresseSpeichern(String name, String vorname, String strasse, String plz, String ort, String telefon);

}
