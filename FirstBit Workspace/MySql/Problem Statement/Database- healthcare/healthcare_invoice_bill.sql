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
-- Table structure for table `invoice_bill`
--

DROP TABLE IF EXISTS `invoice_bill`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `invoice_bill` (
  `invoice_id` int NOT NULL AUTO_INCREMENT,
  `encounter_id` int NOT NULL,
  `invoice_number` varchar(100) DEFAULT NULL,
  `invoice_date` date NOT NULL,
  `total_amount` decimal(10,2) NOT NULL,
  `discount_amount` decimal(10,2) DEFAULT '0.00',
  `tax_amount` decimal(10,2) DEFAULT '0.00',
  `net_payable_amount` decimal(10,2) GENERATED ALWAYS AS (((`total_amount` - `discount_amount`) + `tax_amount`)) STORED,
  `payment_status` varchar(30) DEFAULT NULL,
  `created_timestamp` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  `last_update_timestamp` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`invoice_id`),
  UNIQUE KEY `encounter_id` (`encounter_id`),
  UNIQUE KEY `invoice_number` (`invoice_number`),
  UNIQUE KEY `invoice_number_2` (`invoice_number`),
  CONSTRAINT `invoice_bill_ibfk_1` FOREIGN KEY (`encounter_id`) REFERENCES `encounter` (`encounter_id`),
  CONSTRAINT `invoice_bill_chk_1` CHECK ((`payment_status` in (_utf8mb4'success',_utf8mb4'failed',_utf8mb4'pending',_utf8mb4'refunded')))
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `invoice_bill`
--

LOCK TABLES `invoice_bill` WRITE;
/*!40000 ALTER TABLE `invoice_bill` DISABLE KEYS */;
INSERT INTO `invoice_bill` (`invoice_id`, `encounter_id`, `invoice_number`, `invoice_date`, `total_amount`, `discount_amount`, `tax_amount`, `payment_status`, `created_timestamp`, `last_update_timestamp`) VALUES (1,1,'inv1','2026-02-12',45801.50,0.00,0.00,'success','2026-02-11 18:39:18','2026-02-11 18:52:05'),(2,2,'inv2','2026-02-12',170505.00,505.00,505.00,'success','2026-02-11 18:39:18','2026-02-11 18:57:30'),(3,3,'inv3','2026-02-12',251603.50,0.00,0.00,'success','2026-02-11 18:39:18','2026-02-11 18:52:05'),(4,4,'inv4','2026-02-12',31702.00,0.00,0.00,'success','2026-02-11 18:39:18','2026-02-11 18:52:05'),(5,5,'inv5','2026-02-12',94304.00,0.00,0.00,'success','2026-02-11 18:39:18','2026-02-11 18:52:05'),(6,6,'inv6','2026-02-12',1105.50,1000.00,99.50,'pending','2026-02-11 18:59:28','2026-02-11 19:06:16'),(7,7,'inv7','2026-02-12',800.00,0.00,144.00,'pending','2026-02-11 18:59:35','2026-02-11 19:09:02');
/*!40000 ALTER TABLE `invoice_bill` ENABLE KEYS */;
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
/*!50003 CREATE*/ /*!50017 DEFINER=`root`@`localhost`*/ /*!50003 TRIGGER `invoce_bill_generate` BEFORE INSERT ON `invoice_bill` FOR EACH ROW begin

declare invoice_num varchar(100);

set invoice_num = invoice_number_generator();

set new.invoice_number = invoice_num;
set new.invoice_date = curdate();
set new.total_amount = 0.00;
set new.discount_amount = 0.00;
set new.tax_amount = 0.00;
set new.net_payable_amount = 0.00;
set new.payment_status = 'pending';

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
