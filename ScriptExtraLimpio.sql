-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
-- -----------------------------------------------------
-- Schema diseñoapp
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema diseñoapp
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `diseñoapp` DEFAULT CHARACTER SET utf8 ;
USE `diseñoapp` ;

-- -----------------------------------------------------
-- Table `diseñoapp`.`regiones`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `diseñoapp`.`regiones` (
  `id_reg` INT(11) NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(20) NOT NULL,
  PRIMARY KEY (`id_reg`))
ENGINE = InnoDB
AUTO_INCREMENT = 17
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `diseñoapp`.`ciudad`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `diseñoapp`.`ciudad` (
  `id_reg` INT(11) NOT NULL,
  `id_ciu` INT(11) NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(20) NOT NULL,
  PRIMARY KEY (`id_ciu`),
  INDEX `id_region_idx` (`id_reg` ASC) VISIBLE,
  CONSTRAINT `id_region`
    FOREIGN KEY (`id_reg`)
    REFERENCES `diseñoapp`.`regiones` (`id_reg`))
ENGINE = InnoDB
AUTO_INCREMENT = 5
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `diseñoapp`.`comuna`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `diseñoapp`.`comuna` (
  `id_ciu` INT(11) NOT NULL,
  `id_comun` INT(11) NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(20) NOT NULL,
  PRIMARY KEY (`id_comun`),
  INDEX `id_ciudad_idx` (`id_ciu` ASC) VISIBLE,
  CONSTRAINT `id_ciudad`
    FOREIGN KEY (`id_ciu`)
    REFERENCES `diseñoapp`.`ciudad` (`id_ciu`))
ENGINE = InnoDB
AUTO_INCREMENT = 6
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `diseñoapp`.`sucursal`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `diseñoapp`.`sucursal` (
  `id_suc` INT(11) NOT NULL AUTO_INCREMENT,
  `id_com` INT(11) NOT NULL,
  `direccion_suc` VARCHAR(20) NOT NULL,
  `correo_suc` VARCHAR(20) NOT NULL,
  `telefono` INT(9) NOT NULL,
  PRIMARY KEY (`id_suc`),
  INDEX `id_com_idx` (`id_com` ASC) VISIBLE,
  CONSTRAINT `id_com`
    FOREIGN KEY (`id_com`)
    REFERENCES `diseñoapp`.`comuna` (`id_comun`))
ENGINE = InnoDB
AUTO_INCREMENT = 124
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `diseñoapp`.`cliente`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `diseñoapp`.`cliente` (
  `id_cliente` INT(11) NOT NULL AUTO_INCREMENT,
  `rut_cliente` INT(8) NOT NULL,
  `rut_veri` INT(1) NOT NULL,
  `nombre_cliente` VARCHAR(20) NOT NULL,
  `apellido_paterno_cliente` VARCHAR(20) NOT NULL,
  `apellido_materno_cliente` VARCHAR(20) NOT NULL,
  `id_suc` INT(11) NOT NULL,
  `telefono_cliente` INT(9) NOT NULL,
  `correo_cliente` VARCHAR(100) NOT NULL,
  PRIMARY KEY (`id_cliente`),
  INDEX `id_suc_cli_idx` (`id_suc` ASC) VISIBLE,
  CONSTRAINT `id_suc_cli`
    FOREIGN KEY (`id_suc`)
    REFERENCES `diseñoapp`.`sucursal` (`id_suc`))
ENGINE = InnoDB
AUTO_INCREMENT = 4
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `diseñoapp`.`estado_orden`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `diseñoapp`.`estado_orden` (
  `id_estado` INT(11) NOT NULL AUTO_INCREMENT,
  `nombre_estado` VARCHAR(20) NOT NULL,
  PRIMARY KEY (`id_estado`))
ENGINE = InnoDB
AUTO_INCREMENT = 3
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `diseñoapp`.`vendedor`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `diseñoapp`.`vendedor` (
  `id_vendedor` INT(11) NOT NULL AUTO_INCREMENT,
  `rut_vendedor` INT(8) NOT NULL,
  `rut_veri` INT(1) NOT NULL,
  `nombre_vendedor` VARCHAR(20) NOT NULL,
  `apellido_paterno_vendedor` VARCHAR(20) NOT NULL,
  `apellido_materno_vendedor` VARCHAR(20) NOT NULL,
  `id_suc` INT(11) NOT NULL,
  `correo_vendedor` VARCHAR(100) NOT NULL,
  `telefono_vendedor` INT(9) NOT NULL,
  PRIMARY KEY (`id_vendedor`),
  INDEX `id_sucursal_idx` (`id_suc` ASC) VISIBLE,
  CONSTRAINT `fkIdSuc`
    FOREIGN KEY (`id_suc`)
    REFERENCES `diseñoapp`.`sucursal` (`id_suc`))
