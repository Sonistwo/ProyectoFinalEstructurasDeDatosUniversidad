package persistencia.prestamosDiseno;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

import java.util.LinkedList;
import java.util.List;

import logica.entidades.prestamo.PrestamosDiseno;

import logica.listas.listaPrestamosDiseno;

public class ImportarPrestamosDis {
    
    File archivo = new File("RegistroPrestamosDiseno.txt");

    public void importarPrestamos() throws IOException, ClassNotFoundException {
        
        try(ObjectInputStream paDentro = new ObjectInputStream(new FileInputStream(archivo))){
            
            LinkedList<PrestamosDiseno> nuevo = (LinkedList<PrestamosDiseno>) paDentro.readObject();
            listaPrestamosDiseno.prestamosDiseno = nuevo;
            
        }
        
    }
    
}
