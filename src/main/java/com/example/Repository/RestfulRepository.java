package com.example.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Entity.RestfulEntity;

public interface RestfulRepository extends JpaRepository<RestfulEntity, Long>{

}
