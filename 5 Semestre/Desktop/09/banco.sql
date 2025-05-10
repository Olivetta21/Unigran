Crie um sistema que cadastre veiculos(nome,marca,cor,km,valor)
O sistema deve persistir os dados no postgres
O sistema deve permitir cadastrar e listar o veiculo apartir de telas visuais

create table carro (
    id serial not null primary key,
    nome varchar(64) not null,
    marca varchar(64) not null,
    cor varchar(64) not null,
    km integer not null,
    valor float
)