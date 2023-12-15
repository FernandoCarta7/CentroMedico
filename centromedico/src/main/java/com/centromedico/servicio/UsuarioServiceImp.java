package com.centromedico.servicio;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.centromedico.ConexionPostgreSQL.ConexionPostgreSQL;
import com.centromedico.domain.Usuario;

public class UsuarioServiceImp implements UsuarioService {

    @Override
    public void guardar(Usuario usuario) {

    }

    @Override
    public void eliminar(Usuario usuario) {

    }

    @Override
    public int encontrarUsuario(Usuario usuario) {

        ConexionPostgreSQL connSql = new ConexionPostgreSQL();
        Connection connection = connSql.getConexion();
        

        try {

            String sql = "SELECT * FROM public.usuario WHERE email = " + "'" + usuario.getEmail() + "'";
            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet resultSet = statement.executeQuery();
            
            String email = "";
            String password = "";

            if (resultSet.next()) {

                
                email = resultSet.getString("email");
                password = resultSet.getString("password");

            }

            if (usuario.getEmail().equals(email)
                    && usuario.getPassword().equals(password)) {
                //Encontró usuario
                        
                        //Validando si el usuario es medico
                sql = "SELECT * FROM public.medico WHERE email = " + "'" + email + "'";
                statement = connection.prepareStatement(sql);
                resultSet = statement.executeQuery();
                
                if (resultSet.next()) {
                    return 3;
                }

                        //Validando si el usuario es paciente
                sql = "SELECT * FROM public.paciente WHERE email = " + "'" + email + "'";
                statement = connection.prepareStatement(sql);
                resultSet = statement.executeQuery();
                if (resultSet.next()) {
                    return 2;
                }
            }

            connSql.closeConexion();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return -1;

    }

}
