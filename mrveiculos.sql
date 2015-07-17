-- phpMyAdmin SQL Dump
-- version 4.3.11
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: 17-Jul-2015 às 15:19
-- Versão do servidor: 5.6.24
-- PHP Version: 5.6.8

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `mrveiculos`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `clientefisico`
--

CREATE TABLE IF NOT EXISTS `clientefisico` (
  `id` int(5) NOT NULL,
  `nome` varchar(50) NOT NULL,
  `cpf` varchar(14) NOT NULL,
  `rg` varchar(20) DEFAULT NULL,
  `habilitacao` varchar(20) NOT NULL,
  `endereco` varchar(60) NOT NULL,
  `tel1` varchar(15) NOT NULL,
  `tel2` varchar(15) DEFAULT NULL
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `clientefisico`
--

INSERT INTO `clientefisico` (`id`, `nome`, `cpf`, `rg`, `habilitacao`, `endereco`, `tel1`, `tel2`) VALUES
(1, 'Ricardo Emidio Lessa Santos', '2', '319', '3', 'f', '2', '2'),
(2, 'Alan da Silva', '092.023.223-93', '12123', '4353', 'Rua A, 543, bairro: Vergel do Lago', '(82)98822-3322', '(82)93322-3321'),
(3, 'Joao', '32345', '344', '234', 'JL', '4353', '4321'),
(4, 'teste', '99999', '99999', '8876', 'tgttf', '8877', '9866'),
(5, 'Teste1', 'cpf1', 'rg1', 'hab1', 'end1', 'tel1', 'tel2');

-- --------------------------------------------------------

--
-- Estrutura da tabela `clientejuridico`
--

CREATE TABLE IF NOT EXISTS `clientejuridico` (
  `id` int(5) NOT NULL,
  `nome` varchar(50) NOT NULL,
  `cnpj` varchar(20) NOT NULL,
  `endereco` varchar(25) NOT NULL,
  `tel1` varchar(15) NOT NULL,
  `tel2` varchar(15) NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `clientejuridico`
--

INSERT INTO `clientejuridico` (`id`, `nome`, `cnpj`, `endereco`, `tel1`, `tel2`) VALUES
(1, 'Alimentos SA LTDA', '332244-23', 'Joaquim Leão, 53', '3322-3322', '4455-3322'),
(2, 'LJ', '21', 'df', '3223', '2345'),
(3, 'cli2', 'cnoj2', 'end2', 'tel12', 'tel22');

-- --------------------------------------------------------

--
-- Estrutura da tabela `locacao`
--

CREATE TABLE IF NOT EXISTS `locacao` (
  `id` int(5) NOT NULL,
  `codCliente` int(5) NOT NULL,
  `idVeiculo` int(5) NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `locacao`
--

INSERT INTO `locacao` (`id`, `codCliente`, `idVeiculo`) VALUES
(1, 2, 7),
(2, 2, 7),
(3, 2, 7);

-- --------------------------------------------------------

--
-- Estrutura da tabela `veiculo`
--

CREATE TABLE IF NOT EXISTS `veiculo` (
  `id` int(5) NOT NULL,
  `marca` varchar(15) NOT NULL,
  `modelo` varchar(15) NOT NULL,
  `placa` varchar(7) NOT NULL,
  `chassi` varchar(20) NOT NULL,
  `cor` varchar(10) NOT NULL,
  `qtdPortas` int(5) NOT NULL,
  `statusLocado` tinyint(1) NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `veiculo`
--

INSERT INTO `veiculo` (`id`, `marca`, `modelo`, `placa`, `chassi`, `cor`, `qtdPortas`, `statusLocado`) VALUES
(1, 'fiat', 'palio', 'ohh1020', 'dsf39fjfs0cm3', 'azul', 5, 1),
(2, 'ford', 'ka', 'mnm2030', 'docod3odvomdo3', 'vermelho', 3, 0),
(3, 'volkswagen', 'gol', 'nmh3040', 'dkfmos39f00d', 'branco', 5, 0),
(4, 'volkswagen', 'fox', 'ohh5543', 'odfkofk3o403', 'preto', 5, 1),
(5, 'fiat', 'uno', 'orm4349', 'sodsodkso304402mc', 'branco', 3, 0),
(6, 'fiat', 'freemont', 'orm4433', 'sofmo3mg4o', 'azul', 3, 0),
(7, 'ford', 'fusion', 'erf9090', 'sdpomfw409mwv', 'branco', 5, 0),
(8, 'ford', 'courier', 'orr3322', '3r23prm34p', 'amarelo', 5, 0),
(9, 'marca1', 'mod1', 'orm3344', '340tk0g3', 'azul', 3, 0);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `clientefisico`
--
ALTER TABLE `clientefisico`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `clientejuridico`
--
ALTER TABLE `clientejuridico`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `locacao`
--
ALTER TABLE `locacao`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `veiculo`
--
ALTER TABLE `veiculo`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `clientefisico`
--
ALTER TABLE `clientefisico`
  MODIFY `id` int(5) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=6;
--
-- AUTO_INCREMENT for table `clientejuridico`
--
ALTER TABLE `clientejuridico`
  MODIFY `id` int(5) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=4;
--
-- AUTO_INCREMENT for table `locacao`
--
ALTER TABLE `locacao`
  MODIFY `id` int(5) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=4;
--
-- AUTO_INCREMENT for table `veiculo`
--
ALTER TABLE `veiculo`
  MODIFY `id` int(5) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=10;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
