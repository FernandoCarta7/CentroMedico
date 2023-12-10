package centromedico.com.servicio;

import java.util.List;

import centromedico.com.domain.Paciente;

public interface PacienteService {
    public List<Paciente> listar();

    public void guardar(Paciente paciente);

    public void eliminar(Paciente paciente);

    public Paciente encontrarConcepto(Paciente paciente);
}
