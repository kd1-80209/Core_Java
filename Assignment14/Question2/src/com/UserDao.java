package com;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

import com.mysql.cj.protocol.Resultset;

public class UserDao implements AutoCloseable {

	Connection con;

	public UserDao() throws SQLException {
		con = DbUtil.getConnection();
	}

	@Override
	public void close() throws Exception {

		try {
			if (con != null) {
				con.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public int addUser(User u) throws SQLException, ParseException {
		// insert into users values(default,'Medha',
		// 'Khole','medha@gmail.com','mad#123','1990-11-21',0,'voter');
		String sql = "insert into users values(default,?,?,?,?,?,?,?)";// 7?

		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		java.util.Date uDate = sdf.parse(u.getDate());
		java.sql.Date sDate = new java.sql.Date(uDate.getTime());

		try (PreparedStatement stmt = con.prepareStatement(sql)) {
			stmt.setString(1, u.getfName());
			stmt.setString(2, u.getlName());
			stmt.setString(3, u.getEmail());
			stmt.setString(4, u.getPassword());
			stmt.setDate(5, sDate);
			stmt.setBoolean(6, u.isStatus());
			stmt.setString(7, u.getRole());

			int cnt = stmt.executeUpdate();
			return cnt;
		}

	}

	public int updateUser(User u) throws ParseException, SQLException {
		// update users set first_name='Vinod',last_name='Patil',email='asaks.com',
		// password='Qwe',dob='1990-12-04',status=true,role='Manager' where id=4;

		String sql = "update users set first_name=?,last_name=?,email=?"
				+ ",password=?,dob=?,status=?,role=? where id=?;";

		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		java.util.Date uDate = sdf.parse(u.getDate());
		java.sql.Date sDate = new java.sql.Date(uDate.getTime());

		try (PreparedStatement stmt = con.prepareStatement(sql)) {
			stmt.setString(1, u.getfName());
			stmt.setString(2, u.getlName());
			stmt.setString(3, u.getEmail());
			stmt.setString(4, u.getPassword());
			stmt.setDate(5, sDate);
			stmt.setBoolean(6, u.isStatus());
			stmt.setString(7, u.getRole());
			stmt.setInt(8, u.getId());

			int cnt = stmt.executeUpdate();
			return cnt;
		}
	}

	public int deleteUser(User u) throws SQLException {

		// delete from users where id=4;
		String sql = "delete from users where id=?;";

		PreparedStatement stmt = con.prepareStatement(sql);
		stmt.setInt(1, u.getId());

		int cnt = stmt.executeUpdate();

		return cnt;

	}

	public ArrayList<User> getAllUsers() throws SQLException {

		ArrayList<User> uerslist = new ArrayList<User>();
		// select *from users;
		String sql = "select *from users;";
		PreparedStatement stmt = con.prepareStatement(sql);
		ResultSet rs = stmt.executeQuery();

		while (rs.next()) {
			int id = rs.getInt("id");
			String fName = rs.getString("first_name");
			String lName = rs.getString("last_name");
			String email = rs.getString("email");
			String password = rs.getString("password");
			boolean status = rs.getBoolean("status");
			String role = rs.getString("role");

			java.sql.Date date = rs.getDate("dob");
			SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
			String dat = sdf.format(date);

			User u = new User(id, fName, lName, email, password, dat, status, role);
			uerslist.add(u);
		}

		return uerslist;
	}

}
