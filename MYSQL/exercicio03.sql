CREATE DATABASE db_escola;

USE db_escola;

-- CRIA UMA TABELA DE ALUNOS COM 5 ATRIBUTOS E UMA CHAVE PRIMÁRIA 
CREATE TABLE tb_alunos(
	id_aluno INT AUTO_INCREMENT,
	nome VARCHAR(255),
	matricula INT NOT NULL,
	nota DOUBLE NOT NULL,
	serie VARCHAR(255),
	PRIMARY KEY(id_aluno)
);

-- PREENCHE A TABELA
INSERT INTO tb_alunos(nome, matricula, nota, serie) VALUES 
("Bruna", 000012, 10.0, "3 serie"),
("Bárbara",  000013, 9.5, "3 serie"),
("Luiza",  000014, 7.7, "1 serie"),
("Arthur",  000015, 8.9, "alfa"),
("Alyson",  000016, 6.8, "1 serie"),
("Vinicius",  000017, 4.6, "7 serie"),
("Amancio",  000018, 10.0, "8 serie"),
("Amancio",  000018, 10.0, "6 serie")
;

-- MOSTRA OS ALUNOS COM NOTA MAIOR QUE
SELECT * FROM tb_alunos WHERE nota > 7;


-- MOSTRA OS ALUNOS COM NOTA MENOR QUE
SELECT * FROM tb_alunos WHERE nota > 7;

-- ATUALIZANDO ALGUM DADO

-- USA ESTE BANCO DE DADOS
USE db_escola;

-- ALTERA A SÉRIE DO ALUNO
UPDATE tb_alunos SET serie =  "alfa" WHERE id_aluno = 1;