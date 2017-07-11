--
-- Estrutura da tabela `abastecimento`
--

CREATE TABLE `abastecimento` (
  `codAbastecimento` int(11) NOT NULL,
  `placaVeiculo` varchar(7) DEFAULT NULL,
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
  `nomeMotorista` varchar(40) DEFAULT NULL,
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
  `numeroCNH` varchar(255) CHARACTER SET utf8 DEFAULT NULL,
  `dataDeVencimentoCNH` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estrutura da tabela `usuariosistema`
--

CREATE TABLE `usuariosistema` (
  `codUsuario` int(255) NOT NULL,
  `login` varchar(20) NOT NULL,
  `senha` varchar(10) DEFAULT NULL,
  `nivelPermissao` varchar(7) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `usuariosistema`
--

INSERT INTO `usuariosistema` (`codUsuario`, `login`, `senha`, `nivelPermissao`) VALUES
(1, 'admin', 'admin', 'TOTAL'),
(2, 'teste', 'teste', 'PARCIAL');

-- --------------------------------------------------------

--
-- Estrutura da tabela `veiculo`
--

CREATE TABLE `veiculo` (
  `codVeiculo` int(255) NOT NULL,
  `placaVeiculo` varchar(20) NOT NULL,
  `tipoVeiculo` varchar(20) DEFAULT NULL,
  `fabricante` varchar(20) DEFAULT NULL,
  `modelo` varchar(20) DEFAULT NULL,
  `cor` varchar(20) DEFAULT NULL,
  `anoFabricacao` int(11) DEFAULT NULL,
  `numeroChassi` varchar(255) DEFAULT NULL,
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
  ADD PRIMARY KEY (`codUsuario`);

--
-- Indexes for table `veiculo`
--
ALTER TABLE `veiculo`
  ADD PRIMARY KEY (`codVeiculo`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `abastecimento`
--
ALTER TABLE `abastecimento`
  MODIFY `codAbastecimento` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `controle`
--
ALTER TABLE `controle`
  MODIFY `codControle` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `motorista`
--
ALTER TABLE `motorista`
  MODIFY `codMotorista` int(255) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `usuariosistema`
--
ALTER TABLE `usuariosistema`
  MODIFY `codUsuario` int(255) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
--
-- AUTO_INCREMENT for table `veiculo`
--
ALTER TABLE `veiculo`
  MODIFY `codVeiculo` int(255) NOT NULL AUTO_INCREMENT;COMMIT;

