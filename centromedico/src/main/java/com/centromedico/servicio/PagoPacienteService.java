package com.centromedico.servicio;

import java.util.List;

import com.centromedico.domain.PagoPaciente;

public interface PagoPacienteService {
    public List<PagoPaciente> listar();

    public void guardar(PagoPaciente pagoPaciente);

    public void eliminar(PagoPaciente pagoPaciente);

    public PagoPaciente encontrarConcepto(PagoPaciente pagoPaciente);
}
