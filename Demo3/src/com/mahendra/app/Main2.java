package com.mahendra.app;

import java.util.List;

import com.mahendra.dao.CountryDAOImpl;
import com.mahendra.dao.*;
import com.mahendra.models.*;

public class Main2 {

	public static void main(String[] args) {
	
		CountryDAO dao = new CountryDAOImpl();
		Country country = dao.findById("UK");
		System.out.println("Country found "+country.getName()+" in "+country.getRegion().getName());
	}

}
