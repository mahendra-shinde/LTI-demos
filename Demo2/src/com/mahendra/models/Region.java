package com.mahendra.models;

import java.io.Serializable;
import javax.persistence.*;


@Entity 
@Table(name="regions")
public class Region implements Serializable {

	@Id
	@Column(name="region_id")
	private Integer regionId;
	
	@Column(name="region_name")
	private String name;

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
