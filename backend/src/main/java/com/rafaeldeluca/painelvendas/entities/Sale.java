package com.rafaeldeluca.painelvendas.entities;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table (name= "tb_sales")
public class Sale {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private Integer visitedClients;
	private Integer closedDeals;
	private Double quantity;
	private LocalDate date;
	
	@ManyToOne
	@JoinColumn(name="seller_id")
	private Seller seller;
	
	public Sale () {
		
	}

	public Sale(Long id, Integer visitedClients, Integer closedDeals, Double quantity, LocalDate date, Seller seller) {		
		this.id = id;
		this.visitedClients = visitedClients;
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

	public Integer getVisitedClients() {
		return visitedClients;
	}

	public void setVisitedClients(Integer visitedClients) {
		this.visitedClients = visitedClients;
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
