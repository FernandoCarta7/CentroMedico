package com.centromedico.servicio;

import java.util.List;

import com.centromedico.domain.TurnoEstado;

public interface TurnoEstadoService {
    public List<TurnoEstado> listar();

    public void guardar(TurnoEstado tEstado);

    public void eliminar(TurnoEstado tEstado);

    public TurnoEstado encontrarConcepto(TurnoEstado tEstado);
}
