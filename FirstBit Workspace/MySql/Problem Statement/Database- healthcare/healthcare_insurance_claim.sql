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
-- Table structure for table `insurance_claim`
--

DROP TABLE IF EXISTS `insurance_claim`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `insurance_claim` (
  `claim_id` int NOT NULL,
  `invoice_id` int NOT NULL,
  `patient_insurance_id` int NOT NULL,
  `claim_number` varchar(30) NOT NULL,
  `claim_date` date NOT NULL,
  `claimed_amount` decimal(10,2) NOT NULL,
  `approved_amount` decimal(10,2) DEFAULT '0.00',
  `claim_status` varchar(30) DEFAULT NULL,
  `remark` varchar(100) DEFAULT NULL,
  `created_timestamp` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`claim_id`),
  UNIQUE KEY `invoice_id` (`invoice_id`),
  UNIQUE KEY `claim_number` (`claim_number`),
  KEY `patient_insurance_id` (`patient_insurance_id`),
  CONSTRAINT `insurance_claim_ibfk_1` FOREIGN KEY (`invoice_id`) REFERENCES `invoice_bill` (`invoice_id`),
  CONSTRAINT `insurance_claim_ibfk_2` FOREIGN KEY (`patient_insurance_id`) REFERENCES `patient_insurance` (`patient_insurance_id`),
  CONSTRAINT `insurance_claim_chk_1` CHECK ((`claim_status` in (_utf8mb4'submitted',_utf8mb4'approved',_utf8mb4'rejected',_utf8mb4'partially_approved')))
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `insurance_claim`
--

LOCK TABLES `insurance_claim` WRITE;
/*!40000 ALTER TABLE `insurance_claim` DISABLE KEYS */;
INSERT INTO `insurance_claim` VALUES (1,2,1,'clm1001','2026-02-12',170505.00,150000.00,'partially_approved','policy limit applied','2026-02-11 18:49:06'),(2,3,2,'clm1002','2026-02-12',251603.50,251603.50,'approved','full coverage','2026-02-11 18:49:06'),(3,5,3,'clm1003','2026-02-12',94304.00,0.00,'rejected','not covered under policy','2026-02-11 18:49:06');
/*!40000 ALTER TABLE `insurance_claim` ENABLE KEYS */;
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
