package com.maple.mpdb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.maple.mpdb.model.Regional;

@Repository
public interface RegionalRepository extends JpaRepository<Regional, Integer>{
	
}
