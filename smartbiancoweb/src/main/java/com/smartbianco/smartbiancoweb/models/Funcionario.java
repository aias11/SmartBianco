package com.smartbianco.smartbiancoweb.models;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDate;

@Entity
@Table(name = "tbFuncionarios")
@Data

public class Funcionario {
  @Id

  private Integer id;

  @Column(nullable = false, length = 30)
  private String nome;

  @Column(nullable = false, length = 11)
  private String cpf;

  @Column(nullable = false, length = 100)
  private String senha;

  @Column(nullable = false, length = 30)
  private String telefone;

  @Column(nullable = false)
  private LocalDate data_nasc;

  @Column(nullable = false, length = 10)
  private String sexo;

  @ManyToOne
  @JoinColumn(name = "id_cargo", nullable = false)
  private Cargo cargo;
}
