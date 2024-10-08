package gui.control;

import gui.login.*;
import gui.admin.*;
import gui.prestamos.*;
import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.border.Border;

public class ControlVentanas {
    
    public static Border MAL_TXT = BorderFactory.createLineBorder(Color.red);
    public static Border NORMAL_TXT = BorderFactory.createLineBorder(Color.black);

    public static void cargarPrincipal(){
        new Principal().setVisible(true);
    }
    
    public static void cargarDatosDiseno(){
        new RegistroDiseno().setVisible(true);
    }
    
    public static void cargarLoginDiseno(){
        new LoginDiseno().setVisible(true);
    }
    
    public static void cargarLoginIngenieria(){
        new LoginIngenieria().setVisible(true);
    }
    
    public static void cargarDatosIngenieria(){
        new RegistroIngenieria().setVisible(true);
    }
    
    public static void cargarPrestamoIngenieria(long cedula){
        new PrestamoIngenieria(cedula).setVisible(true);
    }
    
    public static void cargarPrestamoDiseno(long cedula){
        new PrestamoDiseno(cedula).setVisible(true);
    }
    
    public static void cargarLoginAdmin(){
        new LoginAdmin().setVisible(true);
    }
    
    public static void cargarAdmin(){
        new Administrador().setVisible(true);
    }
    
    public static void cargarRegistroEquipo(){
        new RegistrarEquipo().setVisible(true);
    }
    
    public static void cargarVerPrestamos(){
        new VerPrestamos().setVisible(true);
    }
    
}
