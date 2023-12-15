package com.centromedico.domain;

import java.io.Serializable;
import javax.persistence.*;

import lombok.Data;

@Data
@Entity
@Table(name = "pais")
public class Pais implements Serializable {
    @Id
    String idPais;
    String nombrePais;
}
