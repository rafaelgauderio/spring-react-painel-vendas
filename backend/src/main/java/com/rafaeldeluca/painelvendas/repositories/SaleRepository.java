package com.rafaeldeluca.painelvendas.repositories;

import com.rafaeldeluca.painelvendas.dto.FeeSuccessDealsDTO;
import com.rafaeldeluca.painelvendas.dto.SaleSumDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.rafaeldeluca.painelvendas.entities.Sale;

import java.util.List;

@Repository
public interface SaleRepository extends JpaRepository<Sale, Long> {

    @Query("SELECT new com.rafaeldeluca.painelvendas.dto.SaleSumDTO(objeto.seller,SUM(objeto.quantity)) " +
            " FROM Sale AS objeto " +
            " GROUP BY objeto.seller")
    List<SaleSumDTO> somaVendasPorVendedor ();

    @Query("SELECT new com.rafaeldeluca.painelvendas.dto.FeeSuccessDealsDTO(objeto.seller, SUM(objeto.visitedClients), SUM(objeto.closedDeals)) " +
            " FROM Sale AS objeto " +
            " GROUP BY objeto.seller")
    List<FeeSuccessDealsDTO> closedDealsFeeGroupBySeller ();

}
