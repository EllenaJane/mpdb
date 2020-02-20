package com.maple.mpdb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.maple.mpdb.model.Media;

/**
 * Repository layer for managing media transactions
 *
 * @author phulay
 *
 */
@Repository
public interface MediaRepository extends JpaRepository<Media, Integer> {

  /*
   * @Query("SELECT m FROM Media m WHERE m.region.id = :regionId") List<Media>
   * getMediaListByRegion(@Param("regionId") Integer regionId);
   */
}
