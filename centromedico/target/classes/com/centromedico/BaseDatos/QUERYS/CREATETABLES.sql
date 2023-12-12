-- Crear la base de datos
CREATE DATABASE centromedico;



CREATE TABLE concepto (
  idConcepto SERIAL PRIMARY KEY,
  descripcion varchar(100)
);

CREATE TABLE especialidad (
  idEspecialidad SERIAL PRIMARY KEY,
  especialidad varchar(40)
);

CREATE TABLE historia (
  idHistoria SERIAL PRIMARY KEY,
  fechaHistoria timestamp,
  observacion varchar(2000)
);
CREATE TABLE medico (
  idMedico SERIAL PRIMARY KEY,
  primerNombre varchar(50),
  primerApellido varchar(50),
  segundoNombre varchar(50),
  segundoApellido varchar(50),
  genero varchar(10)
);
CREATE TABLE pais (
  idPais char(3) PRIMARY KEY,
  pais varchar(30)
);

CREATE TABLE turno (
  idTurno SERIAL PRIMARY KEY,
  fechaTurno timestamp,
  estado smallint,
  observacion varchar(300)
);
CREATE TABLE pago (
  idPago SERIAL PRIMARY KEY,
  concepto smallint NOT NULL,
  fecha timestamp NOT NULL,
  monto decimal(10,0) NOT NULL,
  estado smallint,
  observacion varchar(1000)
);
CREATE TABLE paciente (
  idPaciente SERIAL PRIMARY KEY,
  DNI varchar(20),
  primerNombre varchar(50) NOT NULL,
  primerApellido varchar(50) NOT NULL,
  segundoNombre varchar(50) ,
  segundoApellido varchar(50),
  genero varchar(10),
  fNacimiento date NOT NULL,
  domicilio varchar(100) NOT NULL,
  idPais char(3) NOT NULL,
  telefono varchar(20),
  email varchar(40) NOT NULL,
  observacion varchar(1000),
  FOREIGN KEY (idPais) REFERENCES pais (idPais)
);

CREATE TABLE historiapaciente (
  idHistoria SERIAL NOT NULL,
  idPaciente int NOT NULL,
  idMedico int NOT NULL,
  PRIMARY KEY (idHistoria),
  FOREIGN KEY (idPaciente) REFERENCES paciente (idPaciente),
  FOREIGN KEY (idMedico) REFERENCES medico (idMedico)
);



CREATE TABLE medicoespecialidad (
  idMedico int NOT NULL,
  idEspecialidad int NOT NULL,
  descripcion varchar(50),
  PRIMARY KEY (idMedico, idEspecialidad),
  FOREIGN KEY (idMedico) REFERENCES medico (idMedico),
  FOREIGN KEY (idEspecialidad) REFERENCES especialidad (idEspecialidad)
);

CREATE TABLE pagopaciente (
  idPago int NOT NULL,
  idPaciente int NOT NULL,
  idTurno int NOT NULL,
  PRIMARY KEY (idPago, idPaciente, idTurno),
  FOREIGN KEY (idPago) REFERENCES pago (idPago),
  FOREIGN KEY (idPaciente) REFERENCES paciente (idPaciente),
  FOREIGN KEY (idTurno) REFERENCES turno (idTurno)
);

CREATE TABLE turnoestado (
  idEstado smallint PRIMARY KEY,
  descripcion varchar(50)
);

CREATE TABLE turnopaciente (
  idEstado smallint NOT NULL,
  descripcion varchar(50),
  PRIMARY KEY (idEstado),
  FOREIGN KEY (idEstado) REFERENCES turnoestado (idEstado)
);