package com.rafaeldeluca.painelvendas.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rafaeldeluca.painelvendas.dto.SellerDTO;
import com.rafaeldeluca.painelvendas.services.SellerService;

@RestController
@RequestMapping(value="/sellers")
public class SellerResource {
	
	@Autowired
	private SellerService sellerService;
	
	@GetMapping
	public ResponseEntity<List<SellerDTO>> findAllSellers () {
		
		List<SellerDTO> listSellerDTO = sellerService.findAll();
		return ResponseEntity.ok(listSellerDTO);
	}

}
