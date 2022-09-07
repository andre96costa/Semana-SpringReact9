package com.devsuperior.andre.dsmeta.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.andre.dsmeta.entities.Sale;

public interface SalesRepository extends JpaRepository<Sale, Long> {
	
	
}
