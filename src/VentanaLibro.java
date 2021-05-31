
import java.awt.Color;
import java.io.File;
import java.util.Formatter;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.YES_OPTION;
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
    String ubicacion = System.getProperty("user.dir")+barra+"Registros de Libros"+barra;

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

        jPanel1 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        lblMinimizar = new javax.swing.JLabel();
        lblCerrar = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        txtLibro = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtAutor = new javax.swing.JTextField();
        txtEdicion = new javax.swing.JTextField();
        btnAñadirPedido = new javax.swing.JButton();
        lblLibro1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblLibros = new javax.swing.JTable();
        lblLibro = new javax.swing.JLabel();
        lblAutor = new javax.swing.JLabel();
        lblEdicion = new javax.swing.JLabel();
        btnVolver = new javax.swing.JButton();
        lblFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(15, 15, 20));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSeparator1.setBackground(new java.awt.Color(252, 213, 68));
        jSeparator1.setForeground(new java.awt.Color(252, 213, 68));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, 280, 10));

        jSeparator2.setBackground(new java.awt.Color(252, 213, 68));
        jSeparator2.setForeground(new java.awt.Color(252, 213, 68));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, 280, 10));

        jSeparator3.setBackground(new java.awt.Color(252, 213, 68));
        jSeparator3.setForeground(new java.awt.Color(252, 213, 68));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, 280, 10));

        jSeparator4.setBackground(new java.awt.Color(252, 213, 68));
        jSeparator4.setForeground(new java.awt.Color(252, 213, 68));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 171, 280, 10));

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
        jPanel1.add(lblMinimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 10, 30, 20));

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
        jPanel1.add(lblCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 10, 40, 20));

        txtID.setBackground(new java.awt.Color(15, 15, 20));
        txtID.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        txtID.setForeground(new java.awt.Color(252, 211, 114));
        txtID.setText("Ingrese el ID");
        txtID.setBorder(null);
        txtID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIDActionPerformed(evt);
            }
        });
        jPanel1.add(txtID, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 60, 200, 30));

        txtLibro.setBackground(new java.awt.Color(15, 15, 20));
        txtLibro.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        txtLibro.setForeground(new java.awt.Color(252, 211, 114));
        txtLibro.setText("Ingrese el Titulo del Libro");
        txtLibro.setBorder(null);
        txtLibro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLibroActionPerformed(evt);
            }
        });
        jPanel1.add(txtLibro, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 100, 200, 30));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(252, 213, 68));
        jLabel1.setText("Ingrese los datos requeridos");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 30, -1, -1));

        txtAutor.setBackground(new java.awt.Color(15, 15, 20));
        txtAutor.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        txtAutor.setForeground(new java.awt.Color(252, 211, 114));
        txtAutor.setText("Ingrese su Autor");
        txtAutor.setBorder(null);
        txtAutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAutorActionPerformed(evt);
            }
        });
        jPanel1.add(txtAutor, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 140, 200, 30));

        txtEdicion.setBackground(new java.awt.Color(15, 15, 20));
        txtEdicion.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        txtEdicion.setForeground(new java.awt.Color(252, 211, 114));
        txtEdicion.setText("Ingrese su Edicion");
        txtEdicion.setBorder(null);
        txtEdicion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEdicionActionPerformed(evt);
            }
        });
        jPanel1.add(txtEdicion, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 180, 200, 30));

        btnAñadirPedido.setBackground(new java.awt.Color(252, 213, 68));
        btnAñadirPedido.setFont(new java.awt.Font("Dialog", 1, 17)); // NOI18N
        btnAñadirPedido.setText("Añadir al Pedido");
        btnAñadirPedido.setBorder(null);
        btnAñadirPedido.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAñadirPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAñadirPedidoActionPerformed(evt);
            }
        });
        jPanel1.add(btnAñadirPedido, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 230, -1, -1));

        lblLibro1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblLibro1.setForeground(new java.awt.Color(252, 213, 68));
        lblLibro1.setText("ID");
        jPanel1.add(lblLibro1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, 50, -1));

        tblLibros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Titulo", "Autor", "Edicion"
            }
        ));
        jScrollPane1.setViewportView(tblLibros);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 450, 100));

        lblLibro.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblLibro.setForeground(new java.awt.Color(252, 213, 68));
        lblLibro.setText("TITULO");
        jPanel1.add(lblLibro, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 70, -1));

        lblAutor.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblAutor.setForeground(new java.awt.Color(252, 213, 68));
        lblAutor.setText("AUTOR");
        jPanel1.add(lblAutor, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, 50, 20));

        lblEdicion.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblEdicion.setForeground(new java.awt.Color(252, 213, 68));
        lblEdicion.setText("EDICION");
        jPanel1.add(lblEdicion, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, 70, -1));

        btnVolver.setBackground(new java.awt.Color(252, 213, 68));
        btnVolver.setFont(new java.awt.Font("Dialog", 1, 17)); // NOI18N
        btnVolver.setText("Volver");
        btnVolver.setBorder(null);
        btnVolver.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });
        jPanel1.add(btnVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, 70, 20));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 0, 490, 430));

        lblFondo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Menú 21x29.7 сm.gif"))); // NOI18N
        lblFondo.setText("jLabel2");
        getContentPane().add(lblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 490, 430));

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

    private void txtIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIDActionPerformed

    private void lblMinimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMinimizarMouseClicked
        this.setState(VentanaPrincipal.ICONIFIED);
    }//GEN-LAST:event_lblMinimizarMouseClicked

    private void lblCerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCerrarMouseClicked
        int Boton = JOptionPane.YES_NO_OPTION;
        int Salir =JOptionPane.showConfirmDialog(null, "¿Desea salir?","Salir",2,3);
        if(Salir==YES_OPTION)System.exit(0);
    }//GEN-LAST:event_lblCerrarMouseClicked

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        new VentanaPedido().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnVolverActionPerformed

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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JLabel lblAutor;
    private javax.swing.JLabel lblCerrar;
    private javax.swing.JLabel lblEdicion;
    private javax.swing.JLabel lblFondo;
    private javax.swing.JLabel lblLibro;
    private javax.swing.JLabel lblLibro1;
    private javax.swing.JLabel lblMinimizar;
    private javax.swing.JTable tblLibros;
    private javax.swing.JTextField txtAutor;
    private javax.swing.JTextField txtEdicion;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtLibro;
    // End of variables declaration//GEN-END:variables
}
