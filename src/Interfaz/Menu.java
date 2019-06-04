
package Interfaz;

import com.sun.xml.internal.txw2.Document;
import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;


public class Menu extends javax.swing.JFrame {
     Calendar fecha;
    int res;
    int sol;
    String fechas;
    
    
    public Menu() {
        initComponents();
        fecha = new GregorianCalendar();
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Barra = new javax.swing.JMenuBar();
        Cliente = new javax.swing.JMenu();
        CrearCLiente = new javax.swing.JMenuItem();
        ModificarCliente = new javax.swing.JMenuItem();
        Cliente1 = new javax.swing.JMenu();
        CrearCLiente1 = new javax.swing.JMenuItem();
        ModificarCliente1 = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jiHistorialCliente = new javax.swing.JMenuItem();
        jmregistro = new javax.swing.JMenu();
        jiregistro = new javax.swing.JMenuItem();

        setTitle("                                                                                                                                                              MENÚ VENTAS ");

        Cliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes 2/1465797433_Manager.png"))); // NOI18N
        Cliente.setText("CLIENTES");

        CrearCLiente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes 2/1465797433_Manager.png"))); // NOI18N
        CrearCLiente.setText("CREAR CIENTES");
        CrearCLiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CrearCLienteActionPerformed(evt);
            }
        });
        Cliente.add(CrearCLiente);

        ModificarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes 2/1465850453_user.png"))); // NOI18N
        ModificarCliente.setText("MODIFICAR CLIENTES");
        ModificarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModificarClienteActionPerformed(evt);
            }
        });
        Cliente.add(ModificarCliente);

        Barra.add(Cliente);

        Cliente1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes 2/1465848570_login.png"))); // NOI18N
        Cliente1.setText("PRODUCTOS");

        CrearCLiente1.setText("CREAR PRODUCTOS");
        CrearCLiente1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CrearCLiente1ActionPerformed(evt);
            }
        });
        Cliente1.add(CrearCLiente1);

        ModificarCliente1.setText("MODIFICAR PRODUCTOS");
        ModificarCliente1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModificarCliente1ActionPerformed(evt);
            }
        });
        Cliente1.add(ModificarCliente1);

        Barra.add(Cliente1);

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes 2/1465850453_user.png"))); // NOI18N
        jMenu1.setText("FACTURACIÓN DE PRODUCTOS");

        jiHistorialCliente.setText("FACTURACIÓN DE PRODUCTOS");
        jiHistorialCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jiHistorialClienteActionPerformed(evt);
            }
        });
        jMenu1.add(jiHistorialCliente);

        Barra.add(jMenu1);

        jmregistro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes 2/1465850516_lock.png"))); // NOI18N
        jmregistro.setText("INVENTARIO DE VENTAS");

        jiregistro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes 2/1465850516_lock.png"))); // NOI18N
        jiregistro.setText("INVENTARIOS DE VENTAS");
        jiregistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jiregistroActionPerformed(evt);
            }
        });
        jmregistro.add(jiregistro);

        Barra.add(jmregistro);

        setJMenuBar(Barra);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 863, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 359, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ModificarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificarClienteActionPerformed
        ModificarCliente modi=new ModificarCliente(this,true); 
        modi.setSize(870,400);
        modi.setLocationRelativeTo(null);
        modi.setVisible(true);
        
    }//GEN-LAST:event_ModificarClienteActionPerformed
//
    private void jiregistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jiregistroActionPerformed
        
        
         AdminInventario admin=new AdminInventario(null,true); 
        
        admin.setSize(400,200);
        admin.setLocationRelativeTo(null);
        admin.setResizable(false);
        admin.setVisible(true);
        admin.getContentPane().setBackground(new Color(0,0,0));     

   
    }//GEN-LAST:event_jiregistroActionPerformed

    private void jiHistorialClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jiHistorialClienteActionPerformed
       Historial modi=new Historial(this,true); 
       modi.setSize(1250,650);
       modi.setLocationRelativeTo(null);
       modi.setVisible(true);
    }//GEN-LAST:event_jiHistorialClienteActionPerformed

    private void CrearCLienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CrearCLienteActionPerformed

        CrearCliente cre=new CrearCliente(null,true);
        cre.setSize(870,400);
        cre.setLocationRelativeTo(null);
        cre.setVisible(true);
    }//GEN-LAST:event_CrearCLienteActionPerformed

    private void CrearCLiente1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CrearCLiente1ActionPerformed
        CrearProducto cre=new CrearProducto(null,true);
        cre.setSize(870,400);
        cre.setLocationRelativeTo(null);
        cre.setVisible(true);
    }//GEN-LAST:event_CrearCLiente1ActionPerformed

    private void ModificarCliente1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificarCliente1ActionPerformed
        ModificarProducto modi=new ModificarProducto(this,true); 
        modi.setSize(870,400);
        modi.setLocationRelativeTo(null);
        modi.setVisible(true);
    }//GEN-LAST:event_ModificarCliente1ActionPerformed

   
    public static void main(String args[]) {
        

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar Barra;
    private javax.swing.JMenu Cliente;
    private javax.swing.JMenu Cliente1;
    private javax.swing.JMenuItem CrearCLiente;
    private javax.swing.JMenuItem CrearCLiente1;
    private javax.swing.JMenuItem ModificarCliente;
    private javax.swing.JMenuItem ModificarCliente1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuItem jiHistorialCliente;
    private javax.swing.JMenuItem jiregistro;
    private javax.swing.JMenu jmregistro;
    // End of variables declaration//GEN-END:variables
}
