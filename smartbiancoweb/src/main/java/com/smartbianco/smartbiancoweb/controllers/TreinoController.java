package com.smartbianco.smartbiancoweb.controllers;

import com.smartbianco.smartbiancoweb.models.Treino;
import com.smartbianco.smartbiancoweb.repositories.TreinoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/treinos")
@CrossOrigin(origins = "*")

public class TreinoController {
  @Autowired
  private TreinoRepository repository;

  @GetMapping
  public List<Treino> listarTreinos() {
    return repository.findAll();
  }
}
