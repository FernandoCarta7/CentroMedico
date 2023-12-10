package centromedico.com.domain;

import java.time.LocalDate;
import java.io.Serializable;
import javax.persistence.*;

import lombok.Data;

@Data
@Entity
@Table(name = "turno")
public class Turno implements Serializable{
    @Id
    int idTurno;
    LocalDate fechaTurno;
    int estado;
    String observacion;
}
