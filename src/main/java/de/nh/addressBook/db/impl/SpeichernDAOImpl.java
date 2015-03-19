package de.nh.addressBook.db.impl;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import de.nh.addressBook.db.SpeichernDAO;

@Component
public class SpeichernDAOImpl implements SpeichernDAO {
	@Autowired
	private DataSource dataSource;

	@Override
	public void adresseSpeichern(String name, String vorname, String strasse, String plz, String ort, String telefon) {

		JdbcTemplate template = new JdbcTemplate(dataSource);
		String SQL = "INSERT User (name, vorname, strasse, plz, ort, telefon) VALUES (?, ?, ?, ?, ?, ?)";
		template.update(SQL, name, vorname, strasse, plz, ort, telefon);
	}

}
