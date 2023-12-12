package com.centromedico.centromedico.domain;
import java.io.Serializable;
import javax.persistence.*;
import java.time.LocalDate;

import lombok.Data;
@Data
@Entity
@Table(name ="historia")
public class Historia implements Serializable{
    @Id
    int idHistoria;
    LocalDate fechaHistoria;
    String observacion;
}
