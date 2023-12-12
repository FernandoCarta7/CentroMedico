package com.centromedico.centromedico.servicio;

import java.util.List;

import com.centromedico.centromedico.domain.HistoriaPaciente;

public interface HistoriaPacienteService  {
public List<HistoriaPaciente> listarHistoriaPaciente();

    public void guardarHistoriaPaciente(HistoriaPaciente hPaciente);

    public void eliminar(HistoriaPaciente hPaciente);

    public HistoriaPaciente encontrarHistoriaPaciente(HistoriaPaciente hPaciente);
}
