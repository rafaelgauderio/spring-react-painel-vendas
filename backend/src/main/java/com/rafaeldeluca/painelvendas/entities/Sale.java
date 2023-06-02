package com.rafaeldeluca.painelvendas.entities;

import java.time.LocalDate;

public class Sale {
	
	private Long id;
	private Integer visitedClientes;
	private Integer closedDeals;
	private Double quantity;
	private LocalDate date;
	
	private Seller seller;
	
	public Sale () {
		
	}

	public Sale(Long id, Integer visitedClientes, Integer closedDeals, Double quantity, LocalDate date, Seller seller) {		
		this.id = id;
		this.visitedClientes = visitedClientes;
		this.closedDeals = closedDeals;
		this.quantity = quantity;
		this.date = date;
		this.seller = seller;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getVisitedClientes() {
		return visitedClientes;
	}

	public void setVisitedClientes(Integer visitedClientes) {
		this.visitedClientes = visitedClientes;
	}

	public Integer getClosedDeals() {
		return closedDeals;
	}

	public void setClosedDeals(Integer closedDeals) {
		this.closedDeals = closedDeals;
	}

	public Double getQuantity() {
		return quantity;
	}

	public void setQuantity(Double quantity) {
		this.quantity = quantity;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public Seller getSeller() {
		return seller;
	}

	public void setSeller(Seller seller) {
		this.seller = seller;
	}
	
	
}
