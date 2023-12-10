package centromedico.com.servicio;

import java.util.List;

import centromedico.com.domain.TurnoEstado;

public interface TurnoEstadoService {
    public List<TurnoEstado> listar();

    public void guardar(TurnoEstado tEstado);

    public void eliminar(TurnoEstado tEstado);

    public TurnoEstado encontrarConcepto(TurnoEstado tEstado);
}
