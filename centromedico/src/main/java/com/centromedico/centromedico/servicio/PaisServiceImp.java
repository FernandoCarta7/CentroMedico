package com.centromedico.centromedico.servicio;

import com.centromedico.ConexionPostgreSQL.ConexionPostgreSQL;
import java.util.List;




import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.centromedico.centromedico.domain.Pais;
import java.sql.*;
import java.util.*;

@Service
public class PaisServiceImp implements PaisService{


    @Override
    @Transactional(readOnly = true)
    public List<Pais> listar() {
        ConexionPostgreSQL connSql = new ConexionPostgreSQL();
        Connection connection = connSql.getConexion();
        List<Pais> paises = new ArrayList<>();
        try {
            
            String sql = "SELECT * FROM public.pais";
            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                System.out.println(resultSet.getString("pais"));
            }

            connSql.closeConexion();
        } catch (Exception e) {
            // TODO: handle exception
        }

        return paises;
    }

    @Override
    public void guardar(Pais pais) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'guardar'");
    }

    @Override
    public void eliminar(Pais pais) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'eliminar'");
    }

    @Override
    public Pais encontrarConcepto(Pais pais) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'encontrarConcepto'");
    }
    
}
