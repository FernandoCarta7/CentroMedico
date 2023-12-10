package centromedico.com.servicio;

import java.util.List;

import centromedico.com.domain.Turno;

public interface TurnoService {
    public List<Turno> listar();

    public void guardar(Turno turno);

    public void eliminar(Turno turno);

    public Turno encontrarConcepto(Turno turno);
}
