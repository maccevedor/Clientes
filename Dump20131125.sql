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
) ENGINE=InnoDB AUTO_INCREMENT=19 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cliente`
--

LOCK TABLES `cliente` WRITE;
/*!40000 ALTER TABLE `cliente` DISABLE KEYS */;
INSERT INTO `cliente` VALUES (10,'1098','mauricio','acevedo','m','2013-11-22','0',0,'0','0','0','0','0'),(11,'23423','somni','asdf','Masculino',NULL,'0',0,'0','0','0','0','0'),(12,'7887','lsx','asl','Masculino','Fri Nov 01 11:41:03 COT 2013','0',0,'0','0','0','0','0'),(13,'123','Caroli','cace','Masculino','Fri Nov 01 00:00:00 COT 2013','0',0,'0','0','0','0','0'),(14,'','','','Masculino','Tue Jan 01 13:22:55 COT 2013','0',0,'0','0','0','0','0'),(15,'','','','Masculino','07/11/2013','0',0,'0','0','0','0','0'),(16,'74985123','diego','gutierrez','Masculino','09/05/2013','0',0,'0','0','0','0','0'),(17,'74985123','diego','gutierrez','Masculino','09/05/2013','0',0,'0','0','0','0','0'),(18,'859','Dioman','REynal','Masculino','07/11/2013','0',0,'0','0','0','0','0');
/*!40000 ALTER TABLE `cliente` ENABLE KEYS */;
UNLOCK TABLES;

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
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2013-11-25  8:58:48
