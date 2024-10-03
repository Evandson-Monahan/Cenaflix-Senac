CREATE DATABASE cenaflix_bd;

USE cenaflix_bd;

CREATE TABLE filmes (
  id INT NOT NULL AUTO_INCREMENT,
  nome VARCHAR (150) NOT NULL,
  datalancamento DATE NOT NULL,
  categoria VARCHAR (100) NOT NULL,
  PRIMARY KEY (id)
);

SELECT * FROM filmes;

ALTER TABLE filmes ADD CONSTRAINT UNIQUE (nome);