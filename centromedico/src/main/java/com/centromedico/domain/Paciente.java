package com.centromedico.domain;


import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

import lombok.Data;

@Data
@Entity
@Table(name = "paciente")
public class Paciente implements Serializable{
    @Id
    int idPaciente;
    String DNI;
    String primerNombre;
    String primerApellido;
    String segundoNombre;
    String segundoApellido;
    String genero;    
    Date fechaNacimiento;
    String domicilio;
    String idPais;
    String telefono;
    String email;
    String observacion;

    public Paciente() {
    }

    public Paciente(int idPaciente, String DNI, String primerNombre, String primerApellido, String segundoNombre, String segundoApellido, String genero, Date fechaNacimiento, String domicilio, String idPais, String telefono, String email, String observacion) {
        this.idPaciente = idPaciente;
        this.DNI = DNI;
        this.primerNombre = primerNombre;
        this.primerApellido = primerApellido;
        this.segundoNombre = segundoNombre;
        this.segundoApellido = segundoApellido;
        this.genero = genero;
        this.fechaNacimiento = fechaNacimiento;
        this.domicilio = domicilio;
        this.idPais = idPais;
        this.telefono = telefono;
        this.email = email;
        this.observacion = observacion;
    }
}
