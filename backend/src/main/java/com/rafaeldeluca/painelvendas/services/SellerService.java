package com.rafaeldeluca.painelvendas.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rafaeldeluca.painelvendas.entities.Seller;
import com.rafaeldeluca.painelvendas.repositories.SellerRepository;

@Service
public class SellerService {
	
	@Autowired
	private SellerRepository repositorySeller;
	
	@Transactional(readOnly=true)
	public List<Seller> findAll() {
		return repositorySeller.findAll();
	}

}
