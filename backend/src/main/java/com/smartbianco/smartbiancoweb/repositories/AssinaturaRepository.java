package com.smartbianco.smartbiancoweb.repositories;

import com.smartbianco.smartbiancoweb.models.Assinatura;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AssinaturaRepository extends JpaRepository<Assinatura, Integer>{
  
}
