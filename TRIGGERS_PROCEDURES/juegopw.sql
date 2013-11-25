-- phpMyAdmin SQL Dump
-- version 2.10.2
-- http://www.phpmyadmin.net
-- 
-- Servidor: localhost
-- Tiempo de generación: 15-11-2013 a las 20:30:48
-- Versión del servidor: 5.0.45
-- Versión de PHP: 5.2.3

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";

-- 
-- Base de datos: `juegopw`
-- 

-- --------------------------------------------------------

-- 
-- Estructura de tabla para la tabla `asignatura`
-- 

CREATE TABLE `asignatura` (
  `asig_codi` int(10) unsigned NOT NULL auto_increment,
  `asig_nomb` varchar(50) collate utf8_spanish2_ci NOT NULL,
  `asig_usua` int(10) unsigned NOT NULL,
  PRIMARY KEY  (`asig_codi`),
  UNIQUE KEY `asig_nomb_UNIQUE` (`asig_nomb`),
  KEY `fk_asignatura_usuario1_idx` (`asig_usua`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 COLLATE=utf8_spanish2_ci AUTO_INCREMENT=3 ;

-- 
-- Volcar la base de datos para la tabla `asignatura`
-- 

INSERT INTO `asignatura` VALUES (1, 'HISTORIA', 91281787);
INSERT INTO `asignatura` VALUES (2, 'PROGRAMACION', 91281787);

-- --------------------------------------------------------

-- 
-- Estructura de tabla para la tabla `bitacora`
-- 

CREATE TABLE `bitacora` (
  `bita_codi` int(10) unsigned NOT NULL auto_increment,
  `bita_desc` varchar(100) collate utf8_spanish2_ci NOT NULL,
  `bita_fech` timestamp NOT NULL default CURRENT_TIMESTAMP,
  `bita_usua` int(10) unsigned default NULL,
  PRIMARY KEY  (`bita_codi`),
  KEY `fk_bitacora_usuario1_idx` (`bita_usua`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 COLLATE=utf8_spanish2_ci AUTO_INCREMENT=8 ;

-- 
-- Volcar la base de datos para la tabla `bitacora`
-- 

INSERT INTO `bitacora` VALUES (1, 'Insercion de Respuesta No. 3: 1422', '2013-11-15 19:33:38', NULL);
INSERT INTO `bitacora` VALUES (2, 'Insercion de Respuesta No. 4: 1482', '2013-11-15 19:33:38', NULL);
INSERT INTO `bitacora` VALUES (3, 'Insercion de Respuesta No. 5 - 1525', '2013-11-15 19:42:46', NULL);
INSERT INTO `bitacora` VALUES (4, 'Insercion Registro en Asignatura', '2013-11-15 19:55:36', 41381787);
INSERT INTO `bitacora` VALUES (5, 'Insercion Registro en Asignatura', '2013-11-15 19:58:21', 41381787);
INSERT INTO `bitacora` VALUES (6, 'Insercion Registro en Asignatura', '2013-11-15 19:58:21', 41381787);
INSERT INTO `bitacora` VALUES (7, 'Insercion Registro en Asignatura', '2013-11-15 19:58:21', 41381787);

-- --------------------------------------------------------

-- 
-- Estructura de tabla para la tabla `pregunta`
-- 

CREATE TABLE `pregunta` (
  `preg_codi` int(10) unsigned NOT NULL auto_increment,
  `preg_desc` text collate utf8_spanish2_ci NOT NULL,
  `preg_nive` int(1) default NULL,
  `preg_asig` int(10) unsigned NOT NULL,
  PRIMARY KEY  (`preg_codi`),
  KEY `fk_Pregunta_asignatura1_idx` (`preg_asig`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 COLLATE=utf8_spanish2_ci AUTO_INCREMENT=3 ;

-- 
-- Volcar la base de datos para la tabla `pregunta`
-- 

INSERT INTO `pregunta` VALUES (1, '¿En que año Cristobal Colon descubrió América?', 1, 1);
INSERT INTO `pregunta` VALUES (2, '¿En que año se declaro la independencia de Colombia?', 1, 1);

-- --------------------------------------------------------

-- 
-- Estructura de tabla para la tabla `respuesta`
-- 

CREATE TABLE `respuesta` (
  `resp_codi` int(10) unsigned NOT NULL auto_increment,
  `resp_desc` varchar(45) collate utf8_spanish2_ci NOT NULL,
  `resp_corr` char(1) collate utf8_spanish2_ci NOT NULL,
  `resp_preg` int(10) unsigned NOT NULL,
  PRIMARY KEY  (`resp_codi`),
  KEY `fk_respuesta_Pregunta1_idx` (`resp_preg`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 COLLATE=utf8_spanish2_ci AUTO_INCREMENT=7 ;

-- 
-- Volcar la base de datos para la tabla `respuesta`
-- 

INSERT INTO `respuesta` VALUES (1, '1492', 'S', 1);
INSERT INTO `respuesta` VALUES (2, '1811', 'N', 2);
INSERT INTO `respuesta` VALUES (3, '1422', 'N', 1);
INSERT INTO `respuesta` VALUES (4, '1482', 'N', 1);
INSERT INTO `respuesta` VALUES (5, '1525', 'N', 2);
INSERT INTO `respuesta` VALUES (6, 'AÑO1', 'N', 1);

-- --------------------------------------------------------

-- 
-- Estructura de tabla para la tabla `respuesta_correcta`
-- 

CREATE TABLE `respuesta_correcta` (
  `reco_codi` int(10) unsigned NOT NULL auto_increment,
  `reco_desc` varchar(45) collate utf8_spanish2_ci NOT NULL,
  `reco_preg` int(10) unsigned NOT NULL,
  PRIMARY KEY  (`reco_codi`),
  KEY `reco_preg` (`reco_preg`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish2_ci AUTO_INCREMENT=1 ;

-- 
-- Volcar la base de datos para la tabla `respuesta_correcta`
-- 


-- --------------------------------------------------------

-- 
-- Estructura de tabla para la tabla `rol`
-- 

CREATE TABLE `rol` (
  `rol_codi` int(10) unsigned NOT NULL auto_increment,
  `rol_nomb` varchar(45) collate utf8_spanish2_ci NOT NULL,
  PRIMARY KEY  (`rol_codi`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 COLLATE=utf8_spanish2_ci AUTO_INCREMENT=3 ;

-- 
-- Volcar la base de datos para la tabla `rol`
-- 

INSERT INTO `rol` VALUES (1, 'DOCENTE');
INSERT INTO `rol` VALUES (2, 'ADMINISTRADOR');

-- --------------------------------------------------------

-- 
-- Estructura de tabla para la tabla `usuario`
-- 

CREATE TABLE `usuario` (
  `usua_codi` int(10) unsigned NOT NULL,
  `usua_nomb` varchar(70) collate utf8_spanish2_ci NOT NULL,
  `usua_apel` varchar(60) collate utf8_spanish2_ci NOT NULL,
  `usua_mail` varchar(100) collate utf8_spanish2_ci NOT NULL,
  `usua_logi` varchar(45) collate utf8_spanish2_ci NOT NULL,
  `usua_clav` varchar(45) collate utf8_spanish2_ci NOT NULL,
  `usua_rol` int(10) unsigned NOT NULL,
  PRIMARY KEY  (`usua_codi`),
  KEY `fk_usuario_rol_idx` (`usua_rol`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish2_ci;

-- 
-- Volcar la base de datos para la tabla `usuario`
-- 

INSERT INTO `usuario` VALUES (41381787, 'MERCEDES', 'RAMIREZ', 'mercedesramirez007@fitecvirtual.edu.co', 'mercedes', '654321', 1);
INSERT INTO `usuario` VALUES (91281787, 'RUBEN', 'JIMENEZ', 'rubendjimenez117@fitecvirtual.edu.co', 'rubencho', '123456', 2);

-- 
-- Filtros para las tablas descargadas (dump)
-- 

-- 
-- Filtros para la tabla `asignatura`
-- 
ALTER TABLE `asignatura`
  ADD CONSTRAINT `fk_asignatura_usuario1` FOREIGN KEY (`asig_usua`) REFERENCES `usuario` (`usua_codi`) ON UPDATE CASCADE;

-- 
-- Filtros para la tabla `bitacora`
-- 
ALTER TABLE `bitacora`
  ADD CONSTRAINT `fk_bitacora_usuario1` FOREIGN KEY (`bita_usua`) REFERENCES `usuario` (`usua_codi`) ON DELETE NO ACTION ON UPDATE NO ACTION;

-- 
-- Filtros para la tabla `pregunta`
-- 
ALTER TABLE `pregunta`
  ADD CONSTRAINT `fk_Pregunta_asignatura1` FOREIGN KEY (`preg_asig`) REFERENCES `asignatura` (`asig_codi`) ON UPDATE CASCADE;

-- 
-- Filtros para la tabla `respuesta`
-- 
ALTER TABLE `respuesta`
  ADD CONSTRAINT `fk_respuesta_Pregunta1` FOREIGN KEY (`resp_preg`) REFERENCES `pregunta` (`preg_codi`) ON UPDATE CASCADE;

-- 
-- Filtros para la tabla `respuesta_correcta`
-- 
ALTER TABLE `respuesta_correcta`
  ADD CONSTRAINT `respuesta_correcta_ibfk_1` FOREIGN KEY (`reco_preg`) REFERENCES `pregunta` (`preg_codi`) ON UPDATE CASCADE;

-- 
-- Filtros para la tabla `usuario`
-- 
ALTER TABLE `usuario`
  ADD CONSTRAINT `fk_usuario_rol` FOREIGN KEY (`usua_rol`) REFERENCES `rol` (`rol_codi`) ON UPDATE CASCADE;
