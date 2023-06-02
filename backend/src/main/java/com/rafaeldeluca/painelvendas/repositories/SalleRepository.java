package com.rafaeldeluca.painelvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rafaeldeluca.painelvendas.entities.Sale;

@Repository
public interface SalleRepository extends JpaRepository<Sale, Long>{

}
