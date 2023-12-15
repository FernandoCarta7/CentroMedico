package com.centromedico.servicio;



import com.centromedico.domain.Usuario;

public interface UsuarioService {
    

    public void guardar(Usuario usuario);

    public void eliminar(Usuario usuario);

    public int encontrarUsuario(Usuario usuario);

}
