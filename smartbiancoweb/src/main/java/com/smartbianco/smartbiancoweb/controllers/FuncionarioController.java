package com.smartbianco.smartbiancoweb.controllers;

import com.smartbianco.smartbiancoweb.models.Funcionario;
import com.smartbianco.smartbiancoweb.repositories.FuncionarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/funcionarios")
@CrossOrigin(origins = "*")

public class FuncionarioController {

  @Autowired
  private FuncionarioRepository repository;

  @GetMapping
  public List<Funcionario> listarFuncionarios(){
    return repository.findAll();
  }

}
