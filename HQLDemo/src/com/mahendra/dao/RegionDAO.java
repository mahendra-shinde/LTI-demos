package com.mahendra.dao;

import java.util.List;
import com.mahendra.models.Region;

public interface RegionDAO {

	void save(Region region);
	Region findById(Integer regionId);
	List<Region> findByName(String name);
	void update(Region region);
	void remove(Region region);
}
