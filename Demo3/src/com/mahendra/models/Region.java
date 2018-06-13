package com.mahendra.models;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.*;

@Entity 
@Table(name="regions")
public class Region implements Serializable {

	@Id
	@Column(name="region_id")
	private Integer regionId;
	
	@Column(name="region_name")
	private String name;

	
	//EAGER = make "set of countries" available even when "region" is in detached mode.
	//LAZY  = make "set of countries" NOT available when "region" is in detached mode.
	@OneToMany(mappedBy="region",fetch=FetchType.EAGER)
	private Set<Country> countries;
	
	public Set<Country> getCountries() {
		return countries;
	}

	public void setCountries(Set<Country> countries) {
		this.countries = countries;
	}

	public Integer getRegionId() {
		return regionId;
	}

	public void setRegionId(Integer regionId) {
		this.regionId = regionId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
