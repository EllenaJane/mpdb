package com.maple.mpdb.repository;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.maple.mpdb.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

  Optional<User> findByName(final String name);

}
