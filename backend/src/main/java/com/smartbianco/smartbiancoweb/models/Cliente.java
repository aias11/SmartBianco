package com.smartbianco.smartbiancoweb.models;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDate;

@Entity
@Table(name = "tbClientes")
@Data

public class Cliente {
  
  @Id@GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;

  @Column(nullable = false, length = 30)
  private String nome;

  @Column(nullable = false, length = 11)
  private String cpf;

  @Column(nullable = false, length = 100)
  private String senha;

  @Column(nullable = false, length = 20)
  private String telefone;

  @Column(nullable = false)
  private LocalDate data_nasc;

  @Column(nullable = false, length = 10)
  private String sexo;

  @Column(nullable = false)
  private Boolean as_on = false;

  @ManyToOne
  @JoinColumn(name = "id_treino", nullable = false)
  private Treino treino;
}
