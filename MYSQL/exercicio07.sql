CREATE DATABASE db_cidade_das_frutas;
USE db_cidade_das_frutas;

CREATE TABLE tb_categoria (
    id_categoria INT AUTO_INCREMENT,
    cor VARCHAR(255),
    tipo_produto ENUM ('Fruta', 'Verdura'),
    PRIMARY KEY (id_categoria)
);

CREATE TABLE tb_produto (
    id_produto INT AUTO_INCREMENT,
    nome VARCHAR(255),
    quantidade INT NOT NULL,
    distribuidor VARCHAR(255),
    valor DOUBLE NOT NULL,
    fk_id_categoria INT,
    PRIMARY KEY (id_produto),
    FOREIGN KEY (fk_id_categoria) REFERENCES tb_categoria (id_categoria)
    );

INSERT INTO tb_categoria (cor, tipo_produto) VALUES
("vermelho", "fruta"),
("verde", "fruta"),
("roxo", "verdura"),
("laranja", "fruta"),
("laranja", "verdura"),
("vermelho", "verdura")
;


INSERT INTO tb_produto(nome, quantidade, distribuidor, valor, fk_id_categoria) 
VALUES
("Melancia", 3, "MK-1", 60.90,1),
("Tomate", 10, "Seda", 53.40,5),
("Morango", 5, "Morangos do Campo", 79.80,1),
("Laranja", 4, "HortFrut", 32.80,4),
("Limão", 10, "HortFrut", 30.20,2),
("Beterraba", 12, "kiki", 50.40,3),
("repolho roxo", 3, "repolheira", 12.90,3),
("cenoura", 10, "frutdistribuidora", 10.0,5)
;

-- MOSTRA PRODUTOS COM PREÇO MAIOR DO QUE 50 REAIS
SELECT * FROM tb_produto WHERE valor > 50;

-- MOSTRA PRODUTOS COM VALOR ENTRE 3 E 60 REAIS
SELECT * FROM tb_produto WHERE valor > 3 AND valor < 60;

-- MOSTRA PRODUTOS QUE COMEÇAM COM A LETRA C
SELECT * FROM tb_produto WHERE nome LIKE 'l%' ;

-- JUNTA AS DUAS TABELAS
SELECT * FROM tb_categoria
INNER JOIN tb_produto
ON tb_produto.fk_id_categoria = tb_categoria.id_categoria
;

-- JUNTA AS TABELAS E MOSTRA DE ACORDO COM AS ESPECIFICAÇÕES DO WHERE. NESSE CASO, AS DUAS TABELAS APENAS PROS PRODUTOS DO TIPO VERDURA
SELECT * FROM tb_categoria
INNER JOIN tb_produto
ON tb_produto.fk_id_categoria = tb_categoria.id_categoria
WHERE tb_categoria.tipo_produto ='Verdura'
;
