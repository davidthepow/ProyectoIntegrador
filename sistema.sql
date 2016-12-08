-- phpMyAdmin SQL Dump
-- version 4.0.10deb1
-- http://www.phpmyadmin.net
--
-- Servidor: localhost
-- Tiempo de generación: 08-12-2016 a las 16:04:53
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
-- Estructura de tabla para la tabla `ag_user`
--

CREATE TABLE IF NOT EXISTS `ag_user` (
  `IDagregar` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `usuarios` text NOT NULL,
  `contra` text NOT NULL,
  `nombre` text NOT NULL,
  `a_pater` text NOT NULL,
  `a_mater` text NOT NULL,
  `edad` tinyint(3) NOT NULL,
  `telefono` bigint(13) NOT NULL,
  `sexo` text CHARACTER SET utf8 COLLATE utf8_spanish_ci NOT NULL,
  `correo` text NOT NULL,
  PRIMARY KEY (`IDagregar`),
  UNIQUE KEY `IDagregar` (`IDagregar`),
  UNIQUE KEY `IDagregar_2` (`IDagregar`),
  UNIQUE KEY `IDagregar_3` (`IDagregar`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=3 ;

--
-- Volcado de datos para la tabla `ag_user`
--

INSERT INTO `ag_user` (`IDagregar`, `usuarios`, `contra`, `nombre`, `a_pater`, `a_mater`, `edad`, `telefono`, `sexo`, `correo`) VALUES
(2, 'David', 'Link', 'Erik David', 'Avila', 'Cruz', 22, 9821034055, 'Masculino', 'davidthepow1@gmail.com');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `clientes`
--

CREATE TABLE IF NOT EXISTS `clientes` (
  `IDnombre` int(1) NOT NULL,
  `Nombre` varchar(100) NOT NULL,
  `A_paterno` text NOT NULL,
  `A_materno` text NOT NULL,
  `D_calle` text NOT NULL,
  `D_col` text NOT NULL,
  `D_numero` int(100) NOT NULL,
  `C_postal` int(100) NOT NULL,
  `Estado` text NOT NULL,
  `C_electronico` text NOT NULL,
  PRIMARY KEY (`Nombre`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

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

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuarios`
--

CREATE TABLE IF NOT EXISTS `usuarios` (
  `ID_usuarios` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `usuario` varchar(255) NOT NULL,
  `clave` varchar(255) NOT NULL,
  PRIMARY KEY (`ID_usuarios`),
  UNIQUE KEY `ID_usuarios` (`ID_usuarios`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=2 ;

--
-- Volcado de datos para la tabla `usuarios`
--

INSERT INTO `usuarios` (`ID_usuarios`, `usuario`, `clave`) VALUES
(1, 'admin', 'admin');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `venta`
--

CREATE TABLE IF NOT EXISTS `venta` (
  `IDventa` int(255) NOT NULL AUTO_INCREMENT,
  `f_entra` date NOT NULL,
  `nom_p` text NOT NULL,
  `cod` int(255) NOT NULL,
  `can` int(255) NOT NULL,
  `precio` int(255) NOT NULL,
  `subt` bigint(20) NOT NULL,
  `iva` bigint(20) NOT NULL,
  `t_total` bigint(20) NOT NULL,
  PRIMARY KEY (`IDventa`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=13 ;

--
-- Volcado de datos para la tabla `venta`
--

INSERT INTO `venta` (`IDventa`, `f_entra`, `nom_p`, `cod`, `can`, `precio`, `subt`, `iva`, `t_total`) VALUES
(10, '2016-12-07', 'ppp', 222, 2, 300, 0, 0, 0),
(11, '2016-12-07', 'hihgl', 545, 4, 654654, 64, 21, 3151),
(12, '2016-12-07', 'aceite crudo', 1234, 2, 1256, 5332, 23, 25658);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
