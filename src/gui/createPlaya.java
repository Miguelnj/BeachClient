/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import Model.Playa;
import consumews.NewJerseyClient;
import java.awt.Toolkit;
import java.math.BigDecimal;
import javax.swing.JOptionPane;

/**
 *
 * @author OrlandoPadrón
 */
public class createPlaya extends javax.swing.JFrame {

    /**
     * Creates new form createPlaya
     */
    
    int id;
    String name;
    String comunidad;
    String provincia;
    double latitud;
    double longitud;
    String lugar; 
    NewJerseyClient njc = new NewJerseyClient(); 
    Playa playaACrear; 
    
    public createPlaya() {
        initComponents();
        setIcon();
        this.setLocationRelativeTo(null);
        

    }
    public void setIcon(){
        setIconImage(Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("imagenes/iconBT.png")));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonAceptar = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        nameText = new javax.swing.JTextField();
        comuText = new javax.swing.JTextField();
        provText = new javax.swing.JTextField();
        lugarText = new javax.swing.JTextField();
        latText = new javax.swing.JTextField();
        lonText = new javax.swing.JTextField();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonAceptar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonAceptar.setText("Aceptar");
        jButtonAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAceptarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonAceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 290, -1, -1));

        jButtonCancelar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonCancelar.setText("Volver");
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 290, -1, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nombre de la playa");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Comunidad");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 80, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Provincia");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Isla");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 140, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Latitud");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 170, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Longitud");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 200, -1, -1));
        getContentPane().add(nameText, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 50, 212, -1));
        getContentPane().add(comuText, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 80, 212, -1));
        getContentPane().add(provText, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 110, 212, -1));
        getContentPane().add(lugarText, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 140, 212, -1));
        getContentPane().add(latText, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 170, 212, -1));
        getContentPane().add(lonText, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 200, 212, -1));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/create.png"))); // NOI18N
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 560, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
            
        adminTools ventanaAnterior = new adminTools();
        ventanaAnterior.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jButtonAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAceptarActionPerformed

        
        id = Integer.parseInt(njc.countREST())+1;   
        name = nameText.getText(); 
        comunidad = comuText.getText(); 
        provincia = provText.getText();
        if(name.isEmpty() || comunidad.isEmpty() || provincia.isEmpty()){
            JOptionPane.showMessageDialog(null, "Todos los campos, excepto 'isla' "
                    + "son obligatorios", "Oops!!", JOptionPane.INFORMATION_MESSAGE); 
        }else{
           try{
            latitud = Double.parseDouble(latText.getText());
            longitud = Double.parseDouble(lonText.getText()); 
            lugar = lugarText.getText();
            if(lugar.isEmpty()){
                playaACrear = new Playa(id, name, comunidad, provincia, latitud, longitud, null);
            }else{
                playaACrear = new Playa(id, name, comunidad, provincia, latitud, longitud, lugar);
            }
            njc.create(playaACrear);
            JOptionPane.showMessageDialog(null, "Elemento " + "'"+ playaACrear.getName()+ "'" + " creado", "Verificación de proceso", JOptionPane.INFORMATION_MESSAGE);
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error con el formato de la latitud/longitud", "Oops!!", JOptionPane.INFORMATION_MESSAGE); 
        } 
        }
        
        nameText.setText("");
        comuText.setText("");
        provText.setText("");
        latText.setText("");
        lonText.setText("");
        lugarText.setText("");
    }//GEN-LAST:event_jButtonAceptarActionPerformed

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
            java.util.logging.Logger.getLogger(createPlaya.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(createPlaya.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(createPlaya.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(createPlaya.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new createPlaya().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JTextField comuText;
    private javax.swing.JButton jButtonAceptar;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField latText;
    private javax.swing.JTextField lonText;
    private javax.swing.JTextField lugarText;
    private javax.swing.JTextField nameText;
    private javax.swing.JTextField provText;
    // End of variables declaration//GEN-END:variables
}
