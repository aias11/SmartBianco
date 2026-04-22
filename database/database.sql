create database if not exists BDSmartBianco;
use bdsmartbianco;

CREATE TABLE IF NOT EXISTS tbCargos(
    id INT PRIMARY KEY AUTO_INCREMENT,
    cargo VARCHAR(100) NOT NULL
);

create table if not exists tbFuncionarios (
id int primary key,
nome varchar (30) not null,
cpf VARCHAR(11) not null,
senha varchar (100) not null,
telefone varchar (20) not null,
data_nasc date not null,
sexo varchar (10) not null,
id_cargo INT NOT NULL,
Foreign Key (id_cargo) REFERENCES tbCargos(id)
);

create table if not exists tbTreino (
id int primary key auto_increment,
descricao text not null
);

create table if not exists tbAssinatura (
id int primary key auto_increment,
plano varchar (10) not null,
valor decimal (8,2) not null
);

create table if not exists tbClientes (
id int primary key auto_increment,
nome varchar (30) not null,
cpf varchar (11) not null,
senha varchar (100) not null,
telefone varchar (20) not null,
data_nasc date not null,
sexo varchar (10) not null,
id_as int not null,
foreign key (id_as)
references tbAssinatura (id),
as_on boolean not null default true,
id_treino int not null,
foreign key (id_treino)
references tbTreino (id)
);
/* inserts */


INSERT INTO tbAssinatura (plano, valor)
VALUES
('MENSAL', 140.99),
('ANUAL', 110.99),
('BLACK', 135.99);


INSERT INTO tbTreino (descricao)
VALUES
("TESTE"),
("INICIANTE"),
("INTERMEDIARIO"),
("AVANÇADO"),
("PERSONALIZADO");



INSERT INTO tbCargos (cargo) VALUES
('Gerente'),
('Supervisor'),
('Recepcionista'),
('Instrutor de Musculação'),
('Personal Trainer'),
('Professor de Aula Coletiva'),
('Nutricionista'),
('Fisioterapeuta'),
('Coordenador Técnico'),
('Estagiário'),
('Auxiliar de Limpeza'),
('Zelador'),
('Segurança'),
('Atendente Comercial'),
('Consultor de Vendas'),
('Administrador');




INSERT INTO tbFuncionarios
(id, nome, cpf, senha, telefone, data_nasc, sexo, id_cargo) VALUES
(1, 'Carlos Silva', 12345678901, '123456', '(11) 91234-5678', '1985-03-15', 'Masculino', 1), -- Gerente
(2, 'Mariana Souza', 23456789012, '123456', '(11) 92345-6789', '1990-07-22', 'Feminino', 2), -- Supervisora
(3, 'João Pereira', 34567890123, '123456', '(11) 93456-7890', '1998-01-10', 'Masculino', 4), -- Instrutor
(4, 'Ana Oliveira', 45678901234, '123456', '(11) 94567-8901', '1995-05-30', 'Feminino', 5), -- Personal
(5, 'Lucas Santos', 56789012345, '123456', '(11) 95678-9012', '2000-09-12', 'Masculino', 10), -- Estagiário
(6, 'Fernanda Costa', 67890123456, '123456', '(11) 96789-0123', '1988-11-08', 'Feminino', 7), -- Nutricionista
(7, 'Ricardo Almeida', 78901234567, '123456', '(11) 97890-1234', '1982-06-18', 'Masculino', 9), -- Coordenador
(8, 'Juliana Rocha', 89012345678, '123456', '(11) 98901-2345', '1993-04-25', 'Feminino', 3), -- Recepcionista
(9, 'Bruno Martins', 90123456789, '123456', '(11) 99012-3456', '1987-12-03', 'Masculino', 12), -- Limpeza
(10, 'Patricia Lima', 11223344556, '123456', '(11) 99123-4567', '1996-08-14', 'Feminino', 14); -- Comercial




INSERT INTO tbClientes 
(nome, cpf, senha, telefone, data_nasc, sexo, id_as, as_on, id_treino) VALUES
('Gustavo Alves', '12345678901', '123456', '(11) 91111-1111', '2003-05-10', 'Masculino', 3, true, 4),
('Camila Ferreira', '23456789012', '123456', '(11) 92222-2222', '1999-08-21', 'Feminino', 1, true, 2),
('Rafael Gomes', '34567890123', '123456', '(11) 93333-3333', '1995-02-14', 'Masculino', 2, true, 3),
('Juliana Martins', '45678901234', '123456', '(11) 94444-4444', '2001-11-30', 'Feminino', 1, false, 1),
('Bruno Carvalho', '56789012345', '123456', '(11) 95555-5555', '1992-07-09', 'Masculino', 3, true, 5),
('Larissa Souza', '67890123456', '123456', '(11) 96666-6666', '1998-03-18', 'Feminino', 2, true, 3),
('Diego Santos', '78901234567', '123456', '(11) 97777-7777', '1989-12-01', 'Masculino', 1, false, 2),
('Fernanda Alves', '89012345678', '123456', '(11) 98888-8888', '2000-06-25', 'Feminino', 3, true, 4),
('Lucas Pereira', '90123456789', '123456', '(11) 99999-9999', '1997-09-13', 'Masculino', 2, true, 3),
('Patricia Lima', '11223344556', '123456', '(11) 90000-0000', '1994-04-07', 'Feminino', 1, true, 2);



/* Selects */


SELECT cl.nome, cl.cpf, cl.senha, cl.telefone, cl.sexo, ass.plano, cl.as_on as ativo, tr.descricao as niveDeTreino FROM tbclientes cl
JOIN tbassinatura ass ON cl.id_as = ass.id
JOIN tbtreino tr ON cl.id_treino = tr.id;


SELECT func.nome, func.cpf, func.telefone, func.sexo, cr.cargo FROM tbfuncionarios func
JOIN tbcargos cr ON func.id_cargo = cr.id;
