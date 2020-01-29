package com.maple.mpdb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.maple.mpdb.model.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, Integer> {

}
