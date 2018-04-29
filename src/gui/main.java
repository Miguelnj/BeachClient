/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;
import API.ClienteForAPI;
import Model.Playa;
import Model.Utilidades;
import java.awt.Toolkit;
import java.util.ArrayList;
import javax.swing.DefaultListModel;

/**
 *
 * @author OrlandoPadrón
 */
public class main extends javax.swing.JFrame {

    /**
     * Creates new form main
     */
    Utilidades utils = new Utilidades();
    ArrayList<Playa> playas = utils.getPlayas();
    ClienteForAPI api; 
    public main() {
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

        BeachTrackerLOGO = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        modelo = new DefaultListModel();
        jListPlayas = new javax.swing.JList<>();
        jLabelSel = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextInfoPlaya = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextApiInfo = new javax.swing.JTextArea();
        jButton2 = new javax.swing.JButton();
        jLabelInfoAdicional = new javax.swing.JLabel();
        Logo = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(getPreferredSize());
        setResizable(false);
        setSize(new java.awt.Dimension(885, 443));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BeachTrackerLOGO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/TitleLogAmarillo.png"))); // NOI18N
        getContentPane().add(BeachTrackerLOGO, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 30, -1, -1));

        jListPlayas.setModel(modelo);
        inicializarmodelo();
        jListPlayas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jListPlayasMouseClicked(evt);
            }
        });
        jListPlayas.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jListPlayasComponentShown(evt);
            }
        });
        jScrollPane1.setViewportView(jListPlayas);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 200, 299, 250));

        jLabelSel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelSel.setForeground(new java.awt.Color(255, 255, 255));
        jLabelSel.setText("Seleccione la playa deseada");
        getContentPane().add(jLabelSel, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 170, -1, -1));

        jTextInfoPlaya.setColumns(20);
        jTextInfoPlaya.setRows(5);
        jTextInfoPlaya.setEditable(false);
        jScrollPane2.setViewportView(jTextInfoPlaya);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 200, 347, -1));

        jTextApiInfo.setColumns(20);
        jTextApiInfo.setRows(5);
        jTextApiInfo.setEditable(false);
        jScrollPane3.setViewportView(jTextApiInfo);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 340, 347, 100));

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jButton2.setText("Conversor");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 90, -1, -1));

        jLabelInfoAdicional.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelInfoAdicional.setForeground(new java.awt.Color(255, 255, 255));
        jLabelInfoAdicional.setText("Información adicional");
        getContentPane().add(jLabelInfoAdicional, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 170, -1, -1));

        Logo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Logo.setForeground(new java.awt.Color(255, 255, 255));
        Logo.setText("Información climática");
        getContentPane().add(Logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 310, -1, -1));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jButton1.setText("Admin");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(783, 30, 90, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/backgroundBT.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 910, 520));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jListPlayasComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jListPlayasComponentShown
        
        
        
    }//GEN-LAST:event_jListPlayasComponentShown

    private void jListPlayasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jListPlayasMouseClicked
        int aux = jListPlayas.getSelectedIndex(); 
        jTextInfoPlaya.setText(playas.get(aux).toString());
        api = new ClienteForAPI(String.valueOf(playas.get(aux).getLatitud()), String.valueOf(playas.get(aux).getLongitud())); 
        jTextApiInfo.setText(api.respuesta().toString());
        
    }//GEN-LAST:event_jListPlayasMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.setVisible(false);
        adminLogin log = new adminLogin(); 
        log.setVisible(true); 
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.setVisible(false);
        conversor conv = new conversor();
        conv.setVisible(true);
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
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BeachTrackerLOGO;
    private javax.swing.JLabel Logo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelInfoAdicional;
    private javax.swing.JLabel jLabelSel;
    private javax.swing.JList<String> jListPlayas;
    private DefaultListModel modelo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jTextApiInfo;
    private javax.swing.JTextArea jTextInfoPlaya;
    // End of variables declaration//GEN-END:variables
}