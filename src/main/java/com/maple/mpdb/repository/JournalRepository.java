package com.maple.mpdb.repository;

import java.util.Date;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
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

  @Query("SELECT j FROM Journal j WHERE (:type is null or j.type = :type) and "
      /* + "(coalesce(:mediaId, null) is null or j.media.id in (:mediaId)) and " */
      + "(:fromDate is null or j.publishedDate >= :fromDate) and (:toDate is null or j.publishedDate <= :toDate)")
  List<Journal> search(@Param("type") final Type type, @Param("fromDate") final Date fromDate,
      @Param("toDate") final Date toDate);
}
