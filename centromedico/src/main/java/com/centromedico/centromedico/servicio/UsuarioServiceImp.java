package com.centromedico.centromedico.servicio;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


import com.centromedico.ConexionPostgreSQL.ConexionPostgreSQL;
import com.centromedico.centromedico.domain.Usuario;




public class UsuarioServiceImp implements UsuarioService {

    @Override
    public void guardar(Usuario usuario) {

    }

    @Override
    public void eliminar(Usuario usuario) {

    }

    @Override
    public boolean encontrarUsuario(Usuario usuario) {

        ConexionPostgreSQL connSql = new ConexionPostgreSQL();
        Connection connection = connSql.getConexion();
        boolean bandera = false;

        try {

            String sql = "SELECT * FROM public.usuario WHERE email = " + "'" + usuario.getEmail() + "'";
            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet resultSet = statement.executeQuery();

            String nombreUsuario = resultSet.getString("nombreUsuario");
            String email = resultSet.getString("email");
            String password = resultSet.getString("password");

            if (usuario.getNombreUsuario().equals(nombreUsuario)
                    && usuario.getEmail().equals(email)
                    && usuario.getPassword().equals(password)) {

                bandera = true;
            }

            connSql.closeConexion();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return bandera;

    }

}
