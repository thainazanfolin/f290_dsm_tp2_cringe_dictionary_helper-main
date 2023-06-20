create table palavras(
    id int primary key auto_increment,
    descricao varchar(100) not null,
    significado varchar(500) not null
);

insert into palavras (descricao, significado) values
('de base', 'Morrer...'),
('F','Prestar condolências.'),
('Não Tankou', 'Não aguentou.'),
('Cringe', '25+'),
('chavoso','Estiloso, (Gangsta)');