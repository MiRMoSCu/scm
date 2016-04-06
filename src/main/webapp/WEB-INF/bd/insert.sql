INSERT INTO usuario (id_usuario, nombre, usuario, contrasenia, activo) VALUES (1,'Gerardo Martín','gmho','gmho',1);




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




INSERT INTO grado (id_grado, nombre, descripcion, activo) VALUES (1,'4-13','4-13',1);
INSERT INTO grado (id_grado, nombre, descripcion, activo) VALUES (2,'14','14',1);
INSERT INTO grado (id_grado, nombre, descripcion, activo) VALUES (3,'15-18','15-18',1);
INSERT INTO grado (id_grado, nombre, descripcion, activo) VALUES (4,'19-30','19-30',1);
INSERT INTO grado (id_grado, nombre, descripcion, activo) VALUES (5,'31-32','31-32',1);
INSERT INTO grado (id_grado, nombre, descripcion, activo) VALUES (6,'33','33',1);




INSERT INTO tipo_participacion (id_tipo_participacion, nombre, descripcion, activo) VALUES (1,'Congresista',' ',1);
INSERT INTO tipo_participacion (id_tipo_participacion, nombre, descripcion, activo) VALUES (2,'Conferencista',' ',1);
INSERT INTO tipo_participacion (id_tipo_participacion, nombre, descripcion, activo) VALUES (3,'Coordinador de Mesa',' ',1);
INSERT INTO tipo_participacion (id_tipo_participacion, nombre, descripcion, activo) VALUES (4,'Secretario de Mesa',' ',1);
INSERT INTO tipo_participacion (id_tipo_participacion, nombre, descripcion, activo) VALUES (5,'Organizador',' ',1);
INSERT INTO tipo_participacion (id_tipo_participacion, nombre, descripcion, activo) VALUES (6,'Administrativo',' ',1);




INSERT INTO tipo_ponencia (id_tipo_ponencia, nombre, descripcion, activo) VALUES (1,'No aplica',' ',1);
INSERT INTO tipo_ponencia (id_tipo_ponencia, nombre, descripcion, activo) VALUES (2,'Lectura',' ',1);
INSERT INTO tipo_ponencia (id_tipo_ponencia, nombre, descripcion, activo) VALUES (3,'Presentación en PowerPoint',' ',1);




INSERT INTO hotel (id_hotel, nombre, activo) VALUES (1,'Holiday Inn Plaza Universidad (Sede)',1);
INSERT INTO hotel (id_hotel, nombre, activo) VALUES (2,'City Express Patio Universiad (Sub-sede)',1);
INSERT INTO hotel (id_hotel, nombre, activo) VALUES (3,'Ramada Inn Vía Venetto (Sub-sede)',1);




INSERT INTO participante (id_participante, nombre, id_estado, activo) VALUES (1,'Gerardo',1,1);




INSERT INTO acompaniante (id_acompaniante, id_participante, nombre, activo) VALUES (1,1,'Lalo',1);
INSERT INTO acompaniante (id_acompaniante, id_participante, nombre, activo) VALUES (2,1,'Mario',1);




INSERT INTO registro (id_registro, id_participante, id_grado, nombre_cuerpo, delegacion, id_tipo_participacion, id_tipo_ponencia, activo) VALUES (1,1,1,'Abejitas','Plantitas',1,3,1);




INSERT INTO hospedaje (id_hospedaje, id_participante, id_hotel, fecha_entrada, fecha_salida, num_personas_habitacion, activo) VALUES (1,1,1,'2016-01-02','2016-01-02',1,1);




INSERT INTO colacion_grado (id_colacion_grado, id_participante, id_grado_pretende, cuerpo_pretende, activo) VALUES (1,1,2,'Cocodrilitos',1);




INSERT INTO pago (id_pago, id_participante, importe_pago, fecha_transaccion, banco, activo) VALUES (1,1,2000,'2015-12-31','HSBC',1);