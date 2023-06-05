package com.rafaeldeluca.painelvendas.services;

import com.rafaeldeluca.painelvendas.dto.SaleDTO;
import com.rafaeldeluca.painelvendas.entities.Sale;
import com.rafaeldeluca.painelvendas.repositories.SaleRepository;
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

    @Transactional(readOnly = true)
    public Page<SaleDTO> findALL (Pageable listaPaginada) {
        Page<Sale> pageSale = saleRepository.findAll(listaPaginada);
        Page<SaleDTO> pageSaleDTO = pageSale.map(sale -> new SaleDTO(sale));
        return  pageSaleDTO;
    }
}
