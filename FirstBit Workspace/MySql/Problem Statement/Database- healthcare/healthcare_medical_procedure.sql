-- MySQL dump 10.13  Distrib 8.0.40, for Win64 (x86_64)
--
-- Host: localhost    Database: healthcare
-- ------------------------------------------------------
-- Server version	8.0.40

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
-- Table structure for table `medical_procedure`
--

DROP TABLE IF EXISTS `medical_procedure`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `medical_procedure` (
  `procedure_id` int NOT NULL,
  `procedure_name` varchar(50) NOT NULL,
  `procedure_code` varchar(30) NOT NULL,
  `department` varchar(30) DEFAULT NULL,
  `description` varchar(100) DEFAULT NULL,
  `estimated_duration` int DEFAULT NULL,
  `procedure_cost` decimal(10,2) DEFAULT NULL,
  `procedure_status` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`procedure_id`),
  UNIQUE KEY `procedure_code` (`procedure_code`),
  CONSTRAINT `medical_procedure_chk_1` CHECK ((`procedure_status` in (_cp850'active',_cp850'inactive')))
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `medical_procedure`
--

LOCK TABLES `medical_procedure` WRITE;
/*!40000 ALTER TABLE `medical_procedure` DISABLE KEYS */;
INSERT INTO `medical_procedure` VALUES (1,'ecg procedure','proc001','cardiology','cardiac rhythm test',20,500.00,'active'),(2,'endoscopy','proc002','gastroenterology','gi tract check',60,4000.00,'active'),(3,'dialysis','proc003','nephrology','blood purification',240,3500.00,'active'),(4,'physiotherapy','proc004','orthopedic','joint therapy',30,800.00,'active'),(5,'angiography','proc005','cardiology','artery imaging',90,20000.00,'active');
/*!40000 ALTER TABLE `medical_procedure` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2026-02-16 15:02:28
