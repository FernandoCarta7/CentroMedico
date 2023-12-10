package centromedico.com.domain;
import java.io.Serializable;
import javax.persistence.*;

import lombok.Data;
@Data
@Entity
@Table(name = "medico")
public class Medico implements Serializable{
    @Id
    int idMedico;
    String nombre;
    String apellido;
}
