-- criando banco de dados
CREATE DATABASE db_farmacia_bem_estar;

-- selecionando banco de dados
USE db_farmacia_bem_estar;

-- Criação da tabela tb_categorias
CREATE TABLE tb_categorias (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    nome_categoria VARCHAR(50) NOT NULL,
    descricao_categoria VARCHAR(255)
);

-- Criação da tabela tb_produtos
CREATE TABLE tb_produtos (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    nome_produto VARCHAR(50) NOT NULL,
    preco DECIMAL(10, 2) NOT NULL,
    quantidade_estoque INT NOT NULL,
    validade DATE,
    id_categoria BIGINT,
    FOREIGN KEY (id_categoria) REFERENCES tb_categorias(id)
);

-- Inserindo dados na tabela tb_categorias
INSERT INTO tb_categorias (nome_categoria, descricao_categoria)
VALUES
('Medicamentos', 'Produtos destinados ao tratamento de doenças.'),
('Higiene Pessoal', 'Produtos de uso diário para higiene pessoal.'),
('Beleza', 'Produtos relacionados a cuidados estéticos e beleza.'),
('Suplementos', 'Produtos para complementar a dieta e saúde.'),
('Infantil', 'Produtos específicos para o público infantil.');

-- Inserindo dados na tabela tb_produtos
INSERT INTO tb_produtos (nome_produto, preco, quantidade_estoque, validade, id_categoria)
VALUES
('Paracetamol 500mg', 5.50, 100, '2025-12-31', 1),
('Sabonete Líquido', 8.99, 50, NULL, 2),
('Shampoo Anticaspa', 15.75, 30, NULL, 2),
('Batom Vermelho', 25.00, 20, NULL, 3),
('Ômega 3', 59.90, 40, '2024-11-01', 4),
('Leite em Pó Infantil', 29.90, 60, '2025-03-15', 5),
('Termômetro Digital', 39.99, 15, NULL, 1),
('Condicionador Nutritivo', 12.50, 25, NULL, 2);

-- listando produtos cujo preco é maior do que 50
SELECT * FROM tb_produtos WHERE preco > 50;

-- listando produtos cujo preco é maior do que 5 e menor que 60
SELECT * FROM tb_produtos WHERE preco BETWEEN 5 AND 60;

-- listando produtos cujo nome contem a letra C
SELECT * FROM tb_produtos WHERE nome_produto LIKE '%C%';

-- INNER JOIN unindo tabelas
SELECT 
	p.id,
	p.nome_produto,
    p.preco,
    p.quantidade_estoque,
    p.validade,
    c.nome_categoria
FROM
	tb_produtos AS p
INNER JOIN 
	tb_categorias AS c
ON
	p.id_categoria = c.id;

-- INNER JOIN unindo tabelas, selecinando somente categoria 'Medicamentos'
SELECT 
	p.id,
	p.nome_produto,
    p.preco,
    p.quantidade_estoque,
    p.validade,
    c.nome_categoria
FROM
	tb_produtos AS p
INNER JOIN 
	tb_categorias AS c
ON
	p.id_categoria = c.id
WHERE 
	c.nome_categoria = 'Medicamentos'


