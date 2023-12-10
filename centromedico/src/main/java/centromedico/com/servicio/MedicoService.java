package centromedico.com.servicio;

import java.util.List;

import centromedico.com.domain.Medico;

public interface MedicoService {
    public List<Medico> listar();

    public void guardar(Medico medico);

    public void eliminar(Medico medico);

    public Medico encontrarConcepto(Medico medico);
}
