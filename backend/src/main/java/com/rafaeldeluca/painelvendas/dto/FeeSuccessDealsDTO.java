package com.rafaeldeluca.painelvendas.dto;

import com.rafaeldeluca.painelvendas.entities.Seller;

import java.io.Serializable;

public class FeeSuccessDealsDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private String sellerName;
    private Long sumVisitedClients;
    private Long sumClosedDeals;

    public FeeSuccessDealsDTO() {

    }

    public FeeSuccessDealsDTO (Seller seller, Long sumVisitedClients, Long sumClosedDeals) {
        this.sellerName = seller.getName();
        this.sumVisitedClients = sumVisitedClients;
        this.sumClosedDeals = sumClosedDeals;
    }

    public String getSellerName() {
        return sellerName;
    }

    public void setSellerName(String sellerName) {
        this.sellerName = sellerName;
    }

    public Long getSumVisitedClients() {
        return sumVisitedClients;
    }

    public void setSumVisitedClients(Long sumVisitedClients) {
        this.sumVisitedClients = sumVisitedClients;
    }

    public Long getSumClosedDeals() {
        return sumClosedDeals;
    }

    public void setSumClosedDeals(Long sumClosedDeals) {
        this.sumClosedDeals = sumClosedDeals;
    }
}
