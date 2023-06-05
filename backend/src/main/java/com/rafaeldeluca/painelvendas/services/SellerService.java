package com.rafaeldeluca.painelvendas.services;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rafaeldeluca.painelvendas.dto.SellerDTO;
import com.rafaeldeluca.painelvendas.entities.Seller;
import com.rafaeldeluca.painelvendas.repositories.SellerRepository;

@Service
public class SellerService implements Comparator<Seller> {
	
	@Autowired
	private SellerRepository repositorySeller;
	
	@Transactional(readOnly=true)
	public List<SellerDTO> findAll() {
		List<Seller> listSeller = repositorySeller.findAll();
		listSeller.sort(new SellerService());
		return listSeller.stream().map(sel -> new SellerDTO(sel)).collect(Collectors.toList());
	}

	@Override
	public int compare(Seller seller1, Seller seller2) {
		String name1 = seller1.getName();
		String name2 = seller2.getName();
		return name1.compareTo(name2);
	}
}
