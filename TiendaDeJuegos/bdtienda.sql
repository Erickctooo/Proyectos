-- phpMyAdmin SQL Dump
-- version 4.7.0
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 29-11-2022 a las 00:00:42
-- Versión del servidor: 10.1.25-MariaDB
-- Versión de PHP: 5.6.31

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `bdtienda`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tbplay`
--

CREATE TABLE `tbplay` (
  `annolanzamiento` int(4) NOT NULL,
  `dlc` tinyint(1) NOT NULL,
  `codigo` varchar(10) NOT NULL,
  `nombrejuego` varchar(60) NOT NULL,
  `nombredistribuidor` varchar(60) NOT NULL,
  `preciojuego` int(6) NOT NULL,
  `stock` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `tbplay`
--

INSERT INTO `tbplay` (`annolanzamiento`, `dlc`, `codigo`, `nombrejuego`, `nombredistribuidor`, `preciojuego`, `stock`) VALUES
(2022, 0, '1111', 'God of War', 'Pc Factory', 80000, 22),
(2018, 1, '22222', 'Spiderman', 'Sony', 60000, 31),
(2016, 0, '3333', 'Uncharted 4', 'Naughty Dog', 63990, 15),
(2020, 1, '4444', 'Ghost of tsuchima', 'Sony', 71000, 18);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tbxbox`
--

CREATE TABLE `tbxbox` (
  `multijugador` tinyint(1) NOT NULL,
  `duracionjuego` int(10) NOT NULL,
  `codigo` varchar(10) NOT NULL,
  `nombrejuego` varchar(60) NOT NULL,
  `nombredistribuidor` varchar(60) NOT NULL,
  `preciojuego` int(6) NOT NULL,
  `stock` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `tbxbox`
--

INSERT INTO `tbxbox` (`multijugador`, `duracionjuego`, `codigo`, `nombrejuego`, `nombredistribuidor`, `preciojuego`, `stock`) VALUES
(1, 100, '2222', 'Fifa 23', 'We play', 72000, 19),
(1, 40, '5555', 'Halo', 'Microsoft', 50000, 10),
(1, 10, '7777', 'Call of duty', 'Activision', 75000, 25),
(1, 25, '8888', 'Doom', 'Microsoft', 40000, 12);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `tbplay`
--
ALTER TABLE `tbplay`
  ADD PRIMARY KEY (`codigo`);

--
-- Indices de la tabla `tbxbox`
--
ALTER TABLE `tbxbox`
  ADD PRIMARY KEY (`codigo`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
