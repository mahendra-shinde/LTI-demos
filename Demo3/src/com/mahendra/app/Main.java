package com.mahendra.app;

import java.util.List;
import java.util.Set;

import com.mahendra.dao.RegionDAO;
import com.mahendra.dao.RegionDAOImpl;
import com.mahendra.models.Country;
import com.mahendra.models.Region;

public class Main {

	public static void main(String[] args) {
	
		RegionDAO dao = new RegionDAOImpl();
		Region region = dao.findById(3);
		System.out.println(region.getName());
		
		Set<Country> countries = region.getCountries();
		System.out.println("Found "+countries.size()+" Countries");
		for(Country c : countries) {
			System.out.println(c.getName());
		}
		
	}

}
