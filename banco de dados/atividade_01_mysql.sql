-- criando banco de dados
CREATE DATABASE db_generation_game_online;

-- Selecionando o banco criado
USE db_generation_game_online;

-- criando a tabela de Classes de poder
CREATE TABLE tb_classes (
	id BIGINT PRIMARY KEY AUTO_INCREMENT,
	nome_classe VARCHAR(100) NOT NULL,
    descricao_classe VARCHAR(255) NOT NULL
);

-- adicionando dados a tabela de Classes de poder criada
INSERT INTO tb_classes (nome_classe, descricao_classe)
VALUES
('Líder', 'Personagem que lidera as missões e coordena o time'),
('Combate Corpo a Corpo', 'Especialista em lutas próximas com habilidades físicas aprimoradas'),
('Controle de Elementos', 'Habilidades que permitem controlar ou manipular elementos da natureza'),
('Poder Mental', 'Mutantes com habilidades mentais, como telepatia ou telecinese'),
('Especialista em Infiltração', 'Hábil em espionagem e ataques furtivos');

-- Criando a tabela de personagens
CREATE TABLE tb_personagens (
    id_personagem BIGINT PRIMARY KEY AUTO_INCREMENT,
    nome_personagem VARCHAR(50) NOT NULL,
    nivel_poder INT NOT NULL,
	poder_ataque INT NOT NULL,
    poder_defesa INT NOT NULL,
    tipo_mutacao VARCHAR(100),
    id_classe BIGINT NOT NULL
);

-- Criando a regra para o relacionamento entre classes e personagens
ALTER TABLE tb_personagens ADD CONSTRAINT fk_personagens_classes 
FOREIGN KEY (id_classe) REFERENCES tb_classes(id);

-- inserindo dados na tabela de personagens
INSERT INTO tb_personagens (nome_personagem, nivel_poder, poder_ataque, 
poder_defesa, tipo_mutacao, id_classe)
VALUES
('Professor X', 95, 30, 80, 'Telepatia', 4), -- Poder Mental
('Wolverine', 90, 85, 70, 'Fator de cura e garras retráteis', 2), -- Combate Corpo a Corpo
('Tempestade', 88, 80, 60, 'Controle climático', 3), -- Controle de Elementos
('Ciclope', 85, 75, 65, 'Rajadas ópticas', 1), -- Líder
('Jean Grey', 98, 90, 85, 'Telecinese e telepatia', 4), -- Poder Mental
('Noturno', 80, 60, 50, 'Teletransporte', 5), -- Especialista em Infiltração
('Colossus', 87, 70, 90, 'Pele de aço orgânico', 2), -- Combate Corpo a Corpo
('Mística', 82, 65, 55, 'Mudança de forma', 5); -- Especialista em Infiltração

-- Selecionando personagens cujo poder de ataque é maior do que 80
SELECT * FROM tb_personagens WHERE poder_ataque > 80;

-- Selecionando personagens cujo poder de ataque é maior do que 80 e menor do que 90
SELECT * FROM tb_personagens WHERE poder_ataque BETWEEN 80 AND 90;

-- Selecionando personagens cujo nome contem a letra C
SELECT * FROM tb_personagens WHERE nome_personagem LIKE '%C%';

SELECT 
	p.nome_personagem,
    p.nivel_poder,
    p.poder_ataque,
    p.poder_defesa,
    p.tipo_mutacao,
    c.nome_classe
FROM 
    tb_personagens AS p
INNER JOIN 
    tb_classes AS c 
ON 
	p.id_classe = c.id;
    
SELECT 
	p.nome_personagem,
    p.nivel_poder,
    p.poder_ataque,
    p.poder_defesa,
    p.tipo_mutacao,
    c.nome_classe
FROM 
    tb_personagens AS p
LEFT JOIN 
    tb_classes AS c 
ON 
	p.id_classe = c.id
WHERE 
    c.nome_classe = 'Poder Mental';






