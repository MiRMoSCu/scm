-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

-- -----------------------------------------------------
-- Schema xxxvicon_lithomat_scm_artiffex
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema xxxvicon_lithomat_scm_artiffex
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `xxxvicon_lithomat_scm_artiffex` DEFAULT CHARACTER SET utf8 ;
USE `xxxvicon_lithomat_scm_artiffex` ;

-- -----------------------------------------------------
-- Table `xxxvicon_lithomat_scm_artiffex`.`estado`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `xxxvicon_lithomat_scm_artiffex`.`estado` (
  `id_estado` INT UNSIGNED NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(60) NULL,
  `activo` TINYINT(1) NULL,
  PRIMARY KEY (`id_estado`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `xxxvicon_lithomat_scm_artiffex`.`participante`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `xxxvicon_lithomat_scm_artiffex`.`participante` (
  `id_participante` INT UNSIGNED NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(80) NULL,
  `ap_paterno` VARCHAR(45) NULL,
  `ap_materno` VARCHAR(45) NULL,
  `calle` VARCHAR(60) NULL,
  `num_exterior` VARCHAR(15) NULL,
  `num_interior` VARCHAR(15) NULL,
  `colonia` VARCHAR(60) NULL,
  `delegacion_municipio` VARCHAR(80) NULL,
  `ciudad` VARCHAR(80) NULL,
  `id_estado` INT UNSIGNED NOT NULL,
  `codigo_postal` VARCHAR(15) NULL,
  `telefono_particular` VARCHAR(15) NULL,
  `telefono_movil` VARCHAR(15) NULL,
  `telefono_oficina` VARCHAR(45) NULL,
  `email` VARCHAR(120) NULL,
  `aplica_acompaniante` TINYINT(1) NULL,
  `aplica_colacion_grado` TINYINT(1) NULL,
  `aplica_hospedaje` TINYINT(1) NULL,
  `activo` TINYINT(1) NULL,
  PRIMARY KEY (`id_participante`),
  INDEX `fk_participante_estado1_idx` (`id_estado` ASC),
  CONSTRAINT `fk_participante_estado1`
    FOREIGN KEY (`id_estado`)
    REFERENCES `xxxvicon_lithomat_scm_artiffex`.`estado` (`id_estado`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `xxxvicon_lithomat_scm_artiffex`.`grado`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `xxxvicon_lithomat_scm_artiffex`.`grado` (
  `id_grado` INT UNSIGNED NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(45) NULL,
  `descripcion` VARCHAR(80) NULL,
  `activo` TINYINT(1) NULL,
  PRIMARY KEY (`id_grado`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `xxxvicon_lithomat_scm_artiffex`.`acompaniante`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `xxxvicon_lithomat_scm_artiffex`.`acompaniante` (
  `id_acompaniante` INT UNSIGNED NOT NULL AUTO_INCREMENT,
  `id_participante` INT UNSIGNED NOT NULL,
  `nombre` VARCHAR(80) NULL,
  `ap_paterno` VARCHAR(45) NULL,
  `ap_materno` VARCHAR(45) NULL,
  `activo` TINYINT(1) NULL,
  PRIMARY KEY (`id_acompaniante`),
  INDEX `fk_acompañante_participante1_idx` (`id_participante` ASC),
  CONSTRAINT `fk_acompañante_participante1`
    FOREIGN KEY (`id_participante`)
    REFERENCES `xxxvicon_lithomat_scm_artiffex`.`participante` (`id_participante`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `xxxvicon_lithomat_scm_artiffex`.`perfil`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `xxxvicon_lithomat_scm_artiffex`.`perfil` (
  `id_perfil` INT UNSIGNED NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(45) NULL,
  `descripcion` VARCHAR(80) NULL,
  `activo` TINYINT(1) NULL,
  PRIMARY KEY (`id_perfil`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `xxxvicon_lithomat_scm_artiffex`.`usuario`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `xxxvicon_lithomat_scm_artiffex`.`usuario` (
  `id_usuario` INT UNSIGNED NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(80) NULL,
  `ap_paterno` VARCHAR(45) NULL,
  `ap_materno` VARCHAR(45) NULL,
  `usuario` VARCHAR(45) NULL,
  `contrasenia` VARCHAR(45) NULL,
  `activo` TINYINT(1) NULL,
  PRIMARY KEY (`id_usuario`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `xxxvicon_lithomat_scm_artiffex`.`perfil_x_usuario`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `xxxvicon_lithomat_scm_artiffex`.`perfil_x_usuario` (
  `id_perfil_x_usuario` INT UNSIGNED NOT NULL,
  `id_usuario` INT UNSIGNED NOT NULL,
  `id_perfil` INT UNSIGNED NOT NULL,
  `activo` TINYINT(1) NULL,
  PRIMARY KEY (`id_perfil_x_usuario`),
  INDEX `fk_perfil_x_usuario_usuario1_idx` (`id_usuario` ASC),
  INDEX `fk_perfil_x_usuario_perfil1_idx` (`id_perfil` ASC),
  CONSTRAINT `fk_perfil_x_usuario_usuario1`
    FOREIGN KEY (`id_usuario`)
    REFERENCES `xxxvicon_lithomat_scm_artiffex`.`usuario` (`id_usuario`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_perfil_x_usuario_perfil1`
    FOREIGN KEY (`id_perfil`)
    REFERENCES `xxxvicon_lithomat_scm_artiffex`.`perfil` (`id_perfil`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `xxxvicon_lithomat_scm_artiffex`.`tipo_participacion`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `xxxvicon_lithomat_scm_artiffex`.`tipo_participacion` (
  `id_tipo_participacion` INT UNSIGNED NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(45) NULL,
  `descripcion` VARCHAR(80) NULL,
  `activo` TINYINT(1) NULL,
  PRIMARY KEY (`id_tipo_participacion`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `xxxvicon_lithomat_scm_artiffex`.`tipo_ponencia`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `xxxvicon_lithomat_scm_artiffex`.`tipo_ponencia` (
  `id_tipo_ponencia` INT NOT NULL,
  `nombre` VARCHAR(45) NULL,
  `descripcion` VARCHAR(80) NULL,
  `activo` TINYINT(1) NULL,
  PRIMARY KEY (`id_tipo_ponencia`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `xxxvicon_lithomat_scm_artiffex`.`tipo_mesa`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `xxxvicon_lithomat_scm_artiffex`.`tipo_mesa` (
  `id_tipo_mesa` INT UNSIGNED NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(120) NULL,
  `descripcion` VARCHAR(250) NULL,
  `activo` TINYINT(1) NULL,
  PRIMARY KEY (`id_tipo_mesa`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `xxxvicon_lithomat_scm_artiffex`.`registro`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `xxxvicon_lithomat_scm_artiffex`.`registro` (
  `id_registro` INT UNSIGNED NOT NULL AUTO_INCREMENT,
  `id_participante` INT UNSIGNED NOT NULL,
  `id_grado` INT UNSIGNED NOT NULL,
  `nombre_cuerpo` VARCHAR(45) NULL,
  `delegacion` VARCHAR(45) NULL,
  `id_tipo_participacion` INT UNSIGNED NOT NULL,
  `id_tipo_ponencia` INT NOT NULL,
  `titulo_ponencia` VARCHAR(120) NULL,
  `id_tipo_mesa` INT UNSIGNED NOT NULL,
  `fecha_registro` DATE NULL,
  `activo` TINYINT(1) NULL,
  PRIMARY KEY (`id_registro`),
  INDEX `fk_registro_grado1_idx` (`id_grado` ASC),
  INDEX `fk_registro_tipo_participacion1_idx` (`id_tipo_participacion` ASC),
  INDEX `fk_registro_ponencia1_idx` (`id_tipo_ponencia` ASC),
  INDEX `fk_registro_participante1_idx` (`id_participante` ASC),
  INDEX `fk_registro_tipo_mesa1_idx` (`id_tipo_mesa` ASC),
  CONSTRAINT `fk_registro_grado1`
    FOREIGN KEY (`id_grado`)
    REFERENCES `xxxvicon_lithomat_scm_artiffex`.`grado` (`id_grado`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_registro_tipo_participacion1`
    FOREIGN KEY (`id_tipo_participacion`)
    REFERENCES `xxxvicon_lithomat_scm_artiffex`.`tipo_participacion` (`id_tipo_participacion`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_registro_ponencia1`
    FOREIGN KEY (`id_tipo_ponencia`)
    REFERENCES `xxxvicon_lithomat_scm_artiffex`.`tipo_ponencia` (`id_tipo_ponencia`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_registro_participante1`
    FOREIGN KEY (`id_participante`)
    REFERENCES `xxxvicon_lithomat_scm_artiffex`.`participante` (`id_participante`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_registro_tipo_mesa1`
    FOREIGN KEY (`id_tipo_mesa`)
    REFERENCES `xxxvicon_lithomat_scm_artiffex`.`tipo_mesa` (`id_tipo_mesa`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `xxxvicon_lithomat_scm_artiffex`.`hotel`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `xxxvicon_lithomat_scm_artiffex`.`hotel` (
  `id_hotel` INT UNSIGNED NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(200) NULL,
  `activo` TINYINT(1) NULL,
  PRIMARY KEY (`id_hotel`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `xxxvicon_lithomat_scm_artiffex`.`paquete_hotel`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `xxxvicon_lithomat_scm_artiffex`.`paquete_hotel` (
  `id_paquete_hotel` INT UNSIGNED NOT NULL AUTO_INCREMENT,
  `id_hotel` INT UNSIGNED NOT NULL,
  `nombre` VARCHAR(45) NULL,
  `descripcion` VARCHAR(250) NULL,
  `precio` DECIMAL(7,2) NULL,
  `activo` TINYINT(1) NULL,
  PRIMARY KEY (`id_paquete_hotel`),
  INDEX `fk_paquete_hotel_hotel1_idx` (`id_hotel` ASC),
  CONSTRAINT `fk_paquete_hotel_hotel1`
    FOREIGN KEY (`id_hotel`)
    REFERENCES `xxxvicon_lithomat_scm_artiffex`.`hotel` (`id_hotel`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `xxxvicon_lithomat_scm_artiffex`.`hospedaje`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `xxxvicon_lithomat_scm_artiffex`.`hospedaje` (
  `id_hospedaje` INT UNSIGNED NOT NULL AUTO_INCREMENT,
  `id_participante` INT UNSIGNED NOT NULL,
  `id_paquete_hotel` INT UNSIGNED NOT NULL,
  `fecha_entrada` DATE NULL,
  `fecha_salida` DATE NULL,
  `num_personas_habitacion` INT NULL,
  `activo` TINYINT(1) NULL,
  PRIMARY KEY (`id_hospedaje`),
  INDEX `fk_hospedaje_participante1_idx` (`id_participante` ASC),
  INDEX `fk_hospedaje_paquete_hotel1_idx` (`id_paquete_hotel` ASC),
  CONSTRAINT `fk_hospedaje_participante1`
    FOREIGN KEY (`id_participante`)
    REFERENCES `xxxvicon_lithomat_scm_artiffex`.`participante` (`id_participante`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_hospedaje_paquete_hotel1`
    FOREIGN KEY (`id_paquete_hotel`)
    REFERENCES `xxxvicon_lithomat_scm_artiffex`.`paquete_hotel` (`id_paquete_hotel`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `xxxvicon_lithomat_scm_artiffex`.`grado_pretende`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `xxxvicon_lithomat_scm_artiffex`.`grado_pretende` (
  `id_grado_pretende` INT NOT NULL,
  `nombre` VARCHAR(45) NULL,
  `descripcion` VARCHAR(80) NULL,
  `precio` DECIMAL(7,2) NULL,
  `activo` TINYINT(1) NULL,
  PRIMARY KEY (`id_grado_pretende`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `xxxvicon_lithomat_scm_artiffex`.`colacion_grado`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `xxxvicon_lithomat_scm_artiffex`.`colacion_grado` (
  `id_colacion_grado` INT UNSIGNED NOT NULL AUTO_INCREMENT,
  `id_participante` INT UNSIGNED NOT NULL,
  `id_grado_pretende` INT NOT NULL,
  `cuerpo_pretende` VARCHAR(80) NULL,
  `delegacion_pretende` VARCHAR(120) NULL,
  `activo` TINYINT(1) NULL,
  PRIMARY KEY (`id_colacion_grado`),
  INDEX `fk_colacion_grado_participante1_idx` (`id_participante` ASC),
  INDEX `fk_colacion_grado_grado_pretende1_idx` (`id_grado_pretende` ASC),
  CONSTRAINT `fk_colacion_grado_participante1`
    FOREIGN KEY (`id_participante`)
    REFERENCES `xxxvicon_lithomat_scm_artiffex`.`participante` (`id_participante`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_colacion_grado_grado_pretende1`
    FOREIGN KEY (`id_grado_pretende`)
    REFERENCES `xxxvicon_lithomat_scm_artiffex`.`grado_pretende` (`id_grado_pretende`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `xxxvicon_lithomat_scm_artiffex`.`pago`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `xxxvicon_lithomat_scm_artiffex`.`pago` (
  `id_pago` INT UNSIGNED NOT NULL AUTO_INCREMENT,
  `id_participante` INT UNSIGNED NOT NULL,
  `costo_congresista` DECIMAL(7,2) NULL,
  `costo_acompaniante` DECIMAL(7,2) NULL,
  `costo_colacion_grado` DECIMAL(7,2) NULL,
  `costo_hospedaje` DECIMAL(7,2) NULL,
  `costo_total` DECIMAL(7,2) NULL,
  `importe_pago` DECIMAL(7,2) NULL,
  `nombre_banco` VARCHAR(60) NULL,
  `num_sucursal` VARCHAR(15) NULL,
  `ciudad` VARCHAR(45) NULL,
  `num_referencia` VARCHAR(15) NULL,
  `fecha_transaccion` DATE NULL,
  `activo` TINYINT(1) NULL,
  PRIMARY KEY (`id_pago`),
  INDEX `fk_pago_participante1_idx` (`id_participante` ASC),
  CONSTRAINT `fk_pago_participante1`
    FOREIGN KEY (`id_participante`)
    REFERENCES `xxxvicon_lithomat_scm_artiffex`.`participante` (`id_participante`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `xxxvicon_lithomat_scm_artiffex`.`parametro_configuracion`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `xxxvicon_lithomat_scm_artiffex`.`parametro_configuracion` (
  `id_parametro_configuracion` INT UNSIGNED NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(80) NULL,
  `valor_int` INT NULL,
  `valor_float` FLOAT NULL,
  `valor_string` VARCHAR(120) NULL,
  `valor_boolean` TINYINT(1) NULL,
  `activo` TINYINT(1) NULL,
  PRIMARY KEY (`id_parametro_configuracion`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `xxxvicon_lithomat_scm_artiffex`.`costo_congresista`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `xxxvicon_lithomat_scm_artiffex`.`costo_congresista` (
  `id_costo_congresista` INT UNSIGNED NOT NULL AUTO_INCREMENT,
  `fecha_inicio` DATE NULL,
  `fecha_fin` DATE NULL,
  `precio` DECIMAL(7,2) NULL,
  `activo` TINYINT(1) NULL,
  PRIMARY KEY (`id_costo_congresista`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `xxxvicon_lithomat_scm_artiffex`.`costo_acompaniante`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `xxxvicon_lithomat_scm_artiffex`.`costo_acompaniante` (
  `id_costo_acompaniante` INT UNSIGNED NOT NULL AUTO_INCREMENT,
  `fecha_inicio` DATE NULL,
  `fecha_fin` DATE NULL,
  `precio` DECIMAL(7,2) NULL,
  `activo` TINYINT(1) NULL,
  PRIMARY KEY (`id_costo_acompaniante`))
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
