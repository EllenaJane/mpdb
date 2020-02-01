package com.maple.mpdb.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.maple.mpdb.model.Journal;
import com.maple.mpdb.model.Media;
import com.maple.mpdb.model.Type;

/**
 * Repository layer for managing journal transactions
 *
 * @author phulay
 *
 */
@Repository
public interface JournalRepository extends JpaRepository<Journal, Integer> {

  List<Journal> findByType(final Type type);

  List<Journal> findByMedia(final Media media);

}
