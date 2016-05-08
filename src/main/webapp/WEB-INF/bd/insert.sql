INSERT INTO usuario (id_usuario, nombre, ap_paterno, ap_materno, usuario, contrasenia, activo) VALUES (1,'Gerardo Martín','Hernández','Oliva','gmho','gmho',1);




INSERT INTO perfil (id_perfil, nombre, descripcion, activo) VALUES (1,'ROLE_ROOT','root',1);
INSERT INTO perfil (id_perfil, nombre, descripcion, activo) VALUES (2,'ROLE_ADMIN','admin',1);



INSERT INTO perfil_x_usuario (id_perfil_x_usuario, id_usuario, id_perfil, activo) VALUES (1,1,2,1);




INSERT INTO estado (id_estado, nombre, activo) VALUES (1,'Aguascalientes',1);
INSERT INTO estado (id_estado, nombre, activo) VALUES (2,'Baja California',1);
INSERT INTO estado (id_estado, nombre, activo) VALUES (3,'Baja California Sur',1);
INSERT INTO estado (id_estado, nombre, activo) VALUES (4,'Campeche',1);
INSERT INTO estado (id_estado, nombre, activo) VALUES (5,'Coahuila de Zaragoza',1);
INSERT INTO estado (id_estado, nombre, activo) VALUES (6,'Colima',1);
INSERT INTO estado (id_estado, nombre, activo) VALUES (7,'Chiapas',1);
INSERT INTO estado (id_estado, nombre, activo) VALUES (8,'Chihuahua',1);
INSERT INTO estado (id_estado, nombre, activo) VALUES (9,'Ciudad de México',1);
INSERT INTO estado (id_estado, nombre, activo) VALUES (10,'Durango',1);
INSERT INTO estado (id_estado, nombre, activo) VALUES (11,'Guanajuato',1);
INSERT INTO estado (id_estado, nombre, activo) VALUES (12,'Guerrero',1);
INSERT INTO estado (id_estado, nombre, activo) VALUES (13,'Hidalgo',1);
INSERT INTO estado (id_estado, nombre, activo) VALUES (14,'Jalisco',1);
INSERT INTO estado (id_estado, nombre, activo) VALUES (15,'México',1);
INSERT INTO estado (id_estado, nombre, activo) VALUES (16,'Michoacán de Ocampo',1);
INSERT INTO estado (id_estado, nombre, activo) VALUES (17,'Morelos',1);
INSERT INTO estado (id_estado, nombre, activo) VALUES (18,'Nayarit',1);
INSERT INTO estado (id_estado, nombre, activo) VALUES (19,'Nuevo León',1);
INSERT INTO estado (id_estado, nombre, activo) VALUES (20,'Oaxaca',1);
INSERT INTO estado (id_estado, nombre, activo) VALUES (21,'Puebla',1);
INSERT INTO estado (id_estado, nombre, activo) VALUES (22,'Querétaro',1);
INSERT INTO estado (id_estado, nombre, activo) VALUES (23,'Quintana Roo',1);
INSERT INTO estado (id_estado, nombre, activo) VALUES (24,'San Luis Potosí',1);
INSERT INTO estado (id_estado, nombre, activo) VALUES (25,'Sinaloa',1);
INSERT INTO estado (id_estado, nombre, activo) VALUES (26,'Sonora',1);
INSERT INTO estado (id_estado, nombre, activo) VALUES (27,'Tabasco',1);
INSERT INTO estado (id_estado, nombre, activo) VALUES (28,'Tamaulipas',1);
INSERT INTO estado (id_estado, nombre, activo) VALUES (29,'Tlaxcala',1);
INSERT INTO estado (id_estado, nombre, activo) VALUES (30,'Veracruz de Ignacio de la Llave',1);
INSERT INTO estado (id_estado, nombre, activo) VALUES (31,'Yucatán',1);
INSERT INTO estado (id_estado, nombre, activo) VALUES (32,'Zacatecas',1);




INSERT INTO grado (id_grado, nombre, descripcion, activo) VALUES (1,'4º - 13º',' ',1);
INSERT INTO grado (id_grado, nombre, descripcion, activo) VALUES (2,'14º',' ',1);
INSERT INTO grado (id_grado, nombre, descripcion, activo) VALUES (3,'15º - 18º',' ',1);
INSERT INTO grado (id_grado, nombre, descripcion, activo) VALUES (4,'19º - 30º',' ',1);
INSERT INTO grado (id_grado, nombre, descripcion, activo) VALUES (5,'31º- 32º',' ',1);
INSERT INTO grado (id_grado, nombre, descripcion, activo) VALUES (6,'33º S.·. N.·.',' ',1);
INSERT INTO grado (id_grado, nombre, descripcion, activo) VALUES (7,'33º M.·. A.·.',' ',1);
INSERT INTO grado (id_grado, nombre, descripcion, activo) VALUES (8,'33º M.·. Past-A.·.',' ',1);




