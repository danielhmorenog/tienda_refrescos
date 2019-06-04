
package Interfaz;

import java.awt.Image;
import java.io.File;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
//import javafx.stage.FileChooser;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
//import com.mxrck.autocompleter.TextAutoCompleter;


public class ModificarProducto extends javax.swing.JDialog {
      File fichero;
    //FileChooser jfchCargarfoto;
    
    public ModificarProducto(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        //TextAutoCompleter text= new TextAutoCompleter(jtProducto);
        //TextAutoCompleter textAutoAcompleter = new TextAutoCompleter( jtCantidad );
cargar();
         getContentPane().setBackground(new java.awt.Color(178, 34, 34));
    }

     public void cargar()
    {
        try{
    		Class.forName("com.mysql.jdbc.Driver");
    		Connection conexion = DriverManager.getConnection("jdbc:mysql://sql10.freesqldatabase.com:3306/sql10292471", "sql10292471", "5smwscQGBg");
    		Statement s = conexion.createStatement();
    		ResultSet r = s.executeQuery("select * from productos;");
                jComboNOMBRE.removeAllItems();
                while(r.next())
                {
    		//jComboNOMBRE.addItem(r.getString("nit")+" "+(r.getString("nombre")));
                    jComboNOMBRE.addItem(r.getString("nombreProd1"));
                }
    		conexion.close();
    		}
    	catch(Exception x)
        {
    		JOptionPane.showMessageDialog(null,"Error "+x);
    	}
        
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jbmodificar = new javax.swing.JButton();
        jbbuscar = new javax.swing.JButton();
        jlfoto = new javax.swing.JLabel();
        jbmodificar1 = new javax.swing.JButton();
        jtCANTIDAD = new javax.swing.JTextField();
        jlcodigo = new javax.swing.JLabel();
        jlnombre = new javax.swing.JLabel();
        jComboNOMBRE = new javax.swing.JComboBox<>();
        jlcodigo1 = new javax.swing.JLabel();
        jlfoto1 = new javax.swing.JLabel();
        jtNOMBRE = new javax.swing.JTextField();
        jtPRECIO = new javax.swing.JTextField();
        jlnombre1 = new javax.swing.JLabel();

        jbmodificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes 2/editnote_edi_9512.png"))); // NOI18N
        jbmodificar.setText("Modificar");
        jbmodificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbmodificarActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("                                                                           MODIFICAR PRODUCTO\n");

        jbbuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes 2/1465798029_system-search.png"))); // NOI18N
        jbbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbbuscarActionPerformed(evt);
            }
        });

        jlfoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Usuario-Icono.jpg"))); // NOI18N
        jlfoto.setText("           Foto");
        jlfoto.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jbmodificar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes 2/editnote_edi_9512.png"))); // NOI18N
        jbmodificar1.setText("ATUALIZAR");
        jbmodificar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbmodificar1ActionPerformed(evt);
            }
        });

        jtCANTIDAD.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jtCANTIDAD.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtCANTIDADKeyPressed(evt);
            }
        });

        jlcodigo.setBackground(new java.awt.Color(255, 255, 255));
        jlcodigo.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jlcodigo.setForeground(new java.awt.Color(255, 255, 255));
        jlcodigo.setText("NOMBRE-PRODUCTO");

        jlnombre.setBackground(new java.awt.Color(255, 255, 255));
        jlnombre.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jlnombre.setForeground(new java.awt.Color(255, 255, 255));
        jlnombre.setText("PRECIO-PRODUCTO");

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

        jlcodigo1.setBackground(new java.awt.Color(255, 255, 255));
        jlcodigo1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jlcodigo1.setForeground(new java.awt.Color(255, 255, 255));
        jlcodigo1.setText("NOMBRE-PRODUCTO");

        jtNOMBRE.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jtNOMBRE.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtNOMBREKeyPressed(evt);
            }
        });

        jtPRECIO.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jtPRECIO.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtPRECIOKeyPressed(evt);
            }
        });

        jlnombre1.setBackground(new java.awt.Color(255, 255, 255));
        jlnombre1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jlnombre1.setForeground(new java.awt.Color(255, 255, 255));
        jlnombre1.setText("PRECIO-PRODUCTO");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlnombre)
                            .addComponent(jlcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jbmodificar1)
                            .addComponent(jtNOMBRE, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE)
                            .addComponent(jtCANTIDAD))
                        .addGap(83, 83, 83)
                        .addComponent(jlfoto1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jlnombre1)
                                .addGap(117, 117, 117)
                                .addComponent(jtPRECIO, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jlcodigo1, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboNOMBRE, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(53, 53, 53)))
                        .addComponent(jbbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addComponent(jlfoto, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(101, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jComboNOMBRE, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jlcodigo1))
                    .addComponent(jbbuscar))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtNOMBRE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlcodigo))
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtCANTIDAD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtPRECIO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlnombre1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jbmodificar1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(jlfoto, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(67, 67, 67)
                        .addComponent(jlfoto1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(51, 51, 51))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbmodificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbmodificarActionPerformed
     
        try
        {
          Class.forName("com.mysql.jdbc.Driver");
          Connection conexion=DriverManager.getConnection("jdbc:mysql://localhost/moto" ,"root","");
          //PreparedStatement ps= conexion.prepareStatement("UPDATE crearmoto SET PrecioProducto='"+jtCANTIDAD.getText()+"'WHERE placa='"+jComboBox1.getSelectedItem()+"'");
            PreparedStatement ps= conexion.prepareStatement("UPDATE productos SET nombreprod1='"+jtNOMBRE.getText()+"',cantidadpro1='"+jtCANTIDAD.getText()+"',preciopro1='"+jtPRECIO.getText()+"'WHERE nombreProd1='"+jComboNOMBRE.getSelectedItem()+"'");
          ps.executeUpdate();
          JOptionPane.showMessageDialog(null, "EL PRODUCTO "+jtNOMBRE.getText()+"FUE MODIFICADO CORRECTAMENTE");
          conexion.close();
        
      
        }
        
        catch(Exception e)
        {
          JOptionPane.showMessageDialog(null,"Error "+e);
        }
        
    }//GEN-LAST:event_jbmodificarActionPerformed

    private void jbmodificar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbmodificar1ActionPerformed

        try
        {
          Class.forName("com.mysql.jdbc.Driver");
          Connection conexion=DriverManager.getConnection("jdbc:mysql://sql10.freesqldatabase.com:3306/sql10292471", "sql10292471", "5smwscQGBg");
          //PreparedStatement ps= conexion.prepareStatement("UPDATE crearmoto SET PrecioProducto='"+jtCANTIDAD.getText()+"'WHERE placa='"+jComboBox1.getSelectedItem()+"'");
            PreparedStatement ps= conexion.prepareStatement("UPDATE productos SET nombreProd1='"+jtNOMBRE.getText()+"',cantidadProd1='"+jtCANTIDAD.getText()+"',precioProd1='"+jtPRECIO.getText()+"'WHERE nombreProd1='"+jComboNOMBRE.getSelectedItem()+"'");
          ps.executeUpdate();
          JOptionPane.showMessageDialog(null, "EL PRODUCTO "+jtNOMBRE.getText()+" FUE MODIFICADO CORRECTAMENTE");
          conexion.close();
        
      
        }
        
        catch(Exception e)
        {
          JOptionPane.showMessageDialog(null,"Error "+e);
        }
       
        jtNOMBRE.setText("");
        jtCANTIDAD.setText("");
        jtPRECIO.setText("");

    }//GEN-LAST:event_jbmodificar1ActionPerformed

    private void jtCANTIDADKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtCANTIDADKeyPressed
        if(evt.getKeyCode()==40)
        {
           // jtCantidad.requestFocus();
            System.out.println("Pressed "+evt.getKeyCode()) ;
        }
        if(evt.getKeyCode()==38)
        {
           // jtProducto.requestFocus();
            System.out.println("Pressed "+evt.getKeyCode()) ;
        }
    }//GEN-LAST:event_jtCANTIDADKeyPressed

    
    
    private void jComboNOMBREComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jComboNOMBREComponentHidden
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboNOMBREComponentHidden

    private void jComboNOMBREActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboNOMBREActionPerformed

        jComboNOMBRE.getSelectedItem();

    }//GEN-LAST:event_jComboNOMBREActionPerformed

    private void jtNOMBREKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtNOMBREKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtNOMBREKeyPressed

    private void jtPRECIOKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtPRECIOKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtPRECIOKeyPressed

    private void jbbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbbuscarActionPerformed

        ImageIcon foto;
        InputStream is;
        try{

            Class.forName("com.mysql.jdbc.Driver");
            Connection conexion = DriverManager.getConnection("jdbc:mysql://sql10.freesqldatabase.com:3306/sql10292471", "sql10292471", "5smwscQGBg");
            Statement s = conexion.createStatement();
            ResultSet r = s.executeQuery("select * from productos where nombreProd1="+"'"+jComboNOMBRE.getSelectedItem()+"'");

            while(r.next()){

                jtNOMBRE.setText(r.getObject(2)+"");
                jtCANTIDAD.setText(r.getObject(3)+"");
                jtPRECIO.setText(r.getObject(4)+"");
                jlfoto.setText(r.getObject(5)+"");

                foto=new ImageIcon(jlfoto.getText());

                Image img= foto.getImage();
                Image newimg=img.getScaledInstance(140, 170,java.awt.Image.SCALE_SMOOTH);

                ImageIcon newIcon=new ImageIcon(newimg);
                jlfoto.setIcon(newIcon);

            }
            conexion.close();

        }

        catch(Exception x)
        {
            JOptionPane.showMessageDialog(null,"CODIGO NO EXISTE "+x);
        }

    }//GEN-LAST:event_jbbuscarActionPerformed

    
    
    
    
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
            java.util.logging.Logger.getLogger(ModificarProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ModificarProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ModificarProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ModificarProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                ModificarProducto dialog = new ModificarProducto(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton jbbuscar;
    private javax.swing.JButton jbmodificar;
    private javax.swing.JButton jbmodificar1;
    private javax.swing.JLabel jlcodigo;
    private javax.swing.JLabel jlcodigo1;
    private javax.swing.JLabel jlfoto;
    private javax.swing.JLabel jlfoto1;
    private javax.swing.JLabel jlnombre;
    private javax.swing.JLabel jlnombre1;
    public javax.swing.JTextField jtCANTIDAD;
    public javax.swing.JTextField jtNOMBRE;
    public javax.swing.JTextField jtPRECIO;
    // End of variables declaration//GEN-END:variables
}
