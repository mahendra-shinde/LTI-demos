package com.mahendra.dao;

import com.mahendra.models.Country;

public interface CountryDAO {
	Country findById(String countryId);
	
}
