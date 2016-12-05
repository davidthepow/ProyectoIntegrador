/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema;
import javax.swing.table.DefaultTableModel;
import java.sql.*;
import javax.swing.JOptionPane;
import sistema.Conexion;
/**
 *
 * @author user
 */
public class VENTA extends javax.swing.JFrame {
DefaultTableModel model;
Connection con;
Statement sent;
    /**
     * Creates new form AgregarCompra
     */
    public VENTA() {
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
        fe_entre = new javax.swing.JTextField();
        pago = new javax.swing.JTextField();
        des = new javax.swing.JTextField();
        n_prod = new javax.swing.JTextField();
        cod = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        cant = new javax.swing.JTextField();
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

        jLabel1.setText("Fecha Entrega");

        jLabel2.setText("Pago");

        jLabel3.setText("Descripcion");

        jLabel4.setText("Nombre Producto");

        jLabel5.setText("Codigo");

        jLabel6.setText("Cantidad");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(23, 23, 23)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(des, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(pago)
                            .addComponent(fe_entre)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cod)
                            .addComponent(n_prod)
                            .addComponent(cant))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(fe_entre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(n_prod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(cant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(pago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(des, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(b_nuevo)
                        .addGap(19, 19, 19)
                        .addComponent(b_agregar)
                        .addGap(18, 18, 18)
                        .addComponent(b_regresar))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(b_modificar)
                        .addGap(33, 33, 33)
                        .addComponent(b_eliminar)
                        .addGap(153, 153, 153))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b_nuevo)
                    .addComponent(b_agregar)
                    .addComponent(b_modificar)
                    .addComponent(b_eliminar)
                    .addComponent(b_regresar))
                .addGap(39, 39, 39))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void TablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaMouseClicked
    if (evt.getButton()==1){
            int fila = Tabla.getSelectedRow();
            try {
                habilitar();
                String sql = "SELECT * FROM venta WHERE IDventa="+Tabla.getValueAt(fila, 0); 
                sent = con.createStatement();
                ResultSet rs = sent.executeQuery(sql);
                rs.next();
                fe_entre.setText(rs.getString("f_entra"));
                n_prod.setText(rs.getString("num_p"));
                cod.setText(rs.getString("cod"));
                cant.setText(rs.getString("can"));
                pago.setText(rs.getString("precio"));
                des.setText(rs.getString("des"));
               
            } catch (Exception e) {
                e.printStackTrace();
            }            
        }        
    }//GEN-LAST:event_TablaMouseClicked

    private void b_nuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_nuevoActionPerformed
        limpiar();
        habilitar();
        b_agregar.setEnabled(true);
    }//GEN-LAST:event_b_nuevoActionPerformed

    private void b_agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_agregarActionPerformed
       try {
            String sql = "INSERT INTO venta(f_entra, num_p, cod, can, precio, des) " + " values(?,?,?,?,?,?)";
            PreparedStatement ps = con.prepareCall(sql);
            ps.setString(1, fe_entre.getText());
            ps.setString(2, n_prod.getText());
            ps.setString(3, cod.getText());
            ps.setString(4, cant.getText());
            ps.setString(5, pago.getText() );
            ps.setString(6, des.getText());
            int n = ps.executeUpdate();
            if (n>0) {
                JOptionPane.showMessageDialog(null,"Venta agregada correctamente");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Error"+e.getMessage());
        }
        desabilitar();
        mostrar();
        b_agregar.setEnabled(false);
    }//GEN-LAST:event_b_agregarActionPerformed

    private void b_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_eliminarActionPerformed
        try {
            int fila = Tabla.getSelectedRow();
            String sql = "DELETE FROM venta WHERE IDventa="+Tabla.getValueAt(fila, 0);
            sent = con.createStatement();
            int n = sent.executeUpdate(sql);
            if(n>0){
                mostrar();       
                JOptionPane.showMessageDialog(null,"Venta eliminada");
                limpiar();
            } 
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Error"+e.getMessage());
        }  
    }//GEN-LAST:event_b_eliminarActionPerformed

    private void b_modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_modificarActionPerformed
try {
            String sql = "UPDATE venta SET f_entra=?, num_p=?, cod=?, can=?, precio=?, des=?"+"WHERE IDventa=?";
            int fila = Tabla.getSelectedRow();
            String dao =(String)Tabla.getValueAt(fila, 0);
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, fe_entre.getText());
            ps.setString(2, n_prod.getText());
            ps.setString(3, cod.getText());
            ps.setString(4, cant.getText());
            ps.setString(5, pago.getText());
            ps.setString(6, des.getText());          
            ps.setString(7, dao);
            
            int n = ps.executeUpdate();
            if(n>0){
                limpiar();
                mostrar();
                JOptionPane.showMessageDialog(null,"Venta Actualizada");
            }                
        } catch (Exception e) {
             JOptionPane.showMessageDialog(null,"Error"+e.getMessage());
        }        
    }//GEN-LAST:event_b_modificarActionPerformed

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
            java.util.logging.Logger.getLogger(VENTA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VENTA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VENTA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VENTA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new VENTA().setVisible(true);
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
    private javax.swing.JTextField cant;
    private javax.swing.JTextField cod;
    private javax.swing.JTextField des;
    private javax.swing.JTextField fe_entre;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField n_prod;
    private javax.swing.JTextField pago;
    // End of variables declaration//GEN-END:variables

    private void habilitar() { // Codigo para habilitar y agregar otro usuario
    fe_entre.setEditable(true);
    pago.setEditable(true);
    des.setEditable(true); 
    n_prod.setEditable(true); 
    cod.setEditable(true); 
    cant.setEditable(true);
    }

       
    private void desabilitar() { // Codigo para desabilitar y no agregar datos
        fe_entre.setEditable(false);
        pago.setEditable(false);
        des.setEditable(false); 
        n_prod.setEditable(false); 
        cod.setEditable(false); 
        cant.setEditable(false);
    }

    private void limpiar() {
        fe_entre.setText(null);
        pago.setText(null);
        des.setText(null);
        n_prod.setText(null);
        cod.setText(null);
        cant.setText(null);
    }
     private void mostrar() { // Codigo para mostrar el contenido en las tablas
       try {
            con = Conexion.geConnection();
            String[]titulos ={"ID Venta","Fecha de Entrada","No:Producto","Codigo","Cantidad","Pago","Descripcion"};
            String sql = "SELECT * FROM venta";
            model = new DefaultTableModel(null,titulos);
            sent = con.createStatement();
            ResultSet rs = sent.executeQuery(sql);
            
            String []fila=new String[7];
            while(rs.next()){
                fila[0]=rs.getString("IDventa");
                fila[1]=rs.getString("f_entra");
                fila[2]=rs.getString("num_p");
                fila[3]=rs.getString("cod");
                fila[4]=rs.getString("can");
                fila[5]=rs.getString("precio");
                fila[6]=rs.getString("des");  
                
                model.addRow(fila);                        
            }  
            Tabla.setModel(model);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
