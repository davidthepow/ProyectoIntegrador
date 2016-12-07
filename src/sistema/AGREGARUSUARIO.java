/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema;
import javax.swing.table.DefaultTableModel;
import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author user
 */
public class AGREGARUSUARIO extends javax.swing.JFrame {
DefaultTableModel model;
Connection con;
Statement sent;


    /**
     * Creates new form AgregarCompra
     */
    public AGREGARUSUARIO() {
       initComponents();
       this.setLocationRelativeTo(null);//centrar ventanas
       con = Conexion.geConnection(); //Realizar la conexion a la base de datos
       desabilitar(); // Desabilitar el campo de texto 
       mostrar();
       b_guardar.setEnabled(false); // bloquear e boton agregar
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        usuario = new javax.swing.JTextField();
        a_mater = new javax.swing.JTextField();
        edad = new javax.swing.JTextField();
        contra = new javax.swing.JTextField();
        nombre = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        a_pater = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        telefono = new javax.swing.JTextField();
        sexo = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        b_nuevo = new javax.swing.JButton();
        b_guardar = new javax.swing.JButton();
        b_modificar = new javax.swing.JButton();
        b_eliminar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla = new javax.swing.JTable();
        b_regresar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Agregar Usuario"));

        jLabel1.setText("Usuario");

        jLabel2.setText("Apellido Materno");

        jLabel3.setText("Edad");

        jLabel4.setText("Contraseña");

        jLabel5.setText("Nombre");

        edad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edadActionPerformed(evt);
            }
        });

        jLabel6.setText("Apellido Paterno");

        jLabel7.setText("Telefono");

        jLabel8.setText("Sexo");

        jLabel9.setText("Correo");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6))
                        .addGap(13, 13, 13)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(contra, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                            .addComponent(nombre)
                            .addComponent(a_pater)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9))
                        .addGap(11, 11, 11)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(usuario)
                            .addComponent(a_mater)
                            .addComponent(edad)
                            .addComponent(telefono)
                            .addComponent(sexo)
                            .addComponent(email))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(contra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(a_pater, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(a_mater, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(edad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(telefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(sexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        b_nuevo.setText("Nuevo");
        b_nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_nuevoActionPerformed(evt);
            }
        });

        b_guardar.setText("Guardar");
        b_guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_guardarActionPerformed(evt);
            }
        });

        b_modificar.setText("Modificar");
        b_modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_modificarActionPerformed(evt);
            }
        });

        b_eliminar.setText("Eliminar");
        b_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_eliminarActionPerformed(evt);
            }
        });

        jScrollPane1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        Tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        Tabla.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        Tabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Tabla);

        b_regresar.setText("Regresar");
        b_regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_regresarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 522, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(b_nuevo)
                        .addGap(18, 18, 18)
                        .addComponent(b_guardar)
                        .addGap(18, 18, 18)
                        .addComponent(b_regresar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(b_modificar)
                        .addGap(64, 64, 64)
                        .addComponent(b_eliminar)
                        .addGap(156, 156, 156))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 299, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b_nuevo)
                    .addComponent(b_guardar)
                    .addComponent(b_modificar)
                    .addComponent(b_eliminar)
                    .addComponent(b_regresar))
                .addGap(27, 27, 27))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void TablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaMouseClicked
