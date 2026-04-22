package com.smartbianco.smartbiancoweb.models;

/*Importa pacote JPA para conversar com o MySQL */
import jakarta.persistence.*;
/*Importa o Lombok ajuda na produtividade */
import lombok.Data;

/*Indica para o Java que ela representa uma linha da tabela do banco de dados */
@Entity
/*Identifica qual tabela do banco de dados ela representa */
@Table(name = "tbCargos")
/*Ativa o Lombok */
@Data



public class Cargo {
  /* Define que o atributo id representa a chave primária da tabela */
  @Id
  /* Corresponde ao AUTO_INCREMENT do SQL */
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  /* Tipo de dado que vamos usar */
  private Integer id;

  /* Column define regras específicas para a coluna */
  /* nullable é o o NOT NULL do sql */
  @Column(nullable = false, length = 100)
  /* Tipo de dado que vamos usar */
  private String cargo;
  
}
