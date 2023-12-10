package centromedico.com.domain;
import java.io.Serializable;
import javax.persistence.*;

import lombok.Data;

@Data
@Entity
@Table(name = "medicoespecialidad")
public class MedicoEspecialidad {
    int idMedico;
    int idEspecialidad;
    int descripcion;
}
