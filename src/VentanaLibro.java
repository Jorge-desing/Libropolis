
import java.awt.Color;
import java.io.File;
import java.util.Formatter;
import static javax.swing.JOptionPane.showMessageDialog;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author marco
 */
public class VentanaLibro extends javax.swing.JFrame {
    String barra =File.separator;
    String ubicacion = System.getProperty("user.dir")+barra+"Registros"+barra;

    public VentanaLibro() {
        initComponents();
        this.setLocationRelativeTo(null);
        m=(DefaultTableModel) tblLibros.getModel();
    }
    
    private void Crear(){
        String archivo = txtID.getText()+".txt";
        File crear_ubicacion = new File(ubicacion);
        File crear_archivo = new File(ubicacion+archivo);
        
        try{
        if(crear_archivo.exists()){
            showMessageDialog(rootPane, "El registro ya existe");
        }else{
            crear_ubicacion.mkdirs();
            Formatter crea = new Formatter(ubicacion+archivo);
            crea.format("%s\r\n%s\r\n%s\r\n","Titulo="+txtLibro.getText(),"Autor="+txtAutor.getText(),"Edicion="+txtEdicion.getText());
            crea.close();
            showMessageDialog(rootPane,"Archivo creado");
        }
        }catch (Exception e){
            showMessageDialog(rootPane,"No se pudo");
        }
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblLibro = new javax.swing.JLabel();
        lblAutor = new javax.swing.JLabel();
        jLabelImagenLibro = new javax.swing.JLabel();
        lblEdicion = new javax.swing.JLabel();
        txtLibro = new javax.swing.JTextField();
        txtAutor = new javax.swing.JTextField();
        txtEdicion = new javax.swing.JTextField();
        btnAñadirPedido = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblLibros = new javax.swing.JTable();
        btnVolver = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lblLibro1 = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblLibro.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblLibro.setText("TITULO");
        getContentPane().add(lblLibro, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 100, 50, -1));

        lblAutor.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblAutor.setText("AUTOR");
        getContentPane().add(lblAutor, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, 50, 20));

        jLabelImagenLibro.setText("jLabel4");
        getContentPane().add(jLabelImagenLibro, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 30, 140, 150));

        lblEdicion.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblEdicion.setText("EDICION");
        getContentPane().add(lblEdicion, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, 60, -1));

        txtLibro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLibroActionPerformed(evt);
            }
        });
        getContentPane().add(txtLibro, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 90, 160, 30));

        txtAutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAutorActionPerformed(evt);
            }
        });
        getContentPane().add(txtAutor, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 130, 160, 30));

        txtEdicion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEdicionActionPerformed(evt);
            }
        });
        getContentPane().add(txtEdicion, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 170, 160, 30));

        btnAñadirPedido.setText("Añadir al Pedido");
        btnAñadirPedido.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAñadirPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAñadirPedidoActionPerformed(evt);
            }
        });
        getContentPane().add(btnAñadirPedido, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 220, -1, -1));

        tblLibros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Titulo", "Autor", "Edicion"
            }
        ));
        jScrollPane1.setViewportView(tblLibros);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 450, 100));

        btnVolver.setText("Volver");
        btnVolver.setBorder(null);
        btnVolver.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });
        getContentPane().add(btnVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 390, 70, 20));

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel1.setText("Ingrese los datos requeridos");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, -1, -1));

        lblLibro1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblLibro1.setText("ID");
        getContentPane().add(lblLibro1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 60, 50, -1));

        txtID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIDActionPerformed(evt);
            }
        });
        getContentPane().add(txtID, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 50, 160, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtLibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLibroActionPerformed
        
    }//GEN-LAST:event_txtLibroActionPerformed

    private void txtEdicionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEdicionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEdicionActionPerformed

    private void txtAutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAutorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAutorActionPerformed

    private void btnAñadirPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAñadirPedidoActionPerformed
        Crear();
        String titulo=txtLibro.getText();
        String autor=txtAutor.getText();
        String edicion=txtEdicion.getText();
        if(titulo.equals("")){
            showMessageDialog(this,"Hay un espacio vacio"); lblLibro.setForeground(Color.red);
            txtLibro.requestFocus();return;
        }else lblLibro.setForeground(Color.black);
        //-------------------------------------------------------------
        if(autor.equals("")){
            showMessageDialog(this,"Hay un espacio vacio"); lblAutor.setForeground(Color.red);
            txtAutor.requestFocus();return;
        }else lblAutor.setForeground(Color.black);
        //-------------------------------------------------------------
        if(edicion.equals("")){
            showMessageDialog(this,"Hay un espacio vacio"); lblEdicion.setForeground(Color.red);
            txtEdicion.requestFocus();return;
        }else lblEdicion.setForeground(Color.black);
        
        L[l++]=new Libro(titulo,autor,edicion);
        Object O []=new Object [4]; O[0]=titulo; O[1]=autor; O[2]=edicion;
        m.addRow(O);
        txtLibro.setText("");txtAutor.setText("");txtEdicion.setText("");
        
        
         
    }//GEN-LAST:event_btnAñadirPedidoActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        this.setVisible(false);
        new VentanaPedido().setVisible(true);
    }//GEN-LAST:event_btnVolverActionPerformed

    private void txtIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIDActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaLibro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaLibro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaLibro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaLibro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaLibro().setVisible(true);
            }
        });
    }
    private Libro L[]=new Libro[10];
    private int l=0;  //indice o tope del array
    private DefaultTableModel m;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAñadirPedido;
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelImagenLibro;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAutor;
    private javax.swing.JLabel lblEdicion;
    private javax.swing.JLabel lblLibro;
    private javax.swing.JLabel lblLibro1;
    private javax.swing.JTable tblLibros;
    private javax.swing.JTextField txtAutor;
    private javax.swing.JTextField txtEdicion;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtLibro;
    // End of variables declaration//GEN-END:variables
}
