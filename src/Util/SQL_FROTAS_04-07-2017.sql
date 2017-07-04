CREATE TABLE `abastecimento` (
  `codAbastecimento` int(11) NOT NULL,
  `codVeiculo` varchar(20) DEFAULT NULL,
  `quantidadeAbastecida` float DEFAULT NULL,
  `quilometroAbastecido` int(11) DEFAULT NULL,
  `quilometroDeAbastecimentoAnterior` int(11) DEFAULT NULL,
  `dataAbastecimento` date DEFAULT NULL,
  PRIMARY KEY (`codAbastecimento`)
)

CREATE TABLE `controle` (
  `codControle` int(11) NOT NULL,
  `nomeMotorista` varchar(20) DEFAULT NULL,
  `placaVeiculo` varchar(20) DEFAULT NULL,
  `KmSaida` int(11) DEFAULT NULL,
  `KmEntrada` int(11) DEFAULT NULL,
  `dataSaida` date DEFAULT NULL,
  `dataEntrada` date DEFAULT NULL,
  PRIMARY KEY (`codControle`)
)

CREATE TABLE `motorista` (
  `codMotorista` int(11) NOT NULL AUTO_INCREMENT,
  `nomeMotorista` varchar(40) DEFAULT NULL,
  `categoriaCNH` varchar(3) DEFAULT NULL,
  `numeroCNH` varchar(20) DEFAULT NULL,
  `dataDeEmissaoCNH` date DEFAULT NULL,
  PRIMARY KEY (`codMotorista`)
) 

CREATE TABLE `usuariosistema` (
  `login` varchar(40) NOT NULL,
  `senha` varchar(10) DEFAULT NULL,
  `nivelPermissao` int(11) DEFAULT NULL,
  PRIMARY KEY (`login`)
)

CREATE TABLE `veiculo` (
  `placaVeiculo` varchar(20) NOT NULL,
  `tipoVeiculo` varchar(20) DEFAULT NULL,
  `fabricante` varchar(20) DEFAULT NULL,
  `modelo` varchar(20) DEFAULT NULL,
  `cor` varchar(20) DEFAULT NULL,
  `anoFabricacao` int(11) DEFAULT NULL,
  `numeroChassi` int(11) DEFAULT NULL,
  `capacidadeTanque` int(11) DEFAULT NULL,
  `mediaConsumo` float DEFAULT NULL,
  PRIMARY KEY (`placaVeiculo`)
) 