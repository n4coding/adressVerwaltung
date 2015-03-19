package de.nh.addressBook.db.impl;

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcTemplate;
import org.springframework.stereotype.Component;

import de.nh.addressBook.db.SuchenDAO;
import de.nh.addressBook.db.mapper.UserMapper;
import de.nh.addressBook.model.User;


@Component
public class SuchenDAOImpl implements SuchenDAO{
	
	
	
	@Autowired
	private DataSource dataSource;

	@Override
	public List<User> suchen(String name, String vorname, String strasse, String plz, String ort, String telefon) {
		List<User> adressen = new ArrayList<>();
		
		SimpleJdbcTemplate template = new SimpleJdbcTemplate(dataSource);
		MapSqlParameterSource params = new MapSqlParameterSource();
		
		int position = 0;
		StringBuilder queryString = new StringBuilder();

		if(name != null && name.trim().length() > 0){
			queryString.append(getWort(position));
			position++;
			queryString.append("name = :name");
			params.addValue("name", name);
		}
		
		if(vorname != null && vorname.trim().length() > 0){
			queryString.append(getWort(position));
			position++;
			queryString.append("vorname = :vorname");
			params.addValue("vorname", vorname);
		}
		
		if(strasse != null && strasse.trim().length() > 0){
			queryString.append(getWort(position));
			position++;
			queryString.append("strasse = :strasse");
			params.addValue("strasse", strasse);
		}
		
		if(plz != null && plz.trim().length() > 0){
			queryString.append(getWort(position));
			position++;
			queryString.append("plz = :plz");
			params.addValue("plz", plz);
		}
		
		if(ort != null && ort.trim().length() > 0){
			queryString.append(getWort(position));
			position++;
			queryString.append("ort = :ort");
			params.addValue("ort", ort);
		}
		
		if(telefon != null && telefon.trim().length() > 0){
			queryString.append(getWort(position));
			position++;
			queryString.append("telefon = :telefon");
			params.addValue("telefon", telefon);
		}
		
		queryString.append(";");
		
		String queryStringTest = "select count(*) from User " + queryString.toString();
		
		int count = template.queryForInt(queryStringTest.toString(), params);
		if(count < 1){
			return null;
		}
		
		String queryStringFinal = "select * from User " + queryString.toString();
		return template.query(queryStringFinal.toString(), new UserMapper(), params);

	}
	
	private String getWort(int position){
		if(position == 0){
			return "WHERE ";
		}
		return " AND ";
	}

}
