package Interfaz;

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

public class CrearCliente extends javax.swing.JDialog {

    File fichero;

    //FileChooser jfchCargarfoto;
    public CrearCliente(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        getContentPane().setBackground(new java.awt.Color(178, 34, 34));

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jlcodigo = new javax.swing.JLabel();
        jlnombre = new javax.swing.JLabel();
        jtNombreCli = new javax.swing.JTextField();
        jbguardar = new javax.swing.JButton();
        jlfotoCli = new javax.swing.JLabel();
        jbfoto = new javax.swing.JButton();
        jtFecha1 = new javax.swing.JTextField();
        jtDirecionCli = new javax.swing.JTextField();
        jtFecha2 = new javax.swing.JTextField();
        jtFecha4 = new javax.swing.JTextField();
        jtFecha3 = new javax.swing.JTextField();
        jtFecha5 = new javax.swing.JTextField();
        jtFecha6 = new javax.swing.JTextField();
        jlfoto1 = new javax.swing.JLabel();
        jlcodigo1 = new javax.swing.JLabel();
        jtcedula = new javax.swing.JTextField();
        jtTelefonoCli = new javax.swing.JTextField();
        jlnombre1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("                                                                                     CREAR CLIENTE");
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(51, 51, 255));
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));

        jlcodigo.setBackground(new java.awt.Color(255, 255, 255));
        jlcodigo.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jlcodigo.setForeground(new java.awt.Color(255, 255, 255));
        jlcodigo.setText("NOMBRE COMPLETO");

        jlnombre.setBackground(new java.awt.Color(255, 255, 255));
        jlnombre.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jlnombre.setForeground(new java.awt.Color(255, 255, 255));
        jlnombre.setText("DIRECCIÓN");

        jtNombreCli.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jtNombreCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtNombreCliActionPerformed(evt);
            }
        });
        jtNombreCli.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtNombreCliKeyPressed(evt);
            }
        });

        jbguardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes 2/1462650033_Save.png"))); // NOI18N
        jbguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbguardarActionPerformed(evt);
            }
        });
        jbguardar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jbguardarKeyPressed(evt);
            }
        });

        jlfotoCli.setFont(new java.awt.Font("Tahoma", 0, 1)); // NOI18N
        jlfotoCli.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes 2/Usuario-Icono.jpg"))); // NOI18N
        jlfotoCli.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jbfoto.setText("AGREGAR FOTO");
        jbfoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbfotoActionPerformed(evt);
            }
        });

        jtFecha1.setFont(jtFecha1.getFont().deriveFont(jtFecha1.getFont().getSize()+3f));

        jtDirecionCli.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jtDirecionCli.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtDirecionCliKeyPressed(evt);
            }
        });

        jtFecha2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jtFecha4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jtFecha3.setFont(jtFecha3.getFont().deriveFont(jtFecha3.getFont().getSize()+3f));

        jtFecha5.setFont(jtFecha5.getFont().deriveFont(jtFecha5.getFont().getSize()+3f));

        jtFecha6.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jlcodigo1.setBackground(new java.awt.Color(255, 255, 255));
        jlcodigo1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jlcodigo1.setForeground(new java.awt.Color(255, 255, 255));
        jlcodigo1.setText("CEDULA ");

        jtcedula.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jtcedula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtcedulaKeyPressed(evt);
            }
        });

        jtTelefonoCli.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jtTelefonoCli.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtTelefonoCliKeyPressed(evt);
            }
        });

        jlnombre1.setBackground(new java.awt.Color(255, 255, 255));
        jlnombre1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jlnombre1.setForeground(new java.awt.Color(255, 255, 255));
        jlnombre1.setText("TELEFONO ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(412, 412, 412)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtFecha6, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jtFecha4)
                                .addComponent(jtFecha5))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(323, 323, 323)
                                .addComponent(jtFecha1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(79, 79, 79)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jlnombre)
                                            .addComponent(jlcodigo1, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jlnombre1))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(112, 112, 112)
                                                .addComponent(jbguardar))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(79, 79, 79)
                                                .addComponent(jtcedula, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jlcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jtNombreCli, javax.swing.GroupLayout.PREFERRED_SIZE, 419, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jtDirecionCli, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jtTelefonoCli, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(30, 30, 30)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(jlfotoCli)
                                                    .addComponent(jbfoto))))))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jtFecha3)
                                    .addComponent(jtFecha2))
                                .addGap(30, 30, 30))
                            .addComponent(jlfoto1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addComponent(jlfoto1)
                        .addGap(0, 0, 0)
                        .addComponent(jtFecha3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jtcedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlcodigo1))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlcodigo)
                            .addComponent(jtNombreCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jlnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jtDirecionCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(16, 16, 16)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jlnombre1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jtTelefonoCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jlfotoCli)))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbguardar)
                    .addComponent(jbfoto))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtFecha1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jtFecha2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(82, 82, 82)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jtFecha4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(103, 103, 103)
                                .addComponent(jtFecha6, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(141, 141, 141)
                                .addComponent(jtFecha5, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbguardarActionPerformed

        if (jtNombreCli.getText().equals("") || jtDirecionCli.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "TIENE UN CAMPO VACIO \n COMPLETE LOS CAMPOS");
            return;
        }

        try {

            Class.forName("com.mysql.jdbc.Driver");
            Connection conexion = DriverManager.getConnection("jdbc:mysql://sql10.freesqldatabase.com:3306/sql10294978", "sql10294978", "PaX2rTpupV");
            PreparedStatement ps = conexion.prepareStatement("insert into cliente values(?,?,?,?,?)");
            ps.setString(1, (jtcedula.getText()));
            ps.setString(2, (jtNombreCli.getText()));
            ps.setString(3, jtDirecionCli.getText());
            ps.setString(4, jtTelefonoCli.getText());
            ps.setObject(5, jlfoto1.getText());

            ps.execute();
            conexion.close();

            //FileOutputStream file = new FileOutputStream(""+jtPlaca.getText()+".xls");
            JOptionPane.showMessageDialog(null, "<html><h1>EL CLIENTE CON EL NOMBRE  " + jtNombreCli.getText() + " <html><h1>FUE CREADO CORRECTAMENTE");
            jtcedula.setText("");
            jtNombreCli.setText("");
            jtDirecionCli.setText("");
            jlfotoCli.setText(null);
            jtTelefonoCli.setText("");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ya existe un Cliente con el codigo " + e);
            System.out.println("error  " + e);

        }


    }//GEN-LAST:event_jbguardarActionPerformed

    private void jtNombreCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtNombreCliActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtNombreCliActionPerformed

    private void jtNombreCliKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtNombreCliKeyPressed
        if (evt.getKeyCode() == 40) {
            jtDirecionCli.requestFocus();
            System.out.println("Pressed " + evt.getKeyCode());
        }

    }//GEN-LAST:event_jtNombreCliKeyPressed

    private void jtDirecionCliKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtDirecionCliKeyPressed
        if (evt.getKeyCode() == 40) {

            System.out.println("Pressed " + evt.getKeyCode());
        }
        if (evt.getKeyCode() == 38) {
            jtNombreCli.requestFocus();
            System.out.println("Pressed " + evt.getKeyCode());
        }
    }//GEN-LAST:event_jtDirecionCliKeyPressed

    private void jbguardarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jbguardarKeyPressed
        if (evt.getKeyCode() == 10) {
            jbguardarActionPerformed(null);
            System.out.println("Pressed " + evt.getKeyCode());
            System.out.println("Pressed " + evt.getKeyCode());
        }
    }//GEN-LAST:event_jbguardarKeyPressed

    private void jbfotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbfotoActionPerformed
        int resultado;

        CargarFoto ventana = new CargarFoto();

        FileNameExtensionFilter filtro
                = new FileNameExtensionFilter("JPG y PNG", "jpg", "png");

        ventana.jFfoto.setFileFilter(filtro);

        resultado = ventana.jFfoto.showOpenDialog(null);

        if (JFileChooser.APPROVE_OPTION == resultado) {

            fichero = ventana.jFfoto.getSelectedFile();

            try {

                ImageIcon icon = new ImageIcon(fichero.toString());

                Icon icono = new ImageIcon(icon.getImage().
                        getScaledInstance(60, 70, 45));

                //foto.setText(null);
                jlfoto1.setText("" + fichero);
                System.out.println("fichero " + fichero);

                jlfotoCli.setIcon(icono);

            } catch (Exception ex) {

                JOptionPane.showMessageDialog(null,
                        "Error abriendo la imagen " + ex);

            }

        }
    }//GEN-LAST:event_jbfotoActionPerformed

    private void jtcedulaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtcedulaKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtcedulaKeyPressed

    private void jtTelefonoCliKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtTelefonoCliKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtTelefonoCliKeyPressed

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
            java.util.logging.Logger.getLogger(CrearCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CrearCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CrearCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CrearCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>


        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                CrearCliente dialog = new CrearCliente(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton jbfoto;
    private javax.swing.JButton jbguardar;
    private javax.swing.JLabel jlcodigo;
    private javax.swing.JLabel jlcodigo1;
    private javax.swing.JLabel jlfoto1;
    private javax.swing.JLabel jlfotoCli;
    private javax.swing.JLabel jlnombre;
    private javax.swing.JLabel jlnombre1;
    public javax.swing.JTextField jtDirecionCli;
    private javax.swing.JTextField jtFecha1;
    private javax.swing.JTextField jtFecha2;
    private javax.swing.JTextField jtFecha3;
    private javax.swing.JTextField jtFecha4;
    private javax.swing.JTextField jtFecha5;
    private javax.swing.JTextField jtFecha6;
    public javax.swing.JTextField jtNombreCli;
    public javax.swing.JTextField jtTelefonoCli;
    public javax.swing.JTextField jtcedula;
    // End of variables declaration//GEN-END:variables
}
