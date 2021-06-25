
import java.awt.Color;
import static java.awt.event.KeyEvent.VK_ENTER;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
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

    
    
    public VentanaCliente() {
        initComponents();
        this.setLocationRelativeTo(null);
        m=(DefaultTableModel) tblCliente.getModel();leerCliente();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlPrincipal = new javax.swing.JPanel();
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
        lbGuardar = new javax.swing.JLabel();
        lblMinimizar = new javax.swing.JLabel();
        lblSalir = new javax.swing.JLabel();
        lblBackground1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setSize(new java.awt.Dimension(1000, 500));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlPrincipal.setOpaque(false);
        pnlPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblNombre.setBackground(new java.awt.Color(15, 15, 20));
        lblNombre.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblNombre.setForeground(new java.awt.Color(252, 213, 68));
        lblNombre.setText("Nombre");
        pnlPrincipal.add(lblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 200, -1, -1));

        lblTelefono.setBackground(new java.awt.Color(15, 15, 20));
        lblTelefono.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblTelefono.setForeground(new java.awt.Color(252, 213, 68));
        lblTelefono.setText("Telefono");
        pnlPrincipal.add(lblTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 240, -1, -1));

        lblCedula.setBackground(new java.awt.Color(15, 15, 20));
        lblCedula.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblCedula.setForeground(new java.awt.Color(252, 213, 68));
        lblCedula.setText("Cedula");
        pnlPrincipal.add(lblCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 160, 50, -1));

        tblCliente.setBackground(new java.awt.Color(255, 204, 0));
        tblCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cedula", "Nombre", "Telefono"
            }
        ));
        tblCliente.setFocusable(false);
        jScrollPane1.setViewportView(tblCliente);

        pnlPrincipal.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 110, 500, 180));

        txtCedula.setBackground(new java.awt.Color(15, 15, 20));
        txtCedula.setForeground(new java.awt.Color(252, 213, 68));
        txtCedula.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtCedula.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtCedulaMouseClicked(evt);
            }
        });
        txtCedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCedulaActionPerformed(evt);
            }
        });
        txtCedula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCedulaKeyPressed(evt);
            }
        });
        pnlPrincipal.add(txtCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 150, 170, 30));

        txtTelefono.setBackground(new java.awt.Color(15, 15, 20));
        txtTelefono.setForeground(new java.awt.Color(252, 213, 68));
        txtTelefono.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtTelefono.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtTelefonoMouseClicked(evt);
            }
        });
        pnlPrincipal.add(txtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 230, 170, 30));

        txtNombre.setBackground(new java.awt.Color(15, 15, 20));
        txtNombre.setForeground(new java.awt.Color(252, 213, 68));
        txtNombre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtNombre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtNombreMouseClicked(evt);
            }
        });
        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });
        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNombreKeyPressed(evt);
            }
        });
        pnlPrincipal.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 190, 170, 30));

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(252, 213, 68));
        jLabel1.setText("Ingrese los datos requeridos");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        pnlPrincipal.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, -1, -1));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(252, 213, 68));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Bienvenido Cliente");
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(252, 213, 68)));
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        pnlPrincipal.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 80, 180, -1));

        jSeparator3.setBackground(new java.awt.Color(252, 213, 68));
        jSeparator3.setForeground(new java.awt.Color(252, 213, 68));
        pnlPrincipal.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, 280, 10));

        jSeparator4.setBackground(new java.awt.Color(252, 213, 68));
        jSeparator4.setForeground(new java.awt.Color(252, 213, 68));
        pnlPrincipal.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 260, 280, 10));

        jSeparator5.setBackground(new java.awt.Color(252, 213, 68));
        jSeparator5.setForeground(new java.awt.Color(252, 213, 68));
        pnlPrincipal.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 220, 280, 10));

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
        pnlPrincipal.add(lblVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, 100, 30));

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
        pnlPrincipal.add(lbGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 270, 90, 30));

        getContentPane().add(pnlPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 400));

        lblMinimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_Expand_Arrow_32px.png"))); // NOI18N
        lblMinimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMinimizarMouseClicked(evt);
            }
        });
        getContentPane().add(lblMinimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 10, -1, -1));

        lblSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_Delete_32px.png"))); // NOI18N
        lblSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblSalirMouseClicked(evt);
            }
        });
        getContentPane().add(lblSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 10, -1, -1));

        lblBackground1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Login_1.png"))); // NOI18N
        getContentPane().add(lblBackground1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        
    }//GEN-LAST:event_txtNombreActionPerformed

    private void txtCedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCedulaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCedulaActionPerformed

    private void lblVolverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblVolverMouseClicked
        this.setVisible(false);
        new VentanaPrincipal().setVisible(true);
    }//GEN-LAST:event_lblVolverMouseClicked

    private void lbGuardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbGuardarMouseClicked
        String n=txtNombre.getText();
        String c=txtCedula.getText();
        String num=txtTelefono.getText();
        
        try{ 
            if(n.equals("")){
            showMessageDialog(this,"Nombre vacio");lblNombre.setForeground(Color.red);
            txtNombre.requestFocus();return;
            }
            int cant=Integer.parseInt(txtCedula.getText());
            
            
            
            if(num.equals("")){
            showMessageDialog(this,"Telefono vacio"); lblTelefono.setForeground(Color.red);
            txtTelefono.requestFocus();return;
            }
            
        }catch(NumberFormatException ex){
            showMessageDialog(this,"Ingrese la cedula correctamente ");txtCedula.setText("");txtCedula.requestFocus();return;
        }
        try{ 
            
            int tel=Integer.parseInt(txtTelefono.getText());
            
        }catch(NumberFormatException ex){
            showMessageDialog(this,"Solo numeros");txtTelefono.setText("");txtTelefono.requestFocus();return;
        }
        
        String R[]=new String[3];
        R[0]=txtCedula.getText();R[1]=txtNombre.getText();R[2]=txtTelefono.getText();
        m.addRow(R);
        C[p++]=new Cliente(c,num,n);
        try { //Flujo de caracteres para salida (escritura)
            java.io.FileWriter fcs=new java.io.FileWriter("CLIENTES.TXT");
            String cad="";
            for (int i = 0; i < p; i++) 
                cad=cad+C[i].getCedula()+"|"+C[i].getNombre()+"|"+C[i].getTelefono()+"\n";  
                 
            fcs.write(cad);
            fcs.flush(); 
            
        } catch (FileNotFoundException ex) {
        
        }catch (IOException ex) { 
            
        }catch (NullPointerException ex) { 
            
        }

    }//GEN-LAST:event_lbGuardarMouseClicked

    private void txtNombreKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyPressed
        if(evt.getKeyCode()==VK_ENTER) txtTelefono.requestFocus();
    }//GEN-LAST:event_txtNombreKeyPressed

    private void txtCedulaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCedulaKeyPressed
        if(evt.getKeyCode()==VK_ENTER) txtNombre.requestFocus();
    }//GEN-LAST:event_txtCedulaKeyPressed

    private void txtCedulaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCedulaMouseClicked
        txtCedula.setText("");
    }//GEN-LAST:event_txtCedulaMouseClicked

    private void txtNombreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNombreMouseClicked
        txtNombre.setText("");
    }//GEN-LAST:event_txtNombreMouseClicked

    private void txtTelefonoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtTelefonoMouseClicked
        txtTelefono.setText("");
    }//GEN-LAST:event_txtTelefonoMouseClicked

    private void lblSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSalirMouseClicked
        try{
            int dialogButton= JOptionPane.YES_NO_OPTION;
            int result = JOptionPane.showConfirmDialog(null, "Desea cerra el sistema?","EXIT",dialogButton);
            if(result==0){
                System.exit(0);
            }
        }catch(Exception e){
            JOptionPane.showConfirmDialog(this, e);
        }

    }//GEN-LAST:event_lblSalirMouseClicked

    private void lblMinimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMinimizarMouseClicked
        this.setState(VentanaPrincipal.ICONIFIED);
    }//GEN-LAST:event_lblMinimizarMouseClicked

    private void leerCliente(){
            try {  
            java.io.FileReader fce=new java.io.FileReader("CLIENTES.TXT");
            java.io.BufferedReader be=new java.io.BufferedReader(fce);
            String linea="";
            
            while(   (linea=be.readLine())  !=null ){
                String R[]=linea.split("\\|"); m.addRow(R);
                C[p++]=new Cliente(R[0],R[1],R[2]);
            }
        } catch (FileNotFoundException ex) {
        
        } catch (IOException ex) {
          
        } catch (NullPointerException ex) {
            
        }
        
    }
    
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
    private Cliente C[ ]=new Cliente[100];
    private int p=0;
    private DefaultTableModel m;
    VentanaPedido vp= new VentanaPedido();
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JLabel lbGuardar;
    private javax.swing.JLabel lblBackground1;
    private javax.swing.JLabel lblCedula;
    private javax.swing.JLabel lblMinimizar;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblSalir;
    private javax.swing.JLabel lblTelefono;
    private javax.swing.JLabel lblVolver;
    private javax.swing.JPanel pnlPrincipal;
    private javax.swing.JTable tblCliente;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
