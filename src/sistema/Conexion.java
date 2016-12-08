/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.sql.DataSource;
import javax.swing.JOptionPane;
import org.apache.commons.dbcp.BasicDataSource;

/**
 *
 * @author Davidthepow1
 */
public class Conexion {

    
    
    
    public DataSource dataSource;
    
    static String bd = "sistema"; //mencionasmos la base de datos
    static String login = "root"; //mencionamos el usuario
    static String pass = "bares123"; // mencionamos la contraseña
    static String url = "jdbc:mysql://130.211.202.183/"+bd; // hacemos la conexion    
    static Connection con; // nombramos el conector
    
    
    public Conexion(){
        
        inicializaDataSource();
        
    }
    
    private void inicializaDataSource(){
    
            BasicDataSource basicDataSource = new BasicDataSource();
            
            basicDataSource.setDriverClassName("org.gjt.mm.mysql.Driver");
            basicDataSource.setUsername(login);
            basicDataSource.setPassword(pass);
            basicDataSource.setUrl(url);
            basicDataSource.setMaxActive(50);
            
            dataSource = basicDataSource;
            
            
    }
    public static Connection geConnection(){
      try{
         //obtenemos el driver de para mysql
         Class.forName("com.mysql.jdbc.Driver");
         //obtenemos la conexión
         con = DriverManager.getConnection(url,login,pass);
         if (con!=null){
            System.out.println("Conección a base de datos "+bd+". listo");
         }
      }catch(Exception e){
          JOptionPane.showMessageDialog(null, "Error al conectar"+e.getMessage());
      }
        return con;
   }
   
}
    
