package persistencia.prestamosIngenieria;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import logica.listas.listaPrestamosIngenieria;

public class ExportarPrestamosInge {
 
    File archivo = new File("RegistroPrestamosIngenieria.txt");

    public void exportarPrestamosInge() throws IOException, FileNotFoundException {
        
        try(ObjectOutputStream paFuera = new ObjectOutputStream(new FileOutputStream(archivo))){
            
            paFuera.writeObject(listaPrestamosIngenieria.prestamosInge);
            
        }
        
    }
    
}
