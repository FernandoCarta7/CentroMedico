package centromedico.com.servicio;

import java.util.List;

import centromedico.com.domain.MedicoEspecialidad;

public interface MedicoEspecialidadService{
    public List<MedicoEspecialidad> listarMedicoEspecialidad();

    public void guardarMedicoEspecialidad(MedicoEspecialidad mEspecialidad);

    public void eliminar(MedicoEspecialidad mEspecialidad);

    public MedicoEspecialidad encontrarConcepto(MedicoEspecialidad mEspecialidad);
}
