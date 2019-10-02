package ConexionBD;

import javax.swing.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DAO_Consultar {
    private Connection conex ;
    private ResultSet resultSet;
    public DAO_Consultar() {
        this.conex = Conexion.getConnection();
    }

    public String ObtenerFachada() {
        String nombre="Sin Conexion Base de Datos";
        try {
            Statement GetFachada = conex.createStatement();
            resultSet = GetFachada.executeQuery("SELECT  nombre FROM TIENDA WHERE id <> 0;");

            while (resultSet.next()) {
                nombre =  resultSet.getString(1);
            }

        } catch (SQLException | NullPointerException e) {

            JOptionPane.showMessageDialog(null, "Sin Conexion Base de Datos");
        }
        return nombre;
    }
    public int ConsultarLogin(String user,String pass) {
       int rolid=0;
        try {
            Statement queryLogin = conex.createStatement();
            resultSet = queryLogin.executeQuery("select rp.rolId " +
                                                    "from PERSONA p " +
                                                    "join ROL_PERSONA rp ON p.id = rp.personaId " +
                                                    "WHERE P.usuario = '" +user+"' "+
                                                    "AND p.clave = '" +pass+"'");

            while (resultSet.next()) {
                rolid =  resultSet.getInt(1);
            }

        } catch (SQLException | NullPointerException e) {

            JOptionPane.showMessageDialog(null, "Sin Conexion Base de Datos");
        }
        return rolid;
    }
}
