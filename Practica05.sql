CREATE DATABASE IF NOT EXISTS medico;
use medico;

-- Creamos la tabla y sus atributos
Create table medico(
DNI_medico Varchar(10) primary key,
Nombre_med Varchar(30) NOT NULL,
Año_colegio Int NOT NULL default 1900,
direccion Varchar(50)
);

Create table paciente(
direccion Varchar(50),
Dni_paciente Varchar(10) primary key,
Dni_medico Varchar(10),
Nombre_pac Varchar(30) Not null,
Dir_pac Varchar(50),
Telefono Varchar(10),
foreign key(Dni_medico) references paciente(Dni_paciente) 
); 

Create table trabaja(
DNI_medico Varchar(10) primary key,
Id_sala Int primary key,
Horario Varchar(40) Not null
);

Create table Salas(
Id_sala INT primary key,
Ubicacion Varchar(50) Not null
);

