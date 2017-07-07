-- phpMyAdmin SQL Dump
-- version 4.7.0
-- https://www.phpmyadmin.net/
--
-- Host: localhost
-- Generation Time: 08-Jul-2017 às 01:04
-- Versão do servidor: 10.1.21-MariaDB
-- PHP Version: 5.6.30

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `frotas`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `abastecimento`
--

CREATE TABLE `abastecimento` (
  `codAbastecimento` int(11) NOT NULL,
  `codVeiculo` varchar(20) DEFAULT NULL,
  `quantidadeAbastecida` float DEFAULT NULL,
  `quilometroAbastecido` int(11) DEFAULT NULL,
  `quilometroDeAbastecimentoAnterior` int(11) DEFAULT NULL,
  `dataAbastecimento` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estrutura da tabela `controle`
--

CREATE TABLE `controle` (
  `codControle` int(11) NOT NULL,
  `nomeMotorista` varchar(20) DEFAULT NULL,
  `placaVeiculo` varchar(20) DEFAULT NULL,
  `KmSaida` int(11) DEFAULT NULL,
  `KmEntrada` int(11) DEFAULT NULL,
  `dataSaida` date DEFAULT NULL,
  `dataEntrada` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estrutura da tabela `motorista`
--

CREATE TABLE `motorista` (
  `codMotorista` int(255) NOT NULL,
  `nomeMotorista` varchar(40) CHARACTER SET utf8 DEFAULT NULL,
  `categoriaCNH` varchar(2) CHARACTER SET utf8 DEFAULT NULL,
  `numeroCNH` varchar(11) CHARACTER SET utf8 DEFAULT NULL,
  `dataDeVencimento` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estrutura da tabela `usuariosistema`
--

CREATE TABLE `usuariosistema` (
  `login` varchar(20) NOT NULL,
  `senha` varchar(10) DEFAULT NULL,
  `nivelPermissao` varchar(7) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estrutura da tabela `veiculo`
--

CREATE TABLE `veiculo` (
  `placaVeiculo` varchar(20) NOT NULL,
  `tipoVeiculo` varchar(20) DEFAULT NULL,
  `fabricante` varchar(20) DEFAULT NULL,
  `modelo` varchar(20) DEFAULT NULL,
  `cor` varchar(20) DEFAULT NULL,
  `anoFabricacao` int(11) DEFAULT NULL,
  `numeroChassi` int(11) DEFAULT NULL,
  `capacidadeTanque` int(11) DEFAULT NULL,
  `mediaConsumo` float DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `abastecimento`
--
ALTER TABLE `abastecimento`
  ADD PRIMARY KEY (`codAbastecimento`);

--
-- Indexes for table `controle`
--
ALTER TABLE `controle`
  ADD PRIMARY KEY (`codControle`);

--
-- Indexes for table `motorista`
--
ALTER TABLE `motorista`
  ADD PRIMARY KEY (`codMotorista`);

--
-- Indexes for table `usuariosistema`
--
ALTER TABLE `usuariosistema`
  ADD PRIMARY KEY (`login`);

--
-- Indexes for table `veiculo`
--
ALTER TABLE `veiculo`
  ADD PRIMARY KEY (`placaVeiculo`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `abastecimento`
--
ALTER TABLE `abastecimento`
  MODIFY `codAbastecimento` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `motorista`
--
ALTER TABLE `motorista`
  MODIFY `codMotorista` int(255) NOT NULL AUTO_INCREMENT;COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
