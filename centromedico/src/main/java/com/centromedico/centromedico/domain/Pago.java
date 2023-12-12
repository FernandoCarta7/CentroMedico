package com.centromedico.centromedico.domain;

import java.time.LocalDate;
import java.io.Serializable;
import javax.persistence.*;

import lombok.Data;

@Data
@Entity
@Table(name = "pago")
public class Pago implements Serializable{
    @Id
    int idPago;
    int concepto;
    LocalDate fechaPago;
    double monto;
    int estado;
    String observacion;
}
