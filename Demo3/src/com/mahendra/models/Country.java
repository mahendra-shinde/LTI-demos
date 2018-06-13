package com.mahendra.models;

import java.io.Serializable;

import javax.persistence.*;


@Entity
@Table(name="countries")
public class Country implements Serializable {

	@Id @Column(name="country_id",length=2)
	private String countryId;
	
	@Column(name="country_name",length=40)
	private String name;
	
	@ManyToOne
	@JoinColumn(name="region_id")
	private Region region;

	public String getCountryId() {
		return countryId;
	}

	public void setCountryId(String countryId) {
		this.countryId = countryId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Region getRegion() {
		return region;
	}

	public void setRegion(Region region) {
		this.region = region;
	}
	
	
}