if (evt.getButton()==1){
            int fila = Tabla.getSelectedRow();
            try {
                habilitar();
                String sql = "SELECT * FROM ag_user WHERE IDagregar="+Tabla.getValueAt(fila, 0); 
                sent = con.createStatement();
                ResultSet rs = sent.executeQuery(sql);
                rs.next();
                usuario.setText(rs.getString("usuarios"));
                contra.setText(rs.getString("contra"));
                nombre.setText(rs.getString("nombre"));
                a_pater.setText(rs.getString("a_pater"));
                a_mater.setText(rs.getString("a_mater"));
                edad.setText(rs.getString("edad"));
                telefono.setText(rs.getString("telefono"));
                sexo.setText(rs.getString("sexo"));
                email.setText(rs.getString("correo"));
            } catch (Exception e) {
                e.printStackTrace();
            }            
        }      
    }//GEN-LAST:event_TablaMouseClicked

    private void b_nuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_nuevoActionPerformed
        limpiar();
        habilitar();
        b_guardar.setEnabled(true);
        mostrar();
    }//GEN-LAST:event_b_nuevoActionPerformed

    private void b_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_guardarActionPerformed
       try {
            String sql = "INSERT INTO ag_user (usuarios,contra,nombre,a_pater,a_mater,edad,telefono,sexo,correo) "+ " values(?,?,?,?,?,?,?,?,?)";
            PreparedStatement ps = con.prepareCall(sql);
            ps.setString(1, usuario.getText());
            ps.setString(2, contra.getText());
            ps.setString(3, nombre.getText());
            ps.setString(4, a_pater.getText());
            ps.setString(5, a_mater.getText() );
            ps.setString(6, edad.getText());
            ps.setString(7, telefono.getText());
            ps.setString(8, sexo.getText());
            ps.setString(9, email.getText());
            int n = ps.executeUpdate();
            if (n>0) {
                JOptionPane.showMessageDialog(null,"Usuario agregado correctamente");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Error"+e.getMessage());
        }
       mostrar();
        desabilitar();
        b_guardar.setEnabled(false);
    }//GEN-LAST:event_b_guardarActionPerformed

    private void b_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_eliminarActionPerformed
      try {
            int fila = Tabla.getSelectedRow();
            String sql = "DELETE FROM ag_user WHERE IDagregar="+Tabla.getValueAt(fila, 0);
            sent = con.createStatement();
            int n = sent.executeUpdate(sql);
            if(n>0){
                mostrar();       
                JOptionPane.showMessageDialog(null,"Usuario eliminado");
                limpiar();
            } 
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Error"+e.getMessage());
        }  
    }//GEN-LAST:event_b_eliminarActionPerformed

    private void b_modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_modificarActionPerformed
         try {
            String sql = "UPDATE ag_user SET usuarios=?, contra=?, nombre=?, a_pater=?, a_mater=?, edad=?, telefono=?, sexo=?,correo=?"+"WHERE IDagregar=?";
            int fila = Tabla.getSelectedRow();
            String dao =(String)Tabla.getValueAt(fila, 0);
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, usuario.getText());
            ps.setString(2, contra.getText());
            ps.setString(3, nombre.getText());
            ps.setString(4, a_pater.getText());
            ps.setString(5, a_mater.getText());
            ps.setString(6, edad.getText());
            ps.setString(7, telefono.getText());
            ps.setString(8, sexo.getText());
            ps.setString(9, email.getText());
            ps.setString(10, dao);
            
            int n = ps.executeUpdate();
            if(n>0){
                limpiar();
                mostrar();
                JOptionPane.showMessageDialog(null,"Usuario modificado");
            }                
        } catch (Exception e) {
             JOptionPane.showMessageDialog(null,"Error"+e.getMessage());
        }
    }//GEN-LAST:event_b_modificarActionPerformed

    private void edadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edadActionPerformed

    private void b_regresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_regresarActionPerformed
        // TODO add your handling code here:
        
         MENU MN = new MENU();
                 MN.setVisible(true);
                 dispose();
    }//GEN-LAST:event_b_regresarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AGREGARUSUARIO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AGREGARUSUARIO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AGREGARUSUARIO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AGREGARUSUARIO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AGREGARUSUARIO().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Tabla;
    private javax.swing.JTextField a_mater;
    private javax.swing.JTextField a_pater;
    private javax.swing.JButton b_eliminar;
    private javax.swing.JButton b_guardar;
    private javax.swing.JButton b_modificar;
    private javax.swing.JButton b_nuevo;
    private javax.swing.JButton b_regresar;
    private javax.swing.JTextField contra;
    private javax.swing.JTextField edad;
    private javax.swing.JTextField email;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nombre;
    private javax.swing.JTextField sexo;
    private javax.swing.JTextField telefono;
    private javax.swing.JTextField usuario;
    // End of variables declaration//GEN-END:variables

    private void habilitar() { // Codigo para habilitar y agregar otro usuario
    usuario.setEditable(true);
    a_mater.setEditable(true);
    edad.setEditable(true); 
    contra.setEditable(true); 
    nombre.setEditable(true); 
    a_pater.setEditable(true);
    telefono.setEditable(true);
    sexo.setEditable(true);
    email.setEditable(true);    
    }

       
    private void desabilitar() { // Codigo para desabilitar y no agregar datos
        usuario.setEditable(false);
        a_mater.setEditable(false);
        edad.setEditable(false); 
        contra.setEditable(false); 
        nombre.setEditable(false); 
        a_pater.setEditable(false);
        telefono.setEditable(false);
        sexo.setEditable(false);
        email.setEditable(false);
    }

    private void limpiar() {
        usuario.setText(null);
        a_mater.setText(null);
        edad.setText(null);
        contra.setText(null);
        nombre.setText(null);
        a_pater.setText(null);
        telefono.setText(null);
        sexo.setText(null);
        email.setText(null);
    }
    
    private void mostrar() { // Codigo para mostrar el contenido en las tablas
       try {
            con = Conexion.geConnection();
            String[]titulos ={"ID Usuario","Usuario","Contraseña","Nombre","Paterno","Materno","Edad","Telefono","Sexo","Correo"};
            String sql = "SELECT * FROM ag_user";
            model = new DefaultTableModel(null,titulos);
            sent = con.createStatement();
            ResultSet rs = sent.executeQuery(sql);
            
            String []fila=new String[10];
            while(rs.next()){
                fila[0]=rs.getString("IDagregar");
                fila[1]=rs.getString("usuarios");
                fila[2]=rs.getString("contra");
                fila[3]=rs.getString("nombre");
                fila[4]=rs.getString("a_pater");
                fila[5]=rs.getString("a_mater");
                fila[6]=rs.getString("edad");  
                fila[7]=rs.getString("telefono");
                fila[8]=rs.getString("sexo");
                fila[9]=rs.getString("correo");
                model.addRow(fila);                        
            }  
            Tabla.setModel(model);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
