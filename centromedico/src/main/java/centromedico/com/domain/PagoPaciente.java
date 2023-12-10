package centromedico.com.domain;
import java.io.Serializable;
import javax.persistence.*;

import lombok.Data;

@Data
@Entity
@Table(name = "pagopaciente")
public class PagoPaciente implements Serializable{
    int idPago;
    int idPaciente;
    int idTurno;
}
