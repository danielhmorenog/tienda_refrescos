/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import java.awt.Color;
import java.awt.Component;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
//import java.time.LocalDate;
import java.util.Calendar;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author DAS
 */
public class TableCellRendererColor extends DefaultTableCellRenderer{

    private Component componente;
    String dia,mes,annio;
    String fechas;
    String fe;
    String an="2017-01-29";
    Calendar c = Calendar.getInstance();
   
    public TableCellRendererColor()
    {
        adrian();
    }
    
    @Override
    public Component getTableCellRendererComponent(JTable jtabla, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
       componente = super.getTableCellRendererComponent(jtabla, value, isSelected, hasFocus, row, column); //To change body of generated methods, choose Tools | Templates.
    
 
       if(jtabla.getValueAt(row, 1).equals(fechas))
       {
          componente.setBackground(Color.red);
          
       }else
       {
           componente.setBackground(Color.YELLOW);
       }
       
       return componente;
    }
    
    public void adrian()
    {
        dia = Integer.toString(c.get(Calendar.DATE));
mes = Integer.toString(c.get(Calendar.MONTH)+1);
annio = Integer.toString(c.get(Calendar.YEAR));
 fechas = (annio + "-" +"0"+ mes+ "-" + dia);
        System.out.println(fechas);
    
    }
    
   
    

        }
       
    

