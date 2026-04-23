package com.smartbianco.smartbiancoweb.repositories;

import com.smartbianco.smartbiancoweb.models.Treino;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface TreinoRepository extends JpaRepository<Treino, Integer>{

}
