package centromedico.com.domain;

import java.time.LocalDate;
import java.io.Serializable;
import javax.persistence.*;

import lombok.Data;

@Data
@Entity
@Table(name = "paciente")
public class Paciente implements Serializable{
    @Id
    int idPaciente;
    String DNI;
    String nombre;
    String apellido;
    LocalDate fechaNacimiento;
    String domicilio;
    int idPais;
    String telefono;
    String email;
    String observacion;
}
