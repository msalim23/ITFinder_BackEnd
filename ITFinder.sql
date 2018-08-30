/*
SQLyog Community v12.2.4 (64 bit)
MySQL - 5.5.24 : Database - itfinder
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`itfinder` /*!40100 DEFAULT CHARACTER SET latin1 */;

USE `itfinder`;

/*Table structure for table `offres` */

DROP TABLE IF EXISTS `offres`;

CREATE TABLE `offres` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `description` varchar(255) DEFAULT NULL,
  `status` bit(1) NOT NULL,
  `titre` varchar(255) DEFAULT NULL,
  `auteur_id` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKohp2ec1a2msdjs05x5r9ebd3u` (`auteur_id`)
) ENGINE=MyISAM AUTO_INCREMENT=11 DEFAULT CHARSET=latin1;

/*Data for the table `offres` */

insert  into `offres`(`id`,`description`,`status`,`titre`,`auteur_id`) values 
(1,'Junior java developper','','Junior Java Developper',NULL),
(2,'o1','','o1','3'),
(3,'o1','','o1','5'),
(4,'qfdqzf','\0','Consultant Angular',NULL),
(5,'qfqfqs','\0','qfqef',NULL),
(6,'qsfqsf','\0','qqsfqsf',NULL),
(7,'qsdgqsdfgqdrqsdfgqsdfg','\0','qsdgqsdgqsdfg',NULL),
(8,'o1','','o1','17'),
(9,'o1','','o1','19'),
(10,'t','\0','zfsqzegthsdfhjg',NULL);

/*Table structure for table `offres_candidats` */

DROP TABLE IF EXISTS `offres_candidats`;

CREATE TABLE `offres_candidats` (
  `candidatures_id` int(11) NOT NULL,
  `candidats_id` varchar(255) NOT NULL,
  KEY `FKhp3ydvocv68ejepfbyk3r883l` (`candidats_id`),
  KEY `FKm83464v9807dr0a40w7u3ep5x` (`candidatures_id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

/*Data for the table `offres_candidats` */

/*Table structure for table `users` */

DROP TABLE IF EXISTS `users`;

CREATE TABLE `users` (
  `dtype` varchar(31) NOT NULL,
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `email` varchar(255) DEFAULT NULL,
  `login` varchar(255) DEFAULT NULL,
  `mdp` varchar(255) DEFAULT NULL,
  `nom` varchar(255) DEFAULT NULL,
  `prenom` varchar(255) DEFAULT NULL,
  `adresse_entreprise` varchar(255) DEFAULT NULL,
  `nom_entreprise` varchar(255) DEFAULT NULL,
  `num_tel` varchar(255) DEFAULT NULL,
  `site_web` varchar(255) DEFAULT NULL,
  `cv` varchar(255) DEFAULT NULL,
  `actif` bit(1) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=28 DEFAULT CHARSET=latin1;

/*Data for the table `users` */

insert  into `users`(`dtype`,`id`,`email`,`login`,`mdp`,`nom`,`prenom`,`adresse_entreprise`,`nom_entreprise`,`num_tel`,`site_web`,`cv`,`actif`) values 
('recruteurs',1,'bobo@gmail.com','bobo','123','bobo','bobo','rue de la rue','bobo Enterprises','0212332123','bobo.bobo',NULL,NULL),
('recruteurs',3,'r1','r1','123','r1','r1','r1','r1','r1','r1',NULL,NULL),
('recruteurs',5,'r1','r1','123','r1','r1','r1','r1','r1','r1',NULL,NULL),
('demandeurs',20,'d1','d1','123','d1','d1',NULL,NULL,NULL,NULL,'d1',''),
('demandeurs',18,'d1','d1','123','d1','d1',NULL,NULL,NULL,NULL,'d1',''),
('recruteurs',17,'r1','r1','123','r1','r1','r1','r1','r1','r1',NULL,NULL),
('recruteurs',19,'r1','r1','123','r1','r1','r1','r1','r1','r1',NULL,NULL),
('demandeurs',2,'sdfsdf','loghin','45454hohohoh','aaaaa','jjjj',NULL,NULL,NULL,NULL,NULL,''),
('demandeurs',26,'rtrt','',NULL,'','',NULL,NULL,NULL,NULL,NULL,'\0'),
('demandeurs',27,'koko@gmail.com','kw1245',NULL,'wysk','konrad',NULL,NULL,NULL,NULL,NULL,'\0');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
