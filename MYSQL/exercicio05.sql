CREATE DATABASE db_pizzaria_legal;
USE db_pizzaria_legal;


-- CRIANDO TABELA DE CATEGORIAS
CREATE TABLE tb_categoria(
	id_categoria INT NOT NULL AUTO_INCREMENT,
	tamanho ENUM('Pequena', 'Media', 'Grande'),
	tipo_massa ENUM('Tradicional', 'fina', 'sem borda'),
	PRIMARY KEY (id_categoria)
);

-- CRIANDO TABELA DE PIZZAS
CREATE TABLE tb_pizzas(
	id_pizza INT NOT NULL AUTO_INCREMENT,
	sabor VARCHAR(255),
	borda ENUM('cheddar', 'catupiry'),
    recheio BOOLEAN NOT NULL,
    preco DOUBLE NOT NULL,
    fk_responsavel INT,
	PRIMARY KEY (id_pizza),
    FOREIGN KEY (fk_responsavel) REFERENCES tb_categoria(id_categoria)
);

-- INSERINDO DADOS NA TABELA DE CATEGORIAS
INSERT INTO tb_categoria (tamanho, tipo_massa)
VALUES
("pequena", "fina"),
("pequena", "tradicional"),
("grande", "tradicional"),
("grande", "sem borda"),
("media", "fina"),
("media", "sem borda")
;

-- INSERINDO DADOS NA TABELA DE PIZZAS
INSERT INTO tb_pizzas(sabor, borda, recheio, preco, fk_responsavel)
VALUES
("Calabresa", "catupiry", 1, 35.90, 1),
("Nordestina","cheddar", 0, 65.80, 2),
("Frango e Bacon","cheddar", 1, 45.70, 3),
("Peperoni","catupiry", 0, 80.0, 3),
("Cuz cuz", "cheddar", 1, 25.50, 2),
("Cartola", "cheddar", 0, 28.90, 1)
;

-- MOSTRA PIZZAS COM PREÇO MAIOR DO QUE 45 REAIS
SELECT * FROM tb_pizzas WHERE preco > 45;

-- MOSTRA PIZZAS COM VALOR ENTRE 29 E 60 REAIS
SELECT * FROM tb_pizzas WHERE preco > 29 AND preco < 60;

-- MOSTRA PIZZAS QUE COMEÇAM COM A LETRA C
SELECT * FROM tb_pizzas WHERE sabor LIKE 'c%' ;

-- JUNTA AS DUAS TABELAS
SELECT * FROM tb_categoria
INNER JOIN tb_pizzas
ON tb_pizzas.fk_responsavel = tb_categoria.id_categoria
;

-- JUNTA AS TABELAS E MOSTRA DE ACORDO COM AS ESPECIFICAÇÕES DO WHERE. NESSE CASO, AS DUAS TABELAS APENAS PROS PERSONAGENS QUE TEM RECHEIO 
SELECT * FROM tb_categoria
INNER JOIN tb_pizzas
ON tb_pizzas.fk_responsavel = tb_categoria.id_categoria
WHERE recheio = true;
;