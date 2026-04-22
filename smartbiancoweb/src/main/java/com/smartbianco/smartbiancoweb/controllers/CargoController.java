package com.smartbianco.smartbiancoweb.controllers;

  import com.smartbianco.smartbiancoweb.models.Cargo;
  import com.smartbianco.smartbiancoweb.repositories.CargoRepository;
  import org.springframework.beans.factory.annotation.Autowired;
  import org.springframework.web.bind.annotation.*;

  import java.util.List;

  @RestController
  @RequestMapping("/api/cargos")
  @CrossOrigin(origins = "*")

public class CargoController {
  @Autowired
  private CargoRepository repository;

  @GetMapping
  public List<Cargo> listarCargos(){
    return repository.findAll();
  }
}
