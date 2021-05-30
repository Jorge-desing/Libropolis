/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PC
 */
public class VentanaPedido extends javax.swing.JFrame{

    /**
     * Creates new form Pedido
     */
    public VentanaPedido() {
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
        jLabelLibro = new javax.swing.JLabel();
        lblCantidad = new javax.swing.JLabel();
        lblFecha = new javax.swing.JLabel();
        lblPago = new javax.swing.JLabel();
        cbxPago = new javax.swing.JCheckBox();
        lblTotal = new javax.swing.JLabel();
        txtTotal = new javax.swing.JTextField();
        txtCantidad = new javax.swing.JTextField();
        btnVolver = new javax.swing.JButton();
        btnSeleccionarLibros = new javax.swing.JButton();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        JLabelFondo = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelLibro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Libro.png"))); // NOI18N
        getContentPane().add(jLabelLibro, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 20, 130, 130));

        lblCantidad.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblCantidad.setText("CANTIDAD");
        getContentPane().add(lblCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, -1, -1));

        lblFecha.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblFecha.setText("FECHA ENTREGA");
        lblFecha.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(lblFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, -1, 20));

        lblPago.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblPago.setText("PAGÓ");
        getContentPane().add(lblPago, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, -1, -1));
        getContentPane().add(cbxPago, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 120, -1, -1));

        lblTotal.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblTotal.setText("MONTO TOTAL");
        getContentPane().add(lblTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, -1, -1));

        txtTotal.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(txtTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 80, 140, 20));

        txtCantidad.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtCantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCantidadActionPerformed(evt);
            }
        });
        getContentPane().add(txtCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 40, 140, -1));

        btnVolver.setText("Volver");
        btnVolver.setBorder(null);
        btnVolver.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });
        getContentPane().add(btnVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 310, 80, 30));

        btnSeleccionarLibros.setText("Seleccionar Libros");
        btnSeleccionarLibros.setBorder(null);
        btnSeleccionarLibros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeleccionarLibrosActionPerformed(evt);
            }
        });
        getContentPane().add(btnSeleccionarLibros, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 310, 110, 30));
        getContentPane().add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 160, 140, -1));

        JLabelFondo.setIcon(new javax.swing.ImageIcon("C:\\Users\\marco\\OneDrive\\Imágenes\\Libropolis\\Fondo.jpg")); // NOI18N
        getContentPane().add(JLabelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 480, 350));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCantidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCantidadActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        this.setVisible(false);
        new VentanaCliente().setVisible(true);
    }//GEN-LAST:event_btnVolverActionPerformed

    private void btnSeleccionarLibrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeleccionarLibrosActionPerformed
       vL.setVisible(true);
        this.setVisible(false); 
    }//GEN-LAST:event_btnSeleccionarLibrosActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPedido().setVisible(true);
            }
        });
    }
    Pedido p=new Pedido();
    VentanaLibro vL=new VentanaLibro();
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JLabelFondo;
    private javax.swing.JButton btnSeleccionarLibros;
    private javax.swing.JButton btnVolver;
    private javax.swing.JCheckBox cbxPago;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelLibro;
    private javax.swing.JLabel lblCantidad;
    private javax.swing.JLabel lblFecha;
    private javax.swing.JLabel lblPago;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables
}
