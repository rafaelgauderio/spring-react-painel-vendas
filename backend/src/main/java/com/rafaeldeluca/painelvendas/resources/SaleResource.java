package com.rafaeldeluca.painelvendas.resources;

import com.rafaeldeluca.painelvendas.dto.SaleDTO;
import com.rafaeldeluca.painelvendas.services.SaleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/sales")
public class SaleResource {

    @Autowired
    private SaleService saleService;

    @GetMapping
    public ResponseEntity<Page<SaleDTO>> findAllSales (Pageable pageable) {
        Page<SaleDTO> listaPaginada = saleService.findALL(pageable);
        return ResponseEntity.ok().body(listaPaginada);
    }
}