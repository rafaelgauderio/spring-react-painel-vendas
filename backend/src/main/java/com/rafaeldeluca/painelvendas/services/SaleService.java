package com.rafaeldeluca.painelvendas.services;

import com.rafaeldeluca.painelvendas.dto.SaleDTO;
import com.rafaeldeluca.painelvendas.entities.Sale;
import com.rafaeldeluca.painelvendas.repositories.SaleRepository;
import com.rafaeldeluca.painelvendas.repositories.SellerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class SaleService {

    @Autowired
    private SaleRepository saleRepository;

    @Autowired
    private SellerRepository sellerRepository;

    @Transactional(readOnly = true)
    public Page<SaleDTO> findALL (Pageable listaPaginada) {
        // já injetar um busca dos sellers, para que a consutalta não tenha que ficar
        // voltando várias vezes ao database.
        sellerRepository.findAll(); // jpa vai deixar salva em memoria os vendedores e não vai voltar ao banco
        Page<Sale> pageSale = saleRepository.findAll(listaPaginada);
        Page<SaleDTO> pageSaleDTO = pageSale.map(sale -> new SaleDTO(sale));
        return  pageSaleDTO;
    }
}
