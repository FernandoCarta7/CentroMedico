package centromedico.com.servicio;

import java.util.List;

import centromedico.com.domain.Pago;

public interface PagoService {
    public List<Pago> listar();

    public void guardar(Pago pago);

    public void eliminar(Pago pago);

    public Pago encontrarConcepto(Pago pago);
}
