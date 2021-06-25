
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
 * @author marco
 */
public class VentanaLibro extends javax.swing.JFrame {
    String barra =File.separator;
    String ubicacion = System.getProperty("user.dir")+barra+"Registros de Libros"+barra;

    public VentanaLibro() {
        initComponents();
        this.setLocationRelativeTo(null);
        m=(DefaultTableModel) tblLibros.getModel();leerLibro();
    }
    
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        pnlPrincipal = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        txtLibro = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtAutor = new javax.swing.JTextField();
        txtEdicion = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblLibros = new javax.swing.JTable();
        lblLibro = new javax.swing.JLabel();
        lblAutor = new javax.swing.JLabel();
        lblEdicion = new javax.swing.JLabel();
        lblAñadir = new javax.swing.JLabel();
        lblVolver = new javax.swing.JLabel();
        lblCosto = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        txtCosto = new javax.swing.JTextField();
        lblMinimizar1 = new javax.swing.JLabel();
        lblSalir1 = new javax.swing.JLabel();
        lblBackground1 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(15, 15, 20));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlPrincipal.setOpaque(false);
        pnlPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSeparator1.setBackground(new java.awt.Color(252, 213, 68));
        jSeparator1.setForeground(new java.awt.Color(252, 213, 68));
        pnlPrincipal.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, 280, 10));

        jSeparator2.setBackground(new java.awt.Color(252, 213, 68));
        jSeparator2.setForeground(new java.awt.Color(252, 213, 68));
        pnlPrincipal.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, 280, 10));

        jSeparator4.setBackground(new java.awt.Color(252, 213, 68));
        jSeparator4.setForeground(new java.awt.Color(252, 213, 68));
        pnlPrincipal.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, 280, 10));

        txtLibro.setBackground(new java.awt.Color(15, 15, 20));
        txtLibro.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        txtLibro.setForeground(new java.awt.Color(252, 211, 114));
        txtLibro.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtLibro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtLibroMouseClicked(evt);
            }
        });
        txtLibro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLibroActionPerformed(evt);
            }
        });
        txtLibro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtLibroKeyPressed(evt);
            }
        });
        pnlPrincipal.add(txtLibro, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 70, 200, 30));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(252, 213, 68));
        jLabel1.setText("Ingrese los datos requeridos");
        pnlPrincipal.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 30, -1, -1));

        txtAutor.setBackground(new java.awt.Color(15, 15, 20));
        txtAutor.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        txtAutor.setForeground(new java.awt.Color(252, 211, 114));
        txtAutor.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtAutor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtAutorMouseClicked(evt);
            }
        });
        txtAutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAutorActionPerformed(evt);
            }
        });
        txtAutor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtAutorKeyPressed(evt);
            }
        });
        pnlPrincipal.add(txtAutor, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, 200, 30));

        txtEdicion.setBackground(new java.awt.Color(15, 15, 20));
        txtEdicion.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        txtEdicion.setForeground(new java.awt.Color(252, 211, 114));
        txtEdicion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtEdicion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtEdicionMouseClicked(evt);
            }
        });
        txtEdicion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEdicionActionPerformed(evt);
            }
        });
        pnlPrincipal.add(txtEdicion, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 150, 200, 30));

        tblLibros.setBackground(new java.awt.Color(252, 213, 68));
        tblLibros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Titulo", "Autor", "Edicion", "Costo"
            }
        ));
        jScrollPane1.setViewportView(tblLibros);

        pnlPrincipal.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 70, 500, 200));

        lblLibro.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblLibro.setForeground(new java.awt.Color(252, 213, 68));
        lblLibro.setText("TITULO");
        pnlPrincipal.add(lblLibro, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, 70, -1));

        lblAutor.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblAutor.setForeground(new java.awt.Color(252, 213, 68));
        lblAutor.setText("AUTOR");
        pnlPrincipal.add(lblAutor, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, 50, 20));

        lblEdicion.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblEdicion.setForeground(new java.awt.Color(252, 213, 68));
        lblEdicion.setText("EDICION");
        pnlPrincipal.add(lblEdicion, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, 70, -1));

        lblAñadir.setBackground(new java.awt.Color(252, 213, 68));
        lblAñadir.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        lblAñadir.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAñadir.setText("Añadir");
        lblAñadir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblAñadir.setOpaque(true);
        lblAñadir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblAñadirMouseClicked(evt);
            }
        });
        pnlPrincipal.add(lblAñadir, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 250, 150, 30));

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
        pnlPrincipal.add(lblVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 100, 30));

        lblCosto.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblCosto.setForeground(new java.awt.Color(252, 213, 68));
        lblCosto.setText("COSTO");
        pnlPrincipal.add(lblCosto, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, 70, -1));

        jSeparator3.setBackground(new java.awt.Color(252, 213, 68));
        jSeparator3.setForeground(new java.awt.Color(252, 213, 68));
        pnlPrincipal.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, 280, 10));

        txtCosto.setBackground(new java.awt.Color(15, 15, 20));
        txtCosto.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        txtCosto.setForeground(new java.awt.Color(252, 211, 114));
        txtCosto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtCosto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtCostoMouseClicked(evt);
            }
        });
        txtCosto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCostoActionPerformed(evt);
            }
        });
        pnlPrincipal.add(txtCosto, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 190, 200, 30));

        getContentPane().add(pnlPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 380));

        lblMinimizar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_Expand_Arrow_32px.png"))); // NOI18N
        lblMinimizar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMinimizar1MouseClicked(evt);
            }
        });
        getContentPane().add(lblMinimizar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 10, -1, -1));

        lblSalir1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_Delete_32px.png"))); // NOI18N
        lblSalir1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblSalir1MouseClicked(evt);
            }
        });
        getContentPane().add(lblSalir1, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 10, -1, -1));

        lblBackground1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Login_1.png"))); // NOI18N
        getContentPane().add(lblBackground1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 380));

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

    private void lblAñadirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAñadirMouseClicked
        
        String titulo=txtLibro.getText();
        String autor=txtAutor.getText();
        String edicion=txtEdicion.getText();
        String costo=txtEdicion.getText();
        
        if(titulo.equals("")){
            showMessageDialog(this,"Hay un espacio vacio"); lblLibro.setForeground(Color.red);
            txtLibro.requestFocus();return;
        }else lblLibro.setForeground(Color.yellow);
        //-------------------------------------------------------------
        if(autor.equals("")){
            showMessageDialog(this,"Hay un espacio vacio"); lblAutor.setForeground(Color.red);
            txtAutor.requestFocus();return;
        }else lblAutor.setForeground(Color.yellow);
        //-------------------------------------------------------------
        if(edicion.equals("")){
            showMessageDialog(this,"Hay un espacio vacio"); lblEdicion.setForeground(Color.red);
            txtEdicion.requestFocus();return;
        }else lblEdicion.setForeground(Color.yellow);
        //-------------------------------------------------------------
        
        if(costo.equals("")){
            showMessageDialog(this,"Hay un espacio vacio"); lblCosto.setForeground(Color.red);
            txtCosto.requestFocus();return;
        }else lblCosto.setForeground(Color.yellow);
         
        try{   
        double cost=Integer.parseInt(txtCosto.getText());
        }catch(NumberFormatException ex){
            showMessageDialog(this,"Costo en numeros ");txtCosto.setText("");txtCosto.requestFocus();return;
        }
        
        String R[]=new String[3];
        R[0]=txtLibro.getText();R[1]=txtAutor.getText();R[2]=txtEdicion.getText();R[3]=txtCosto.getText();
        m.addRow(R);
        L[l++]=new Libro(titulo,autor,edicion,Double.parseDouble(costo));
        try { //Flujo de caracteres para salida (escritura)
            java.io.FileWriter fcs=new java.io.FileWriter("LIBROS.TXT");
            String cad="";
            for (int i = 0; i < l; i++) 
                cad=cad+L[i].getTitulo()+"|"+L[i].getAutor()+"|"+L[i].getEdicion()+"|"+L[i].getCosto()+"\n";  
                
            fcs.write(cad);
            fcs.flush(); 
            
        } catch (FileNotFoundException ex) {
        
        }
        catch (IOException ex) {
         
        }
        
        txtLibro.setText("");txtAutor.setText("");txtEdicion.setText("");txtCosto.setText("");
    }//GEN-LAST:event_lblAñadirMouseClicked

    private void lblVolverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblVolverMouseClicked
        new VentanaPrincipal().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_lblVolverMouseClicked

    private void txtLibroKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtLibroKeyPressed
        if(evt.getKeyCode()==VK_ENTER) txtAutor.requestFocus();
    }//GEN-LAST:event_txtLibroKeyPressed

    private void txtAutorKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAutorKeyPressed
        if(evt.getKeyCode()==VK_ENTER) txtEdicion.requestFocus();
    }//GEN-LAST:event_txtAutorKeyPressed

    private void txtCostoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCostoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCostoActionPerformed

    private void txtLibroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtLibroMouseClicked
        txtLibro.setText("");
    }//GEN-LAST:event_txtLibroMouseClicked

    private void txtAutorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtAutorMouseClicked
        txtAutor.setText("");
    }//GEN-LAST:event_txtAutorMouseClicked

    private void txtEdicionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtEdicionMouseClicked
        txtEdicion.setText("");
    }//GEN-LAST:event_txtEdicionMouseClicked

    private void txtCostoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCostoMouseClicked
        txtCosto.setText("");
    }//GEN-LAST:event_txtCostoMouseClicked

    private void lblMinimizar1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMinimizar1MouseClicked
        this.setState(VentanaPrincipal.ICONIFIED);
    }//GEN-LAST:event_lblMinimizar1MouseClicked

    private void lblSalir1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSalir1MouseClicked
        try{
            int dialogButton= JOptionPane.YES_NO_OPTION;
            int result = JOptionPane.showConfirmDialog(null, "Desea cerra el sistema?","EXIT",dialogButton);
            if(result==0){
            System.exit(0);
            }
        }catch(Exception e){
            JOptionPane.showConfirmDialog(this, e);
        }
    }//GEN-LAST:event_lblSalir1MouseClicked
    
    private void leerLibro(){
            try {  
            java.io.FileReader fce=new java.io.FileReader("LIBROS.TXT");
            java.io.BufferedReader be=new java.io.BufferedReader(fce);
            String linea="";
            
            while(   (linea=be.readLine())  !=null ){
                String R[]=linea.split("\\|"); m.addRow(R);
                L[l++]=new Libro(R[0],R[1],R[2],Double.parseDouble(R[3]));
            }
        } catch (FileNotFoundException ex) {
        
        }
          catch (IOException ex) {
          
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
    private Libro L[]=new Libro[1000];
    private int l=0;  //indice o tope del array
    private DefaultTableModel m;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JLabel lblAutor;
    private javax.swing.JLabel lblAñadir;
    private javax.swing.JLabel lblBackground1;
    private javax.swing.JLabel lblCosto;
    private javax.swing.JLabel lblEdicion;
    private javax.swing.JLabel lblLibro;
    private javax.swing.JLabel lblMinimizar1;
    private javax.swing.JLabel lblSalir1;
    private javax.swing.JLabel lblVolver;
    private javax.swing.JPanel pnlPrincipal;
    private javax.swing.JTable tblLibros;
    private javax.swing.JTextField txtAutor;
    private javax.swing.JTextField txtCosto;
    private javax.swing.JTextField txtEdicion;
    private javax.swing.JTextField txtLibro;
    // End of variables declaration//GEN-END:variables
}
