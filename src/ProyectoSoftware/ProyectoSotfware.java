package ProyectoSoftware;

import Interfaz.Admin;
import java.awt.Color;

public class ProyectoSotfware {

    Admin admin = new Admin(null, true);

    public ProyectoSotfware() {
        admin.setSize(400, 200);
        admin.setLocationRelativeTo(null);
        admin.setResizable(false);
        admin.setVisible(true);
        admin.getContentPane().setBackground(new Color(0, 0, 0));
    }

    public static void main(String[] args) {
        new ProyectoSotfware();
    }

}
