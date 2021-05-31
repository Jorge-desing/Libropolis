
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
 * @author PC
 */
public class VentanaCliente extends javax.swing.JFrame {

    String barra =File.separator;
    String ubicacion = System.getProperty("user.dir")+barra+"Registros de Clientes"+barra;
    
    public VentanaCliente() {
        initComponents();
        this.setLocationRelativeTo(null);
        m=(DefaultTableModel) tblCliente.getModel();
    }

    private void Crear(){
        String archivo = txtNombre.getText()+".txt";
        File crear_ubicacion = new File(ubicacion);
        File crear_archivo = new File(ubicacion+archivo);
        
        try{
        if(crear_archivo.exists()){
            showMessageDialog(rootPane, "El registro ya existe");
        }else{
            crear_ubicacion.mkdirs();
            Formatter crea = new Formatter(ubicacion+archivo);
            crea.format("%s\r\n%s\r\n%s\r\n","Titulo="+txtNombre.getText(),"Autor="+txtCedula.getText(),"Edicion="+txtTelefono.getText());
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
        lblNombre = new javax.swing.JLabel();
        lblTelefono = new javax.swing.JLabel();
        lblCedula = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCliente = new javax.swing.JTable();
        txtCedula = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        lblVolver = new javax.swing.JLabel();
        lblPedir = new javax.swing.JLabel();
        lbGuardar = new javax.swing.JLabel();
        lblMinimizar = new javax.swing.JLabel();
        lblCerrar = new javax.swing.JLabel();
        lblFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(15, 15, 20));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblNombre.setBackground(new java.awt.Color(15, 15, 20));
        lblNombre.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblNombre.setForeground(new java.awt.Color(252, 213, 68));
        lblNombre.setText("Nombre");
        jPanel1.add(lblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, -1, -1));

        lblTelefono.setBackground(new java.awt.Color(15, 15, 20));
        lblTelefono.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblTelefono.setForeground(new java.awt.Color(252, 213, 68));
        lblTelefono.setText("Telefono");
        jPanel1.add(lblTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 210, -1, -1));

