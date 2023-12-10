package centromedico.com.servicio;

import java.util.List;

import centromedico.com.domain.Especialidad;

public interface EspecialidadService {
    public List<Especialidad> listar();

    public void guardar(Especialidad especialidad);

    public void eliminar(Especialidad especialidad);

    public Especialidad encontrarConcepto(Especialidad especialidad);
}
