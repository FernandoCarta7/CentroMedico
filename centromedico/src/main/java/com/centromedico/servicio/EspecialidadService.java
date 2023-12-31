package com.centromedico.servicio;

import java.util.List;

import com.centromedico.domain.Especialidad;


public interface EspecialidadService {
    public List<Especialidad> listar();

    public void guardar(Especialidad especialidad);

    public void eliminar(Especialidad especialidad);

    public Especialidad encontrarConcepto(Especialidad especialidad);
}
