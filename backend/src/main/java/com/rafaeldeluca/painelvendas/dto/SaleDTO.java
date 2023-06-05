package com.rafaeldeluca.painelvendas.dto;

import com.rafaeldeluca.painelvendas.entities.Sale;

import java.io.Serializable;
import java.time.LocalDate;

public class SaleDTO implements Serializable {

    private static final long serialVersionUID = 1L;
    
    private Long id;
    private Integer visitedClients;
    private Integer closedDeals;
    private Double quantity;
    private LocalDate date;
    //objeto aninhado Seller (não colocar a entidade aqui, sempre o DTO)
    private SellerDTO sellerDTO;

    public SaleDTO () {

    }

    public SaleDTO(Long id, Integer visitedClients, Integer closedDeals, Double quantity, LocalDate date, SellerDTO sellerDTO) {
        this.id = id;
        this.visitedClients = visitedClients;
        this.closedDeals = closedDeals;
        this.quantity = quantity;
        this.date = date;
        this.sellerDTO = sellerDTO;
    }

    public SaleDTO(Sale entity) {
        this.id = entity.getId();
        this.visitedClients = entity.getVisitedClients();
        this.closedDeals = entity.getClosedDeals();
        this.quantity = entity.getQuantity();
        this.date = entity.getDate();
        this.sellerDTO = new SellerDTO(entity.getSeller());
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

    public SellerDTO getSellerDTO() {
        return sellerDTO;
    }

    public void setSellerDTO(SellerDTO sellerDTO) {
        this.sellerDTO = sellerDTO;
    }
}
