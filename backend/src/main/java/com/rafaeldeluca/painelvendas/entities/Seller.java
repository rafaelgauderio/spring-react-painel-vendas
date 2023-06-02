package com.rafaeldeluca.painelvendas.entities;

import java.util.ArrayList;
import java.util.List;

public class Seller {
	
	private Long id;
	private String name;
	
	private List<Sale> sales = new ArrayList<Sale>();
	
	public Seller () {
		
	}
	
	public Seller(Long id, String name) {
		this.id = id;
		this.name = name;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Sale> getSales() {
		return sales;
	}

	/* não se usa métoto ser em coleções
	public void setSales(List<Sale> sales) {
		this.sales = sales;
	}	
	*/	
	

}
