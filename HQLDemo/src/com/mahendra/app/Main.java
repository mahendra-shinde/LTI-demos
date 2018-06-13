package com.mahendra.app;

import java.util.List;
import java.util.Set;

import com.mahendra.dao.CountryDAO;
import com.mahendra.dao.CountryDAOImpl;
import com.mahendra.dao.RegionDAO;
import com.mahendra.dao.RegionDAOImpl;
import com.mahendra.models.Country;
import com.mahendra.models.Region;

public class Main {

	public static void main(String[] args) {
	
		CountryDAO dao = new CountryDAOImpl();
		int count = dao.countCountries();
		
		System.out.println("Number of countries :" +count);
		
		List<String> names = dao.getCountryNames();
		
		for(String str : names) {
		System.out.println(str);
		}
		
		
	}

}
