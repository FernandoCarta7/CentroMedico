package centromedico.com.domain;

import java.io.Serializable;
import javax.persistence.*;

import lombok.Data;

@Data
@Entity
@Table(name = "historiapaciente")
public class HistoriaPaciente {

    int idHistoria;
    int idPaciente;
    int idMedico;
}
