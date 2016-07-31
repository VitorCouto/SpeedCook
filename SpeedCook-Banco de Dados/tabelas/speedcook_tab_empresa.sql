CREATE DATABASE  IF NOT EXISTS `speedcook` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `speedcook`;
-- MySQL dump 10.13  Distrib 5.7.9, for Win64 (x86_64)
--
-- Host: localhost    Database: speedcook
-- ------------------------------------------------------
-- Server version	5.7.10-log

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
-- Table structure for table `tab_empresa`
--

DROP TABLE IF EXISTS `tab_empresa`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tab_empresa` (
  `idEmpresa` int(11) NOT NULL AUTO_INCREMENT,
  `razaoSocial` varchar(255) NOT NULL,
  `fantasia` varchar(255) NOT NULL,
  `dataCad` datetime NOT NULL,
  `telefone` varchar(45) NOT NULL,
  `email` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL,
  `numEndereco` int(11) NOT NULL,
  `compEndereco` varchar(255) DEFAULT NULL,
  `codLogradouro` int(11) NOT NULL,
  `cnpj` varchar(20) NOT NULL,
  `logomarca` varchar(255) DEFAULT NULL,
  `taxaEntrega` double NOT NULL,
  `sobreEmpresa` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`idEmpresa`),
  KEY `fk_tab_Empresa_tab_Logradouro1_idx` (`codLogradouro`),
  CONSTRAINT `codLogradouro` FOREIGN KEY (`codLogradouro`) REFERENCES `tab_logradouro` (`idRua`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tab_empresa`
--

LOCK TABLES `tab_empresa` WRITE;
/*!40000 ALTER TABLE `tab_empresa` DISABLE KEYS */;
INSERT INTO `tab_empresa` VALUES (1,'Pastelzinho das Tchuca LTDA','Pastelzinho das Tchuca LTDA','2016-07-03 18:28:01','3432102575','pastel@gmail.com','2ca793116fbd7764a0d326cdb1d22f376bf69924772800f169ebf812fa823e421f2fe825e028bb8e',156,NULL,197747,'06787479000134',NULL,12,'Pastelzinho gostosinhos das Tchucas feito na hora !!!'),(2,'Pizzaria das Tchucas LTDA','Pizzaria das Tchucas','2016-07-05 17:03:13','3432102575','pizzadatchucas@gmail.com','0416708b10e3652f9eb410221a97bc029ca992408d740e36e2a1d3dd00107b3cb48bb7dbc2c14c31',63,NULL,197311,'06787479000134',NULL,16.8,'a');
/*!40000 ALTER TABLE `tab_empresa` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2016-07-29 18:20:25
