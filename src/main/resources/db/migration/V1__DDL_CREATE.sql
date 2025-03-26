/*==============================================================*/
/* Table: pessoa                                              */
/*==============================================================*/
-- Long id, String nome, String sobrenome, String telefone, String documento, String email

-- Criação do schema
CREATE SCHEMA IF NOT EXISTS cadastro;

-- Criação da tabela Pessoa
CREATE TABLE IF NOT EXISTS cadastro.pessoa (
    id SERIAL PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    sobrenome VARCHAR(100) NOT NULL,
    telefone VARCHAR(20) NOT NULL,
    documento VARCHAR(20) NOT NULL,
    email VARCHAR(100) NOT NULL
);

-- Alteração do proprietário da tabela
ALTER TABLE cadastro.pessoa OWNER TO postgres;