/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllerProducto;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;
import modelo.Conexion;

/**
 *
 * @author danva
 */
public class ControllerProducto {
    
    
    public DefaultTableModel mostrarProducto() {
        
        DefaultTableModel muestra = null;

        //1. conectarme
        Conexion conectar = new Conexion();
        Connection cn = conectar.conec();

        String sql = "Select * From tbl_producte";
        Statement st = null;
        String vectorProducto[] = new String[5];
        String vectorProducto1[] = new String[5];
        vectorProducto1[0] = "prod_id";
        vectorProducto1[1] = "prod_nom";
        vectorProducto1[2] = "prod_precio";
        vectorProducto1[3] = "prod_foto";
        vectorProducto1[4] = "serie_id";
        
        muestra=new DefaultTableModel(null, vectorProducto1);
//String[] vectorProducto; De otra manera definir el vector

        try {

            st = cn.createStatement();

            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {

                vectorProducto[0] = String.valueOf(rs.getInt("prod_id"));
                vectorProducto[1] = rs.getString("prod_nom");
                vectorProducto[2] = String.valueOf(rs.getInt("prod_foto"));
                vectorProducto[3] = String.valueOf(rs.getInt("serie_id"));
                muestra.addRow(vectorProducto);
            }
        } catch (Exception e) {
        }

        return muestra;
        
    }
    
}
