CREATE DATABASE  IF NOT EXISTS `tiendacelularesed` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `tiendacelularesed`;
-- MySQL dump 10.13  Distrib 8.0.25, for Win64 (x86_64)
--
-- Host: localhost    Database: tiendacelularesed
-- ------------------------------------------------------
-- Server version	8.0.25

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `administrador`
--

DROP TABLE IF EXISTS `administrador`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `administrador` (
  `idadministrador` int NOT NULL AUTO_INCREMENT,
  `username` varchar(45) NOT NULL,
  `contra` varchar(45) NOT NULL,
  PRIMARY KEY (`idadministrador`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `administrador`
--

LOCK TABLES `administrador` WRITE;
/*!40000 ALTER TABLE `administrador` DISABLE KEYS */;
INSERT INTO `administrador` VALUES (1,'bommybear','Fisi2021');
/*!40000 ALTER TABLE `administrador` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `carritocompras`
--

DROP TABLE IF EXISTS `carritocompras`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `carritocompras` (
  `idcarritocompras` int NOT NULL AUTO_INCREMENT,
  `marca` varchar(45) NOT NULL,
  `modelo` varchar(45) NOT NULL,
  `precio` double NOT NULL,
  `cantidad` int NOT NULL,
  `idcliente` int NOT NULL,
  PRIMARY KEY (`idcarritocompras`),
  KEY `fk_clientecarrito_idx` (`idcliente`),
  CONSTRAINT `fk_clientecarrito` FOREIGN KEY (`idcliente`) REFERENCES `cliente` (`idcliente`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=78 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `carritocompras`
--

LOCK TABLES `carritocompras` WRITE;
/*!40000 ALTER TABLE `carritocompras` DISABLE KEYS */;
INSERT INTO `carritocompras` VALUES (5,'Huawei','Mate 20 Pro',2500.5,1,5),(6,'Apple','iPhone 12',2900.5,5,5),(23,'Huawei','P40 Pro',2300.5,1,7),(24,'Apple','iPhone 12',2300.5,1,8),(25,'Huawei','Y9a',2300.5,1,9),(27,'Huawei','P40 Pro',2300.5,1,11),(28,'Huawei','P40 Pro',2100.5,1,12),(29,'Huawei','P40 Pro',2300.5,1,13),(30,'Huawei','P40 Pro',2300.5,1,14),(31,'Huawei','P40 Pro',2300.5,1,15),(39,'Samsung','Galaxy A01',1000,1,12),(41,'Lenovo','Viva-Book',580,2,16),(42,'Sony','Xperia 200',830,1,16),(43,'Motorola','Z-Plus',430,1,16),(44,'LG','K022Lite',400,2,16),(45,'Xiaomi','Note M31',470,2,16),(46,'Xiaomi','M11 US',850,1,16),(47,'Lenovo','Gamer-Pro',300,2,15),(48,'Motorola','E7 Power',316,1,15),(49,'Sony','Xperia 12',530,3,15),(50,'Lenovo','Gamer-Pro',300,3,17),(51,'Sony','Xperia 12',530,1,17),(53,'Apple','iPhone 8',1400,1,19),(54,'Huawei','Y9a',900,1,19),(55,'Xiaomi','Redmi 3AUS',900,3,19),(56,'Huawei','Mate 9 Lite',1500.5,1,6),(57,'Samsung','Galaxy A72',2300.5,1,6),(58,'Apple','iPhone 7',1300,1,6),(59,'LG','H1 ',680,1,6),(60,'LG','K2021-Pro',400,1,6),(61,'LG','K2021-Pro',400,1,6),(62,'Samsung','Fernanfloo',450,1,6),(63,'Samsung','Fernanfloo',450,1,6),(64,'Apple','iPhone 12',2900.5,1,20),(65,'Sony','Xperya30',950,3,20),(66,'Huawei','Y7a',750,1,20),(67,'Lenovo','B-15',530,2,20),(68,'Samsung','Galaxy A52',1500.5,1,21),(69,'Huawei','Mate 9 Lite',1500.5,1,6),(70,'Samsung','Galaxy Z 5G',2500.5,1,22),(71,'Huawei','Mate 20 Pro',2500.5,2,22),(72,'Apple','iPhone 1 Pro',5050,2,22),(73,'Samsung','Galaxy Z 5G',2500.5,2,23),(74,'Lenovo','Gamer-Pro',300,2,23),(75,'Huawei','Mate 9 Lite',1500.5,3,23),(76,'Xiaomi','Redmi Note 9T',2500.5,1,24),(77,'Samsung','Galaxy1230',350,1,24);
/*!40000 ALTER TABLE `carritocompras` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `cliente`
--

DROP TABLE IF EXISTS `cliente`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `cliente` (
  `idcliente` int NOT NULL AUTO_INCREMENT,
  `nombre` varchar(45) NOT NULL,
  `apellido` varchar(45) NOT NULL,
  `dni` varchar(45) NOT NULL,
  `username` varchar(45) NOT NULL,
  `password` varchar(45) NOT NULL,
  PRIMARY KEY (`idcliente`)
) ENGINE=InnoDB AUTO_INCREMENT=25 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cliente`
--

LOCK TABLES `cliente` WRITE;
/*!40000 ALTER TABLE `cliente` DISABLE KEYS */;
INSERT INTO `cliente` VALUES (5,'carlos','Villena Cabrejos','77','bommybear','123456'),(6,'carlos','Villena Cabrejos','77','bommybear','123456'),(7,'maria','cortez','651','mari123','123456'),(8,'jesus','salinas','78951','jesus1','123456'),(9,'andres','quispe','8951','quisde125','123456'),(11,'luzmila','concepcion','012651','luzmi123','123456'),(12,'pedro','castillo','7891651','marx69','123456789'),(13,'cesar','acuña','23678951','plagio123','123456'),(14,'eduardo','cadillo','1208951','eduardo6','123456'),(15,'itachi','uchiha','10364151','sharinga12','123456'),(16,'luis','gamboa','4512651','gamboa10','123456'),(17,'daniel','santos','7894521','dani123','123456'),(18,'peter','parker','7756104','peter15','123456'),(19,'carlos','villena','1234567','carlos123','123456'),(20,'luffy','monkey','77923610','luffy123','123456'),(21,'justin','bieber','7894561','justin123','123456'),(22,'zoe','villena','77821234','zoe123','123456'),(23,'josecarlos','villena','741234','pilon','123456'),(24,'Luz','Elena','12345667','luzelena','123456789');
/*!40000 ALTER TABLE `cliente` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `productos`
--

DROP TABLE IF EXISTS `productos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `productos` (
  `idproductos` int NOT NULL AUTO_INCREMENT,
  `marca` varchar(45) NOT NULL,
  `nombre` varchar(45) NOT NULL,
  `precio` double NOT NULL,
  `cantidad` int NOT NULL,
  PRIMARY KEY (`idproductos`)
) ENGINE=InnoDB AUTO_INCREMENT=113 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `productos`
--

LOCK TABLES `productos` WRITE;
/*!40000 ALTER TABLE `productos` DISABLE KEYS */;
INSERT INTO `productos` VALUES (1,'Huawei','Mate 20 Pro',2500.5,10),(2,'Huawei','Mate 20 Lite',2300.4,15),(3,'Huawei','Mate 10 Pro',2100.5,14),(4,'Huawei','Mate 9 Pro',1900.5,20),(5,'Huawei','Mate 9 Lite',1500.5,15),(6,'Huawei','P40 Pro',2300.5,30),(7,'Huawei','Y9a',900,14),(8,'Huawei','Y7a',750,9),(9,'Huawei','Y6a',600,5),(10,'Huawei','Y5p',550,40),(11,'Huawei','Y8p',850,25),(12,'Huawei','P30 Lite',1200,23),(13,'Huawei','Y5 2018',470,27),(14,'Huawei','Y9  Prime',1000,19),(15,'Huawei','Nova 5T',1700.5,15),(16,'Samsung','Galaxy Z 5G',2500.5,50),(17,'Samsung','Galaxy M12',2300.4,15),(18,'Samsung','Galaxy A32',2100.5,14),(19,'Samsung','Galaxy A02s',1900.5,10),(20,'Samsung','Galaxy A52',1500.5,25),(21,'Samsung','Galaxy A72',2300.5,20),(22,'Samsung','Galaxy A12',900,24),(23,'Samsung','Galaxy S20 FE',750,19),(24,'Samsung','Galaxy M51',600,5),(25,'Samsung','Galaxy A11',550,10),(26,'Samsung','Galaxy M11',850,25),(27,'Samsung','Galaxy A31',1200,23),(28,'Samsung','Galaxy M31',470,50),(29,'Samsung','Galaxy A01',1000,19),(30,'Samsung','Galaxy S10Lite',1700.5,15),(31,'Apple','iPhone 12',2900.5,50),(32,'Apple','iPhone 12 Pro',2500.4,15),(33,'Apple','iPhone 11',2200.5,14),(34,'Apple','iPhone 11 Lite',1900.5,10),(35,'Apple','iPhone 10',1800.5,25),(36,'Apple','iPhone 9',1700.5,20),(37,'Apple','iPhone 8',1400,24),(38,'Apple','iPhone 8 Pro',1350,19),(39,'Apple','iPhone 7',1300,5),(40,'Apple','iPhone 6',1150,10),(41,'Apple','iPhone 1 Pro',5050,25),(42,'Apple','iPhone 5Lite',600,23),(43,'Xiaomi','Redmi Note 9T',2500.5,50),(44,'Xiaomi','Redmi 9A',2300.4,15),(45,'Xiaomi','Redmi Us4GB',2100.5,14),(46,'Xiaomi','Redmi 8A Pro',1900.5,10),(47,'Xiaomi','Redmi 6A Lite',1500.5,25),(48,'Xiaomi','Redmi 5A Pro',2300.5,20),(49,'Xiaomi','Redmi 3AUS',900,24),(50,'Xiaomi','Note Pro15',750,19),(51,'Xiaomi','Redmi M51',600,5),(52,'Xiaomi','Pro Lite A11',550,10),(53,'Xiaomi','M11 US',850,25),(54,'Xiaomi','Redmi A31',1200,23),(55,'Xiaomi','Note M31',470,50),(56,'Xiaomi','MAc A01',1000,19),(57,'Xiaomi','Note 30 S10Lite',1700.5,15),(59,'Xiaomi','A15 Redmi',350,20),(60,'Apple','IphonePro5',500,12),(61,'LG','H1 ',680,63),(62,'LG','CES 2021',3000,4),(63,'Sony','Xperya',560,14),(64,'Samsung','R2020 Pro',900,7),(65,'Motorola','Moto G',650,13),(66,'Motorola','Moto C',860,450),(67,'Samsung','Galaxy78',400,58),(68,'Lenovo','B-15',530,9),(69,'Apple','Iphone300',4050,2),(70,'Sony','Xperya30',950,7),(71,'Lenovo','W-2021',450,19),(72,'LG','Power15',850,17),(73,'Motorola','Moto G Power',4500,32),(74,'Motorola','PlusPower',360,45),(75,'LG','K22',400,9),(76,'LG','K56',500,3),(77,'LG','Q41',430,10),(78,'LG','K22-PRO',800,16),(79,'LG','K022Lite',400,17),(80,'LG','Q-Lite',440,29),(81,'LG','K2021-Pro',400,34),(82,'LG','H12021',400,37),(83,'Motorola','Moto 12',330,13),(84,'Motorola','Moto 36',550,3),(85,'Motorola','Z-Plus',430,8),(86,'Motorola','E6 Plus',900,6),(87,'Motorola','E7 Power',316,17),(88,'Motorola','W-Power8',450,69),(89,'Motorola','E12 Plus',400,14),(90,'Motorola','IPlus',450,27),(91,'Sony','Xperia 12',530,15),(92,'Sony','Xperia 30',650,21),(93,'Sony','Xperia 200',830,37),(94,'Sony','Xperia 34',1000,16),(95,'Lenovo','Viva-Book',580,15),(96,'Lenovo','Gamer-Pro',300,21),(97,'Lenovo','Pro-gamer',860,37),(98,'Lenovo','Lite-Gamer',450,16),(99,'Samsung','Galaxy Pro-5',1200,30),(100,'LG','F-45',310,4),(101,'Xiaomi','RedmiLite8',200,4),(102,'Motorola','MotoT-45',150,9),(103,'Motorola','MotoT-40',150,9),(104,'Samsung','Fernanfloo',450,12),(105,'Xiaomi','patrick',1500,3),(106,'Sony','fernanflo',250,5),(107,'Huawei','cjuro',250,5),(108,'Samsung','Galaxy1230',350,10),(109,'Huawei','Y50',600,15),(110,'Xiaomi','Redmi6320',300,50),(111,'Huawei','Pro Lite 500',3000,40),(112,'Motorola','Moto5',500,40);
/*!40000 ALTER TABLE `productos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `venta`
--

DROP TABLE IF EXISTS `venta`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `venta` (
  `idventa` int NOT NULL AUTO_INCREMENT,
  `idcliente` int DEFAULT NULL,
  `total` double DEFAULT NULL,
  PRIMARY KEY (`idventa`),
  KEY `fk_ventacliente_idx` (`idcliente`),
  CONSTRAINT `fk_ventacliente` FOREIGN KEY (`idcliente`) REFERENCES `cliente` (`idcliente`) ON DELETE SET NULL
) ENGINE=InnoDB AUTO_INCREMENT=30 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `venta`
--

LOCK TABLES `venta` WRITE;
/*!40000 ALTER TABLE `venta` DISABLE KEYS */;
INSERT INTO `venta` VALUES (6,7,4000),(7,8,5000),(8,9,1200),(9,NULL,540),(11,12,363),(12,12,2600),(13,13,3440),(14,14,2350),(15,15,303),(16,16,1250),(20,16,4760),(21,15,2256),(22,17,1330),(23,19,3500),(24,20,4610.5),(25,21,1500.5),(26,6,8731.5),(27,22,15001),(28,23,5501),(29,24,2850.5);
/*!40000 ALTER TABLE `venta` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-03-14 15:58:06
