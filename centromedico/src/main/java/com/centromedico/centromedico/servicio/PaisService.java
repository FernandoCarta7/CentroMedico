package com.centromedico.centromedico.servicio;

import java.util.List;

import com.centromedico.centromedico.domain.Pais;

public interface PaisService {
    public List<Pais> listar();

    public void guardar(Pais pais);

    public void eliminar(Pais pais);

    public Pais encontrarConcepto(Pais pais);
}
