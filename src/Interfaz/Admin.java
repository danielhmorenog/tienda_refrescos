package Interfaz;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class Admin extends javax.swing.JDialog {

    public Menu parent;
    String codi, nombre;
    String cap = "";
    String usuarioo = "";
    static String user = "";
    Statement s;

    String guardar;

    String passw = "";

    public Admin(Menu parent, boolean modal) {
        super(parent, modal);
        this.parent = parent;

        initComponents();
        getContentPane().setBackground(new java.awt.Color(178, 34, 34));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jlusuario = new javax.swing.JLabel();
        jlcontraseña = new javax.swing.JLabel();
        jtusuario = new javax.swing.JTextField();
        jbAceptar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPcontraseña = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("                 LOGEO DE USUARIO ");
        setBackground(javax.swing.UIManager.getDefaults().getColor("RadioButtonMenuItem.selectionBackground"));

        jlusuario.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jlusuario.setForeground(new java.awt.Color(255, 255, 255));
        jlusuario.setText("Usuario");

        jlcontraseña.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jlcontraseña.setForeground(new java.awt.Color(255, 255, 255));
        jlcontraseña.setText("Contraseña");

        jtusuario.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jtusuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtusuarioKeyPressed(evt);
            }
        });

        jbAceptar.setText("Aceptar");
        jbAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAceptarActionPerformed(evt);
            }
        });
        jbAceptar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jbAceptarKeyPressed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes 2/1.jpg"))); // NOI18N

        jPcontraseña.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jPcontraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPcontraseñaActionPerformed(evt);
            }
        });
        jPcontraseña.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jPcontraseñaKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(13, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jlusuario)
                                .addGap(36, 36, 36))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jlcontraseña)
                                .addGap(18, 18, 18)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jtusuario, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                            .addComponent(jPcontraseña)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(jbAceptar)))
                .addGap(28, 28, 28))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlusuario)
                            .addComponent(jtusuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlcontraseña)
                            .addComponent(jPcontraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jbAceptar))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAceptarActionPerformed
        try {
            if (jPcontraseña.getText().equals("") || jtusuario.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Tiene un campo vacio \n Complete el campo");
                return;
            }

            Class.forName("com.mysql.jdbc.Driver");
            try (Connection conexion = DriverManager.getConnection("jdbc:mysql://sql10.freesqldatabase.com:3306/sql10294978", "sql10294978", "PaX2rTpupV")) {
                Statement s = conexion.createStatement();
                ResultSet r = s.executeQuery("select usurio1,contraseña1 from admin1 where contraseña1=" + "'" + jPcontraseña.getText() + "'" + " and usurio1=" + "'" + jtusuario.getText() + "'");
                // ResultSet r = s.executeQuery("select Codigo,contraseña from admin where contraseña="+"'"+jPcontraseña.getText()+"'");
                while (r.next()) {

                    // cap=r.getString(1);
                    usuarioo = r.getString(1);
                    user = r.getString(2);

                    System.out.println("contraseña " + user);
                    System.out.println("usuario " + usuarioo);

                }
                if (user.equals(jPcontraseña.getText()) && usuarioo.equals(jtusuario.getText())) {
                    this.setVisible(false);
                    JOptionPane.showMessageDialog(null, "Logeo Exitoso ' Administrador '");

                    Menu menu = new Menu();
                    menu.setSize(863, 367);
                    menu.setVisible(true);
                    menu.setResizable(false);
                    menu.setLocationRelativeTo(null);

                    menu.pack();

                } else {
                    JOptionPane.showMessageDialog(null, "Usuario o contraseña \n del Admin es Incorrecta  ");
                    jtusuario.setText("");
                    jPcontraseña.setText("");
                }
            }
        } catch (ClassNotFoundException | SQLException | HeadlessException x) {
            JOptionPane.showMessageDialog(null, "Erroraaa " + x.getMessage());
        }
    }//GEN-LAST:event_jbAceptarActionPerformed


    private void jPcontraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPcontraseñaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPcontraseñaActionPerformed

    private void jbAceptarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jbAceptarKeyPressed

        if (evt.getKeyCode() == 10) {
            jbAceptarActionPerformed(null);
            System.out.println("Pressed " + evt.getKeyCode());
        }
        if (evt.getKeyCode() == 109) {
            jPcontraseña.requestFocus();
            System.out.println("Pressed " + evt.getKeyCode());
        }
    }//GEN-LAST:event_jbAceptarKeyPressed

    private void jPcontraseñaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPcontraseñaKeyPressed
        if (evt.getKeyCode() == 38) {
            jtusuario.requestFocus();
            System.out.println("Pressed " + evt.getKeyCode());
        }
        if (evt.getKeyCode() == 40) {
            jbAceptar.requestFocus();
            System.out.println("Pressed " + evt.getKeyCode());
        }
        if (evt.getKeyCode() == 10) {
            //jPcontraseña.requestFocus();
            jbAceptarActionPerformed(null);
            int tecla = evt.getKeyCode();
            System.out.println("Pressed " + evt.getKeyCode() + " " + tecla);
        }
    }//GEN-LAST:event_jPcontraseñaKeyPressed

    private void jtusuarioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtusuarioKeyPressed
        if (evt.getKeyCode() == 40) {
            jPcontraseña.requestFocus();

            System.out.println("Pressed " + evt.getKeyCode());
        }

    }//GEN-LAST:event_jtusuarioKeyPressed

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
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
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
                Admin dialog = new Admin(new Menu(), true);
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPasswordField jPcontraseña;
    private javax.swing.JButton jbAceptar;
    private javax.swing.JLabel jlcontraseña;
    private javax.swing.JLabel jlusuario;
    private javax.swing.JTextField jtusuario;
    // End of variables declaration//GEN-END:variables
}
