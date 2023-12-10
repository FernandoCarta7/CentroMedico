package centromedico.com.domain;
import java.io.Serializable;
import javax.persistence.*;

import lombok.Data;
@Data
@Entity
@Table(name ="especialidad")
public class Especialidad implements Serializable{
    @Id
    int idEspecialidad;
    String especialidad;
}