INSERT INTO tipo_participacion (id_tipo_participacion, nombre, descripcion, activo) VALUES (1,'Congresista',' ',1);
INSERT INTO tipo_participacion (id_tipo_participacion, nombre, descripcion, activo) VALUES (2,'Conferencista',' ',1);
INSERT INTO tipo_participacion (id_tipo_participacion, nombre, descripcion, activo) VALUES (3,'Coordinador de Mesa',' ',1);
INSERT INTO tipo_participacion (id_tipo_participacion, nombre, descripcion, activo) VALUES (4,'Secretario de Mesa',' ',1);
INSERT INTO tipo_participacion (id_tipo_participacion, nombre, descripcion, activo) VALUES (5,'Organizador',' ',1);
INSERT INTO tipo_participacion (id_tipo_participacion, nombre, descripcion, activo) VALUES (6,'Administrativo',' ',1);




INSERT INTO tipo_ponencia (id_tipo_ponencia, nombre, descripcion, activo) VALUES (1,'No aplica',' ',1);
INSERT INTO tipo_ponencia (id_tipo_ponencia, nombre, descripcion, activo) VALUES (2,'Lectura',' ',1);
INSERT INTO tipo_ponencia (id_tipo_ponencia, nombre, descripcion, activo) VALUES (3,'Presentación en PowerPoint',' ',1);




INSERT INTO tipo_mesa (id_tipo_mesa, nombre, descripcion, activo) VALUES (1,'Ninguna en particular',' ',1);
INSERT INTO tipo_mesa (id_tipo_mesa, nombre, descripcion, activo) VALUES (2,'Masonería en Constituciones',' ',1);
INSERT INTO tipo_mesa (id_tipo_mesa, nombre, descripcion, activo) VALUES (3,'Derechos Humanos',' ',1);
INSERT INTO tipo_mesa (id_tipo_mesa, nombre, descripcion, activo) VALUES (4,'Masonería y Educación',' ',1);
INSERT INTO tipo_mesa (id_tipo_mesa, nombre, descripcion, activo) VALUES (5,'Globalización Económica y Soberanía',' ',1);
INSERT INTO tipo_mesa (id_tipo_mesa, nombre, descripcion, activo) VALUES (6,'Libertad de Creencias y Estado Laíco',' ',1);




INSERT INTO grado_pretende (id_grado_pretende, nombre, descripcion, activo) VALUES (1,'14º',' ',1);
INSERT INTO grado_pretende (id_grado_pretende, nombre, descripcion, activo) VALUES (2,'15º - 18º',' ',1);
INSERT INTO grado_pretende (id_grado_pretende, nombre, descripcion, activo) VALUES (3,'19º - 30º',' ',1);
INSERT INTO grado_pretende (id_grado_pretende, nombre, descripcion, activo) VALUES (4,'31º - 32º',' ',1);




INSERT INTO grado_pretende_precio (id_grado_pretende_precio, id_grado_pretende, fecha_inicio, fecha_fin, precio, activo) VALUES (1,1,'2016-01-01','2016-05-31',1500,1);
INSERT INTO grado_pretende_precio (id_grado_pretende_precio, id_grado_pretende, fecha_inicio, fecha_fin, precio, activo) VALUES (2,2,'2016-01-01','2016-05-31',2000,1);
INSERT INTO grado_pretende_precio (id_grado_pretende_precio, id_grado_pretende, fecha_inicio, fecha_fin, precio, activo) VALUES (3,3,'2016-01-01','2016-05-31',1700,1);
INSERT INTO grado_pretende_precio (id_grado_pretende_precio, id_grado_pretende, fecha_inicio, fecha_fin, precio, activo) VALUES (4,4,'2016-01-01','2016-05-31',3400,1);
INSERT INTO grado_pretende_precio (id_grado_pretende_precio, id_grado_pretende, fecha_inicio, fecha_fin, precio, activo) VALUES (5,1,'2016-06-01','2016-12-01',1600,1);
INSERT INTO grado_pretende_precio (id_grado_pretende_precio, id_grado_pretende, fecha_inicio, fecha_fin, precio, activo) VALUES (6,2,'2016-06-01','2016-12-01',2200,1);
INSERT INTO grado_pretende_precio (id_grado_pretende_precio, id_grado_pretende, fecha_inicio, fecha_fin, precio, activo) VALUES (7,3,'2016-06-01','2016-12-01',1800,1);
INSERT INTO grado_pretende_precio (id_grado_pretende_precio, id_grado_pretende, fecha_inicio, fecha_fin, precio, activo) VALUES (8,4,'2016-06-01','2016-12-01',3700,1);




INSERT INTO hotel (id_hotel, nombre, activo) VALUES (1,'Holiday Inn (Sede)',1);
INSERT INTO hotel (id_hotel, nombre, activo) VALUES (2,'City Express (Sub-sede)',1);
INSERT INTO hotel (id_hotel, nombre, activo) VALUES (3,'Ramada Inn (Sub-sede)',1);




