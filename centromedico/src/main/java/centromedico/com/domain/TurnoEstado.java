package centromedico.com.domain;

import java.io.Serializable;
import javax.persistence.*;

import lombok.Data;

@Data
@Entity
@Table(name = "turnoestado")
public class TurnoEstado implements Serializable{
    @Id
    int idEstado;
    String descripcion;
}