ENGINE = InnoDB
AUTO_INCREMENT = 6
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `diseñoapp`.`orden_servicio`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `diseñoapp`.`orden_servicio` (
  `id_orden` INT(11) NOT NULL AUTO_INCREMENT,
  `id_cliente` INT(11) NOT NULL,
  `id_vendedor` INT(11) NOT NULL,
  `id_estado` INT(11) NOT NULL,
  `fecha_rec` VARCHAR(50) NOT NULL,
  `fecha_dev` VARCHAR(50) NOT NULL,
  PRIMARY KEY (`id_orden`),
  INDEX `id_vendedor_idx` (`id_vendedor` ASC) VISIBLE,
  INDEX `id_estado_idx` (`id_estado` ASC) VISIBLE,
  INDEX `id_cliente_orden_idx` (`id_cliente` ASC) VISIBLE,
  CONSTRAINT `id_cliente_orden`
    FOREIGN KEY (`id_cliente`)
    REFERENCES `diseñoapp`.`cliente` (`id_cliente`),
  CONSTRAINT `id_estado_orden`
    FOREIGN KEY (`id_estado`)
    REFERENCES `diseñoapp`.`estado_orden` (`id_estado`),
  CONSTRAINT `id_vendedor_orden`
    FOREIGN KEY (`id_vendedor`)
    REFERENCES `diseñoapp`.`vendedor` (`id_vendedor`))
ENGINE = InnoDB
AUTO_INCREMENT = 11
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `diseñoapp`.`metodo_pago`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `diseñoapp`.`metodo_pago` (
  `id_metodo_pago` INT(11) NOT NULL AUTO_INCREMENT,
  `nombre_metodo` VARCHAR(20) NOT NULL,
  PRIMARY KEY (`id_metodo_pago`))
ENGINE = InnoDB
AUTO_INCREMENT = 4
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `diseñoapp`.`boleta`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `diseñoapp`.`boleta` (
  `id_boleta` INT(11) NOT NULL AUTO_INCREMENT,
  `id_orden` INT(11) NOT NULL,
  `neto` INT(11) NOT NULL,
  `iva` INT(11) NOT NULL,
  `id_metodo_pago` INT(11) NOT NULL,
  PRIMARY KEY (`id_boleta`),
  INDEX `fk_Boleta_Orden_Servicio1_idx` (`id_orden` ASC) VISIBLE,
  INDEX `id_metodo_pago_idx` (`id_metodo_pago` ASC) VISIBLE,
  CONSTRAINT `fk_Boleta_Orden_Servicio1`
    FOREIGN KEY (`id_orden`)
    REFERENCES `diseñoapp`.`orden_servicio` (`id_orden`),
  CONSTRAINT `id_metodo_pago`
    FOREIGN KEY (`id_metodo_pago`)
    REFERENCES `diseñoapp`.`metodo_pago` (`id_metodo_pago`))
ENGINE = InnoDB
AUTO_INCREMENT = 13
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `diseñoapp`.`estado_detalle_orden`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `diseñoapp`.`estado_detalle_orden` (
  `id_estado_detalle` INT(11) NOT NULL AUTO_INCREMENT,
  `descripcion` VARCHAR(20) NOT NULL,
  PRIMARY KEY (`id_estado_detalle`))
ENGINE = InnoDB
AUTO_INCREMENT = 3
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `diseñoapp`.`tipo_prenda`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `diseñoapp`.`tipo_prenda` (
  `id_tipo_prenda` INT(11) NOT NULL AUTO_INCREMENT,
  `descripcion` VARCHAR(20) NOT NULL,
  PRIMARY KEY (`id_tipo_prenda`))
