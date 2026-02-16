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
-- Table structure for table `medical_record`
--

DROP TABLE IF EXISTS `medical_record`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `medical_record` (
  `medical_record_id` int NOT NULL,
  `patient_id` int NOT NULL,
  `record_date` date NOT NULL,
  `symptoms` varchar(30) DEFAULT NULL,
  `diagnosis` varchar(30) DEFAULT NULL,
  `allergies` varchar(30) DEFAULT NULL,
  `current_medications` varchar(30) DEFAULT NULL,
  `past_medical_history` varchar(30) DEFAULT NULL,
  `ongoing_conditions` varchar(30) DEFAULT NULL,
  `doctor_notes` varchar(30) DEFAULT NULL,
  `created_timestamp` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  `last_updated_timestamp` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`medical_record_id`),
  KEY `patient_id` (`patient_id`),
  CONSTRAINT `medical_record_ibfk_1` FOREIGN KEY (`patient_id`) REFERENCES `patient_info` (`patient_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `medical_record`
--

LOCK TABLES `medical_record` WRITE;
/*!40000 ALTER TABLE `medical_record` DISABLE KEYS */;
INSERT INTO `medical_record` VALUES (1,1,'2026-02-10','fever and cold','viral infection','none','paracetamol','none','none','rest advised','2026-02-11 19:12:02','2026-02-11 19:12:02'),(2,2,'2026-02-11','chest pain','mild cardiac issue','penicillin','aspirin','hypertension','hypertension','cardiology follow-up needed','2026-02-11 19:12:02','2026-02-11 19:12:02'),(3,3,'2026-02-12','knee swelling','osteoarthritis','none','calcium','previous ligament injury','arthritis','physiotherapy recommended','2026-02-11 19:12:02','2026-02-11 19:12:02'),(4,4,'2026-02-13','headache','migraine','none','none','none','migraine','avoid stress','2026-02-11 19:12:02','2026-02-11 19:12:02'),(5,5,'2026-02-14','pregnancy check','normal pregnancy','none','folic acid','none','pregnancy','routine monitoring','2026-02-11 19:12:02','2026-02-11 19:12:02');
/*!40000 ALTER TABLE `medical_record` ENABLE KEYS */;
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
