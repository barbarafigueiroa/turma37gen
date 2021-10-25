CREATE DATABASE db_generation_game_online;
USE db_generation_game_online;

-- CRIANDO TABELA DE CLASSES
CREATE TABLE tb_classe(
	id_classe INT NOT NULL AUTO_INCREMENT,
	nome VARCHAR(255),
	habilidade VARCHAR(255),
	PRIMARY KEY (id_classe)
);


-- CRIANDO TABELA DE PERSONAGENS
CREATE TABLE tb_personagens(
id_personagem INT AUTO_INCREMENT,
nome VARCHAR(255) NOT NULL,
poder_defesa INT,
poder_ataque INT,
agilidade INT,
fk_responsavel INT,
PRIMARY KEY(id_personagem),
FOREIGN KEY (fk_responsavel) REFERENCES tb_classe(id_classe)
);

-- INSERINDO CLASSES NA TABELA
INSERT INTO tb_classe (nome, habilidade) 
VALUES
("Elfa", "Encantamento"),
("Mago", "Feitiçaria"),
("Fada", "Pó magico"),
("Arqueiro", "Mira")

;

-- INSERINDO PERSONAGENS NA TABELA
INSERT INTO tb_personagens(nome, poder_defesa, poder_ataque, agilidade, fk_responsavel)
VALUES
("BlueSky", 8900, 2500, 99, 1),
("BruxoWild", 1000, 10000, 100, 2),
("Arcflesh", 7000, 1000, 65, 4),
("BlackWitch", 3000, 7000, 98, 2),
("Clorofila", 2000, 9000, 100, 1),
("Castle", 1000, 2000, 70, 4),
("Sininho", 1500, 4000, 60, 3),
("FadaGreen", 1500, 1000, 50, 3)
;

-- MOSTRANDO PERSONAGENS COM PODER DE ATAQUE MAIOR QUE 2000
SELECT * FROM tb_personagens WHERE poder_ataque > 2000;

-- MOSTRA PERSONAGENS COM PODER DE DEFESA MAIOR QUE 1000 E MENOR QUE 2000
SELECT * FROM tb_personagens WHERE poder_ataque > 1000 AND poder_ataque < 2000;

-- MOSTRA PERSONAGENS QUE COMEÇAM COM C
SELECT * FROM tb_personagens WHERE nome LIKE 'c%' ;

-- JUNTA AS DUAS TABELAS
SELECT * FROM tb_classe
INNER JOIN tb_personagens
ON tb_personagens.fk_responsavel = tb_classe.id_classe
;

-- JUNTA AS TABELAS E MOSTRA DE ACORDO COM AS ESPECIFICAÇÕES DO WHERE. NESSE CASO, AS DUAS TABELAS APENAS PROS PERSONAGENS QUE TEM ID_CLASSE NUMERO 3
SELECT * FROM tb_classe
INNER JOIN tb_personagens
ON tb_personagens.fk_responsavel = tb_classe.id_classe
WHERE id_classe = 3
;


