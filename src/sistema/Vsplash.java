/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema;

import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author jackie
 */
public class Vsplash extends javax.swing.JFrame implements Runnable {

    Thread t;
    /**
     * Creates new form Vsplash
     */
    public Vsplash() {
        initComponents();
    }

    @Override
    public void run()
    {
        try {
            
            this.setLocationRelativeTo(null);
            this.setVisible(true);
            t.sleep(5000);
            this.dispose();
            new PanelLogin().setVisible(true);
            
        } catch (InterruptedException ex) {
            Logger.getLogger(Vsplash.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    
    }

  
       

    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
  
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(450, 200));
        setUndecorated(true);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ERP2.jpg"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


              
           
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables



}
