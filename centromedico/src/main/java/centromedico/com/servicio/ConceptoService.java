package centromedico.com.servicio;

import java.util.List;

import centromedico.com.domain.Concepto;

public interface ConceptoService {
    public List<Concepto> listar();

    public void guardar(Concepto concepto);

    public void eliminar(Concepto concepto);

    public Concepto encontrarConcepto(Concepto concepto);
}
