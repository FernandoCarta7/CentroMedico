package centromedico.com.servicio;

import java.util.List;

import centromedico.com.domain.TurnoPaciente;

public interface TurnoPacienteService {
    public List<TurnoPaciente> listar();

    public void guardar(TurnoPaciente tPaciente);

    public void eliminar(TurnoPaciente tPaciente);

    public TurnoPaciente encontrarConcepto(TurnoPaciente tPaciente);
}
