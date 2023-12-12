package com.centromedico.centromedico.servicio;

import com.centromedico.ConexionPostgreSQL.ConexionPostgreSQL;
import java.util.List;
import org.springframework.transaction.annotation.Transactional;
import com.centromedico.centromedico.domain.*;
import java.sql.*;
import java.util.ArrayList;

@Transactional
public class PacienteServiceImp implements PacienteService {

    @Override
    public List<Paciente> listar() {
        ConexionPostgreSQL connSql = new ConexionPostgreSQL();
        Connection connection = connSql.getConexion();
        Paciente paciente;
        List<Paciente> pacientes = new ArrayList<>();
        try {

            String sql = "SELECT * FROM public.paciente";
            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {

                int idpaciente = resultSet.getInt("idpaciente");
                String dni = resultSet.getString("dni");
                String primernombre = resultSet.getString("primernombre");
                String primerapellido = resultSet.getString("primerapellido");
                String segundoNombre = resultSet.getString("segundonombre");
                String segundoApellido = resultSet.getString("segundoapellido");
                String genero = resultSet.getString("genero");
                Date fNacimiento = resultSet.getDate("fnacimiento");
                String domicilio = resultSet.getString("domicilio");
                String pais = resultSet.getString("idpais");
                String telefono = resultSet.getString("telefono");
                String email = resultSet.getString("email");
                String observacion = resultSet.getString("observacion");

                paciente = new Paciente(
                        idpaciente,
                        dni,
                        primernombre,
                        primerapellido,
                        segundoNombre,
                        segundoApellido,
                        genero,
                        fNacimiento,
                        domicilio,
                        pais,
                        telefono,
                        email,
                        observacion);

                pacientes.add(paciente);
            }

            connSql.closeConexion();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return pacientes;
    }

    @Override
    public void guardar(Paciente paciente) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'guardar'");
    }

    @Override
    public void eliminar(Paciente paciente) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'eliminar'");
    }

    @Override
    public Paciente encontrarConcepto(Paciente paciente) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'encontrarConcepto'");
    }
    
}
