package com.smartbianco.smartbiancoweb.controllers;

import com.smartbianco.smartbiancoweb.models.Assinatura;
import com.smartbianco.smartbiancoweb.repositories.AssinaturaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/assinaturas")
@CrossOrigin(origins = "*")

public class AssinaturaController {
  @Autowired
  private AssinaturaRepository repository;

  @GetMapping
  public List<Assinatura> listarAssinaturas() {
    return repository.findAll();
  }
}
