package com.mahendra.dao;

import java.util.List;

import com.mahendra.models.Country;

public interface CountryDAO {
	Country findById(String countryId);
	Integer countCountries();
	List<String> getCountryNames();
	
}
