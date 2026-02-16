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
-- Table structure for table `encounter`
--

DROP TABLE IF EXISTS `encounter`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `encounter` (
  `encounter_id` int NOT NULL,
  `patient_id` int NOT NULL,
  `doctor_id` int NOT NULL,
  `encounter_type` varchar(100) NOT NULL,
  `encounter_date` date NOT NULL,
  `encounter_start_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  `encounter_end_time` timestamp NULL DEFAULT NULL,
  `reason_for_visit` varchar(100) DEFAULT NULL,
  `diagnosis_summary` varchar(100) DEFAULT NULL,
  `department` varchar(30) NOT NULL,
  `encounter_status` varchar(30) DEFAULT NULL,
  `admission_required` char(3) DEFAULT NULL,
  `created_by` varchar(30) DEFAULT NULL,
  `last_updated_timestamp` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`encounter_id`),
  KEY `patient_id` (`patient_id`),
  KEY `doctor_id` (`doctor_id`),
  CONSTRAINT `encounter_ibfk_1` FOREIGN KEY (`patient_id`) REFERENCES `patient_info` (`patient_id`),
  CONSTRAINT `encounter_ibfk_2` FOREIGN KEY (`doctor_id`) REFERENCES `doctor` (`doctor_id`),
  CONSTRAINT `encounter_chk_1` CHECK ((`encounter_status` in (_utf8mb4'scheduled',_utf8mb4'ongoing',_utf8mb4'completed',_utf8mb4'cancelled'))),
  CONSTRAINT `encounter_chk_2` CHECK ((`admission_required` in (_utf8mb4'yes',_utf8mb4'no')))
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `encounter`
--

LOCK TABLES `encounter` WRITE;
/*!40000 ALTER TABLE `encounter` DISABLE KEYS */;
INSERT INTO `encounter` VALUES (1,1,2,'opd','2024-01-10','2026-02-11 18:39:18',NULL,'fever','viral infection','medicine','completed','no','system','2026-02-11 18:39:18'),(2,2,1,'opd','2024-01-11','2026-02-11 18:39:18',NULL,'chest pain','suspected cardiac','cardiology','completed','no','system','2026-02-11 18:39:18'),(3,3,3,'ipd','2024-01-12','2026-02-11 18:39:18',NULL,'knee pain','arthritis','orthopedic','ongoing','yes','system','2026-02-11 18:39:18'),(4,4,2,'opd','2024-01-13','2026-02-11 18:39:18',NULL,'headache','migraine','neurology','completed','no','system','2026-02-11 18:39:18'),(5,5,4,'ipd','2024-01-14','2026-02-11 18:39:18',NULL,'pregnancy check','planned delivery','gynecology','ongoing','yes','system','2026-02-11 18:39:18'),(6,1,2,'opd','2026-02-13','2026-02-11 18:59:28',NULL,'persistent cough','upper respiratory infection','medicine','completed','no','system','2026-02-11 18:59:28'),(7,3,3,'ipd','2026-02-14','2026-02-11 18:59:35',NULL,'severe knee swelling','advanced osteoarthritis','orthopedic','ongoing','yes','system','2026-02-11 18:59:35');
/*!40000 ALTER TABLE `encounter` ENABLE KEYS */;
UNLOCK TABLES;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = cp850 */ ;
/*!50003 SET character_set_results = cp850 */ ;
/*!50003 SET collation_connection  = cp850_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
/*!50003 CREATE*/ /*!50017 DEFINER=`root`@`localhost`*/ /*!50003 TRIGGER `encounter_invoice` AFTER INSERT ON `encounter` FOR EACH ROW begin

insert into invoice_bill(encounter_id) values(new.encounter_id);

end */;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2026-02-16 15:02:27
