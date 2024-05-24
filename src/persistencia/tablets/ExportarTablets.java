package persistencia.tablets;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import logica.listas.listaTablets;

public class ExportarTablets {
 
    File archivo = new File("RegistroTablets.txt");
    
    public void exportarTablets() throws IOException, FileNotFoundException {
        
        try(ObjectOutputStream paFuera = new ObjectOutputStream(new FileOutputStream(archivo))){
            
            paFuera.writeObject(listaTablets.listaTabletas);
            
        }
        
    }
    
}
