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
-- Table structure for table `test_report`
--

DROP TABLE IF EXISTS `test_report`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `test_report` (
  `test_report_id` int NOT NULL AUTO_INCREMENT,
  `encounter_id` int NOT NULL,
  `test_id` int NOT NULL,
  `ordered_date` date NOT NULL,
  `performed_date` date DEFAULT NULL,
  `test_result` varchar(100) DEFAULT NULL,
  `test_time` timestamp NULL DEFAULT NULL,
  `performed_by` varchar(30) DEFAULT NULL,
  `verified_by` varchar(30) NOT NULL,
  `remarks` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`test_report_id`),
  KEY `encounter_id` (`encounter_id`),
  KEY `test_id` (`test_id`),
  CONSTRAINT `test_report_ibfk_1` FOREIGN KEY (`encounter_id`) REFERENCES `encounter` (`encounter_id`),
  CONSTRAINT `test_report_ibfk_2` FOREIGN KEY (`test_id`) REFERENCES `test` (`test_id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `test_report`
--

LOCK TABLES `test_report` WRITE;
/*!40000 ALTER TABLE `test_report` DISABLE KEYS */;
INSERT INTO `test_report` VALUES (1,1,1,'2024-01-10','2024-01-10','normal','2024-01-10 04:30:00','lab tech','dr sneha patil','within range'),(2,2,2,'2024-01-11','2024-01-11','abnormal','2024-01-11 05:30:00','cardio tech','dr anand joshi','mild variation'),(3,3,3,'2024-01-12','2024-01-12','normal','2024-01-12 04:00:00','radiology tech','dr rahul khanna','clear image'),(4,4,4,'2024-01-13','2024-01-13','borderline','2024-01-13 06:30:00','lab tech','dr sneha patil','slightly high'),(5,5,1,'2024-01-14','2024-01-14','normal','2024-01-14 08:30:00','lab tech','dr pooja deshmukh','stable'),(6,6,1,'2026-02-13','2026-02-13','normal','2026-02-13 05:00:00','lab technician','dr sneha patil','within normal limits'),(7,6,3,'2026-02-13','2026-02-13','mild inflammation','2026-02-13 05:45:00','radiology technician','dr sneha patil','no major infection detected'),(8,7,3,'2026-02-14','2026-02-14','joint space narrowing observed','2026-02-14 04:15:00','radiology technician','dr rahul khanna','consistent with osteoarthritis');
/*!40000 ALTER TABLE `test_report` ENABLE KEYS */;
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
/*!50003 CREATE*/ /*!50017 DEFINER=`root`@`localhost`*/ /*!50003 TRIGGER `test_invoice_item` AFTER INSERT ON `test_report` FOR EACH ROW begin

declare encounterid int;
declare invoiceid int;
declare cost decimal(10,2);

set encounterid = new.encounter_id;

select invoice_id into invoiceid from invoice_bill where encounter_id = encounterid;

select test_cost into cost from test where test_id = new.test_id;

insert into invoice_item(invoice_id, item_type, item_reference_id, quantity, unit_price)
values(invoiceid, "test", new.test_id, 1, cost);

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

-- Dump completed on 2026-02-16 15:02:28
