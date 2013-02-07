SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

CREATE SCHEMA IF NOT EXISTS `jdaydatabase` DEFAULT CHARACTER SET latin1 ;
USE `jdaydatabase` ;

-- -----------------------------------------------------
-- Table `jdaydatabase`.`bookingno`
-- -----------------------------------------------------
CREATE  TABLE IF NOT EXISTS `jdaydatabase`.`bookingno` (
  `bookingno` INT(64) NOT NULL ,
  `availability` VARCHAR(45) NOT NULL ,
  PRIMARY KEY (`bookingno`) )
ENGINE = InnoDB
DEFAULT CHARACTER SET = latin1;


-- -----------------------------------------------------
-- Table `jdaydatabase`.`class`
-- -----------------------------------------------------
CREATE  TABLE IF NOT EXISTS `jdaydatabase`.`class` (
  `class` VARCHAR(100) NOT NULL ,
  `fees` VARCHAR(100) NOT NULL ,
  `timing` VARCHAR(100) NOT NULL ,
  `venue` VARCHAR(100) NOT NULL ,
  `description` VARCHAR(100) NOT NULL ,
  PRIMARY KEY (`class`) )
ENGINE = InnoDB
DEFAULT CHARACTER SET = latin1;


-- -----------------------------------------------------
-- Table `jdaydatabase`.`event`
-- -----------------------------------------------------
CREATE  TABLE IF NOT EXISTS `jdaydatabase`.`event` (
  `idupdate` INT(11) NOT NULL AUTO_INCREMENT ,
  `info` VARCHAR(100) NOT NULL ,
  `title` VARCHAR(45) NOT NULL ,
  `date` VARCHAR(45) NOT NULL ,
  `venue` VARCHAR(45) NOT NULL ,
  PRIMARY KEY (`idupdate`) )
ENGINE = InnoDB
AUTO_INCREMENT = 7
DEFAULT CHARACTER SET = latin1;


-- -----------------------------------------------------
-- Table `jdaydatabase`.`fnb`
-- -----------------------------------------------------
CREATE  TABLE IF NOT EXISTS `jdaydatabase`.`fnb` (
  `orderno` INT(11) NOT NULL AUTO_INCREMENT ,
  `bookingno` INT(11) NOT NULL ,
  `fnborder` VARCHAR(100) NULL DEFAULT NULL ,
  `quantity` INT(11) NULL DEFAULT NULL ,
  `venue` VARCHAR(45) NULL DEFAULT NULL ,
  `price` DOUBLE NULL DEFAULT NULL ,
  `memberid` VARCHAR(45) NOT NULL ,
  PRIMARY KEY (`orderno`) )
ENGINE = InnoDB
AUTO_INCREMENT = 10
DEFAULT CHARACTER SET = latin1;


-- -----------------------------------------------------
-- Table `jdaydatabase`.`golf`
-- -----------------------------------------------------
CREATE  TABLE IF NOT EXISTS `jdaydatabase`.`golf` (
  `bookingno` INT(11) NOT NULL ,
  `memberid` VARCHAR(45) NOT NULL ,
  `time` VARCHAR(45) NOT NULL ,
  `date` VARCHAR(45) NOT NULL ,
  `greenfees` VARCHAR(45) NOT NULL ,
  `price` DOUBLE NOT NULL ,
  PRIMARY KEY (`bookingno`) )
ENGINE = InnoDB
DEFAULT CHARACTER SET = latin1;


-- -----------------------------------------------------
-- Table `jdaydatabase`.`memberinfo`
-- -----------------------------------------------------
CREATE  TABLE IF NOT EXISTS `jdaydatabase`.`memberinfo` (
  `memberid` VARCHAR(10) NOT NULL ,
  `name` VARCHAR(100) NOT NULL ,
  `birthdate` VARCHAR(10) NULL DEFAULT NULL ,
  `contactnoH` INT(8) NULL DEFAULT NULL ,
  `contactnoM` INT(8) NOT NULL ,
  `email` VARCHAR(100) NOT NULL ,
  `address` VARCHAR(100) NULL DEFAULT NULL ,
  PRIMARY KEY (`memberid`) )
ENGINE = InnoDB
DEFAULT CHARACTER SET = latin1;


-- -----------------------------------------------------
-- Table `jdaydatabase`.`register`
-- -----------------------------------------------------
CREATE  TABLE IF NOT EXISTS `jdaydatabase`.`register` (
  `no` INT(11) NOT NULL AUTO_INCREMENT ,
  `registerno` INT(100) NOT NULL ,
  `eventclass` VARCHAR(100) NOT NULL ,
  `memberid` VARCHAR(100) NOT NULL ,
  PRIMARY KEY (`no`, `registerno`) )
ENGINE = InnoDB
AUTO_INCREMENT = 11
DEFAULT CHARACTER SET = latin1;


-- -----------------------------------------------------
-- Table `jdaydatabase`.`registerno`
-- -----------------------------------------------------
CREATE  TABLE IF NOT EXISTS `jdaydatabase`.`registerno` (
  `registerno` INT(64) NOT NULL ,
  `availability` VARCHAR(100) NOT NULL ,
  PRIMARY KEY (`registerno`) )
ENGINE = InnoDB
DEFAULT CHARACTER SET = latin1;


-- -----------------------------------------------------
-- Table `jdaydatabase`.`spakaraoke`
-- -----------------------------------------------------
CREATE  TABLE IF NOT EXISTS `jdaydatabase`.`spakaraoke` (
  `bookingno` INT(11) NOT NULL ,
  `memberid` VARCHAR(45) NOT NULL ,
  `time` VARCHAR(45) NOT NULL ,
  `date` VARCHAR(45) NOT NULL ,
  `session` VARCHAR(45) NOT NULL ,
  `roomnumber` VARCHAR(45) NULL DEFAULT NULL ,
  PRIMARY KEY (`bookingno`) )
ENGINE = InnoDB
DEFAULT CHARACTER SET = latin1;


-- -----------------------------------------------------
-- Table `jdaydatabase`.`sports`
-- -----------------------------------------------------
CREATE  TABLE IF NOT EXISTS `jdaydatabase`.`sports` (
  `bookingno` INT(11) NOT NULL ,
  `memberid` VARCHAR(45) NOT NULL ,
  `time` VARCHAR(45) NOT NULL ,
  `date` VARCHAR(45) NOT NULL ,
  `court` INT(11) NOT NULL ,
  `sport` VARCHAR(45) NULL DEFAULT NULL ,
  PRIMARY KEY (`bookingno`) )
ENGINE = InnoDB
DEFAULT CHARACTER SET = latin1;


-- -----------------------------------------------------
-- Table `jdaydatabase`.`user_aes`
-- -----------------------------------------------------
CREATE  TABLE IF NOT EXISTS `jdaydatabase`.`user_aes` (
  `user_name` VARCHAR(8) NOT NULL ,
  `pin` BLOB NOT NULL ,
  `membertype` VARCHAR(45) NOT NULL ,
  `count` VARCHAR(45) NULL DEFAULT NULL ,
  PRIMARY KEY (`user_name`) )
ENGINE = InnoDB
DEFAULT CHARACTER SET = latin1;

USE `jdaydatabase` ;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
