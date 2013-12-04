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
) ENGINE=InnoDB AUTO_INCREMENT=62 DEFAULT CHARSET=utf8 COLLATE=utf8_spanish2_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `bitacora`
--

LOCK TABLES `bitacora` WRITE;
/*!40000 ALTER TABLE `bitacora` DISABLE KEYS */;
INSERT INTO `bitacora` VALUES (8,'Se ingreso un nuevo usuario con Cedula45656','2013-11-28 13:05:11',24,NULL),(9,'Se ingreso un nuevo usuario con Cedula 1098','2013-11-28 13:06:43',25,NULL),(10,'Se ingreso un nuevo usuario con Cedula 8778998','2013-11-28 13:25:34',26,'cliente'),(11,'Se ingreso un nuevo usuario con Cedula 765438','2013-11-29 00:02:13',27,'cliente'),(12,'Se ingreso un nuevo usuario con Cedula 1098','2013-11-29 03:08:10',28,'cliente'),(13,'Se actualizo el usuario con Cedula 45656','2013-11-30 04:56:21',24,'cliente'),(14,'Se elimino el usuario con Cedula 123','2013-11-30 05:00:32',13,'cliente'),(15,'Se elimino el usuario con Cedula 859','2013-11-30 05:00:37',18,'cliente'),(16,'Se elimino el usuario con Cedula 74985123','2013-11-30 05:02:40',16,'cliente'),(17,'Se elimino el usuario con Cedula 74985123','2013-11-30 05:02:40',17,'cliente'),(18,'Se ingreso la encuesta con consecutivo 0','2013-11-30 05:18:37',0,'encuesta'),(19,'Se ingreso la promocion con consecutivo 0','2013-11-30 05:18:57',0,'promociones'),(20,'Se ingreso la promocion con consecutivo 0','2013-11-30 05:19:02',0,'promociones'),(21,'Se ingreso la promocion con consecutivo 0','2013-11-30 05:19:08',0,'promociones'),(22,'Se ingreso un nuevo usuario con Cedula 896','2013-11-30 05:22:52',29,'cliente'),(23,'Se ingreso la encuesta con consecutivo 5','2013-11-30 05:24:03',5,'encuesta'),(24,'Se ingreso la promocion con consecutivo 10','2013-11-30 05:24:12',10,'promociones'),(25,'Se ingreso un nuevo usuario con Cedula 91493106','2013-12-01 14:06:41',30,'cliente'),(26,'Se actualizo el usuario con Cedula 45656','2013-12-01 14:07:30',24,'cliente'),(27,'Se actualizo el usuario con Cedula 8956','2013-12-01 14:09:02',19,'cliente'),(28,'Se actualizo el usuario con Cedula 8956','2013-12-01 14:09:18',19,'cliente'),(29,'Se actualizo el usuario con Cedula 1098','2013-12-01 14:11:09',10,'cliente'),(30,'Se actualizo el usuario con Cedula 1098','2013-12-01 14:11:09',25,'cliente'),(31,'Se actualizo el usuario con Cedula 1098','2013-12-01 14:11:09',28,'cliente'),(32,'Se ingreso la promocion con consecutivo 11','2013-12-01 14:12:50',11,'promociones'),(33,'Se ingreso la promocion con consecutivo 12','2013-12-01 14:13:14',12,'promociones'),(34,'Se ingreso la promocion con consecutivo 13','2013-12-01 14:13:53',13,'promociones'),(35,'Se ingreso la encuesta con consecutivo 6','2013-12-01 14:18:10',6,'encuesta'),(36,'Se elimino el usuario con Cedula 45656','2013-12-01 14:21:37',24,'cliente'),(37,'Se actualizo el usuario con Cedula 109865773','2013-12-01 14:44:22',22,'cliente'),(38,'Se actualizo el usuario con Cedula 8956','2013-12-01 15:10:18',19,'cliente'),(39,'Se actualizo el usuario con Cedula 109865773','2013-12-01 15:10:39',22,'cliente'),(40,'Se elimino el usuario con Cedula 7887','2013-12-01 15:35:55',12,'cliente'),(41,'Se elimino el usuario con Cedula 1098','2013-12-01 15:36:56',10,'cliente'),(42,'Se elimino el usuario con Cedula 1098','2013-12-01 15:36:56',25,'cliente'),(43,'Se elimino el usuario con Cedula 1098','2013-12-01 15:36:56',28,'cliente'),(44,'Se actualizo el usuario con Cedula 8778998','2013-12-01 16:35:46',26,'cliente'),(45,'Se ingreso la promocion con consecutivo 14','2013-12-02 20:51:50',14,'promociones'),(46,'Se ingreso la promocion con consecutivo 15','2013-12-02 21:11:04',15,'promociones'),(47,'Se ingreso la promocion con consecutivo 16','2013-12-02 21:11:19',16,'promociones'),(48,'Se ingreso la promocion con consecutivo 17','2013-12-02 21:11:40',17,'promociones'),(49,'Se ingreso la promocion con consecutivo 18','2013-12-02 21:27:52',18,'promociones'),(50,'Se ingreso la promocion con consecutivo 19','2013-12-02 21:35:17',19,'promociones'),(51,'Se ingreso la promocion con consecutivo 20','2013-12-02 21:38:23',20,'promociones'),(52,'Se ingreso la promocion con consecutivo 21','2013-12-02 21:38:36',21,'promociones'),(53,'Se ingreso un nuevo usuario con Cedula 9999','2013-12-03 18:21:09',31,'cliente'),(54,'Se actualizo el usuario con Cedula 99999','2013-12-03 18:21:26',31,'cliente'),(55,'Se ingreso la encuesta con consecutivo 7','2013-12-03 18:54:40',7,'encuesta'),(56,'Se ingreso la encuesta con consecutivo 9','2013-12-03 19:13:41',9,'encuesta'),(57,'Se ingreso la encuesta con consecutivo 10','2013-12-04 00:19:40',10,'encuesta'),(58,'Se ingreso la promocion con consecutivo 22','2013-12-04 00:26:10',22,'promociones'),(59,'Se ingreso un nuevo usuario con Cedula 67543673','2013-12-04 00:37:40',32,'cliente'),(60,'Se ingreso un nuevo usuario con Cedula 1098653','2013-12-04 01:04:12',33,'cliente'),(61,'Se ingreso un nuevo usuario con Cedula 34','2013-12-04 01:07:18',34,'cliente');
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
  PRIMARY KEY (`Id`),
  KEY `Cedula` (`Cedula`)
) ENGINE=InnoDB AUTO_INCREMENT=35 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cliente`
--

LOCK TABLES `cliente` WRITE;
/*!40000 ALTER TABLE `cliente` DISABLE KEYS */;
INSERT INTO `cliente` VALUES (19,'8956','Johanna','Badillo','Femenino','15/08/2012','Soltero ',0,'Bucaramanga','Campo hermoso','0','0','0'),(22,'109865773','Alejandro','Rueda','Masculino','01/11/2013','Soltero ',0,'Florida','0','Alejo@gmail.com','0','0'),(26,'8778998','Sandra','Diaz','Masculino','01/11/2013','Soltero ',0,'Bucaramanga','0','tania@hotmial.com','0','0'),(27,'765438','Jennifer','Hernandez','Masculino','16/11/2007','0',0,'0','0','0','0','0'),(29,'896','Miguel','Ortiz','Masculino','15/11/2013','Soltero ',1,'Bucaramanga','Bogota','ortiz@gmail.com','',''),(30,'91493106','Javier','Grajales','Masculino','19/11/2013','Soltero ',0,'Florida','Cir 29 #22-16','javierlgrajales@hotmial.com','6199689','3167526103'),(31,'99999','incognito','incognito','0',NULL,'0',0,'0','0','0','0','0'),(32,'67543673','Jaanga','barajasre','Masculino','04/12/2013','Soltero ',1,'El Tablón','Cerca de bucaram','','',''),(33,'1098653','mauricio','acevedo rueda','Masculino','04/04/2013','Soltero ',1,'Bucaramanga','Cra 13 ','maccevedor@gmail.com','647','318'),(34,'34','luz','ace','Masculino','03/12/2013','Soltero ',1,'Bucaramanga','cr','das','sadsa','2321');
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
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = '' */ ;
DELIMITER ;;
/*!50003 CREATE*/ /*!50017 DEFINER=`root`@`localhost`*/ /*!50003 TRIGGER `UpdateCliente` AFTER UPDATE ON `cliente` FOR EACH ROW INSERT INTO bitacora(bita_codi,bita_desc,bita_fech,bita_id,bita_tabla) VALUES (null,concat("Se actualizo el usuario con Cedula ",New.Cedula),now(),New.Id,"cliente") */;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = '' */ ;
DELIMITER ;;
/*!50003 CREATE*/ /*!50017 DEFINER=`root`@`localhost`*/ /*!50003 TRIGGER `DeleteCliente` AFTER DELETE ON `cliente` FOR EACH ROW INSERT INTO bitacora(bita_codi,bita_desc,bita_fech,bita_id,bita_tabla) VALUES (null,concat("Se elimino el usuario con Cedula ",old.Cedula),now(),old.Id,"cliente") */;;
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
  `Frecuencia` varchar(50) DEFAULT '0',
  `Costo` varchar(50) DEFAULT '0',
  `Tiempo` varchar(50) DEFAULT '0',
  `Opinion` varchar(50) DEFAULT '0',
  `Mejora` varchar(50) DEFAULT '0',
  `Promociones` varchar(50) DEFAULT '0',
  `Cedula` varchar(20),
  PRIMARY KEY (`Id`),
  KEY `Cliente` (`Cedula`),
  CONSTRAINT `Cliente` FOREIGN KEY (`Cedula`) REFERENCES `cliente` (`Cedula`) ON DELETE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=latin1 COMMENT='Informacion de los gustos del cliente';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `encuesta`
--

LOCK TABLES `encuesta` WRITE;
/*!40000 ALTER TABLE `encuesta` DISABLE KEYS */;
INSERT INTO `encuesta` VALUES (1,'Planchado','15','20000','2','Muy caro','horario','fin de mes','99999'),(7,'Peinado','3','12000','3','malo','muchos','muchos','109865773'),(9,'Peinado','Hoy','2000','50','malo','mucho','Promociones online','896'),(10,'peinado ultimo','56','20000','20','Regular','mas barato','Regalos o muestras gratis','8956');
/*!40000 ALTER TABLE `encuesta` ENABLE KEYS */;
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
/*!50003 CREATE*/ /*!50017 DEFINER=`root`@`localhost`*/ /*!50003 TRIGGER `InsertEncuesta` AFTER INSERT ON `encuesta` FOR EACH ROW INSERT INTO bitacora(bita_codi,bita_desc,bita_fech,bita_id,bita_tabla) VALUES (null,concat("Se ingreso la encuesta con consecutivo ",New.Id),now(),New.Id,"encuesta") */;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;

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
) ENGINE=InnoDB AUTO_INCREMENT=23 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `promociones`
--

LOCK TABLES `promociones` WRITE;
/*!40000 ALTER TABLE `promociones` DISABLE KEYS */;
INSERT INTO `promociones` VALUES (1,'50%','0'),(2,'page menos','0'),(3,'page menos','0'),(4,'Rebajas en el precio del producto',''),(5,'Rebajas en el precio del producto',''),(6,'Ofertas 2x1 o 3z2',''),(7,'Ofertas 2x1 o 3z2',''),(8,'Reembolso o devolucion de efectivo',''),(9,'Promociones online',''),(10,'cantidad extra del producto',''),(11,'Entrada a concursos o juegos',''),(12,'Ofertas 2x1 o 3z2',''),(13,'Ofertas 2x1 o 3z2','LA hora feliz'),(14,'Seleccionar','Hora feliz'),(15,'Descuentos','asda'),(16,'Descuentos','asdasad'),(17,'Descuentos','sas'),(18,'Ofertas 2x1 o 3z2',''),(19,'Descuentos','67'),(20,'Otra','mcuah'),(21,'Descuentos','mcuah'),(22,'Otra','hola mundo');
/*!40000 ALTER TABLE `promociones` ENABLE KEYS */;
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
/*!50003 CREATE*/ /*!50017 DEFINER=`root`@`localhost`*/ /*!50003 TRIGGER `InsertPromociones` AFTER INSERT ON `promociones` FOR EACH ROW INSERT INTO bitacora(bita_codi,bita_desc,bita_fech,bita_id,bita_tabla) VALUES (null,concat("Se ingreso la promocion con consecutivo ",New.Id),now(),New.Id,"promociones") */;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;

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
  `codusu` int(11) NOT NULL,
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
INSERT INTO `usuarios` VALUES (0,'mao','mao','1','','','','2013-11-26 17:41:51'),(1,'Jennifer','Jennifer','1','','','',NULL),(2,'Javier','Javier','1','','','',NULL);
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

-- Dump completed on 2013-12-03 20:19:50
