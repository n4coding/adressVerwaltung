package de.nh.addressBook.db.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import de.nh.addressBook.model.User;

public class UserMapper implements RowMapper<User> {
	
	@Override
	public User mapRow(ResultSet rs, int arg1) throws SQLException {
		return new User(rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7));
	}

}
