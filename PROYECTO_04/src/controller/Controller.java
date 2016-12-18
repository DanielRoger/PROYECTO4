/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import modelo.Categoria;
import modelo.Conexion;
import modelo.Producte;
import modelo.Stock;

/**
 *
 * @author DANIEL Y ROGER
 */







public class Controller {

    public Controller() {
    }
    public static boolean isNumeric(String cadena){
	try {
		Integer.parseInt(cadena);
		return true;
	} catch (NumberFormatException nfe){
		return false;
	}
}
    public int login(String usuario, String clavedef){
        
        int resultado=0;
        
        Conexion conecControl = new Conexion();
        Connection cn = conecControl.conec();
        
        String sql = "SELECT * FROM tbl_usuario WHERE usu_nombre='"+usuario+"' && usu_pwd='"+clavedef+"'";
         
         try {
            // crear el statement
            Statement st = cn.createStatement();
            // lanzar la consulta
            ResultSet rs = st.executeQuery(sql);
            //lanza consulta con "executequery"
            while(rs.next()){
                resultado=1;
            }
         
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "UPPS! no se ha podido conectar a la base de datos");
        } finally {
             try {
                 cn.close();
             } catch (Exception e) {
                 JOptionPane.showMessageDialog(null, "UPPS! no se ha podido desconectar a la base de datos");
             }
        }
        return resultado; 
    }
    
    public static void ocultarColumna(int i, JTable jTable1){
        jTable1.getColumnModel().getColumn(i).setMaxWidth(0);

        jTable1.getColumnModel().getColumn(i).setMinWidth(0);

        jTable1.getColumnModel().getColumn(i).setPreferredWidth(0);
        
    }
    

  public DefaultTableModel mostrarProducto() {
        DefaultTableModel muestra = null;

        //1. conectarme
        Conexion conectar = new Conexion();
        Connection cn = conectar.conec();
        String sql = "Select tbl_producte.prod_nom, tbl_producte.pro_precio, tbl_estoc.estoc_q_actual, tbl_estoc.estoc_q_max, tbl_estoc.estoc_q_min, tbl_categoria.categoria_nom, tbl_producte.prod_foto, tbl_producte.prod_id, tbl_estoc.estoc_id, tbl_producte.categoria_id From tbl_estoc inner join tbl_producte on tbl_estoc.prod_id=tbl_producte.prod_id inner join tbl_categoria on tbl_producte.categoria_id=tbl_categoria.categoria_id ";
        System.out.println(sql);
        //String sql = "Select * From tbl_estoc";
        Statement st = null;
        String vectorProducto[] = new String[10];
        String vectorProducto1[] = new String[10];
        
        vectorProducto1[0] = "NOMBRE";
        vectorProducto1[1] = "PRECIO";
        vectorProducto1[2] = "ESTOC ACTUAL";
        vectorProducto1[3] = "ESTOC MAXIMO";
        vectorProducto1[4] = "ESTOC MINIMO";
        vectorProducto1[5] = "CATEGORIA";
        vectorProducto1[6] = "FOTO";
        vectorProducto1[7] = "prod_id";
        vectorProducto1[8] = "estoc_id";
        vectorProducto1[9] = "categoria_id";
        
        //vectorProducto1[0] = "stoc_id";
        //vectorProducto1[1] = "stoc_q_max";
        //vectorProducto1[2] = "stoc_q_min";
        //vectorProducto1[3] = "prod_id";

        
        muestra=new DefaultTableModel(null, vectorProducto1);
//String[] vectorProducto; De otra manera definir el vector

        try {

            st = cn.createStatement();

            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {

                vectorProducto[0] = rs.getString("prod_nom");
                vectorProducto[1] = String.valueOf(rs.getInt("pro_precio"));
                vectorProducto[2] = String.valueOf(rs.getInt("estoc_q_actual"));
                vectorProducto[3] = String.valueOf(rs.getInt("estoc_q_max"));
                vectorProducto[4] = String.valueOf(rs.getInt("estoc_q_min"));
                vectorProducto[5] = rs.getString("categoria_nom");
                vectorProducto[6] = rs.getString("prod_foto");
                vectorProducto[7] = String.valueOf(rs.getInt("prod_id"));
                vectorProducto[8] = String.valueOf(rs.getInt("estoc_id"));
                vectorProducto[9] = String.valueOf(rs.getInt("categoria_id"));
                
                //vectorProducto[0] = String.valueOf(rs.getInt("estoc_id"));
                //vectorProducto[1] = rs.getString("estoc_q_max");
                //vectorProducto[2] = String.valueOf(rs.getInt("estoc_q_min"));
                //vectorProducto[3] = String.valueOf(rs.getInt("prod_id"));
                
                muestra.addRow(vectorProducto);
            }
        } catch (Exception e) {
        }

        return muestra;
    }
  
  public void llenarCombo(JComboBox box){
        DefaultComboBoxModel value;
        
        Conexion conectar = new Conexion();
        Connection cn = conectar.conec();

        String sql = "SELECT * FROM tbl_categoria";
        Statement st = null;
        ResultSet rs = null;

        try {
            st = cn.createStatement();
             //JOptionPane.showMessageDialog(null, "Conexion viento en popa2");
            rs = st.executeQuery(sql);
             // JOptionPane.showMessageDialog(null, "Conexion viento en popa2");
            value= new DefaultComboBoxModel();
            box.setModel(value);
            while (rs.next()) {
            
             value.addElement(new Categoria(rs.getInt("categoria_id"),rs.getString("categoria_nom")));
            
            }
            cn.close();
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, "Conexion erronea");
          
        }

    }
  public void EliminarProducto(Producte p, Stock s) {
        //1. conectarme
        Conexion conectar = new Conexion();
        Connection cn = conectar.conec();
        
        String sql1 ="DELETE FROM tbl_estoc WHERE estoc_id = ? ";
        String sql2 ="DELETE FROM tbl_producte WHERE prod_id = ? ";
        
        PreparedStatement pst1 = null;
        PreparedStatement pst2 = null;
        
        
         try {
            //solo hace una sentencia sql (false) hace dos sentencias (true)
            //cn.setAutoCommit(false);
            pst1 = cn.prepareStatement(sql1);
            pst1.setInt(1, s.getIdstock());
            
            pst2 = cn.prepareStatement(sql2);
            pst2.setInt(1, p.getProd_id());
        
            //pst1.executeUpdate();
            //pst2.executeUpdate();
            
            
            

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Conexion erronea");
            try {
                cn.rollback();
            } catch (SQLException ex) {
            }
        }
  }
  
  public void InsertarProductoStock(Producte p, Stock s, int f) {
        //1. conectarme
        Conexion conectar = new Conexion();
        Connection cn = conectar.conec();
        
        
        
        //NUEVO PRODUCTO:
        String sql1 = "INSERT INTO tbl_producte (prod_nom, pro_precio, prod_foto, categoria_id) VALUES (?,?,?,?)";
        //ACTUALIZAR PRODUCTO:
        String sql2 = "UPDATE tbl_producte SET prod_nom = ?, pro_precio = ?, prod_foto = ?, categoria_id = ? WHERE prod_id = ?";
        //NUEVO STOCK:
        String sql3 ="INSERT INTO tbl_estoc (estoc_q_max, estoc_q_actual, estoc_q_min, prod_id) VALUES (?,?,?,?)";
        //ACTUALIZAR STOCK:
        String sql4 ="UPDATE tbl_estoc SET estoc_q_max = ?, estoc_q_actual = ?, estoc_q_min = ?, prod_id = ? WHERE estoc_id = ?";
        //creamos la primera consulta sql
        //String sql1 = "INSERT INTO tbl_producte (pro_nombre, pro_precio ,pro_stock) VALUES (?,?,?)";

        //Creamos la segunda sentencia
        //String sql2 = "INSER INTO tbl_client (cli_nom, cli_nif) VALUES (?,?)";
 
        PreparedStatement pst1 = null;
        PreparedStatement pst2 = null;
        PreparedStatement pst3 = null;
        PreparedStatement pst4 = null;
        try {
            //solo hace una sentencia sql (false) hace dos sentencias (true)
            //cn.setAutoCommit(false);
            if(f!=0){
                pst2 = cn.prepareStatement(sql2);
                
                pst2.setString(1, p.getProd_nom());
                pst2.setInt(2, p.getProd_preu());
                pst2.setInt(3, p.getProd_foto());
                pst2.setInt(4, p.getCategoria_id());
                pst2.setInt(5, p.getProd_id());
                
                pst4 = cn.prepareStatement(sql4);
                
                pst4.setInt(1, s.getStock_max());
                pst4.setInt(2, s.getStock_actual());
                pst4.setInt(3, s.getStock_min());
                pst4.setInt(4, p.getProd_id());
                pst4.setInt(5, s.getIdstock());
                
                //pst4.executeUpdate();
                //pst2.executeUpdate();
                
            
            }else{
                pst1 = cn.prepareStatement(sql1);
                
                pst1.setString(1, p.getProd_nom());
                pst1.setInt(2, p.getProd_preu());
                pst1.setInt(3, p.getProd_foto());
                pst1.setInt(4, p.getCategoria_id());
                
                
                pst3 = cn.prepareStatement(sql3);
                
                pst3.setInt(1, s.getStock_max());
                pst3.setInt(2, s.getStock_actual());
                pst3.setInt(3, s.getStock_min());
                pst3.setInt(4, p.getProd_id());
                
                //pst1.executeUpdate();
                //pst3.executeUpdate();
                
            }
           
            
            
            
            //pst2 = cn.prepareStatement(sql2);

            //pst2.setString(1, p.getProd_nombre());
            //pst2.setDouble(2, p.getProd_preu());
            //pst2.setDouble(3, p.getProd_foto());
            //pst2.setInt(4, p.getCategoria_id());
            //pst2.setInt(4, p.getProd_id());

            //pst2 = cn.prepareStatement(sql2);

            //pst2.setString(1, c.getCli_nom());
            //pst2.setString(2, c.getCli_nif());
            //System.out.println(sql1);
            
            //pst2.executeUpdate();
            
            //cn.commit();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Conexion erronea");
            try {
                cn.rollback();
            } catch (SQLException ex) {
            }
        }
    }

}
