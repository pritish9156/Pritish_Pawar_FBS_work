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
-- Table structure for table `encounter_doctor`
--

DROP TABLE IF EXISTS `encounter_doctor`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `encounter_doctor` (
  `encounter_doctor_id` int NOT NULL,
  `encounter_id` int NOT NULL,
  `doctor_id` int NOT NULL,
  `role_of_doctor` varchar(30) NOT NULL,
  `involvemt_start_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  `involvement_end_time` timestamp NULL DEFAULT NULL,
  PRIMARY KEY (`encounter_doctor_id`),
  KEY `doctor_id` (`doctor_id`),
  KEY `encounter_id` (`encounter_id`),
  CONSTRAINT `encounter_doctor_ibfk_1` FOREIGN KEY (`doctor_id`) REFERENCES `doctor` (`doctor_id`),
  CONSTRAINT `encounter_doctor_ibfk_2` FOREIGN KEY (`encounter_id`) REFERENCES `encounter` (`encounter_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `encounter_doctor`
--

LOCK TABLES `encounter_doctor` WRITE;
/*!40000 ALTER TABLE `encounter_doctor` DISABLE KEYS */;
INSERT INTO `encounter_doctor` VALUES (1,3,3,'assistant','2026-02-11 18:39:48',NULL),(2,5,4,'primary','2026-02-11 18:39:48',NULL),(3,5,1,'consultant','2026-02-11 18:39:48',NULL),(4,3,2,'consultant','2026-02-11 18:39:48',NULL),(5,2,1,'primary','2026-02-11 18:39:48',NULL);
/*!40000 ALTER TABLE `encounter_doctor` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2026-02-16 15:02:29
