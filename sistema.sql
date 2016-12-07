-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 07-12-2016 a las 14:43:13
-- Versión del servidor: 10.1.19-MariaDB
-- Versión de PHP: 7.0.13

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
  `IDprod` bigint(20) UNSIGNED NOT NULL,
  `n_prod` text NOT NULL,
  `p_kg` text NOT NULL,
  `u_kg` text NOT NULL,
  `cost` int(255) NOT NULL,
  `f_entra` date NOT NULL,
  `f_Cad` date NOT NULL,
  `des` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `productos`
--

INSERT INTO `productos` (`IDprod`, `n_prod`, `p_kg`, `u_kg`, `cost`, `f_entra`, `f_Cad`, `des`) VALUES
(6, 'olivas', '138', '1', 10, '2016-12-03', '2016-12-09', 'Prueba');

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
  `num_p` text NOT NULL,
  `cod` int(255) NOT NULL,
  `can` int(255) NOT NULL,
  `precio` int(255) NOT NULL,
  `des` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `venta`
--

INSERT INTO `venta` (`IDventa`, `f_entra`, `num_p`, `cod`, `can`, `precio`, `des`) VALUES
(3, '2016-12-02', 'Palma', 2152, 1000, 5200, 'extraccion de aceite'),
(4, '2016-12-06', 'Aceite', 1402, 100, 30, 'Aceite de palma'),
(5, '2016-12-03', 'Carro', 1450, 1, 20300, 'Carro contenedor'),
(6, '2016-12-05', 'It', 3212, 2, 653, 'iT'),
(7, '2016-12-13', 'Pal', 2155, 1, 100, 'A');

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
  MODIFY `IDagregar` bigint(20) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;
--
-- AUTO_INCREMENT de la tabla `productos`
--
ALTER TABLE `productos`
  MODIFY `IDprod` bigint(20) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;
--
-- AUTO_INCREMENT de la tabla `usuarios`
--
ALTER TABLE `usuarios`
  MODIFY `ID_usuarios` bigint(20) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
--
-- AUTO_INCREMENT de la tabla `venta`
--
ALTER TABLE `venta`
  MODIFY `IDventa` int(255) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
