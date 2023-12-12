package com.centromedico.centromedico.servicio;

import java.util.List;

import com.centromedico.centromedico.domain.Pago;

public interface PagoService {
    public List<Pago> listar();

    public void guardar(Pago pago);

    public void eliminar(Pago pago);

    public Pago encontrarConcepto(Pago pago);
}