        lblCedula.setBackground(new java.awt.Color(15, 15, 20));
        lblCedula.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblCedula.setForeground(new java.awt.Color(252, 213, 68));
        lblCedula.setText("Cedula");
        jPanel1.add(lblCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 170, 50, -1));

        tblCliente.setBackground(new java.awt.Color(15, 15, 20));
        tblCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Cedula", "Telefono"
            }
        ));
        tblCliente.setFocusable(false);
        jScrollPane1.setViewportView(tblCliente);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, 420, 110));

        txtCedula.setBackground(new java.awt.Color(15, 15, 20));
        txtCedula.setForeground(new java.awt.Color(252, 213, 68));
        txtCedula.setText("Ingrese su cedula");
        txtCedula.setBorder(null);
        txtCedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCedulaActionPerformed(evt);
            }
        });
        jPanel1.add(txtCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 170, 170, 20));

        txtTelefono.setBackground(new java.awt.Color(15, 15, 20));
        txtTelefono.setForeground(new java.awt.Color(252, 213, 68));
        txtTelefono.setText("Ingrese su número telefonico");
        txtTelefono.setBorder(null);
        jPanel1.add(txtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 210, 170, 20));

        txtNombre.setBackground(new java.awt.Color(15, 15, 20));
        txtNombre.setForeground(new java.awt.Color(252, 213, 68));
        txtNombre.setText("Ingrese su nombre");
        txtNombre.setBorder(null);
        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });
        jPanel1.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 130, 170, 20));

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(252, 213, 68));
        jLabel1.setText("Ingrese los datos requeridos");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 80, -1, -1));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(252, 213, 68));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Bienvenido Cliente");
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(252, 213, 68)));
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 50, 180, -1));

        jSeparator3.setBackground(new java.awt.Color(252, 213, 68));
        jSeparator3.setForeground(new java.awt.Color(252, 213, 68));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, 280, 10));

        jSeparator4.setBackground(new java.awt.Color(252, 213, 68));
        jSeparator4.setForeground(new java.awt.Color(252, 213, 68));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 230, 280, 10));

        jSeparator5.setBackground(new java.awt.Color(252, 213, 68));
        jSeparator5.setForeground(new java.awt.Color(252, 213, 68));
        jPanel1.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 190, 280, 10));

        lblVolver.setBackground(new java.awt.Color(252, 213, 68));
        lblVolver.setFont(new java.awt.Font("Dialog", 1, 17)); // NOI18N
        lblVolver.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblVolver.setText("Volver");
        lblVolver.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblVolver.setOpaque(true);
        lblVolver.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblVolverMouseClicked(evt);
            }
        });
        jPanel1.add(lblVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 450, 100, 30));

        lblPedir.setBackground(new java.awt.Color(252, 213, 68));
        lblPedir.setFont(new java.awt.Font("Dialog", 1, 17)); // NOI18N
        lblPedir.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPedir.setText("Pedir Libros");
        lblPedir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblPedir.setOpaque(true);
        lblPedir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblPedirMouseClicked(evt);
            }
        });
        jPanel1.add(lblPedir, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 450, 130, 30));

        lbGuardar.setBackground(new java.awt.Color(252, 213, 68));
        lbGuardar.setFont(new java.awt.Font("Dialog", 1, 17)); // NOI18N
        lbGuardar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbGuardar.setText("Guardar");
        lbGuardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbGuardar.setOpaque(true);
        lbGuardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbGuardarMouseClicked(evt);
            }
        });
        jPanel1.add(lbGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 270, 90, 30));

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
        jPanel1.add(lblMinimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 10, 30, 20));

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
        jPanel1.add(lblCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 10, 40, 20));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 0, 440, 490));

        lblFondo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Menú 21x29.7 сm.gif"))); // NOI18N
        lblFondo.setText("jLabel2");
        getContentPane().add(lblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 490));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void txtCedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCedulaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCedulaActionPerformed

    private void lblVolverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblVolverMouseClicked
        this.setVisible(false);
        new VentanaPrincipal().setVisible(true);
    }//GEN-LAST:event_lblVolverMouseClicked

    private void lblPedirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPedirMouseClicked
        this.setVisible(false);
        new VentanaPedido().setVisible(true);
    }//GEN-LAST:event_lblPedirMouseClicked

    private void lbGuardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbGuardarMouseClicked
        Crear();
        String n=txtNombre.getText();
        String c=txtCedula.getText();
        String num=txtTelefono.getText();
        /*
        if(n.equals("")){
            showMessageDialog(this,"Nombre vacio"); lblNombre.setForeground(Color.red);
            txtNombre.requestFocus();return;
        }else lblNombre.setForeground(Color.black);
        //-------------------------------------------------------------
        if(c.equals("")){
            showMessageDialog(this,"Cedula vacia"); lblCedula.setForeground(Color.red);
            txtCedula.requestFocus();return;
        }else lblCedula.setForeground(Color.black);
        //-------------------------------------------------------------
        if(num.equals("")){
            showMessageDialog(this,"Telefono vacio"); lblTelefono.setForeground(Color.red);
            txtTelefono.requestFocus();return;
        }else lblTelefono.setForeground(Color.black);
        */
        
        C[p++]=new Cliente(Integer.parseInt(c),num,n);
        Object O []=new Object [3]; O[0]=n; O[1]=c; O[2]=num;
        m.addRow(O);
        txtNombre.setText("");txtTelefono.setText("");txtCedula.setText("");
    }//GEN-LAST:event_lbGuardarMouseClicked

    private void lblMinimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMinimizarMouseClicked
        this.setState(VentanaPrincipal.ICONIFIED);
    }//GEN-LAST:event_lblMinimizarMouseClicked

    private void lblCerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCerrarMouseClicked
        int Boton = JOptionPane.YES_NO_OPTION;
        int Salir =JOptionPane.showConfirmDialog(null, "¿Desea salir?","Salir",2,3);
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
            java.util.logging.Logger.getLogger(VentanaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaCliente().setVisible(true);
            }
        });
    }
    private Cliente C[ ]=new Cliente[1000];
    private int p=0;
    private DefaultTableModel m;
    VentanaPedido vp= new VentanaPedido();
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JLabel lbGuardar;
    private javax.swing.JLabel lblCedula;
    private javax.swing.JLabel lblCerrar;
    private javax.swing.JLabel lblFondo;
    private javax.swing.JLabel lblMinimizar;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblPedir;
    private javax.swing.JLabel lblTelefono;
    private javax.swing.JLabel lblVolver;
    private javax.swing.JTable tblCliente;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
