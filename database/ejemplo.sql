-- phpMyAdmin SQL Dump
-- version 3.5.2.2
-- http://www.phpmyadmin.net
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 23-04-2013 a las 22:02:45
-- Versión del servidor: 5.5.27
-- Versión de PHP: 5.4.7

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Base de datos: `ejemplo`
--

DELIMITER $$
--
-- Procedimientos
--
CREATE DEFINER=`root`@`localhost` PROCEDURE `buscar`(in fullname varchar(100))
begin
select concat(s_apellidos,' ',s_nombres) from socios
where s_apellidos like concat(fullname,'%');
end$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `cambiar_clave`(in us char(20),in pas char(20),n_pas char(20))
begin
update usuarios
set password=n_pas
where usuario=us and password=pas;
end$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `dni_validate`(dni char(8))
begin
select count(*) from socios where s_dni=dni ;
end$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `email_validate`(in em varchar(100),out res int)
begin
select count(*) into res from socios where s_email=em;
end$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `full_name`()
begin
select concat(s_nombres,' ',s_apellidos) from socios;
end$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `getDataForName`(in fullname varchar(100))
begin
select * from socios where concat(s_apellidos,' ',s_nombres)=fullname;
end$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `lista`()
begin
select s_nombres from socios;
end$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `mostrar_aportes`(dni char(8))
begin
select a_id,a_aporte,a_fecha_deposito,concat(s_apellidos,s_nombres) from aportes join socios on s_id=s_dni and s_id=dni;
end$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `nuevo_aporte`(aporte decimal,fecha date,dni char(8))
begin
insert into aportes(a_aporte,a_fecha_deposito,s_id)
values(aporte,fecha,dni);
end$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `nuevo_prestamo`(cantidad decimal,fecha date,dni char(8),us char(20),estado char(20))
begin
insert into prestamos(p_cantidad,p_fecha_prestamo,s_id,usuario,p_estado)
values(cantidad,fecha,dni,us,estado);
end$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `nuevo_socio`(dni char(8),ape varchar(50),nom varchar(50),fecha date,gen char(10),ingreso date, dir varchar(100),tel char(10), email varchar(50), estado char(15))
begin
insert into socios(s_dni,s_apellidos,s_Nombres,s_fecha_nac,s_genero,s_fecha_ingreso,s_direccion,s_num_telefono,s_email,s_estado)
values(dni,ape,nom,fecha,gen,ingreso,dir,tel,email,estado);
end$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `nuevo_usuario`(us char(20),pass char(20))
begin
insert into usuarios (usuario,password)
values(us,pass);
end$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `scList`(dni char(8))
begin
select * from socios where s_dni=dni;
end$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `update_Data`(dni char(8),ape char(20), nom char(20),fecha date,gen char(10), ingreso date,dir varchar(100),tel char(10),email varchar(50),est char(10),id int)
begin
update socios
set s_dni=dni, 
s_apellidos=ape,
s_nombres=nom,
s_fecha_nac=fecha,
s_genero=gen,
s_fecha_ingreso=ingreso,
s_direccion=dir,
s_num_telefono=tel,
s_email=email,
s_estado=est where s_id=id;
end$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `userval`(us varchar(50),out res int)
begin
select count(*) into res from usuarios where usuario=us;
end$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `validar_usuario`(in us char(20), in pass char(20), out res int)
begin
select count(*) into res from usuarios
where usuario=us and password=pass;
end$$

DELIMITER ;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `aportes`
--

CREATE TABLE IF NOT EXISTS `aportes` (
  `a_ID` int(11) NOT NULL AUTO_INCREMENT,
  `a_Aporte` decimal(10,2) NOT NULL,
  `a_Fecha_Deposito` date NOT NULL,
  `s_id` int(11) NOT NULL,
  PRIMARY KEY (`a_ID`),
  KEY `socios_aportes` (`s_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `prestamos`
--

CREATE TABLE IF NOT EXISTS `prestamos` (
  `p_ID` int(11) NOT NULL AUTO_INCREMENT,
  `p_Cantidad` decimal(10,2) NOT NULL,
  `p_Fecha_Prestamo` date NOT NULL,
  `usuario` char(20) NOT NULL,
  `p_estado` char(20) NOT NULL,
  `s_id` int(11) NOT NULL,
  PRIMARY KEY (`p_ID`),
  KEY `socios_prestamos` (`s_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `socios`
--

CREATE TABLE IF NOT EXISTS `socios` (
  `s_id` int(11) NOT NULL AUTO_INCREMENT,
  `s_DNI` char(8) NOT NULL,
  `s_Apellidos` varchar(50) NOT NULL,
  `s_Nombres` varchar(50) NOT NULL,
  `s_Fecha_Nac` date NOT NULL,
  `s_Genero` char(10) NOT NULL,
  `s_Fecha_Ingreso` date NOT NULL,
  `s_Direccion` varchar(100) NOT NULL,
  `s_Num_Telefono` char(14) DEFAULT 'sin numero',
  `s_Email` varchar(100) DEFAULT 'no email',
  `s_Estado` char(15) NOT NULL,
  PRIMARY KEY (`s_id`),
  UNIQUE KEY `s_DNI_UNIQUE` (`s_DNI`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=4 ;

--
-- Volcado de datos para la tabla `socios`
--

INSERT INTO `socios` (`s_id`, `s_DNI`, `s_Apellidos`, `s_Nombres`, `s_Fecha_Nac`, `s_Genero`, `s_Fecha_Ingreso`, `s_Direccion`, `s_Num_Telefono`, `s_Email`, `s_Estado`) VALUES
(1, '43220406', 'ingaroca de la cruz', 'lincoln jesus', '2214-01-01', 'Masculino', '2010-02-01', 'jr. junin 1071 interior i lima', '971913147', 'lincolnf_2@hotmail.com', 'Retirado'),
(2, '43220402', 'de paz crispin', 'flor isabel', '1985-11-27', 'Femenino', '2010-12-01', 'jr. junin 1071 interior i lima', '992240229', 'fdepaz_2@hotmail.com', 'Activo'),
(3, '23214569', 'de paz olarte', 'ester olivia', '1212-12-12', 'Femenino', '1212-12-12', 'kjjkjkjkj', '123654789', 'loaia@lala.com', 'Retirado');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuarios`
--

CREATE TABLE IF NOT EXISTS `usuarios` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `usuario` char(20) DEFAULT NULL,
  `password` char(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=2 ;

--
-- Volcado de datos para la tabla `usuarios`
--

INSERT INTO `usuarios` (`id`, `usuario`, `password`) VALUES
(1, 'flor', '2311046');

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `aportes`
--
ALTER TABLE `aportes`
  ADD CONSTRAINT `socios_aportes` FOREIGN KEY (`s_id`) REFERENCES `socios` (`s_id`) ON UPDATE CASCADE;

--
-- Filtros para la tabla `prestamos`
--
ALTER TABLE `prestamos`
  ADD CONSTRAINT `socios_prestamos` FOREIGN KEY (`s_id`) REFERENCES `socios` (`s_id`) ON UPDATE CASCADE;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
