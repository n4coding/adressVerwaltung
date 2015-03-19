package de.nh.addressBook.model;

public class User {

	private String name;
	private String vorname;
	private String strasse;
	private String plz;
	private String ort;
	private String telefonnummer;


	public User() {
		super();
	}
	
	public User(String name, String vorname, String strasse, String plz, String ort, String telefonnummer) {
		super();
		this.name = name;
		this.vorname = vorname;
		this.strasse = strasse;
		this.plz = plz;
		this.ort = ort;
		this.telefonnummer = telefonnummer;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getVorname() {
		return vorname;
	}

	public void setVorname(String vorname) {
		this.vorname = vorname;
	}

	public String getStrasse() {
		return strasse;
	}

	public void setStrasse(String strasse) {
		this.strasse = strasse;
	}

	public String getOrt() {
		return ort;
	}

	public void setOrt(String ort) {
		this.ort = ort;
	}

	public String getPlz() {
		return plz;
	}

	public void setPlz(String plz) {
		this.plz = plz;
	}

	public String getTelefonnummer() {
		return telefonnummer;
	}

	public void setTelefonnummer(String telefonnummer) {
		this.telefonnummer = telefonnummer;
	}

}
