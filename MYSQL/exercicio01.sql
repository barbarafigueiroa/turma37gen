-- CRIA O BANCO DE DADOS
CREATE DATABASE db_rh;

-- USA O BANCO DE DADOS
USE db_rh;

-- CRIA UMA TABELA DE FUNCIONÁRIOS COM 5 ATRIBUTOS E UMA CHAVE PRIMÁRIA 
CREATE TABLE tb_funcionarios(
	id_funcionario INT AUTO_INCREMENT,
	nome VARCHAR(255),
	email VARCHAR(255),
	cargo VARCHAR (255),
	salario DOUBLE NULL,
	PRIMARY KEY(id_funcionario)
);

-- PREENCHE A TABELA
INSERT INTO tb_funcionarios(nome, email, cargo, salario) VALUES 
("Bárbara", "bfamorim@outlook.com", "Estudante", 500.00),
("Júlia", "julia@outlook.com", "Professor", 1500.00),
("Clara", "clara@outlook.com", "Diretora", 2500.00),
("Selma", "selma@outlook.com", "Coordenadora", 5000.00),
("Ricardo", "rick@outlook.com", "Vice-Diretor", 1800.00)
;

-- MOSTRA OS FUNCIONÁRIOS COM SALÁRIO MAIOR QUE 2000
SELECT * FROM tb_funcionarios WHERE salario > 2000;


-- MOSTRA OS FUNCIONÁRIOS COM SALÁRIO MENOR QUE 2000
SELECT * FROM tb_funcionarios WHERE salario > 2000;

-- ATUALIZANDO ALGUM DADO

-- USA ESTE BANCO DE DADOS
USE db_rh;

-- ALTERA O VALOR DO SALARIO DA ESTUDANTE DE ID = 1, NO CASO BÁRBARA, SAI DE 500 PARA 900
UPDATE tb_funcionarios SET salario =  900.00 WHERE id_funcionario = 1;



