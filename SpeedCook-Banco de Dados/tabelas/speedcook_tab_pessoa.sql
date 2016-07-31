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
-- Table structure for table `tab_pessoa`
--

DROP TABLE IF EXISTS `tab_pessoa`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tab_pessoa` (
  `idPessoa` int(11) NOT NULL AUTO_INCREMENT,
  `nome` varchar(255) NOT NULL,
  `sobrenome` varchar(255) NOT NULL,
  `dataNasc` datetime NOT NULL,
  `telefone` varchar(255) NOT NULL,
  `email` varchar(255) NOT NULL,
  `dataCad` datetime NOT NULL,
  `password` varchar(255) NOT NULL,
  `codLogradouro` int(11) NOT NULL,
  `numEndereco` varchar(45) NOT NULL,
  `compEndereco` varchar(255) DEFAULT NULL,
  `codSexo` int(11) NOT NULL,
  `cpf` varchar(11) NOT NULL,
  `foto` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`idPessoa`),
  KEY `fk_tab_Pessoa_tab_Logradouro1_idx` (`codLogradouro`),
  KEY `fk_tab_Pessoa_tab_Sexo1_idx` (`codSexo`),
  CONSTRAINT `fk_tab_Pessoa_tab_Logradouro1` FOREIGN KEY (`codLogradouro`) REFERENCES `tab_logradouro` (`idRua`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_tab_Pessoa_tab_Sexo1` FOREIGN KEY (`codSexo`) REFERENCES `tab_sexo` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tab_pessoa`
--

LOCK TABLES `tab_pessoa` WRITE;
/*!40000 ALTER TABLE `tab_pessoa` DISABLE KEYS */;
INSERT INTO `tab_pessoa` VALUES (1,'Vitor','Couto Rodovalho','1991-11-07 22:00:00','34991875606','admin@gmail.com','2016-07-03 18:03:16','991088c25c2cd99b67a89e08dd389e055b3887f4c75d9a1dc65ae677e6d7da2d82e856b06bf4d65f',196821,'788','Proximo ao Venus Motel',1,'07057694610',NULL),(2,'Lucas','Couto','1975-08-05 21:00:00','3491875606','lucas@gmail.com','2016-07-07 16:05:50','eb8e9d110f800f5c18122e5f1632ede03b6e03f6325aff6ef816467b544d823d37c74c245eded806',102569,'89',NULL,2,'06057694610',NULL);
/*!40000 ALTER TABLE `tab_pessoa` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2016-07-29 18:20:23
