package com.evolve.core.domain.repositories;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.evolve.core.domain.entities.Admin;

@Repository
public interface AdminRepository extends JpaRepository<Admin, Serializable> {

}
