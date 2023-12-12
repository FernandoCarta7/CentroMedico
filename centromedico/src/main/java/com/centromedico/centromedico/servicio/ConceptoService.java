package com.centromedico.centromedico.servicio;

import java.util.List;

import com.centromedico.centromedico.domain.Concepto;



public interface ConceptoService {
    public List<Concepto> listar();

    public void guardar(Concepto concepto);

    public void eliminar(Concepto concepto);

    public Concepto encontrarConcepto(Concepto concepto);
}
