

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PC
 */
import AppPackage.AnimationClass;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.YES_OPTION;
public class VentanaPrincipal extends javax.swing.JFrame {


    /**
     * Creates new form VentanaPrincipal
     */
    public VentanaPrincipal() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btncerrar = new javax.swing.JButton();
        jLabelFondo = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblMinimizar = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lblCerrar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 235, 88));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Menú 21x29.7 сm.gif"))); // NOI18N
        jLabel1.setOpaque(true);
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-80, -140, 340, 620));

        jPanel1.setBackground(new java.awt.Color(15, 15, 20));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btncerrar.setBackground(new java.awt.Color(255, 255, 255));
        btncerrar.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        btncerrar.setForeground(new java.awt.Color(255, 0, 0));
        btncerrar.setText("X");
        btncerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btncerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncerrarActionPerformed(evt);
            }
        });
        jPanel1.add(btncerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 10, -1, -1));
        jPanel1.add(jLabelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 460));

        jLabel2.setBackground(new java.awt.Color(252, 213, 68));
        jLabel2.setFont(new java.awt.Font("Dialog", 1, 17)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Ingresar datos");
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.setOpaque(true);
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 430, 140, 30));

        lblMinimizar.setBackground(new java.awt.Color(0, 0, 0));
        lblMinimizar.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        lblMinimizar.setForeground(new java.awt.Color(255, 204, 0));
        lblMinimizar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMinimizar.setText("-");
        lblMinimizar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(252, 213, 68)));
        lblMinimizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblMinimizar.setOpaque(true);
        lblMinimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMinimizarMouseClicked(evt);
            }
        });
        jPanel1.add(lblMinimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 10, 30, 20));

        jLabel6.setBackground(new java.awt.Color(0, 0, 0));
        jLabel6.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(252, 213, 68));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Bienvenido");
        jLabel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(252, 213, 68)));
        jLabel6.setOpaque(true);
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 60, 230, 30));

        lblCerrar.setBackground(new java.awt.Color(0, 0, 0));
        lblCerrar.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        lblCerrar.setForeground(new java.awt.Color(255, 204, 0));
        lblCerrar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCerrar.setText("X");
        lblCerrar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(252, 213, 68)));
        lblCerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblCerrar.setOpaque(true);
        lblCerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCerrarMouseClicked(evt);
            }
        });
        jPanel1.add(lblCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 10, 40, 20));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 0, 372, 480));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btncerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncerrarActionPerformed
      System.exit(0);
    }//GEN-LAST:event_btncerrarActionPerformed

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        vc.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jLabel2MouseClicked

    private void lblMinimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMinimizarMouseClicked
        this.setState(VentanaPrincipal.ICONIFIED);
    }//GEN-LAST:event_lblMinimizarMouseClicked

    private void lblCerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCerrarMouseClicked
        int Boton = JOptionPane.YES_NO_OPTION;
        int Salir =JOptionPane.showConfirmDialog(null, "¿Desea salir?");
        if(Salir==YES_OPTION)System.exit(0);
    }//GEN-LAST:event_lblCerrarMouseClicked

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
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });
    }
    VentanaCliente vc= new VentanaCliente();
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btncerrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabelFondo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblCerrar;
    private javax.swing.JLabel lblMinimizar;
    // End of variables declaration//GEN-END:variables
}
