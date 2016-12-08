-- phpMyAdmin SQL Dump
-- version 4.0.10deb1
-- http://www.phpmyadmin.net
--
-- Servidor: localhost
-- Tiempo de generación: 08-12-2016 a las 16:03:59
-- Versión del servidor: 5.5.53-0ubuntu0.14.04.1
-- Versión de PHP: 5.5.9-1ubuntu4.20

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Base de datos: `sistema`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `productos`
--

CREATE TABLE IF NOT EXISTS `productos` (
  `IDprod` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `proveedor` text NOT NULL,
  `producto` text NOT NULL,
  `origen` text NOT NULL,
  `destino` text NOT NULL,
  `entrada` int(11) NOT NULL,
  `folio` int(11) NOT NULL,
  `pesokg` bigint(20) NOT NULL,
  `fechaentrada` date NOT NULL,
  `estatus` text NOT NULL,
  `descripcion` text NOT NULL,
  `salida` date NOT NULL,
  `pesobruto` bigint(20) NOT NULL,
  `pesotara` bigint(20) NOT NULL,
  `pesoneto` bigint(20) NOT NULL,
  `fechasalida` date NOT NULL,
  `hora` time NOT NULL,
  PRIMARY KEY (`IDprod`),
  UNIQUE KEY `IDProducto` (`IDprod`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=12 ;

--
-- Volcado de datos para la tabla `productos`
--

INSERT INTO `productos` (`IDprod`, `proveedor`, `producto`, `origen`, `destino`, `entrada`, `folio`, `pesokg`, `fechaentrada`, `estatus`, `descripcion`, `salida`, `pesobruto`, `pesotara`, `pesoneto`, `fechasalida`, `hora`) VALUES
(9, 'Avila', 'aciete', 'chiapas', 'campeche', 12, 123, 12000, '2016-12-08', 'incompleto', 'flojo', '2016-12-09', 13000, 1000, 12000, '2016-12-07', '07:25:00'),
(11, 'Pansoncito', 'semillas', 'chiapas', 'Cruz Blanco', 16, 1234, 5000, '2016-12-09', 'incompleto', 'flojo', '2016-12-09', 6000, 1000, 5000, '2016-12-09', '00:00:00');

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
