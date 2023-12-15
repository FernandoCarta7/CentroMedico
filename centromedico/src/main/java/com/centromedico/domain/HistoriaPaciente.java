package com.centromedico.domain;

import java.io.Serializable;
import javax.persistence.*;

import lombok.Data;

@Data
@Entity
@Table(name = "historiapaciente")
public class HistoriaPaciente implements Serializable {

    int idHistoria;
    int idPaciente;
    int idMedico;
}
