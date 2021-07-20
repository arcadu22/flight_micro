
INSERT INTO `viajesbd`.`avion` (`capacidad`, `empresa`, `matricula`, `topo_avion`) VALUES ('50', 'avianca', '87rt8', 'carga');

INSERT INTO `viajesbd`.`cliente` (`apellido`, `documento`, `edad`, `email`, `nombre`, `telefono`) VALUES ('Lopez Sanchez', '98711777', '25', 'juan@hotmail.com', 'jose', '3003128998');

INSERT INTO `viajesbd`.`destino` (`aeropuerto`, `ciudad`, `pais`) VALUES ('Jose maria cordova', 'Rio Negro', 'Colombia');

INSERT INTO `viajesbd`.`origen` (`aeropuerto`, `ciudad`, `pais`) VALUES ('El Dorado', 'Bogota', 'Colombia');

INSERT INTO `viajesbd`.`reserva` (`fecha_reserva`, `ida_vuelta`, `clientefk`) VALUES ('2021-07-11', b'1', b'1');

INSERT INTO `viajesbd`.`tiquete` (`asiento`, `clase`, `fecha`, `hora`, `valor`, `avion_fk`, `clientefk`, `destino_fk`, `origen_fk`) VALUES ('4f', 'vip', '2021-07-20', '12:00:00', '100.900', '1', '1', '1', '1');
