package persistencia.prestamosDiseno;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import logica.listas.listaPrestamosDiseno;

public class ExportarPrestamosDis {
 
    File archivo = new File("RegistroPrestamosDiseno.txt");
    
    public void exportarPrestamosDis() throws IOException, FileNotFoundException {
        
        try(ObjectOutputStream paFuera = new ObjectOutputStream(new FileOutputStream(archivo))){
            
            paFuera.writeObject(listaPrestamosDiseno.prestamosDiseno);
            
        }
        
    }
    
}
