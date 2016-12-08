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
public class AGREGARPRODUCTO extends javax.swing.JFrame {
DefaultTableModel model;
Connection con;
Statement sent;
    /**
     * Creates new form AgregarCompra
     */
    public AGREGARPRODUCTO() {
        initComponents();
        this.setLocationRelativeTo(null);//centrar ventanas
        con = Conexion.geConnection(); //Realizar la conexion a la base de datos
        desabilitar(); // Desabilitar el campo de texto 
        mostrar();
        b_agregar.setEnabled(false); // bloquear e boton agregar
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
        n_pro = new javax.swing.JTextField();
        fecha = new javax.swing.JTextField();
        fecha_cad = new javax.swing.JTextField();
        clave = new javax.swing.JTextField();
        cantidad = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        costo = new javax.swing.JTextField();
        des = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        b_nuevo = new javax.swing.JButton();
        b_agregar = new javax.swing.JButton();
        b_modificar = new javax.swing.JButton();
        b_eliminar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla = new javax.swing.JTable();
        b_regresar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Agregar producto"));

        jLabel1.setText("Nombre del Producto");

        jLabel2.setText("Fecha de Entrada");

        jLabel3.setText("Fecha de Caducidad");

        jLabel4.setText("Precio/KG");

        jLabel5.setText("UNIDAD/KG");

        fecha_cad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fecha_cadActionPerformed(evt);
            }
        });

        jLabel6.setText("Costo");

        jLabel7.setText("Descripcion");

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
                        .addGap(55, 55, 55)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cantidad)
                            .addComponent(clave)
                            .addComponent(costo)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(11, 11, 11)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(n_pro, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)
                            .addComponent(fecha)
                            .addComponent(fecha_cad)
                            .addComponent(des))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(n_pro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(clave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(costo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(fecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(fecha_cad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(des, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addContainerGap())
        );

        b_nuevo.setText("Nuevo");
        b_nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_nuevoActionPerformed(evt);
            }
        });

        b_agregar.setText("Agregar");
        b_agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_agregarActionPerformed(evt);
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(b_nuevo)
                        .addGap(18, 18, 18)
                        .addComponent(b_agregar)
                        .addGap(26, 26, 26)
                        .addComponent(b_regresar)
                        .addGap(9, 9, 9))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 498, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(b_modificar)
                        .addGap(46, 46, 46)
                        .addComponent(b_eliminar)
                        .addGap(148, 148, 148))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b_nuevo)
                    .addComponent(b_agregar)
                    .addComponent(b_modificar)
                    .addComponent(b_eliminar)
                    .addComponent(b_regresar))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void TablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaMouseClicked
        if (evt.getButton()==1){
            int fila = Tabla.getSelectedRow();
            try {
                habilitar();
                String sql = "SELECT * FROM productos WHERE IDprod="+Tabla.getValueAt(fila, 0); 
                sent = con.createStatement();
                ResultSet rs = sent.executeQuery(sql);
                rs.next();
                n_pro.setText(rs.getString("n_prod"));
                clave.setText(rs.getString("p_kg"));
                cantidad.setText(rs.getString("u_kg"));
                costo.setText(rs.getString("cost"));
                fecha.setText(rs.getString("f_entra"));
                fecha_cad.setText(rs.getString("f_Cad"));
                des.setText(rs.getString("des"));
            } catch (Exception e) {
                e.printStackTrace();
            }            
        }          
        
    }//GEN-LAST:event_TablaMouseClicked

    private void b_nuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_nuevoActionPerformed
        limpiar();
        habilitar();
        mostrar();
        b_agregar.setEnabled(true);
    }//GEN-LAST:event_b_nuevoActionPerformed

    private void b_agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_agregarActionPerformed
       try {
            String sql = "INSERT INTO productos(n_prod, p_kg, u_kg, cost, f_entra, f_cad, des) " + " values(?,?,?,?,?,?,?)"; 
            PreparedStatement ps = con.prepareCall(sql);
            ps.setString(1, n_pro.getText());
            ps.setString(2, clave.getText());
            ps.setString(3, cantidad.getText());
            ps.setString(4, costo.getText());
            ps.setString(5, fecha.getText() );
            ps.setString(6, fecha_cad.getText());
            ps.setString(7, des.getText());
            int n = ps.executeUpdate();
            if (n>0) {
                JOptionPane.showMessageDialog(null,"Producto agregado correctamente");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Error"+e.getMessage());
        }
        desabilitar();
        limpiar();
        mostrar();
        b_agregar.setEnabled(false);
    }//GEN-LAST:event_b_agregarActionPerformed

    private void b_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_eliminarActionPerformed
         try {
            int fila = Tabla.getSelectedRow();
            String sql = "DELETE FROM productos WHERE IDprod="+Tabla.getValueAt(fila, 0);
            sent = con.createStatement();
            int n = sent.executeUpdate(sql);
            if(n>0){
                mostrar();       
                JOptionPane.showMessageDialog(null,"Producto eliminado");
                limpiar();
            } 
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Error"+e.getMessage());
        }  
                 mostrar();

    }//GEN-LAST:event_b_eliminarActionPerformed

    private void b_modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_modificarActionPerformed
             try {
            String sql = "UPDATE productos SET n_prod=?, p_kg=?, u_kg=?, cost=?, f_entra=?, f_Cad=?, des=?"+"WHERE IDprod=?";
            int fila = Tabla.getSelectedRow();
            String dao =(String)Tabla.getValueAt(fila, 0);
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, n_pro.getText());
            ps.setString(2, clave.getText());
            ps.setString(3, cantidad.getText());
            ps.setString(4, costo.getText());
            ps.setString(5, fecha.getText());
            ps.setString(6, fecha_cad.getText());
            ps.setString(7, des.getText());
            ps.setString(8, dao);
            
            int n = ps.executeUpdate();
            if(n>0){
                limpiar();
                mostrar();
                JOptionPane.showMessageDialog(null,"Usuario modificado");
            }                
        } catch (Exception e) {
             JOptionPane.showMessageDialog(null,"Error"+e.getMessage());
        }
             mostrar();
    }//GEN-LAST:event_b_modificarActionPerformed

    private void fecha_cadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fecha_cadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fecha_cadActionPerformed

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
            java.util.logging.Logger.getLogger(AGREGARPRODUCTO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AGREGARPRODUCTO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AGREGARPRODUCTO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AGREGARPRODUCTO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AGREGARPRODUCTO().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Tabla;
    private javax.swing.JButton b_agregar;
    private javax.swing.JButton b_eliminar;
    private javax.swing.JButton b_modificar;
    private javax.swing.JButton b_nuevo;
    private javax.swing.JButton b_regresar;
    private javax.swing.JTextField cantidad;
    private javax.swing.JTextField clave;
    private javax.swing.JTextField costo;
    private javax.swing.JTextField des;
    private javax.swing.JTextField fecha;
    private javax.swing.JTextField fecha_cad;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField n_pro;
    // End of variables declaration//GEN-END:variables

    private void habilitar() { // Codigo para habilitar y agregar otro usuario
    n_pro.setEditable(true);
    fecha.setEditable(true);
    fecha_cad.setEditable(true); 
    clave.setEditable(true); 
    cantidad.setEditable(true); 
    costo.setEditable(true);
    des.setEditable(true);
    }
       
    private void desabilitar() { // Codigo para desabilitar y no agregar datos
        n_pro.setEditable(false);
        fecha.setEditable(false);
        fecha_cad.setEditable(false); 
        clave.setEditable(false); 
        cantidad.setEditable(false); 
        costo.setEditable(false);
    }

    private void limpiar() {
        n_pro.setText(null);
        fecha.setText(null);
        fecha_cad.setText(null);
        clave.setText(null);
        cantidad.setText(null);
        costo.setText(null);
        des.setText(null);
    }
    
    private void mostrar() {
       try {
            con = Conexion.geConnection();
            String[]titulos ={"ID Producto","Nombre del Producto","Precio/KG","unidades*KG","Costo","Fecha de Entrada","Fecha de Caducidad","Descripcion"};
            String sql = "SELECT * FROM productos";
            model = new DefaultTableModel(null,titulos);
            sent = con.createStatement();
            ResultSet rs = sent.executeQuery(sql);
            
            String []fila=new String[8];
            while(rs.next()){
                fila[0]=rs.getString("IDprod");
                fila[1]=rs.getString("n_prod");
                fila[2]=rs.getString("p_kg");
                fila[3]=rs.getString("u_kg");
                fila[4]=rs.getString("cost");
                fila[5]=rs.getString("f_entra");
                fila[6]=rs.getString("f_Cad"); 
                fila[7]=rs.getString("des");
                model.addRow(fila);                        
            }  
            Tabla.setModel(model);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
