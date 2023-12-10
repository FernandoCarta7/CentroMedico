package centromedico.com.servicio;

import java.util.List;

import centromedico.com.domain.PagoPaciente;

public interface PagoPacienteService {
    public List<PagoPaciente> listar();

    public void guardar(PagoPaciente pagoPaciente);

    public void eliminar(PagoPaciente pagoPaciente);

    public PagoPaciente encontrarConcepto(PagoPaciente pagoPaciente);
}
