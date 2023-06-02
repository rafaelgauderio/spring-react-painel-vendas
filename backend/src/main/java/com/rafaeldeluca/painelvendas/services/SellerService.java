package com.rafaeldeluca.painelvendas.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rafaeldeluca.painelvendas.dto.SellerDTO;
import com.rafaeldeluca.painelvendas.entities.Seller;
import com.rafaeldeluca.painelvendas.repositories.SellerRepository;

@Service
public class SellerService {
	
	@Autowired
	private SellerRepository repositorySeller;
	
	@Transactional(readOnly=true)
	public List<SellerDTO> findAll() {
		List<Seller> listSeller = repositorySeller.findAll();
		return listSeller.stream().map(sel -> new SellerDTO(sel)).collect(Collectors.toList());
	}

}
