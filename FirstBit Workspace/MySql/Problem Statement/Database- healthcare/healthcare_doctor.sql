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
-- Table structure for table `doctor`
--

DROP TABLE IF EXISTS `doctor`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `doctor` (
  `doctor_id` int NOT NULL,
  `doctor_name` varchar(30) NOT NULL,
  `gender` char(1) DEFAULT NULL,
  `date_of_birth` date NOT NULL,
  `joining_date` date DEFAULT NULL,
  `contact_number` varchar(13) NOT NULL,
  `email_id` varchar(30) DEFAULT NULL,
  `employment_type` varchar(30) NOT NULL,
  `qualification` varchar(30) NOT NULL,
  `specialization` varchar(30) DEFAULT NULL,
  `Medical_license_number` varchar(30) NOT NULL,
  `license_issuing_authority` varchar(30) NOT NULL,
  `license_valid_to` date NOT NULL,
  `license_valid_from` date NOT NULL,
  `doctor_status` varchar(30) NOT NULL,
  PRIMARY KEY (`doctor_id`),
  UNIQUE KEY `Medical_license_number` (`Medical_license_number`),
  UNIQUE KEY `email_id` (`email_id`),
  CONSTRAINT `doctor_chk_1` CHECK ((`employment_type` in (_utf8mb4'full_time',_utf8mb4'part_time',_utf8mb4'visiting',_utf8mb4'consultant'))),
  CONSTRAINT `doctor_chk_2` CHECK ((`doctor_status` in (_utf8mb4'active',_utf8mb4'on_leave',_utf8mb4'suspended',_utf8mb4'retired')))
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `doctor`
--

LOCK TABLES `doctor` WRITE;
/*!40000 ALTER TABLE `doctor` DISABLE KEYS */;
INSERT INTO `doctor` VALUES (1,'dr anand joshi','m','1975-05-10','2005-06-01','9000000001','anand@hosp.com','full_time','mbbs','cardiology','lic001','mmc','2030-12-31','2000-01-01','active'),(2,'dr sneha patil','f','1980-08-20','2010-07-15','9000000002','sneha@hosp.com','full_time','mbbs','medicine','lic002','mmc','2032-10-10','2005-03-01','active'),(3,'dr rahul khanna','m','1978-11-12','2008-09-01','9000000003','rahul@hosp.com','consultant','ms','orthopedic','lic003','dmc','2031-08-20','2003-02-15','active'),(4,'dr pooja deshmukh','f','1985-01-30','2015-01-01','9000000004','pooja@hosp.com','visiting','md','gynecology','lic004','mmc','2035-05-15','2010-06-10','active'),(5,'dr karan mehta','m','1983-04-18','2012-05-01','9000000005','karan@hosp.com','full_time','md','neurology','lic005','mmc','2034-09-01','2008-07-01','active');
/*!40000 ALTER TABLE `doctor` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2026-02-16 15:02:27
