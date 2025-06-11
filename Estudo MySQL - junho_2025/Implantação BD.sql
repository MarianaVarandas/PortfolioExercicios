create database LocadoraVeiculos;
use LocadoraVeiculos;

create table Cliente(
	idCliente int not null auto_increment,
    CPF varchar (100) not null,
    Nome varchar (50) not null,
    Telefone varchar (20) not null,
    Email varchar (50) not null,
    Endereco varchar (100) not null,
    Primary key (idCliente)
    );
        
-- decidi mudar o nome das colunas para minúscula por padronização
alter table Cliente
change CPF cpf varchar (100) not null,
change Nome nome varchar (50) not null,
change Telefone telefone varchar (20) not null,
change Email email varchar (50) not null,
change Endereco endereco varchar (100) not null;

-- checando se ficou como eu queria:
select * from cliente;

-- como idPagamento será FK de Locacao, opto por criar primeiro a tabela pagamento
 create table Pagamento (
	idPagamento int not null auto_increment,
    forma enum ('Cartao', 'Pix', 'Dinheiro') not null,
    dataPagamento date not null,
    valorTotal decimal (7,2) not null,
    estado enum ('Pago', 'Pendente') not null,
    primary key (idPagamento)
    );   

create table Locacao (
	idLocacao int not null auto_increment,
    idCliente int not null,
    idPagamento int not null,
    dataInicio date not null, 
    dataFim date not null,
    primary key (idLocacao),
    foreign key (idCliente) references Cliente (idCliente),
	foreign key (idPagamento) references Pagamento (idPagamento)
    );
    
create table Veiculo (
	idVeiculo int not null auto_increment,
    modelo varchar (50) not null,
    marca varchar (50) not null,
    ano int not null, 
    placa varchar (10) unique not null,
    valorDiaria decimal (7,2) not null, 
    estado enum ('Disponível', 'Alugado', 'Manutenção'),
	primary key (idVeiculo)
    );   
    
create table LocacaoVeiculo (
	idLocacao int not null,
    idVeiculo int not null,
    primary key (idLocacao, idVeiculo), -- para evitar erros, transformo o combo idLocacao re idVeiculo em uma PK para essa entidade composta
	foreign key (idLocacao) references Locacao (idLocacao),
	foreign key (idVeiculo) references Veiculo (idVeiculo)
    );   
    
create table Manutencao (
	idManutencao int auto_increment not null,
    idVeiculo int not null,
    descricao varchar (100) not null,
    dataManutencao date not null,
    custo decimal (7,2) not null,
	primary key (idManutencao),
    foreign key (idVeiculo) references Veiculo (idVeiculo)
    );  
    
insert into Cliente (CPF, nome, telefone, email, endereco) values
     ('045.159.785-10', 'João da Silva', '(41) 99854-5648', 'joao.s@email.com.br', 'Rua das Flores, 3578, Curitiba - PR'),
     ('147.963.789-02', 'Maria de Souza', '(21) 99763-1213', 'maria.s@email.com.br', 'Rua Vicente Machado, 10503, apto. 1007, Rio de Janeiro - RJ'),
     ('357.456.309-07', 'Carlos Mendes', '(85) 98754-2050', 'carlos.m@email.com.br', 'Rua Osvaldo Cruz, 578, Fortaleza - CE'),
     ('569.428.308.12', 'Ana Oliveira', '(11) 99527-3721', 'ana.o@email.com.br', 'Avenida Ipiranga, 1246, apto. 201, São Paulo - SP'),
     ('096.429.761-05', 'Pedro dos Santos', '(92) 98418-3141', 'pedro.s@email.com.br', 'Rua Venezuela, 649, Manaus - AM'),
     ('548.302.980-13', 'Fernanda Lima', '(51) 99234-5458', 'fernanda.l@email.com.br', 'Avenida Uruguai, 3152, apto. 2202, Porto Alegre - RS'),
     ('947.652.415-09', 'Ricardo Alves', '(65) 98953-7828', 'ricardo.a@email.com.br', 'Rua dos Açudes, 1029, Cuiabá - MT'),
     ('012.359.678-15', 'Juliana Costa', '(63) 99315-6264', 'juliana.c@email.com.br', 'Avenida Brasil, 953, apto. 709, Palmas - TO'),
     ('254.635.485-05', 'Lucas Martins', '(71) 99264-3585', 'lucas.m@email.com.br', 'Rua dos Baianos, 12549, Salvador - BA'),
     ('785.126.497-72', 'Beatriz Rocha', '(69) 98767-1545', 'beatriz.r@email.com.br', 'Rua Indenpendente, 209, Porto Velho - RO');
     
	select * from cliente;

