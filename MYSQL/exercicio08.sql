CREATE DATABASE db_construindo_a_nossa_vida;
USE db_construindo_a_nossa_vida;

CREATE TABLE tb_categoria (
    id_categoria INT AUTO_INCREMENT,
    prazo_entrega INT NOT NULL,
    tipo_produto ENUM ('hidraulica', 'eletrica'),
    PRIMARY KEY (id_categoria)
);

CREATE TABLE tb_produto (
    id_produto INT AUTO_INCREMENT,
    nome VARCHAR(255),
    quantidade INT NOT NULL,
    marca VARCHAR(255),
    valor DOUBLE NOT NULL,
    fk_id_categoria INT,
    PRIMARY KEY (id_produto),
    FOREIGN KEY (fk_id_categoria) REFERENCES tb_categoria (id_categoria)
    );

INSERT INTO tb_categoria (prazo_entrega, tipo_produto) VALUES
(10, "hidraulica"),
(20, "hidraulica"),
(30, "hidraulica"),
(15, "eletrica"),
(25, "eletrica"),
(5, "eletrica")
;


INSERT INTO tb_produto(nome, quantidade, marca, valor, fk_id_categoria) 
VALUES
("Joelho", 3, "Krona", 20.90,1),
("torneira cromada", 1, "Trigre", 120.89,3),
("Interruptor", 5, "Cliclone", 40.75,4),
("quadro de distribuição", 4, "Luxluz", 280.99,4),
("Lampada", 10, "celpe", 12.00,5),
("cano pvc", 12, "amanco", 80.90,3),
("ralo de banheiro", 3, "BrunaLTDA", 4.99,2),
("cotovelo", 10, "BarbaraS.A", 15.75,1)
;

-- MOSTRA PRODUTOS COM PREÇO MAIOR DO QUE 50 REAIS
SELECT * FROM tb_produto WHERE valor > 50;

-- MOSTRA PRODUTOS COM VALOR ENTRE 3 E 60 REAIS
SELECT * FROM tb_produto WHERE valor > 3 AND valor < 60;

-- MOSTRA PRODUTOS QUE COMEÇAM COM A LETRA C
SELECT * FROM tb_produto WHERE nome LIKE 'c%' ;

-- JUNTA AS DUAS TABELAS
SELECT * FROM tb_categoria
INNER JOIN tb_produto
ON tb_produto.fk_id_categoria = tb_categoria.id_categoria
;

-- JUNTA AS TABELAS E MOSTRA DE ACORDO COM AS ESPECIFICAÇÕES DO WHERE. NESSE CASO, AS DUAS TABELAS APENAS PROS PRODUTOS DO TIPO ELÉTRICA
SELECT * FROM tb_categoria
INNER JOIN tb_produto
ON tb_produto.fk_id_categoria = tb_categoria.id_categoria
WHERE tb_categoria.tipo_produto ='elétrica'
;
