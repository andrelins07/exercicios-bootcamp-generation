-- criando banco de dados
CREATE DATABASE db_pizzaria_legal;

-- selecionando banco criado
USE db_pizzaria_legal;

-- criando tabela com categorias
CREATE TABLE tb_categorias (
	id BIGINT PRIMARY KEY AUTO_INCREMENT,
    nome VARCHAR(100),
    descricao VARCHAR(255)
);

-- criando tabela com pizzas
CREATE TABLE tb_pizzas (
	id BIGINT PRIMARY KEY AUTO_INCREMENT,
	sabor VARCHAR(100),
    preco DECIMAL(4,2),
    avaliacao_geral DECIMAL (2,1),
    ingredientes VARCHAR(255),
    id_categoria BIGINT,
    FOREIGN KEY (id_categoria) REFERENCES tb_categorias(id)
);

-- inserindo dados na tabela de categorias
INSERT INTO tb_categorias (nome, descricao) VALUES
('Tradicional', 'Pizzas clássicas com sabores tradicionais.'),
('Especial', 'Pizzas com combinações únicas e especiais.'),
('Vegetariana', 'Pizzas sem carne, com vegetais e queijos.'),
('Premium', 'Pizzas com ingredientes de alta qualidade.'),
('Doce', 'Pizzas com ingredientes doces e sobremesas.');

-- inserido dados na tabela de pizzas
INSERT INTO tb_pizzas (sabor, preco, avaliacao_geral, ingredientes, id_categoria) VALUES
('Margherita', 30.00, 4.5, 'Mussarela, tomate, manjericão', 1),
('Pepperoni', 68.00, 4.8, 'Mussarela, pepperoni', 1),
('Quatro Queijos', 50.00, 4.9, 'Mussarela, gorgonzola, parmesão, catupiry', 2),
('Vegetariana', 28.00, 4.3, 'Abobrinha, berinjela, tomate, manjericão', 3),
('Calabresa', 35.00, 4.6, 'Calabresa, cebola, azeitonas', 1),
('Frango com Catupiry', 38.00, 4.7, 'Frango, catupiry, milho', 2),
('Trufada', 65.00, 5.0, 'Queijo brie, azeite de trufa, rúcula', 4),
('Nutella', 40.00, 4.9, 'Nutella, morango, leite condensado', 5);

-- listando todos as pizzas com preco maior do que 45
SELECT * FROM tb_pizzas WHERE preco > 45;

-- listando todos as pizzas com preco maior do que 50 e menor que 100
SELECT * FROM tb_pizzas WHERE preco BETWEEN  50 AND 100;

-- listando pizzas cujo nome contem a letra M
SELECT * FROM tb_pizzas WHERE sabor LIKE '%M%';

-- listando dados das duas tabelas relacionadas com INNER JOIN
SELECT 
	p.id,
	p.sabor,
    p.ingredientes,
    p.preco,
    p.avaliacao_geral,
    c.nome
FROM
	tb_pizzas AS P
INNER JOIN 
	tb_categorias AS c
ON
	p.id_categoria = c.id;

-- listando dados das duas tabelas relacionadas com INNER JOIN, quando a categoria da pizza é ESPECIAL
SELECT 
	p.id,
	p.sabor,
    p.ingredientes,
    p.preco,
    p.avaliacao_geral,
    c.nome
FROM
	tb_pizzas AS P
INNER JOIN 
	tb_categorias AS c
ON
	p.id_categoria = c.id
WHERE
	c.nome = 'Especial'
    