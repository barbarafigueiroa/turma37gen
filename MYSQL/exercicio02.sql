CREATE DATABASE db_ecommerce;

USE db_ecommerce;

-- CRIA UMA TABELA DE PRODUTOS COM 5 ATRIBUTOS E UMA CHAVE PRIMÁRIA 
CREATE TABLE tb_produtos(
	id_produto INT AUTO_INCREMENT,
	nome VARCHAR(255),
	valor DOUBLE,
	marca VARCHAR (255),
	codigo VARCHAR(255),
	PRIMARY KEY(id_produto)
);

-- PREENCHE A TABELA
INSERT INTO tb_produtos(nome, valor, marca, codigo) VALUES 
("Monitor", 1500.00, "CCE", "P-001"),
("Teclado", 250.00, "Alien", "P-002"),
("Mouse", 78.90, "eoxGame", "P-003"),
("Phone", 540.0, "hp", "P-004"),
("Mousepad", 30.99, "DELL", "P-005"),
("Carregador", 59.75, "Sony", "P-006"),
("Cabo HDMI", 25.40, "marca anonima", "P-007")
;
INSERT INTO tb_produtos(nome, valor, marca, codigo) VALUES 
("Cadeira", 1500.00, "marca Gamer", "P-008");

-- SELECIONA PRODUTOS COM VALOR MAIOR QUE 500
SELECT * FROM tb_produtos WHERE valor > 500;

-- SELECIONA PRODUTOS COM VALOR MENOR QUE 500
SELECT * FROM tb_produtos WHERE valor < 500;

-- ATUALIZA O VALOR DE UM ITEM

USE db_ecommerce;
UPDATE tb_produtos SET valor = 200.00 WHERE id_produto = 1;
