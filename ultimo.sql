CREATE DATABASE  IF NOT EXISTS `cliente` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `cliente`;
-- MySQL dump 10.13  Distrib 5.6.13, for Win32 (x86)
--
-- Host: 127.0.0.1    Database: cliente
-- ------------------------------------------------------
-- Server version	5.5.32

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `bitacora`
--

DROP TABLE IF EXISTS `bitacora`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `bitacora` (
  `bita_codi` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `bita_desc` varchar(100) COLLATE utf8_spanish2_ci NOT NULL,
  `bita_fech` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `bita_Id` int(10) unsigned DEFAULT NULL,
  `bita_tabla` varchar(50) COLLATE utf8_spanish2_ci DEFAULT NULL,
  PRIMARY KEY (`bita_codi`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8 COLLATE=utf8_spanish2_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `bitacora`
--

LOCK TABLES `bitacora` WRITE;
/*!40000 ALTER TABLE `bitacora` DISABLE KEYS */;
INSERT INTO `bitacora` VALUES (8,'Se ingreso un nuevo usuario con Cedula45656','2013-11-28 13:05:11',24,NULL),(9,'Se ingreso un nuevo usuario con Cedula 1098','2013-11-28 13:06:43',25,NULL),(10,'Se ingreso un nuevo usuario con Cedula 8778998','2013-11-28 13:25:34',26,'cliente');
/*!40000 ALTER TABLE `bitacora` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `cliente`
--

DROP TABLE IF EXISTS `cliente`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `cliente` (
  `Id` int(11) NOT NULL AUTO_INCREMENT,
  `Cedula` varchar(20) DEFAULT '0',
  `Nombre` varchar(50) DEFAULT '0',
  `Apellido` varchar(50) DEFAULT '0',
  `Sexo` varchar(10) DEFAULT '0',
  `FchNacimiento` varchar(50) DEFAULT NULL,
  `Ecivil` varchar(10) DEFAULT '0',
  `Nhijos` int(11) DEFAULT '0',
  `Municipio` varchar(50) DEFAULT '0',
  `Direccion` varchar(50) DEFAULT '0',
  `Email` varchar(50) DEFAULT '0',
  `Telefono` varchar(50) DEFAULT '0',
  `Celular` varchar(50) DEFAULT '0',
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB AUTO_INCREMENT=27 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cliente`
--

LOCK TABLES `cliente` WRITE;
/*!40000 ALTER TABLE `cliente` DISABLE KEYS */;
INSERT INTO `cliente` VALUES (10,'1098','mauricio','acevedo','m','2013-11-22','0',0,'0','0','0','0','0'),(12,'7887','lsx','asl','Masculino','Fri Nov 01 11:41:03 COT 2013','0',0,'0','0','0','0','0'),(13,'123','Caroli','cace','Masculino','Fri Nov 01 00:00:00 COT 2013','0',0,'0','0','0','0','0'),(16,'74985123','diego','gutierrez','Masculino','09/05/2013','0',0,'0','0','0','0','0'),(17,'74985123','diego','gutierrez','Masculino','09/05/2013','0',0,'0','0','0','0','0'),(18,'859','Dioman','REynal','Masculino','07/11/2013','0',0,'0','0','0','0','0'),(19,'8956','Johanna','BAdillo','Femenino','15/08/2012','0',0,'0','0','0','0','0'),(22,'109865773','Alejandro','Rueda','Masculino','01/11/2013','0',0,'0','0','0','0','0'),(24,'45656','Jose','perales','0',NULL,'0',0,'0','0','0','0','0'),(25,'1098','luis','cantante','Masculino','23/11/2013','0',0,'0','0','0','0','0'),(26,'8778998','Sandra','Diaz','Femenino','01/11/2013','0',0,'0','0','0','0','0');
/*!40000 ALTER TABLE `cliente` ENABLE KEYS */;
UNLOCK TABLES;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = '' */ ;
DELIMITER ;;
/*!50003 CREATE*/ /*!50017 DEFINER=`root`@`localhost`*/ /*!50003 TRIGGER `InsertCliente` AFTER INSERT ON `cliente` FOR EACH ROW INSERT INTO bitacora(bita_codi,bita_desc,bita_fech,bita_id,bita_tabla) VALUES (null,concat("Se ingreso un nuevo usuario con Cedula ",New.Cedula),now(),New.Id,"cliente") */;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;

--
-- Table structure for table `encuesta`
--

DROP TABLE IF EXISTS `encuesta`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `encuesta` (
  `Id` int(11) NOT NULL AUTO_INCREMENT,
  `Servicio` varchar(50) DEFAULT '0',
  `Costo` varchar(50) DEFAULT '0',
  `Tiempo` varchar(50) DEFAULT '0',
  `Concepto` varchar(50) DEFAULT '0',
  `Mejora` varchar(50) DEFAULT '0',
  `Promociones` varchar(50) DEFAULT '0',
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COMMENT='Informacion de los gustos del cliente';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `encuesta`
--

LOCK TABLES `encuesta` WRITE;
/*!40000 ALTER TABLE `encuesta` DISABLE KEYS */;
/*!40000 ALTER TABLE `encuesta` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `promociones`
--

DROP TABLE IF EXISTS `promociones`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `promociones` (
  `Id` int(11) NOT NULL AUTO_INCREMENT,
  `Nombre` varchar(50) DEFAULT '0',
  `Otra` varchar(50) DEFAULT '0',
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `promociones`
--

LOCK TABLES `promociones` WRITE;
/*!40000 ALTER TABLE `promociones` DISABLE KEYS */;
/*!40000 ALTER TABLE `promociones` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tipo_usuarios`
--

DROP TABLE IF EXISTS `tipo_usuarios`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tipo_usuarios` (
  `Cod_Tipo_Usuario` char(10) NOT NULL,
  `Descripcion` varchar(30) NOT NULL,
  PRIMARY KEY (`Cod_Tipo_Usuario`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tipo_usuarios`
--

LOCK TABLES `tipo_usuarios` WRITE;
/*!40000 ALTER TABLE `tipo_usuarios` DISABLE KEYS */;
INSERT INTO `tipo_usuarios` VALUES ('1','admin');
/*!40000 ALTER TABLE `tipo_usuarios` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `usuarios`
--

DROP TABLE IF EXISTS `usuarios`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `usuarios` (
  `codusu` char(10) NOT NULL,
  `Nom_usuario` varchar(40) NOT NULL,
  `cla_Usuario` varchar(20) NOT NULL,
  `Cod_tipo_Usuario` varchar(10) NOT NULL,
  `Estado_Usuario` varchar(15) NOT NULL,
  `PrgtSecreta` varchar(50) NOT NULL,
  `rstSecreta` varchar(50) NOT NULL,
  `Sesion` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`codusu`),
  KEY `fk_Cod_tipo_Usuario` (`Cod_tipo_Usuario`),
  CONSTRAINT `fk_Cod_tipo_Usuario` FOREIGN KEY (`Cod_tipo_Usuario`) REFERENCES `tipo_usuarios` (`Cod_Tipo_Usuario`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `usuarios`
--

LOCK TABLES `usuarios` WRITE;
/*!40000 ALTER TABLE `usuarios` DISABLE KEYS */;
INSERT INTO `usuarios` VALUES ('','mao','mao','1','','','','2013-11-26 17:41:51');
/*!40000 ALTER TABLE `usuarios` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2013-11-28 18:03:56
