CREATE TABLE Controle (
codControle int PRIMARY KEY,
codMotorista int,
codVeiculo varchar(20),
KmSaida int,
KmEntrada int,
dataSaida date,
dataEntrada date
)

CREATE TABLE Veiculo (
placaVeiculo varchar(20) PRIMARY KEY,
tipoVeiculo varchar(20),
fabricante varchar(20),
modelo varchar(20),
cor varchar(20),
codVeiculo int,
anoFabricacao int,
numeroChassi int,
capacidadeTanque int,
mediaConsumo float
)

CREATE TABLE Abastecimento (
codAbastecimento int PRIMARY KEY,
codVeiculo varchar(20),
quantidadeAbastecida float,
quilometroAbastecido int,
quilometroDeAbastecimentoAnterior int,
dataAbastecimento date
)

CREATE TABLE Motorista (
codMotorista int PRIMARY KEY,
nomeMotorista varchar(40),
categoriaCNH varchar(3),
numeroCNH varchar(20),
dataDeEmissaoCNH date
)

CREATE TABLE UsuarioSistema (
login varchar(40) PRIMARY KEY,
senha varchar(10),
nivelPermissao varchar(20)
)

ALTER TABLE Controle ADD FOREIGN KEY(codMotorista) REFERENCES Motorista (codMotorista)
