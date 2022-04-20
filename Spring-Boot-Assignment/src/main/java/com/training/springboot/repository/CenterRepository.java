package com.training.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.training.springboot.model.Center;

@Repository
public interface CenterRepository extends JpaRepository<Center, Integer>{

}
