package com.rafaeldeluca.painelvendas.dto;

import com.rafaeldeluca.painelvendas.entities.Seller;

import java.io.Serializable;

public class SaleSumDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private String sellerName;
    private Double sumSales;

    public SaleSumDTO () {

    }

    public SaleSumDTO(Seller seller, Double sumSales) {
        this.sellerName = seller.getName();
        this.sumSales = sumSales;
    }

    public String getSellerName() {
        return sellerName;
    }

    public void setSellerName(String sellerName) {
        this.sellerName = sellerName;
    }

    public Double getSumSales() {
        return sumSales;
    }

    public void setSumSales(Double sumSales) {
        this.sumSales = sumSales;
    }
}
