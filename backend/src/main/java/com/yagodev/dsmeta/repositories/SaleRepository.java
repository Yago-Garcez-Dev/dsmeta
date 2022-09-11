package com.yagodev.dsmeta.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yagodev.dsmeta.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long> {
	
	
}
