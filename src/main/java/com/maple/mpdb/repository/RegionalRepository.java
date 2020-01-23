package com.maple.mpdb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.maple.mpdb.model.Region;

/**
 * Repository layer for managing regional transactions
 *
 * @author phulay
 *
 */
@Repository
public interface RegionalRepository extends JpaRepository<Region, Integer>{
	
}
