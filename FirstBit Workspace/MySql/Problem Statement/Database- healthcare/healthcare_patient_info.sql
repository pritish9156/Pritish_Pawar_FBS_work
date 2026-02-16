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
-- Table structure for table `patient_info`
--

DROP TABLE IF EXISTS `patient_info`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `patient_info` (
  `patient_id` int NOT NULL,
  `patient_name` varchar(30) NOT NULL,
  `Registration_date` date NOT NULL,
  `date_of_birth` date DEFAULT NULL,
  `height_cm` decimal(5,2) DEFAULT NULL,
  `weight_kg` decimal(5,2) DEFAULT NULL,
  `Gender` char(1) DEFAULT NULL,
  `blood_group` char(3) DEFAULT NULL,
  `contact_details` varchar(13) NOT NULL,
  `email_id` varchar(30) DEFAULT NULL,
  `emergency_contact_number` varchar(13) NOT NULL,
  `emergency_contact_name` varchar(30) NOT NULL,
  `address` varchar(255) NOT NULL,
  `patient_status` varchar(30) NOT NULL,
  PRIMARY KEY (`patient_id`),
  UNIQUE KEY `email_id` (`email_id`),
  CONSTRAINT `patient_info_chk_1` CHECK ((`blood_group` in (_cp850'A+',_cp850'A-',_cp850'B+',_cp850'B-',_cp850'AB+',_cp850'AB-',_cp850'O+',_cp850'O-'))),
  CONSTRAINT `patient_info_chk_2` CHECK ((`patient_status` in (_cp850'active',_cp850'admitted',_cp850'discharged',_cp850'inactive',_cp850'deceased')))
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `patient_info`
--

LOCK TABLES `patient_info` WRITE;
/*!40000 ALTER TABLE `patient_info` DISABLE KEYS */;
INSERT INTO `patient_info` VALUES (1,'amit sharma','2024-01-01','1990-05-12',170.00,72.00,'m','b+','9876543210','amit@gmail.com','9876543211','ramesh sharma','pune','active'),(2,'neha patil','2024-01-02','1988-08-20',160.00,60.00,'f','a+','9876543220','neha@gmail.com','9876543221','suresh patil','mumbai','active'),(3,'raj malhotra','2024-01-03','1975-02-18',175.00,80.00,'m','o+','9876543230','raj@gmail.com','9876543231','sunita malhotra','delhi','active'),(4,'pooja kulkarni','2024-01-04','1995-11-10',158.00,55.00,'f','ab+','9876543240','pooja@gmail.com','9876543241','mahesh kulkarni','nagpur','active'),(5,'vikram singh','2024-01-05','1982-03-25',180.00,85.00,'m','b-','9876543250','vikram@gmail.com','9876543251','anita singh','nashik','active');
/*!40000 ALTER TABLE `patient_info` ENABLE KEYS */;
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