ENGINE = InnoDB
AUTO_INCREMENT = 7
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `diseñoapp`.`detalle_orden`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `diseñoapp`.`detalle_orden` (
  `id_detalle` INT(11) NOT NULL AUTO_INCREMENT,
  `id_orden` INT(11) NOT NULL,
  `id_tipo_prenda` INT(11) NOT NULL,
  `id_estado_detalle` INT(11) NOT NULL,
  `observacion` VARCHAR(20) NOT NULL,
  PRIMARY KEY (`id_detalle`),
  INDEX `id_orden_idx` (`id_orden` ASC) VISIBLE,
  INDEX `id_tipo_prenda_idx` (`id_tipo_prenda` ASC) VISIBLE,
  INDEX `id_estado_detalle_idx` (`id_estado_detalle` ASC) VISIBLE,
  CONSTRAINT `id_estado_detalle`
    FOREIGN KEY (`id_estado_detalle`)
    REFERENCES `diseñoapp`.`estado_detalle_orden` (`id_estado_detalle`),
  CONSTRAINT `id_orden`
    FOREIGN KEY (`id_orden`)
    REFERENCES `diseñoapp`.`orden_servicio` (`id_orden`),
  CONSTRAINT `id_tipo_prenda`
    FOREIGN KEY (`id_tipo_prenda`)
    REFERENCES `diseñoapp`.`tipo_prenda` (`id_tipo_prenda`))
ENGINE = InnoDB
AUTO_INCREMENT = 5
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `diseñoapp`.`tipo_servicio`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `diseñoapp`.`tipo_servicio` (
  `id_tipo_servicio` INT(11) NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(20) NOT NULL,
  PRIMARY KEY (`id_tipo_servicio`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `diseñoapp`.`servicio`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `diseñoapp`.`servicio` (
  `id_servicio` INT(11) NOT NULL AUTO_INCREMENT,
  `id_tipo_servicio` INT(11) NOT NULL,
  `precio` INT(11) NOT NULL,
  `dias` INT(11) NOT NULL,
  PRIMARY KEY (`id_servicio`),
  INDEX `id_tipo_servicio_idx` (`id_tipo_servicio` ASC) VISIBLE,
  CONSTRAINT `id_tipo_servicio`
    FOREIGN KEY (`id_tipo_servicio`)
    REFERENCES `diseñoapp`.`tipo_servicio` (`id_tipo_servicio`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `diseñoapp`.`detalle_servicio_prenda`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `diseñoapp`.`detalle_servicio_prenda` (
  `id_detalle_servicio` INT(11) NOT NULL AUTO_INCREMENT,
  `id_servicio` INT(11) NOT NULL,
  `id_detalle` INT(11) NOT NULL,
  PRIMARY KEY (`id_detalle_servicio`),
  INDEX `id_servicio_idx` (`id_servicio` ASC) VISIBLE,
  INDEX `id_detalle_idx` (`id_detalle` ASC) VISIBLE,
  CONSTRAINT `id_detalle`
    FOREIGN KEY (`id_detalle`)
    REFERENCES `diseñoapp`.`detalle_orden` (`id_detalle`),
  CONSTRAINT `id_servicio`
    FOREIGN KEY (`id_servicio`)
    REFERENCES `diseñoapp`.`servicio` (`id_servicio`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `diseñoapp`.`telefono_cliente`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `diseñoapp`.`telefono_cliente` (
  `id_telefono_cliente` INT(11) NOT NULL AUTO_INCREMENT,
  `id_cliente` INT(11) NOT NULL,
  `numero` INT(11) NOT NULL,
  PRIMARY KEY (`id_telefono_cliente`),
  INDEX `id_cliente_idx` (`id_cliente` ASC) VISIBLE,
  CONSTRAINT `id_cliente`
    FOREIGN KEY (`id_cliente`)
    REFERENCES `diseñoapp`.`cliente` (`id_cliente`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `diseñoapp`.`telefonosuc`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `diseñoapp`.`telefonosuc` (
  `id_telefono` INT(11) NOT NULL AUTO_INCREMENT,
  `id_suc` INT(11) NOT NULL,
  `numero` INT(11) NOT NULL,
  PRIMARY KEY (`id_telefono`),
  INDEX `id_suc_idx` (`id_suc` ASC) VISIBLE,
  CONSTRAINT `id_suc`
    FOREIGN KEY (`id_suc`)
    REFERENCES `diseñoapp`.`sucursal` (`id_suc`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
