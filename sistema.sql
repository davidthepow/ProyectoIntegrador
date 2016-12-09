-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 08-12-2016 a las 20:37:34
-- Versión del servidor: 10.1.9-MariaDB
-- Versión de PHP: 5.6.15

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `sistema`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `ag_user`
--

CREATE TABLE `ag_user` (
  `IDagregar` bigint(20) UNSIGNED NOT NULL,
  `usuarios` text NOT NULL,
  `contra` text NOT NULL,
  `nombre` text NOT NULL,
  `a_pater` text NOT NULL,
  `a_mater` text NOT NULL,
  `edad` tinyint(3) NOT NULL,
  `telefono` bigint(13) NOT NULL,
  `sexo` text CHARACTER SET utf8 COLLATE utf8_spanish_ci NOT NULL,
  `correo` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `ag_user`
--

INSERT INTO `ag_user` (`IDagregar`, `usuarios`, `contra`, `nombre`, `a_pater`, `a_mater`, `edad`, `telefono`, `sexo`, `correo`) VALUES
(2, 'David', 'Link', 'Erik David', 'Avila', 'Cruz', 22, 9821034055, 'Masculino', 'davidthepow1@gmail.com');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `clientes`
--

CREATE TABLE `clientes` (
  `IDnombre` int(1) NOT NULL,
  `Nombre` varchar(100) NOT NULL,
  `A_paterno` text NOT NULL,
  `A_materno` text NOT NULL,
  `D_calle` text NOT NULL,
  `D_col` text NOT NULL,
  `D_numero` int(100) NOT NULL,
  `C_postal` int(100) NOT NULL,
  `Estado` text NOT NULL,
  `C_electronico` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `productos`
--

CREATE TABLE `productos` (
  `IDprod` int(10) UNSIGNED NOT NULL,
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
  `salida` int(11) NOT NULL,
  `pesobruto` bigint(20) NOT NULL,
  `pesotara` bigint(20) NOT NULL,
  `pesoneto` bigint(20) NOT NULL,
  `fechasalida` date NOT NULL,
  `hora` time NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `productos`
--

INSERT INTO `productos` (`IDprod`, `proveedor`, `producto`, `origen`, `destino`, `entrada`, `folio`, `pesokg`, `fechaentrada`, `estatus`, `descripcion`, `salida`, `pesobruto`, `pesotara`, `pesoneto`, `fechasalida`, `hora`) VALUES
(9, 'Avila', 'aciete', 'chiapas', 'campeche', 12, 123, 12000, '2016-12-08', 'incompleto', 'flojo', 20161209, 13000, 1000, 12000, '2016-12-07', '07:25:00'),
(11, 'Pansoncito', 'semillas', 'chiapas', 'Cruz Blanco', 16, 1234, 5000, '2016-12-09', 'incompleto', 'flojo', 20161209, 6000, 1000, 5000, '2016-12-09', '00:00:00'),
(12, 'marroquin', 'semilla madura', 'escarcega', 'planta estractora de aceite', 2323, 333, 44, '2016-12-08', 'Completo', 'toda la semilla en buen estado', 20161209, 45444, 554, 4455, '2016-12-09', '10:29:00'),
(13, 'jorge', 'semilla', 'chiapas', 'planta procesadora', 3322, 4332, 434, '2016-12-08', 'Incompleto', 'no ha llegado complata ', 443, 44635737, 34634, 5345, '2016-12-09', '10:34:56'),
(14, 'sadsaddas', 'Fruta de Palma de Aceite (RFF)', 'sdfsd', 'Planta Extractora de Aceite ''Don Jorge Mena Pérez''', 3131, 223, 646, '2016-12-08', 'isds', 'sdsf', 5646, 8854, 56823, 899898, '2016-12-08', '12:17:30'),
(15, 'avila', 'Fruta de Palma de Aceite (RFF)', 'escarcega', 'Planta Extractora de Aceite ''Don Jorge Mena Pérez''', 2, 1234, 32, '2016-12-08', 'Completo', 'esta completo', 253, 23, 10, 13, '2016-12-08', '13:36:38');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuarios`
--

CREATE TABLE `usuarios` (
  `ID_usuarios` bigint(20) UNSIGNED NOT NULL,
  `usuario` varchar(255) NOT NULL,
  `clave` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `usuarios`
--

INSERT INTO `usuarios` (`ID_usuarios`, `usuario`, `clave`) VALUES
(1, 'admin', 'admin');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `venta`
--

CREATE TABLE `venta` (
  `IDventa` int(255) NOT NULL,
  `f_entra` date NOT NULL,
  `nom_p` text NOT NULL,
  `cod` int(255) NOT NULL,
  `can` int(255) NOT NULL,
  `precio` int(255) NOT NULL,
  `subt` bigint(20) NOT NULL,
  `iva` bigint(20) NOT NULL,
  `t_total` bigint(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `venta`
--

INSERT INTO `venta` (`IDventa`, `f_entra`, `nom_p`, `cod`, `can`, `precio`, `subt`, `iva`, `t_total`) VALUES
(10, '2016-12-07', 'ppp', 222, 2, 300, 0, 0, 0),
(11, '2016-12-07', 'hihgl', 545, 4, 654654, 64, 21, 3151),
(12, '2016-12-07', 'aceite crudo', 1234, 2, 1256, 5332, 23, 25658);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `ag_user`
--
ALTER TABLE `ag_user`
  ADD PRIMARY KEY (`IDagregar`),
  ADD UNIQUE KEY `IDagregar` (`IDagregar`),
  ADD UNIQUE KEY `IDagregar_2` (`IDagregar`),
  ADD UNIQUE KEY `IDagregar_3` (`IDagregar`);

--
-- Indices de la tabla `clientes`
--
ALTER TABLE `clientes`
  ADD PRIMARY KEY (`Nombre`);

--
-- Indices de la tabla `productos`
--
ALTER TABLE `productos`
  ADD PRIMARY KEY (`IDprod`),
  ADD UNIQUE KEY `IDProducto` (`IDprod`);

--
-- Indices de la tabla `usuarios`
--
ALTER TABLE `usuarios`
  ADD PRIMARY KEY (`ID_usuarios`),
  ADD UNIQUE KEY `ID_usuarios` (`ID_usuarios`);

--
-- Indices de la tabla `venta`
--
ALTER TABLE `venta`
  ADD PRIMARY KEY (`IDventa`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `ag_user`
--
ALTER TABLE `ag_user`
  MODIFY `IDagregar` bigint(20) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
--
-- AUTO_INCREMENT de la tabla `productos`
--
ALTER TABLE `productos`
  MODIFY `IDprod` int(10) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=16;
--
-- AUTO_INCREMENT de la tabla `usuarios`
--
ALTER TABLE `usuarios`
  MODIFY `ID_usuarios` bigint(20) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
--
-- AUTO_INCREMENT de la tabla `venta`
--
ALTER TABLE `venta`
  MODIFY `IDventa` int(255) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=13;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
