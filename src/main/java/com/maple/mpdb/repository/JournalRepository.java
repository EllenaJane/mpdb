package com.maple.mpdb.repository;

import java.util.Date;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.maple.mpdb.model.Journal;
import com.maple.mpdb.model.Type;

/**
 * Repository layer for managing journal transactions
 *
 * @author phulay
 *
 */
@Repository
public interface JournalRepository extends JpaRepository<Journal, Integer> {

  /*
   * List<Journal> findByType(final Type type);
   * 
   * @Query("SELECT j FROM Journal j WHERE j.media = ?1") List<Journal> findByMedia(final Integer
   * mediaId);
   * 
   * @Query("SELECT j FROM Journal j WHERE j.publishedDate >= ?1 and j.publishedDate <= ?2")
   * List<Journal> findByPeriod(final Instant fromDate, final Instant toDate);
   */

  @Query("SELECT j FROM Journal j WHERE (?1 is null or j.type = ?1) and  (?2 is null or j.media.id = ?2) and "
      + "(?3 is null or j.publishedDate >= ?3) and (?4 is null or j.publishedDate <= ?4)")
  List<Journal> search(final Type type, final Integer mediaId, final Date fromDate,
      final Date toDate);
}
