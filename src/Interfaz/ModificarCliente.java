package Interfaz;

import java.awt.Image;
import java.io.File;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class ModificarCliente extends javax.swing.JDialog {

    File fichero;

    public ModificarCliente(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        //TextAutoCompleter text= new TextAutoCompleter(jtProducto);
        //TextAutoCompleter textAutoAcompleter = new TextAutoCompleter( jtCantidad );
        cargar();
        getContentPane().setBackground(new java.awt.Color(178, 34, 34));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jbmodificar = new javax.swing.JButton();
        jlfoto = new javax.swing.JLabel();
        jbmodificar1 = new javax.swing.JButton();
        jtDIRECION = new javax.swing.JTextField();
        jlcodigo = new javax.swing.JLabel();
        jlnombre = new javax.swing.JLabel();
        jlcodigo1 = new javax.swing.JLabel();
        jbbuscarPRUEBA = new javax.swing.JButton();
        jlfoto1 = new javax.swing.JLabel();
        jtNOMBRE = new javax.swing.JTextField();
        jlnombre1 = new javax.swing.JLabel();
        jtTELEFONO = new javax.swing.JTextField();
        jComboNOMBRE = new javax.swing.JComboBox<>();

        jbmodificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes 2/editnote_edi_9512.png"))); // NOI18N
        jbmodificar.setText("Modificar");
        jbmodificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbmodificarActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("                                                                           MODIFICAR CLIENTE\n");

        jlfoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Usuario-Icono.jpg"))); // NOI18N
        jlfoto.setText("           Foto");
        jlfoto.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jbmodificar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes 2/editnote_edi_9512.png"))); // NOI18N
        jbmodificar1.setText("ACTUALIZAR");
        jbmodificar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbmodificar1ActionPerformed(evt);
            }
        });

        jtDIRECION.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jtDIRECION.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtDIRECIONKeyPressed(evt);
            }
        });

        jlcodigo.setBackground(new java.awt.Color(255, 255, 255));
        jlcodigo.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jlcodigo.setForeground(new java.awt.Color(255, 255, 255));
        jlcodigo.setText("NOMBRE DEL CLIENTE");

        jlnombre.setBackground(new java.awt.Color(255, 255, 255));
        jlnombre.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jlnombre.setForeground(new java.awt.Color(255, 255, 255));
        jlnombre.setText("DIRECCIÓN");

        jlcodigo1.setBackground(new java.awt.Color(255, 255, 255));
        jlcodigo1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jlcodigo1.setForeground(new java.awt.Color(255, 255, 255));
        jlcodigo1.setText("CEDULA");

        jbbuscarPRUEBA.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes 2/1465798029_system-search.png"))); // NOI18N
        jbbuscarPRUEBA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbbuscarPRUEBAActionPerformed(evt);
            }
        });

        jtNOMBRE.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jtNOMBRE.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtNOMBREKeyPressed(evt);
            }
        });

        jlnombre1.setBackground(new java.awt.Color(255, 255, 255));
        jlnombre1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jlnombre1.setForeground(new java.awt.Color(255, 255, 255));
        jlnombre1.setText("TELEFONO");

        jtTELEFONO.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jtTELEFONO.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtTELEFONOKeyPressed(evt);
            }
        });

        jComboNOMBRE.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                jComboNOMBREComponentHidden(evt);
            }
        });
        jComboNOMBRE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboNOMBREActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jlnombre1)
                                    .addComponent(jlnombre))
                                .addGap(158, 158, 158)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jtDIRECION, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jtTELEFONO, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(26, 26, 26)
                                .addComponent(jlfoto, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jbmodificar1)
                                .addGap(326, 326, 326)))
                        .addComponent(jlfoto1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlcodigo1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jComboNOMBRE, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbbuscarPRUEBA, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jtNOMBRE, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(235, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(62, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbbuscarPRUEBA, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jlcodigo1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jComboNOMBRE, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlcodigo)
                    .addComponent(jtNOMBRE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlfoto, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jlnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jtDIRECION, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(11, 11, 11)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jlnombre1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jtTELEFONO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbmodificar1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(168, 168, 168)
                        .addComponent(jlfoto1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(76, 76, 76))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbmodificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbmodificarActionPerformed

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conexion = DriverManager.getConnection("jdbc:mysql://sql10.freesqldatabase.com:3306/sql10291222", "sql10291222", "ue73H8XFU1");
            PreparedStatement ps = conexion.prepareStatement("UPDATE cliente SET nombre1='" + jtNOMBRE.getText() + "',direcion1='" + jtDIRECION.getText() + "',telefono1='" + jtTELEFONO.getText() + "'WHERE cedula1='" + jComboNOMBRE.getSelectedIndex() + "'");

            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "EL CLIENTE " + jtNOMBRE.getText() + " FUE MODIFICADO CORRECTAMENTE");
            conexion.close();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error " + e);
        }

    }//GEN-LAST:event_jbmodificarActionPerformed

    private void jbmodificar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbmodificar1ActionPerformed

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conexion = DriverManager.getConnection("jdbc:mysql://sql10.freesqldatabase.com:3306/sql10294978", "sql10294978", "PaX2rTpupV");
            PreparedStatement ps = conexion.prepareStatement("UPDATE cliente SET nombre1='" + jtNOMBRE.getText() + "',direcion1='" + jtDIRECION.getText() + "',telefono1='" + jtTELEFONO.getText() + "'WHERE cedula1='" + jComboNOMBRE.getSelectedItem() + "'");

            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "EL CLIENTE " + jtNOMBRE.getText() + " FUE MODIFICADO CORRECTAMENTE");
            conexion.close();

            jtNOMBRE.setText("");
            jtDIRECION.setText("");
            jtTELEFONO.setText("");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error " + e);
        }


    }//GEN-LAST:event_jbmodificar1ActionPerformed

    private void jtDIRECIONKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtDIRECIONKeyPressed
        if (evt.getKeyCode() == 40) {
            // jtCantidad.requestFocus();
            System.out.println("Pressed " + evt.getKeyCode());
        }
        if (evt.getKeyCode() == 38) {
            // jtProducto.requestFocus();
            System.out.println("Pressed " + evt.getKeyCode());
        }
    }//GEN-LAST:event_jtDIRECIONKeyPressed


    private void jbbuscarPRUEBAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbbuscarPRUEBAActionPerformed

        ImageIcon foto;
        InputStream is;
        try {

            Class.forName("com.mysql.jdbc.Driver");
            Connection conexion = DriverManager.getConnection("jdbc:mysql://sql10.freesqldatabase.com:3306/sql10294978", "sql10294978", "PaX2rTpupV");
            Statement s = conexion.createStatement();
            //ResultSet r = s.executeQuery("select NombreProducto from productosnuevos where Categorias="+"'"+jComboCategorias.getSelectedItem()+"'");
            ResultSet r = s.executeQuery("select * from cliente where cedula1=" + "'" + jComboNOMBRE.getSelectedItem() + "'");
            while (r.next()) {

                jtNOMBRE.setText(r.getObject(2) + "");
                jtDIRECION.setText(r.getObject(3) + "");
                jtTELEFONO.setText(r.getObject(4) + "");
                jlfoto.setText(r.getObject(5) + "");

                foto = new ImageIcon(jlfoto.getText());

                Image img = foto.getImage();
                Image newimg = img.getScaledInstance(140, 170, java.awt.Image.SCALE_SMOOTH);

                ImageIcon newIcon = new ImageIcon(newimg);
                jlfoto.setIcon(newIcon);

            }
            conexion.close();

        } catch (Exception x) {
            JOptionPane.showMessageDialog(null, "CODIGO NO EXISTE " + x);
        }


    }//GEN-LAST:event_jbbuscarPRUEBAActionPerformed

    private void jtNOMBREKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtNOMBREKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtNOMBREKeyPressed

    private void jtTELEFONOKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtTELEFONOKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtTELEFONOKeyPressed

    private void jComboNOMBREComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jComboNOMBREComponentHidden
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboNOMBREComponentHidden

    private void jComboNOMBREActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboNOMBREActionPerformed

        jComboNOMBRE.getSelectedItem();
    }//GEN-LAST:event_jComboNOMBREActionPerformed

    public void cargar() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conexion = DriverManager.getConnection("jdbc:mysql://sql10.freesqldatabase.com:3306/sql10294978", "sql10294978", "PaX2rTpupV");
            Statement s = conexion.createStatement();
            ResultSet r = s.executeQuery("select * from cliente;");
            jComboNOMBRE.removeAllItems();
            while (r.next()) {
                //jComboNOMBRE.addItem(r.getString("nit")+" "+(r.getString("nombre")));
                jComboNOMBRE.addItem(r.getString("cedula1"));
            }
            conexion.close();
        } catch (Exception x) {
            JOptionPane.showMessageDialog(null, "Error " + x);
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
            java.util.logging.Logger.getLogger(ModificarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ModificarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ModificarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ModificarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ModificarCliente dialog = new ModificarCliente(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jComboNOMBRE;
    private javax.swing.JButton jbbuscarPRUEBA;
    private javax.swing.JButton jbmodificar;
    private javax.swing.JButton jbmodificar1;
    private javax.swing.JLabel jlcodigo;
    private javax.swing.JLabel jlcodigo1;
    private javax.swing.JLabel jlfoto;
    private javax.swing.JLabel jlfoto1;
    private javax.swing.JLabel jlnombre;
    private javax.swing.JLabel jlnombre1;
    public javax.swing.JTextField jtDIRECION;
    public javax.swing.JTextField jtNOMBRE;
    public javax.swing.JTextField jtTELEFONO;
    // End of variables declaration//GEN-END:variables
}
