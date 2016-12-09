/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import reporte.Reportito2;

/**
 *
 * @author Arturo
 */
public class A_Reporte extends javax.swing.JFrame {
    DefaultTableModel model;
    Connection con;
    Statement sent;

    /**
     * Creates new form A_Reporte
     */
    public A_Reporte() {
        initComponents();
        con = Conexion.geConnection(); //Realizar la conexion a la base de datos
        mostrar();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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

        jButton2.setText("Imprimir");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
                .addGap(601, 601, 601))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 747, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(396, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(50, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaMouseClicked
        
    }//GEN-LAST:event_TablaMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        try {
            con = Conexion.geConnection();
            String[]titulos ={"Posición","Proveedor","Cantidad"};
            String sql = "select proveedor, sum(pesoneto) as cantidad from productos group by proveedor order by 2 desc";
            model = new DefaultTableModel(null,titulos);
            sent = con.createStatement();
            ResultSet rs = sent.executeQuery(sql);
            
            ArrayList<String[]> filas = new ArrayList<String[]>();
            int posicion = 1;
            while(rs.next()){
                String []fila=new String[3];               
                fila[0]=""+posicion++;
                fila[1]=rs.getString("proveedor");
                fila[2]=rs.getString("cantidad");
                
                filas.add(fila);
            }  

            File f;
            f = new File("C:\\Users\\ing_m\\reportep.json");
            //Escritura
            try {
                FileWriter w = new FileWriter(f);
                BufferedWriter bw = new BufferedWriter(w);
                PrintWriter wr = new PrintWriter(bw);
                wr.write("{\"titulo\": \"Reporte\",");
                wr.write("\"List\"[");                        
                for (int i = 0; i < filas.size(); i++) {
                    wr.append("\"" + filas.get(i)[0] + "\",");
                }
                wr.append("]");
                wr.append("\"List proveedor\":[");
                for (int i = 0; i < filas.size(); i++) {
                    wr.append("\"" + filas.get(i)[1] + "\",");
                }
                wr.append("]");
                wr.append("\"List cantidad\":[");
                for (int i = 0; i < filas.size(); i++) {
                    wr.append("\"" + filas.get(i)[2] + "\",");
                }
                wr.append("]}");
                wr.close();
                bw.close();
            } catch (IOException e) {
            };
            Reportito2 re = new Reportito2(f,"C:\\Users\\ing_m\\listado.pdf");
            
            } catch (Exception e) {
                e.printStackTrace();
            }            
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(A_Reporte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(A_Reporte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(A_Reporte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(A_Reporte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new A_Reporte().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Tabla;
    private javax.swing.JButton jButton2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    private void mostrar() { // Codigo para mostrar el contenido en las tablas
       try {
            con = Conexion.geConnection();
            String[]titulos ={"Posición","Proveedor","Cantidad"};
            String sql = "select proveedor, sum(pesoneto) as cantidad from productos group by proveedor order by 2 desc";
            model = new DefaultTableModel(null,titulos);
            sent = con.createStatement();
            ResultSet rs = sent.executeQuery(sql);
            
            String []fila=new String[3];
            int i = 1;
            while(rs.next()){
               
                fila[0]=""+i++;
                fila[1]=rs.getString("proveedor");
                fila[2]=rs.getString("cantidad");
                
                model.addRow(fila);                        
            }  
            Tabla.setModel(model);
            Tabla.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
            Tabla.getColumnModel().getColumn(0).setPreferredWidth(60);
            Tabla.getColumnModel().getColumn(1).setPreferredWidth(360);
            Tabla.getColumnModel().getColumn(2).setPreferredWidth(80);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
