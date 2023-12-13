package com.centromedico.centromedico.servicio;



import com.centromedico.centromedico.domain.Usuario;

public interface UsuarioService {
    

    public void guardar(Usuario usuario);

    public void eliminar(Usuario usuario);

    public boolean encontrarUsuario(Usuario usuario);

}
