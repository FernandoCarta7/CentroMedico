package com.centromedico.centromedico.servicio;

import java.util.List;

import com.centromedico.centromedico.domain.*;

public interface PacienteService {
    public List<Paciente> listar();

    public void guardar(Paciente paciente);

    public void eliminar(Paciente paciente);

    public Paciente encontrarConcepto(Paciente paciente);
}
