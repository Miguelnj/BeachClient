/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import Model.Playa;
import Model.Utilidades;
import consumews.NewJerseyClient;
import java.awt.Toolkit;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author OrlandoPadrón
 */
public class adminTools extends javax.swing.JFrame {

    /**
     * Creates new form adminTools
     */
    Utilidades utils = new Utilidades();
    NewJerseyClient njc = new NewJerseyClient();
    ArrayList<Playa> playas = utils.getPlayas();
    
    public adminTools() {
        initComponents();
        setIcon();
        this.setLocationRelativeTo(null);

    }
    public void setIcon(){
        setIconImage(Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("imagenes/iconBT.png")));
    }
    public void inicializarmodelo(){
        for (int i = 0; i < playas.size(); i++){
            modelo.addElement(playas.get(i).getId() + ") "+ playas.get(i).getName());
        }
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
        modelo = new DefaultListModel();
        jListPlayas = new javax.swing.JList<>();
        jButton1 = new javax.swing.JButton();
        jButtonDesconectar = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        setSize(new java.awt.Dimension(577, 432));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jListPlayas.setModel(modelo);
        inicializarmodelo();
        jScrollPane1.setViewportView(jListPlayas);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(93, 105, 226, 224));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jButton1.setText("Crear");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(372, 157, 100, 44));

        jButtonDesconectar.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jButtonDesconectar.setText("Desconectar");
        jButtonDesconectar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDesconectarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonDesconectar, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 350, 115, 44));

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jButton3.setText("Borrar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(372, 219, 100, 44));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Administrar datos");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 30, 330, 40));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/adminTools.png"))); // NOI18N
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 4, 560, 420));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        createPlaya ventananueva = new createPlaya();
        ventananueva.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        
        int pos = jListPlayas.getSelectedIndex(); 
        
        //DESCOMENTAR TRAS REALIZAR LAS PRUEBAS
        
        if (pos > 12){
            modelo.removeElementAt(pos);
            njc.remove(String.valueOf(playas.get(pos).getId()));
            JOptionPane.showMessageDialog(null, "Elemento eliminado", "Verificación de proceso", JOptionPane.INFORMATION_MESSAGE); 

        }else{
            JOptionPane.showMessageDialog(null, "Movimiento no permitido. Dato protegido", "Error", JOptionPane.WARNING_MESSAGE); 


        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButtonDesconectarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDesconectarActionPerformed

        main ventanaprincipal = new main();
        ventanaprincipal.setVisible(true);
        this.setVisible(false); 
        
    }//GEN-LAST:event_jButtonDesconectarActionPerformed

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
            java.util.logging.Logger.getLogger(adminTools.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(adminTools.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(adminTools.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(adminTools.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new adminTools().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButtonDesconectar;
    private javax.swing.JLabel jLabel1;
    private DefaultListModel modelo;
    private javax.swing.JList<String> jListPlayas;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables


    

}
