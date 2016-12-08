/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Davidthepow1
 */
public class Validar {
    
   Conexion metodo = new Conexion();
    
public int validar_ingreso(){
    String usuario = PanelLogin.jTextField1.getText();
    String clave = String.valueOf(PanelLogin.jPasswordField1.getPassword());
    
    int resultado=0;
    
    String SSQL= "SELECT * FROM usuarios WHERE usuario='"+usuario+"' AND clave=('"+clave+"')";
    Connection conect = null;
       try {
           
           conect = metodo.dataSource.getConnection();
           Statement st = conect.createStatement();
           ResultSet rs = st.executeQuery(SSQL);
           
           if(rs.next()){
               resultado =1;
           }
       } 
       catch (SQLException ex) {
          
           JOptionPane.showMessageDialog(null, ex, "Error de Conexion", JOptionPane.ERROR_MESSAGE );
       }finally{
       
           try {
            conect.close();
            
        } catch (SQLException ex) {
            
           JOptionPane.showMessageDialog(null, ex,"Desconexion",JOptionPane.ERROR_MESSAGE);
           
        }
           
       }
    return resultado;
            
}
    
}