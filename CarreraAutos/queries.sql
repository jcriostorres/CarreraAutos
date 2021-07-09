CREATE DATABASE carrera_autos;
USE carrera_autos;

CREATE TABLE conductores(
	id_conductor INT NOT NULL AUTO_INCREMENT,
    nombre_conductor VARCHAR(50) NOT NULL,
    color_carro VARCHAR(30) NOT NULL,
    marca_carro VARCHAR(30) NOT NULL,
    carreras_ganadas INT DEFAULT 0,
	cedula_conductor VARCHAR(20) NOT NULL,
    PRIMARY KEY(id_conductor)
);

INSERT INTO conductores (nombre_conductor, color_carro, marca_carro, cedula_conductor) VALUES 
("Juan Perez Monsalve", "Rojo", "Renault", "123"),
("Catalina Rios", "verde", "Lada", "456"),
("Jaito Rios", "Rojo", "Suzuky", "789"),
("Elena Torres", "negro", "Toyota", "1011");


CREATE TABLE podios (
	id_podio INT NOT NULL AUTO_INCREMENT,
    nombre_1ra_posicion VARCHAR(50) NOT NULL,
	nombre_2ra_posicion VARCHAR(50) NOT NULL,
	nombre_3ra_posicion VARCHAR(50) NOT NULL,
    PRIMARY KEY (id_podio)
);

INSERT INTO podios (nombre_1ra_posicion, nombre_2ra_posicion, nombre_3ra_posicion) VALUES 
("Juan Perez Monsalve", "Catalina Rios", "Jairo Rios");
