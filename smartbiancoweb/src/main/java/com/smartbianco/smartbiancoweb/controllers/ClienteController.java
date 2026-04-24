package com.smartbianco.smartbiancoweb.controllers;

import com.smartbianco.smartbiancoweb.models.Cliente;
import com.smartbianco.smartbiancoweb.repositories.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/clientes")
@CrossOrigin(origins = "*")
public class ClienteController {

  @Autowired
  private ClienteRepository repository;

  @GetMapping
  public List<Cliente> ListarClientes() {
    return repository.findAll();
  }
}
