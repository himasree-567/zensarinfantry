package com.insta1.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import com.insta1.entity.InstaEmployee;

public class InstaDAO implements InstaDAOInterface {
	private InstaDAO() {}

	public static InstaDAOInterface createDaoObject() {
		// TODO Auto-generated method stub
		return new InstaDAO();
	}

	@Override
	public int createprofileDAO(InstaEmployee fe) {
		// TODO Auto-generated method stub
		int i=0;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","system","Zensar123");
			PreparedStatement ps=con.prepareStatement("insert into instaemployee values(?,?,?,?)");
			ps.setString(1, fe.getName());
			ps.setString(2, fe.getPass());
			ps.setString(3, fe.getEmail());
			ps.setString(4, fe.getAddress());
			i=ps.executeUpdate();
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return i;
	}

	

}
