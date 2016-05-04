-- MySQL Administrator dump 1.4
--
-- ------------------------------------------------------
-- Server version   5.1.31-community


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


--
-- Create schema super_hero
--

CREATE DATABASE IF NOT EXISTS super_hero;
USE super_hero;

--
-- Definition of table `costume`
--

DROP TABLE IF EXISTS `costume`;
CREATE TABLE `costume` (
  `id_costume` int(11) NOT NULL AUTO_INCREMENT,
  `couleur` varchar(255) NOT NULL,
  `is_moulant` tinyint(1) NOT NULL,
  `nom` varchar(255) NOT NULL,
  `id_super_hero` int(11) DEFAULT NULL,
  PRIMARY KEY (`id_costume`),
  KEY `FK38FDE5E0A9A495A1` (`id_super_hero`),
  CONSTRAINT `FK38FDE5E0A9A495A1` FOREIGN KEY (`id_super_hero`) REFERENCES `super_hero` (`id_super_hero`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `costume`
--

/*!40000 ALTER TABLE `costume` DISABLE KEYS */;
INSERT INTO `costume` (`id_costume`,`couleur`,`is_moulant`,`nom`,`id_super_hero`) VALUES 
 (1,'noire',0,'BatCape',2),
 (2,'rouge',1,'SpiderCostume',1),
 (3,'bleu',1,'XTenue',4),
 (4,'blanc',0,'Cape de Thor',3);
/*!40000 ALTER TABLE `costume` ENABLE KEYS */;


--
-- Definition of table `pouvoir`
--

DROP TABLE IF EXISTS `pouvoir`;
CREATE TABLE `pouvoir` (
  `id_pouvoir` int(11) NOT NULL AUTO_INCREMENT,
  `nom` varchar(255) NOT NULL,
  `puissance` int(11) NOT NULL,
  `id_super_hero` int(11) DEFAULT NULL,
  PRIMARY KEY (`id_pouvoir`),
  KEY `FKE8CBE8F8A9A495A1` (`id_super_hero`),
  CONSTRAINT `FKE8CBE8F8A9A495A1` FOREIGN KEY (`id_super_hero`) REFERENCES `super_hero` (`id_super_hero`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `pouvoir`
--

/*!40000 ALTER TABLE `pouvoir` DISABLE KEYS */;
/*!40000 ALTER TABLE `pouvoir` ENABLE KEYS */;


--
-- Definition of table `super_hero`
--

DROP TABLE IF EXISTS `super_hero`;
CREATE TABLE `super_hero` (
  `id_super_hero` int(11) NOT NULL AUTO_INCREMENT,
  `nom` varchar(45) NOT NULL,
  `prenom` varchar(45) NOT NULL,
  `super_nom` varchar(45) NOT NULL,
  PRIMARY KEY (`id_super_hero`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `super_hero`
--

/*!40000 ALTER TABLE `super_hero` DISABLE KEYS */;
INSERT INTO `super_hero` (`id_super_hero`,`nom`,`prenom`,`super_nom`) VALUES 
 (1,'Parker','Peter','Spiderman'),
 (2,'Wayne','Bruce','Batman'),
 (3,'Odinson','Thor','Thor'),
 (4,'Howlett','James','Wolverine');
/*!40000 ALTER TABLE `super_hero` ENABLE KEYS */;




/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
