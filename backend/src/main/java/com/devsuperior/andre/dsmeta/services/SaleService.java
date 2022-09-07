package com.devsuperior.andre.dsmeta.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devsuperior.andre.dsmeta.entities.Sale;
import com.devsuperior.andre.dsmeta.repositories.SalesRepository;

@Service
public class SaleService {
	
	@Autowired
	private SalesRepository salesRepository;
	
	public List<Sale> findSales() {
		return salesRepository.findAll();
	}
}
