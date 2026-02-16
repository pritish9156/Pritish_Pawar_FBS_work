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
-- Table structure for table `surgery`
--

DROP TABLE IF EXISTS `surgery`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `surgery` (
  `surgery_id` int NOT NULL,
  `surgery_name` varchar(50) NOT NULL,
  `surgery_code` varchar(30) NOT NULL,
  `department` varchar(30) DEFAULT NULL,
  `surgery_type` varchar(100) DEFAULT NULL,
  `anesthesia_type` varchar(60) DEFAULT NULL,
  `risk_level` varchar(30) DEFAULT NULL,
  `estimated_duration` int DEFAULT NULL,
  `surgery_cost` decimal(10,2) DEFAULT NULL,
  `surgery_status` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`surgery_id`),
  UNIQUE KEY `surgery_code` (`surgery_code`),
  CONSTRAINT `surgery_chk_1` CHECK ((`surgery_status` in (_cp850'active',_cp850'inactive')))
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `surgery`
--

LOCK TABLES `surgery` WRITE;
/*!40000 ALTER TABLE `surgery` DISABLE KEYS */;
INSERT INTO `surgery` VALUES (1,'angioplasty','surg001','cardiology','minimally invasive','local','high',120,150000.00,'active'),(2,'appendectomy','surg002','general surgery','laparoscopic','general','medium',90,45000.00,'active'),(3,'knee replacement','surg003','orthopedic','major','spinal','high',180,250000.00,'active'),(4,'cataract surgery','surg004','ophthalmology','day care','local','low',40,30000.00,'active'),(5,'c-section','surg005','gynecology','major','spinal','high',90,90000.00,'active');
/*!40000 ALTER TABLE `surgery` ENABLE KEYS */;
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
