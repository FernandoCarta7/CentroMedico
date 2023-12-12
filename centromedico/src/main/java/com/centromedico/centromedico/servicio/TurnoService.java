package com.centromedico.centromedico.servicio;

import java.util.List;

import com.centromedico.centromedico.domain.Turno;

public interface TurnoService {
    public List<Turno> listar();

    public void guardar(Turno turno);

    public void eliminar(Turno turno);

    public Turno encontrarConcepto(Turno turno);
}
