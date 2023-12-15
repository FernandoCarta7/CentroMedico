package com.centromedico.servicio;

import java.util.List;

import com.centromedico.domain.Historia;


public interface HistoriaService {
    public List<Historia> listarHistoria();

    public void guardar(Historia historia);

    public void eliminar(Historia historia);

    public Historia encontrarConcepto(Historia historia);
}
