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
-- Table structure for table `tab_pedido`
--

DROP TABLE IF EXISTS `tab_pedido`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tab_pedido` (
  `idPedido` int(11) NOT NULL AUTO_INCREMENT,
  `dataPedido` datetime NOT NULL,
  `desconto` double NOT NULL,
  `totalPedido` double NOT NULL,
  `codPessoa` int(11) NOT NULL,
  `codStatus` int(11) NOT NULL,
  `codEmpresa` int(11) NOT NULL,
  PRIMARY KEY (`idPedido`),
  KEY `cod_status_idx` (`codStatus`),
  KEY `cod_Pessoa_idx` (`codPessoa`),
  KEY `fk_tab_Pedido_tab_Empresa1_idx` (`codEmpresa`),
  CONSTRAINT `cod_Pessoa` FOREIGN KEY (`codPessoa`) REFERENCES `tab_pessoa` (`idPessoa`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `cod_status` FOREIGN KEY (`codStatus`) REFERENCES `tab_status` (`idStatus`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_tab_Pedido_tab_Empresa1` FOREIGN KEY (`codEmpresa`) REFERENCES `tab_empresa` (`idEmpresa`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tab_pedido`
--

LOCK TABLES `tab_pedido` WRITE;
/*!40000 ALTER TABLE `tab_pedido` DISABLE KEYS */;
INSERT INTO `tab_pedido` VALUES (1,'2016-07-26 00:00:00',0,4.5,1,4,1),(2,'2016-06-29 00:00:00',5,50,2,4,2);
/*!40000 ALTER TABLE `tab_pedido` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2016-07-29 18:20:22
