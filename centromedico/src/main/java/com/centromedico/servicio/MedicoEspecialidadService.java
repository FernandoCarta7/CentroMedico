package com.centromedico.servicio;

import java.util.List;

import com.centromedico.domain.MedicoEspecialidad;



public interface MedicoEspecialidadService{
    public List<MedicoEspecialidad> listarMedicoEspecialidad();

    public void guardarMedicoEspecialidad(MedicoEspecialidad mEspecialidad);

    public void eliminar(MedicoEspecialidad mEspecialidad);

    public MedicoEspecialidad encontrarConcepto(MedicoEspecialidad mEspecialidad);
}
