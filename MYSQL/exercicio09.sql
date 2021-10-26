CREATE DATABASE db_curso_da_minha_vida;
USE db_curso_da_minha_vida;

CREATE TABLE tb_categoria (
    id_categoria INT AUTO_INCREMENT,
    curso ENUM ('java', 'javascript', 'Phyton', 'Banco de dados'),
    turno VARCHAR(255) NOT NULL,
    PRIMARY KEY (id_categoria)
);

CREATE TABLE tb_curso (
    id_curso INT AUTO_INCREMENT,
    nome_aluno VARCHAR(255),
    professor ENUM('Boaz', 'Fernanda'),
    idade INT,
    valor DOUBLE NOT NULL,
    fk_categoria INT,
    PRIMARY KEY (id_curso),
    FOREIGN KEY (fk_categoria) REFERENCES tb_categoria (id_categoria)
    );

INSERT INTO tb_categoria (curso, turno) VALUES
("Java", "Manhã"),
("Javascript", "Tarde"),
("Phyton", "Noite"),
("banco de dados", "Manhã"),
("Java", "Manhã"),
("javascript", "Noite");


INSERT INTO tb_curso(nome_aluno, professor, idade, valor, fk_categoria) 
VALUES
("Bruna", 'Boaz',27,300.00, 1),
("Bárbara", 'Fernanda', 28, 500.00,4),
("Ályson",'Fernanda',30, 700.00, 4),
("Danillo", 'Fernanda', 20.00, 22,3),
("Mayara", 'Boaz', 90.80, 25,6),
("Marília", 'Boaz', 50.60, 20,5),
("Arthur", 'Boaz', 300.00, 21,1),
("Sylvia", 'Boaz', 500.00, 26,4)
;

-- MOSTRA CURSOS COM PREÇO MAIOR DO QUE 50 REAIS
SELECT * FROM tb_curso WHERE valor > 50;

-- MOSTRA CURSOS COM VALOR ENTRE 3 E 60 REAIS
SELECT * FROM tb_curso WHERE valor > 3 AND valor < 60;

-- MOSTRA CURSOS QUE COMEÇAM COM A LETRA C
SELECT * FROM tb_curso WHERE nome_aluno LIKE 'b%' ;

-- JUNTA AS DUAS TABELAS
SELECT * FROM tb_categoria
INNER JOIN tb_curso
ON tb_curso.fk_categoria = tb_categoria.id_categoria
;

-- JUNTA AS TABELAS E MOSTRA DE ACORDO COM AS ESPECIFICAÇÕES DO WHERE. NESSE CASO, AS DUAS TABELAS APENAS PROS CURSOS 
SELECT * FROM tb_categoria
INNER JOIN tb_curso
ON tb_curso.fk_categoria = tb_categoria.id_categoria
WHERE tb_categoria.turno ='n'
;
