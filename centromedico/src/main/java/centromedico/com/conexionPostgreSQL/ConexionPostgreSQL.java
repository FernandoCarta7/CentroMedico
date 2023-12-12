package centromedico.com.conexionPostgreSQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

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
