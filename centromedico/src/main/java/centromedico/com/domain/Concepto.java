package centromedico.com.domain;
import java.io.Serializable;
import javax.persistence.*;

import lombok.Data;
@Data
@Entity
@Table(name ="concepto")
public class Concepto implements Serializable{
    @Id
    int idConcepto;
    String descripcion;
}