insert into Veiculo (modelo, marca, ano, placa, valorDiaria, estado) values
     ('Onix', 'Chevrolet', 2021, 'ABC-1D34', 150.00, 'Disponível'),
     ('HB20', 'Hyundai', 2022, 'XYZ-5E78', 180.00, 'Alugado'),
     ('Gol', 'Volkswagen', 2020, 'DEF-9W12', 140.00, 'Alugado'),
     ('Civic', 'Honda', 2023, 'GHI-3F56', 250.00, 'Disponível'),
     ('Corolla', 'Toyota', 2022, 'JKL-7I90', 240.00, 'Alugado'),
     ('Fiesta', 'Ford', 2019, 'MNO-2P45', 130.00, 'Manutenção'),
     ('Cruze', 'Chevrolet', 2021, 'PQR-6A89', 200.00, 'Disponível'),
     ('Duster', 'Renault', 2022, 'STU-1Z34', 220.00, 'Alugado'),
     ('Toro', 'Fiat', 2023, 'VWX-5Q78', 260.00, 'Manutenção'),
     ('Compass', 'Jeep', 2024, 'YZA-9S12', 280.00, 'Disponível');
    
insert into Manutencao (idVeiculo, descricao, dataManutencao, custo) values
     (1, 'Troca de óleo e revisão geral', '2024-12-09', 200.00),
     (1, 'Substituição de pneu', '2024-12-10', 600.00),
     (3, 'Troca de pastilhas de freio', '2024-12-14', 450.00),
     (5, 'Alinhamento e balanceamento', '2024-12-18', 150.00),
     (5, 'Revisão elétrica completa', '2024-12-28', 500.00),
     (8, 'Reparo na suspensão', '2025-01-05', 700.00),
     (10, 'Troca do sistema de escapamento', '2025-01-07', 750.00),
     (6, 'Troca de bateria', '2025-01-17', 400.00),
     (6, 'Substituição do filtro de ar', '2025-01-17', 120.00),
     (9, 'Pintura e retoques na lataria', '2025-01-28', 900.00);

insert into Pagamento (forma, dataPagamento, valorTotal, estado) values
     ('Cartão', '2024-12-01', 360.00, 'Pago'),
     ('Cartão', '2024-12-01', 140.00, 'Pago'),
     ('Pix', '2024-12-05', 480.00, 'Pago'),
     ('Cartão', '2024-12-10', 1100.00, 'Pago'),
     ('Dinheiro', '2024-12-11', 1350.00, 'Pago'),
     ('Cartão', '2024-12-15', 2210.00, 'Pago'),
     ('Pix', '2024-12-20', 1080.00, 'Pago'),
     ('Pix', '2024-12-23', 2200.00, 'Pago'),
     ('Cartão', '2024-12-26', 500.00, 'Pago'),
     ('Pix', '2024-12-28', 840.00, 'Pago'),
     ('Pix', '2025-01-02', 520.00, 'Pago'),
     ('Dinheiro', '2025-01-05', 900.00, 'Pago'),
     ('Cartão', '2025-01-05', 260.00, 'Pago'),
     ('Cartão', '2025-01-09', 1120.00, 'Pago'),
     ('Pix', '2025-01-12', 600.00, 'Pago'),
     ('Cartão', '2025-01-13', 1680.00, 'Pendente'),
     ('Pix', '2025-01-16', 1040.00, 'Pago'),
     ('Pix', '2025-01-18', 540.00, 'Pendente'),
     ('Cartão', '2025-01-19', 280.00, 'Pendente'),
     ('Pix', '2025-01-21', 880.00, 'Pendente');


insert into Locacao (idCliente, idPagamento, dataInicio, dataFim) values
     (1, 1, '2024-12-01', '2024-12-03'),
     (2, 2, '2024-12-01', '2024-12-02'),
     (3, 3, '2024-12-05', '2024-12-07'),
     (1, 4, '2024-12-10', '2024-12-15'),
     (4, 5, '2024-12-11', '2024-12-20'),
     (2, 6, '2024-12-15', '2025-01-01'),
     (5, 7, '2024-12-20', '2024-12-26'),
     (6, 8, '2024-12-23', '2025-01-02'),
     (1, 9, '2024-12-26', '2024-12-28'),
     (3, 10, '2024-12-28', '2025-01-03'),
     (7, 11, '2025-01-02', '2025-01-04'),
     (4, 12, '2025-01-05', '2025-01-10'),
     (6, 13, '2025-01-05', '2025-01-07'),
     (8, 14, '2025-01-09', '2025-01-13'),
     (7, 15, '2025-01-12', '2025-01-15'),
     (9, 16, '2025-01-13', '2025-01-20'),
     (10, 17, '2025-01-16', '2025-01-20'),
     (9, 18, '2025-01-18', '2025-01-21'),
     (5, 19, '2025-01-19', '2025-01-20'),
     (1, 20, '2025-01-21', '2025-01-25');

insert into LocacaoVeiculo (idLocacao, idVeiculo) values
     (1, 2),
     (2, 3),
     (3, 5),
     (4, 8),
     (5, 1),
     (6, 6),
     (7, 2),
     (8, 8),
     (9, 4),
     (10, 3),
     (11, 9),
     (12, 2),
     (13, 6),
     (14, 10),
     (15, 7),
     (16, 5),
     (17, 9),
     (18, 2),
     (19, 10),
     (20, 8);
     


