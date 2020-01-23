package com.maple.mpdb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.maple.mpdb.model.Journal;

/**
 * Repository layer for managing journal transactions
 *
 * @author phulay
 *
 */
@Repository
public interface JournalRepository extends JpaRepository<Journal, Integer> {

}
