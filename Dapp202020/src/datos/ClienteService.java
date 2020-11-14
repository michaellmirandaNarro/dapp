/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
//import java.util.LinkedList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ClienteService {

 

   public static DefaultTableModel mostrarClientes(){
        String []  nombresColumnas = {"Id","Nombre","ApPaterno", "ApMaterno","Telefono", "Tipo documento","Nro documento","Direccion"};
        String [] registros = new String[8];
        
       DefaultTableModel modelo = new DefaultTableModel(null,nombresColumnas);
        
        String sql = "SELECT * FROM cliente";
        
        Connection cn = null;
        
        PreparedStatement pst = null;
        
        ResultSet rs = null;
        
        try
        {
            cn = DBConexion.getConnection();
            
            pst = cn.prepareStatement(sql);                        
            
            rs = pst.executeQuery();
            
            while(rs.next())
            {
                //colocamos el registro en la columna adecuada
                registros[0] = rs.getString("id_cliente");
                
                registros[1] = rs.getString("nombre");
           
                registros[2] = rs.getString("apellido_paterno");
                
                registros[3] = rs.getString("apellido_materno");
                
                registros[4] = rs.getString("telefono");
                
                registros[5] = rs.getString("tipo_documento");
                
                registros[6] = rs.getString("nro_documento");
                
                registros[7] = rs.getString("direccion");
                
                modelo.addRow(registros);
                
            }
            
           
        }
        catch(SQLException e)
        {
            
            JOptionPane.showMessageDialog(null,"Error al conectar");
            
        }
        finally
        {
            try
            {
                if (rs != null) rs.close();
                
                if (pst != null) pst.close();
                
                if (cn != null) cn.close();
            }
            catch(SQLException e)
            {
                JOptionPane.showMessageDialog(null,e);
            }
        }
         return modelo;
    } 
   
   //mostrar modelo 
    public static DefaultTableModel mostrarModelo(){
        String []  nombresColumnas = {"Id","Nombre","Tipo"};
        String [] registros = new String[3];
        
       DefaultTableModel modelo = new DefaultTableModel(null,nombresColumnas);
        
        String sql = "SELECT * FROM modelo";
        
        Connection cn = null;
        
        PreparedStatement pst = null;
        
        ResultSet rs = null;
        
        try
        {
            cn = DBConexion.getConnection();
            
            pst = cn.prepareStatement(sql);                        
            
            rs = pst.executeQuery();
            
            while(rs.next())
            {
                registros[0] = rs.getString("id_modelo");
                
                registros[1] = rs.getString("nombre");
           
                registros[2] = rs.getString("tipo");
            
                
                modelo.addRow(registros);
                
            }
            
           
        }
        catch(SQLException e)
        {
            
            JOptionPane.showMessageDialog(null,"Error al conectar");
            
        }
        finally
        {
            try
            {
                if (rs != null) rs.close();
                
                if (pst != null) pst.close();
                
                if (cn != null) cn.close();
            }
            catch(SQLException e)
            {
                JOptionPane.showMessageDialog(null,e);
            }
        }
         return modelo;
    } 
   
   
   //mostrar trabajador
    public static DefaultTableModel mostrarTrabajador(){
        String []  nombresColumnas = {"Id","Nombre","ApMaterno", "ApPaterno","Telefono", "Tipo documento","Nro documento","Direccion","Cargo"};
        String [] registros = new String[9];
        
       DefaultTableModel modelo = new DefaultTableModel(null,nombresColumnas);
        
        String sql = "SELECT * FROM trabajador";
        
        Connection cn = null;
        
        PreparedStatement pst = null;
        
        ResultSet rs = null;
        
        try
        {
            cn = DBConexion.getConnection();
            
            pst = cn.prepareStatement(sql);                        
            
            rs = pst.executeQuery();
            
            while(rs.next())
            {
                registros[0] = rs.getString("id_trabajador");
                
                registros[1] = rs.getString("nombre");
           
                registros[2] = rs.getString("apellido_paterno");
                
                registros[3] = rs.getString("apellido_materno");
                
                registros[4] = rs.getString("telefono");
                
                registros[5] = rs.getString("tipo_documento");
                
                registros[6] = rs.getString("nro_documento");
                
                registros[7] = rs.getString("direccion");
                
                 registros[8] = rs.getString("cargo");
                
                modelo.addRow(registros);
                
            }
            
           
        }
        catch(SQLException e)
        {
            
            JOptionPane.showMessageDialog(null,"Error al conectar");
            
        }
        finally
        {
            try
            {
                if (rs != null) rs.close();
                
                if (pst != null) pst.close();
                
                if (cn != null) cn.close();
            }
            catch(SQLException e)
            {
                JOptionPane.showMessageDialog(null,e);
            }
        }
         return modelo;
    } 
   
   
   //mostrar proveedores
      public static DefaultTableModel mostrarProveedor(){
        String []  nombresColumnas = {"Id","Razón Social","Ruc", "Telefono","Dirección"};
        String [] registros = new String[5];
        
       DefaultTableModel modelo = new DefaultTableModel(null,nombresColumnas);
        
        String sql = "SELECT * FROM proveedor";
        
        Connection cn = null;
        
        PreparedStatement pst = null;
        
        ResultSet rs = null;
        
        try
        {
            cn = DBConexion.getConnection();
            
            pst = cn.prepareStatement(sql);                        
            
            rs = pst.executeQuery();
            
            while(rs.next())
            {
                registros[0] = rs.getString("id_proveedor");
                
                registros[1] = rs.getString("razon_social");
                
                registros[2] = rs.getString("Ruc");
           
                registros[3] = rs.getString("telefono");
                
                registros[4] = rs.getString("direccion");
                
                modelo.addRow(registros);
                
            }
            
           
        }
        catch(SQLException e)
        {
            
            JOptionPane.showMessageDialog(null,"Error al conectar");
            
        }
        finally
        {
            try
            {
                if (rs != null) rs.close();
                
                if (pst != null) pst.close();
                
                if (cn != null) cn.close();
            }
            catch(SQLException e)
            {
                JOptionPane.showMessageDialog(null,e);
            }
        }
         return modelo;
    } 
      
     
   //mostrar insumos
       public static DefaultTableModel mostrarInsumos(){
        String []  nombresColumnas = {"Id","nombre","Cantidad", "Precio","Proveedor id"};
        String [] registros = new String[5];
        
       DefaultTableModel modelo = new DefaultTableModel(null,nombresColumnas);
        
        String sql = "SELECT *FROM insumo";
        
        Connection cn = null;
        
        PreparedStatement pst = null;
        
        ResultSet rs = null;
        
        try
        {
            cn = DBConexion.getConnection();
            
            pst = cn.prepareStatement(sql);                        
            
            rs = pst.executeQuery();
            
            while(rs.next())
            {
                registros[0] = rs.getString("id_insumo");
                
                registros[1] = rs.getString("nombre");
                
                registros[2] = rs.getString("cantidad");
           
                registros[3] = rs.getString("precio");
                
                registros[4] = rs.getString("proveedor_id");
                
                modelo.addRow(registros);
                
            }
            
           
        }
        catch(SQLException e)
        {
            
            JOptionPane.showMessageDialog(null,"Error al conectar");
            
        }
        finally
        {
            try
            {
                if (rs != null) rs.close();
                
                if (pst != null) pst.close();
                
                if (cn != null) cn.close();
            }
            catch(SQLException e)
            {
                JOptionPane.showMessageDialog(null,e);
            }
        }
         return modelo;
    } 
      
   
   
      public static DefaultTableModel buscarClientes( String buscar){
        String []  nombresColumnas = {"Id","Nombres","ApMaterno","Telefono", "ApPaterno", "Tipo documento","Nro documento","Direccion"};
        String [] registros = new String[8];
        
       DefaultTableModel modelo = new DefaultTableModel(null,nombresColumnas);
        
        String sql = "SELECT * FROM cliente WHERE id_cliente LIKE '%"+buscar+"%' OR nombre LIKE '%"+buscar+ "%' OR nro_documento LIKE '%" +buscar+"%'";
        
        Connection cn = null;
        
        PreparedStatement pst = null;
        
        ResultSet rs = null;
        
        try
        {
            cn = DBConexion.getConnection();
            
            pst = cn.prepareStatement(sql);                        
            
            rs = pst.executeQuery();
            
            while(rs.next())
            {
                registros[0] = rs.getString("id_cliente");
                
                registros[1] = rs.getString("nombre");
                
                registros[2] = rs.getString("apellido_paterno");
                
                registros[3] = rs.getString("apellido_materno");
                
                registros[4] = rs.getString("telefono");
                
                registros[5] = rs.getString("tipo_documento");
                
                registros[6] = rs.getString("nro_documento");
                
                registros[7] = rs.getString("direccion");
                
                modelo.addRow(registros);
                
            }
            
           
        }
        catch(SQLException e)
        {
            
            JOptionPane.showMessageDialog(null,"Error al conectar");
            
        }
        finally
        {
            try
            {
                if (rs != null) rs.close();
                
                if (pst != null) pst.close();
                
                if (cn != null) cn.close();
            }
            catch(SQLException e)
            {
                JOptionPane.showMessageDialog(null,e);
            }
        }
         return modelo;
    }
      //buscar trabajador
     public static DefaultTableModel buscarTrabajador( String buscar){
        String []  nombresColumnas = {"Id","Nombre","ApMaterno", "ApPaterno","Telefono", "Tipo documento","Nro documento","Direccion","Cargo"};
        String [] registros = new String[9];
        
       DefaultTableModel modelo = new DefaultTableModel(null,nombresColumnas);
        
        String sql = "SELECT * FROM trabajador WHERE id_trabajador LIKE '%"+buscar+"%' OR cargo LIKE '%"+buscar+ "%' OR nro_documento LIKE '%" +buscar+"%'";
        
        Connection cn = null;
        
        PreparedStatement pst = null;
        
        ResultSet rs = null;
        
        try
        {
            cn = DBConexion.getConnection();
            
            pst = cn.prepareStatement(sql);                        
            
            rs = pst.executeQuery();
            
            while(rs.next())
            {
                 registros[0] = rs.getString("id_trabajador");
                
                registros[1] = rs.getString("nombre");
           
                registros[2] = rs.getString("apellido_paterno");
                
                registros[3] = rs.getString("apellido_materno");
                
                registros[4] = rs.getString("telefono");
                
                registros[5] = rs.getString("tipo_documento");
                
                registros[6] = rs.getString("nro_documento");
                
                registros[7] = rs.getString("direccion");
                
                registros[8] = rs.getString("cargo");
                
                modelo.addRow(registros);
                
            }
            
           
        }
        catch(SQLException e)
        {
            
            JOptionPane.showMessageDialog(null,"Error al conectar");
            
        }
        finally
        {
            try
            {
                if (rs != null) rs.close();
                
                if (pst != null) pst.close();
                
                if (cn != null) cn.close();
            }
            catch(SQLException e)
            {
                JOptionPane.showMessageDialog(null,e);
            }
        }
         return modelo;
    }
     
     //buscar modelo
      public static DefaultTableModel buscarModelo(String buscar){
        String []  nombresColumnas = {"Id","Nombre","Tipo"};
        String [] registros = new String[3];
        
       DefaultTableModel modelo = new DefaultTableModel(null,nombresColumnas);
        
        String sql = "SELECT * FROM modelo WHERE nombre LIKE '%"+buscar+"%'";
        
        Connection cn = null;
        
        PreparedStatement pst = null;
        
        ResultSet rs = null;
        
        try
        {
            cn = DBConexion.getConnection();
            
            pst = cn.prepareStatement(sql);                        
            
            rs = pst.executeQuery();
            
            while(rs.next())
            {
                registros[0] = rs.getString("id_modelo");
                
                registros[1] = rs.getString("nombre");
           
                registros[2] = rs.getString("tipo");
            
                
                modelo.addRow(registros);
                
            }
            
           
        }
        catch(SQLException e)
        {
            
            JOptionPane.showMessageDialog(null,"Error al conectar");
            
        }
        finally
        {
            try
            {
                if (rs != null) rs.close();
                
                if (pst != null) pst.close();
                
                if (cn != null) cn.close();
            }
            catch(SQLException e)
            {
                JOptionPane.showMessageDialog(null,e);
            }
        }
         return modelo;
    } 
     
     
      //buscarProveedor
      public static DefaultTableModel buscarProveedor( String buscar){
        String []  nombresColumnas = {"Id","Razón Social","Ruc", "Telefono","Dirección"};
        String [] registros = new String[5];
        
       DefaultTableModel modelo = new DefaultTableModel(null,nombresColumnas);
        
        String sql = "SELECT * FROM proveedor WHERE id_proveedor LIKE '%"+buscar+"%' OR razon_social LIKE '%"+buscar+ "%' OR Ruc LIKE '%" +buscar+"%'";
        
        Connection cn = null;
        
        PreparedStatement pst = null;
        
        ResultSet rs = null;
        
        try
        {
            cn = DBConexion.getConnection();
            
            pst = cn.prepareStatement(sql);                        
            
            rs = pst.executeQuery();
            
            while(rs.next())
            {
               registros[0] = rs.getString("id_proveedor");
                
                registros[1] = rs.getString("razon_social");
                
                registros[2] = rs.getString("Ruc");
           
                registros[3] = rs.getString("telefono");
                
                registros[4] = rs.getString("direccion");
                
                modelo.addRow(registros);
                
            }
            
           
        }
        catch(SQLException e)
        {
            
            JOptionPane.showMessageDialog(null,"Error al conectar");
            
        }
        finally
        {
            try
            {
                if (rs != null) rs.close();
                
                if (pst != null) pst.close();
                
                if (cn != null) cn.close();
            }
            catch(SQLException e)
            {
                JOptionPane.showMessageDialog(null,e);
            }
        }
         return modelo;
    }
      
      
      //BUSCAR INSUMO
      public static DefaultTableModel buscarInsumo( String buscar){
        String []  nombresColumnas = {"Id","Nombre","Cantidad", "Precio","Proveedor id"};
        String [] registros = new String[5];
        
       DefaultTableModel modelo = new DefaultTableModel(null,nombresColumnas);
        
        String sql = "SELECT * FROM insumo WHERE id_insumo LIKE '%"+buscar+"%' OR nombre LIKE '%"+buscar+"%'";
        
        Connection cn = null;
        
        PreparedStatement pst = null;
        
        ResultSet rs = null;
        
        try
        {
            cn = DBConexion.getConnection();
            
            pst = cn.prepareStatement(sql);                        
            
            rs = pst.executeQuery();
            
            while(rs.next())
            {
               registros[0] = rs.getString("id_insumo");
                
                registros[1] = rs.getString("nombre");
                
                registros[2] = rs.getString("cantidad");
           
                registros[3] = rs.getString("precio");
                
                registros[4] = rs.getString("proveedor_id");
                
                modelo.addRow(registros);
                
            }
            
           
        }
        catch(SQLException e)
        {
            
            JOptionPane.showMessageDialog(null,"Error al conectar");
            
        }
        finally
        {
            try
            {
                if (rs != null) rs.close();
                
                if (pst != null) pst.close();
                
                if (cn != null) cn.close();
            }
            catch(SQLException e)
            {
                JOptionPane.showMessageDialog(null,e);
            }
        }
         return modelo;
    }
      
      
      
      //ELIMINAR  "Delete from cliente where id_cliente= '"+id+"'";
      
   public static boolean eliminarRegistro(int id, String nombreTabla, String nombreId){
        String sql = "DELETE FROM "+nombreTabla+" WHERE " +nombreId+" = ?";
        Connection cn;
        PreparedStatement pst;
        try
        {
            cn = DBConexion.getConnection();
            
            pst = cn.prepareStatement(sql);
            
            pst.setInt(1, id);
            
            int i = pst.executeUpdate();
            
            return i != 0;
            
        }
        catch(SQLException e )
        {
            System.out.println("Error al eliminar registro "+e.getMessage());
            
            return false;
        }
    }
   
   
      public static boolean validarNumeros (String datos){
      return datos.matches("[0-9]+");
      }
      
      public static boolean validarLetras (String datos){
      return datos.matches("[a-zA-Z]+");
      }
      
      public static boolean validarDecimales(String datos){
      
          return datos.matches("^[0-9]+([.][0-9]+)?$");
      }
      
       public static boolean validarNocetosAlinicio(String datos){
      
          return datos.matches("[1-9][0-9]*");
      }

}
