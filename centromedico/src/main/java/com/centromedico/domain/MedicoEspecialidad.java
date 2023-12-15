package com.centromedico.domain;
import java.io.Serializable;
import javax.persistence.*;

import lombok.Data;

@Data
@Entity
@Table(name = "medicoespecialidad")
public class MedicoEspecialidad implements Serializable {
    int idMedico;
    int idEspecialidad;
    int descripcion;
}
