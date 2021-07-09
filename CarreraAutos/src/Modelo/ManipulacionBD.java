
package Modelo;

import dominio.Carro;
import dominio.Conductor;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author catalina
 */
public class ManipulacionBD {
    private ConexionBD conexionBD;

    public ManipulacionBD(){
        this.conexionBD = new ConexionBD();
    }
    
    public void ingresarCorredor(Conductor conductor) {
        Connection conexion =  this.conexionBD.conectarBD();
        PreparedStatement ps;
        int res;
        if(conexion != null){
           try{
               ps = conexion.prepareStatement("INSERT INTO conductores (nombre_conductor, color_carro, marca_carro, cedula_conductor) VALUES(?,?,?,?)");
               ps.setString(1, conductor.getNombre());
               ps.setString(2, conductor.getCarro().getColor());
               ps.setString(3, conductor.getCarro().getMarca());
               ps.setString(4, conductor.getCedula());
               res = ps.executeUpdate();
               if(res >0) {
                   System.out.println("Ingreso exitoso.");
               }
           } catch(SQLException e) {
               e.printStackTrace(System.out);
           } finally {
               conexion = null;
           }
       }
    }

    public boolean existeUsuario(String cedula) {
        Connection conexion =  this.conexionBD.conectarBD();
        PreparedStatement ps;
        ResultSet res;
        boolean existe = false;
        if(conexion != null){
           try{
               ps = conexion.prepareStatement("SELECT * FROM conductores WHERE cedula_conductor = ?");
               ps.setString(1, cedula);
               res = ps.executeQuery();
               if(res.next()) {
                   existe = true;
               }
           } catch(SQLException e) {
               e.getClass().getSimpleName();
           } finally {
               conexion = null;
           }
       }
        return(existe);
    }

    public Conductor getConductor(String cedula) {
        Connection conexion =  this.conexionBD.conectarBD();
        PreparedStatement ps;
        ResultSet res;
        Conductor conductor = null;
        if(conexion != null){
           try{
               ps = conexion.prepareStatement("SELECT * FROM conductores WHERE cedula_conductor = ? LIMIT 1");
               ps.setString(1, cedula);
               res = ps.executeQuery();
               if(res.next()) {
                   String nombre = res.getString("nombre_conductor");
                   int carrerasGanadas = res.getInt("carreras_ganadas");
                   String color = res.getString("color_carro");
                   String marca = res.getString("marca_carro");  
                   Carro carro = new Carro(color, marca);
                   conductor = new Conductor(carro, nombre, cedula);
               }
           } catch(SQLException e) {
               e.getClass().getSimpleName();
           } finally {
               conexion = null;
           }
       }
        return(conductor);
    }
    
    
}
