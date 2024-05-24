package persistencia.prestamosIngenieria;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

import java.util.List;

import logica.entidades.prestamo.PrestamosIngenieria;

import logica.listas.listaPrestamosIngenieria;

public class ImportarPrestamosInge {
    
    File archivo = new File("RegistroPrestamosIngenieria.txt");  
    
    public void importarPrestamos() throws IOException, ClassNotFoundException {
        
        try(ObjectInputStream paDentro = new ObjectInputStream(new FileInputStream(archivo))){
            
            listaPrestamosIngenieria.prestamosInge = (List<PrestamosIngenieria>) paDentro.readObject();
            
        }
        
    }
    
}
