package com.centromedico.centromedico.servicio;

import java.util.List;

import com.centromedico.centromedico.domain.*;

public interface MedicoService {
    public List<Medico> listar();

    public void guardar(Medico medico);

    public void eliminar(Medico medico);

    public Medico encontrarConcepto(Medico medico);
}