INSERT INTO paquete_hotel (id_paquete_hotel, id_hotel, nombre, descripcion, precio, activo) VALUES (1,1,'Doble 1 día','Habitación doble por día. Incluye desayuno',3520,1);
INSERT INTO paquete_hotel (id_paquete_hotel, id_hotel, nombre, descripcion, precio, activo) VALUES (2,1,'Doble 2 días','Habitación doble por 2 días. Incluye desayuno',7040,1);
INSERT INTO paquete_hotel (id_paquete_hotel, id_hotel, nombre, descripcion, precio, activo) VALUES (3,1,'Doble 3 días','Habitación doble por 3 días. Incluye desayuno',10560,1);
INSERT INTO paquete_hotel (id_paquete_hotel, id_hotel, nombre, descripcion, precio, activo) VALUES (4,2,'Doble 1 día','Habitación doble por día. Incluye desayuno',1561,1);
INSERT INTO paquete_hotel (id_paquete_hotel, id_hotel, nombre, descripcion, precio, activo) VALUES (5,2,'Doble 2 días','Habitación doble por 2 días. Incluye desayuno',3122,1);
INSERT INTO paquete_hotel (id_paquete_hotel, id_hotel, nombre, descripcion, precio, activo) VALUES (6,2,'Doble 3 días','Habitación doble por 3 días. Incluye desayuno',4683,1);
INSERT INTO paquete_hotel (id_paquete_hotel, id_hotel, nombre, descripcion, precio, activo) VALUES (7,3,'Sencilla 1 día','Habitación sencilla por día. NO incluye desayuno',895,1);
INSERT INTO paquete_hotel (id_paquete_hotel, id_hotel, nombre, descripcion, precio, activo) VALUES (8,3,'Sencilla 2 días','Habitación sencilla por 2 días. NO incluye desayuno',1790,1);
INSERT INTO paquete_hotel (id_paquete_hotel, id_hotel, nombre, descripcion, precio, activo) VALUES (9,3,'Sencilla 3 días','Habitación sencilla por 3 días. NO incluye desayuno',2685,1);
INSERT INTO paquete_hotel (id_paquete_hotel, id_hotel, nombre, descripcion, precio, activo) VALUES (10,3,'Doble 1 día','Habitación doble por día. NO incluye desayuno',1265,1);
INSERT INTO paquete_hotel (id_paquete_hotel, id_hotel, nombre, descripcion, precio, activo) VALUES (11,3,'Doble 2 días','Habitación doble por 2 días. NO incluye desayuno',2530,1);
INSERT INTO paquete_hotel (id_paquete_hotel, id_hotel, nombre, descripcion, precio, activo) VALUES (12,3,'Doble 3 días','Habitación doble por 3 días. NO incluye desayuno',3795,1);




INSERT INTO costo_congresista (id_costo_congresista, fecha_inicio, fecha_fin, precio, activo) VALUES (1,'2016-01-01','2016-02-29',1800,1);
INSERT INTO costo_congresista (id_costo_congresista, fecha_inicio, fecha_fin, precio, activo) VALUES (2,'2016-03-01','2016-04-30',2300,1);
INSERT INTO costo_congresista (id_costo_congresista, fecha_inicio, fecha_fin, precio, activo) VALUES (3,'2016-05-01','2016-06-30',2800,1);




INSERT INTO costo_acompaniante (id_costo_acompaniante, fecha_inicio, fecha_fin, precio, activo) VALUES (1,'2016-01-01','2016-02-29',1500,1);
INSERT INTO costo_acompaniante (id_costo_acompaniante, fecha_inicio, fecha_fin, precio, activo) VALUES (2,'2016-03-01','2016-04-30',2000,1);
INSERT INTO costo_acompaniante (id_costo_acompaniante, fecha_inicio, fecha_fin, precio, activo) VALUES (3,'2016-05-01','2016-06-30',2500,1);




INSERT INTO participante (id_participante, nombre, id_estado, activo) VALUES (1,'Gerardo',1,1);




INSERT INTO acompaniante (id_acompaniante, id_participante, nombre, activo) VALUES (1,1,'Lalo',1);
INSERT INTO acompaniante (id_acompaniante, id_participante, nombre, activo) VALUES (2,1,'Mario',1);




INSERT INTO registro (id_registro, id_participante, id_grado, nombre_cuerpo, delegacion, id_tipo_participacion, id_tipo_ponencia, id_tipo_mesa, activo) VALUES (1,1,1,'Abejitas','Plantitas',1,3,1,1);




INSERT INTO hospedaje (id_hospedaje, id_participante, id_paquete_hotel, fecha_entrada, fecha_salida, num_personas_habitacion, activo) VALUES (1,1,1,'2016-01-02','2016-01-03',1,1);




INSERT INTO colacion_grado (id_colacion_grado, id_participante, id_grado_pretende, cuerpo_pretende, activo) VALUES (1,1,2,'Cocodrilitos',1);




INSERT INTO pago (id_pago, id_participante, importe_pago, activo) VALUES (1,1,2000,1);




INSERT INTO parametro_configuracion (id_parametro_configuracion, nombre, valor_int, activo) VALUES (1,'contador_visitas',0,1);