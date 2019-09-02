package com.insta1.service;

import com.insta1.dao.InstaDAO;
import com.insta1.dao.InstaDAOInterface;
import com.insta1.entity.InstaEmployee;

public class Instaservice implements InstaserviceInterface {
	private Instaservice() {}

	public static InstaserviceInterface createserviceobject() {
		// TODO Auto-generated method stub
		return new Instaservice();
	}

	@Override
	public int createprofile(InstaEmployee fe) {
		// TODO Auto-generated method stub
		InstaDAOInterface fd=InstaDAO.createDaoObject();
		return fd.createprofileDAO(fe);
		
	}

	

	

	
	

	

}
