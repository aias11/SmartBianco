CREATE DATABASE SmartBianco;
USE SmartBianco;

CREATE TABLE funcionarios (
    id INT AUTO_INCREMENT PRIMARY KEY,
    cargo VARCHAR(50), 
    nome VARCHAR(100) NOT NULL,
    cpf VARCHAR(14),
    senha VARCHAR(100),
    telefone VARCHAR(20),
    genero VARCHAR(20),
    data_nasc VARCHAR(10),
    salario VARCHAR(20),
    status VARCHAR(20)
);

CREATE TABLE cargos (
    id_cargo INT AUTO_INCREMENT PRIMARY KEY,
    salario VARCHAR(20),
    nome_cargo VARCHAR(100) NOT NULL
);

INSERT INTO cargos (nome_cargo, salario) VALUES ('Gerente', '5000.00'), ('Treinador', '3000.00'), ('Faxineiro', '2000.00');

CREATE TABLE clientes (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    cpf VARCHAR(14) UNIQUE,
    telefone VARCHAR(20),
    senha VARCHAR(100),
    data_nascimento VARCHAR(20), 
    genero VARCHAR(20),
    assinatura VARCHAR(50), 
    valor VARCHAR(15),         
    status VARCHAR(20)          
);

CREATE TABLE fichas_treino (
    id INT AUTO_INCREMENT PRIMARY KEY,
    cliente_id INT,                 
    dia_semana VARCHAR(20),         
    exercicio VARCHAR(100),         
    series VARCHAR(20),           
    repeticoes VARCHAR(20),       
    FOREIGN KEY (cliente_id) REFERENCES clientes(id) ON DELETE CASCADE
);

CREATE TABLE assinaturas (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nome_assinatura VARCHAR(50) NOT NULL,
    valor varchar(15) NOT NULL,
    duracao varchar(20) NOT NULL
);

DROP TABLE IF EXISTS fichas_treino; 
DROP TABLE IF EXISTS clientes;
drop table funcionarios;
drop table assinaturas;
drop table cargos;
drop DATABASE smartbianco;
