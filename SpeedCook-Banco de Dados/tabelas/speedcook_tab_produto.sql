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
-- Table structure for table `tab_produto`
--

DROP TABLE IF EXISTS `tab_produto`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tab_produto` (
  `idProduto` int(11) NOT NULL AUTO_INCREMENT,
  `nomeProduto` varchar(255) NOT NULL,
  `quantidade` int(11) NOT NULL,
  `valor` double NOT NULL,
  `descricao` varchar(255) NOT NULL,
  `foto` longblob,
  `codEmpresa` int(11) NOT NULL,
  PRIMARY KEY (`idProduto`),
  KEY `fk_tab_produto_tab_empresa1_idx` (`codEmpresa`),
  CONSTRAINT `fk_tab_produto_tab_empresa1` FOREIGN KEY (`codEmpresa`) REFERENCES `tab_empresa` (`idEmpresa`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tab_produto`
--

LOCK TABLES `tab_produto` WRITE;
/*!40000 ALTER TABLE `tab_produto` DISABLE KEYS */;
INSERT INTO `tab_produto` VALUES (1,'Pastel de Carne',5,4.5,'Pastel de Carne com Queijo',NULL,1),(2,'Pastel de Frango',0,5,'Pastel de Frango com Queijo',NULL,1),(3,'Pizza Moda da Casa',5,25,'Queijo, Calabresa, Azeitona',NULL,2),(4,'Pizza de Frango',6,27.5,'Pizza recheada  de frango, azeitona',NULL,2),(5,'Pastel de Queijo',5,5.25,'Pastel de Queijo',NULL,1);
/*!40000 ALTER TABLE `tab_produto` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2016-07-29 18:20:21
