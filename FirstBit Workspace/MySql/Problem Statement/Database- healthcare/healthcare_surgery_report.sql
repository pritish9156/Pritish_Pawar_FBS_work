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
-- Table structure for table `surgery_report`
--

DROP TABLE IF EXISTS `surgery_report`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `surgery_report` (
  `surgery_report_id` int NOT NULL AUTO_INCREMENT,
  `encounter_id` int NOT NULL,
  `surgery_id` int NOT NULL,
  `scheduled_date` date NOT NULL,
  `performed_date` date DEFAULT NULL,
  `operation_theatre` varchar(20) DEFAULT NULL,
  `outcome` varchar(100) DEFAULT NULL,
  `complications` varchar(100) DEFAULT NULL,
  `surgery_status` varchar(30) DEFAULT NULL,
  `remarks` varchar(100) DEFAULT NULL,
  `created_timestamp` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  `last_update_timestamp` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`surgery_report_id`),
  KEY `encounter_id` (`encounter_id`),
  KEY `surgery_id` (`surgery_id`),
  CONSTRAINT `surgery_report_ibfk_1` FOREIGN KEY (`encounter_id`) REFERENCES `encounter` (`encounter_id`),
  CONSTRAINT `surgery_report_ibfk_2` FOREIGN KEY (`surgery_id`) REFERENCES `surgery` (`surgery_id`),
  CONSTRAINT `surgery_report_chk_1` CHECK ((`surgery_status` in (_utf8mb4'scheduled',_utf8mb4'completed',_utf8mb4'cancelled',_utf8mb4'postponed')))
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `surgery_report`
--

LOCK TABLES `surgery_report` WRITE;
/*!40000 ALTER TABLE `surgery_report` DISABLE KEYS */;
INSERT INTO `surgery_report` VALUES (1,3,3,'2024-01-15',NULL,'ot-1',NULL,NULL,'scheduled','planned','2026-02-11 18:43:11','2026-02-11 18:43:11'),(2,5,5,'2024-01-16',NULL,'ot-2',NULL,NULL,'scheduled','planned delivery','2026-02-11 18:43:11','2026-02-11 18:43:11'),(3,2,1,'2024-01-20',NULL,'ot-3',NULL,NULL,'scheduled','angioplasty advised','2026-02-11 18:43:11','2026-02-11 18:43:11'),(4,4,4,'2024-01-18',NULL,'ot-4',NULL,NULL,'scheduled','minor surgery','2026-02-11 18:43:11','2026-02-11 18:43:11'),(5,1,2,'2024-01-19',NULL,'ot-5',NULL,NULL,'scheduled','appendix check','2026-02-11 18:43:11','2026-02-11 18:43:11');
/*!40000 ALTER TABLE `surgery_report` ENABLE KEYS */;
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
/*!50003 CREATE*/ /*!50017 DEFINER=`root`@`localhost`*/ /*!50003 TRIGGER `surgery_invoice_item` AFTER INSERT ON `surgery_report` FOR EACH ROW begin

declare encounterid int;
declare invoiceid int;
declare cost decimal(10,2);

set encounterid = new.encounter_id;

select invoice_id into invoiceid from invoice_bill where encounter_id = encounterid;

select surgery_cost into cost from surgery where surgery_id = new.surgery_id;

insert into invoice_item(invoice_id, item_type, item_reference_id, quantity, unit_price, total_price)
values(invoiceid, "surgery", new.surgery_id, 1, cost, 0.00);

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
