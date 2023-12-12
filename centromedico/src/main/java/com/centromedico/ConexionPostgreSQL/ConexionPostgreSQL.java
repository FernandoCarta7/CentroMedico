/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.centromedico.ConexionPostgreSQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author fernando
 */
public class ConexionPostgreSQL {
    private Connection conexion;
    private String url = "jdbc:postgresql://localhost:5432/centromedico";
    private String usuario = "postgres";
    private String contraseña = "admin";

    public Connection getConexion() {
        try {
            conexion = DriverManager.getConnection(url, usuario, contraseña);
            System.out.println("CONEXIÓN EXITOSA");
            return conexion;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public void closeConexion() {

        try {
            if (conexion != null && !conexion.isClosed()) {
                conexion.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
