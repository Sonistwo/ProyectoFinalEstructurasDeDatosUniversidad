package persistencia.computadores;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import logica.listas.listaComputadores;

public class ExportarComputadores {
 
    File archivo = new File("RegistroComputadores.txt");
    
    public void exportarComputadoras() throws IOException, FileNotFoundException {
        
        try(ObjectOutputStream paFuera = new ObjectOutputStream(new FileOutputStream(archivo))){
            
            paFuera.writeObject(listaComputadores.listaPCs);
            
        }
        
    }
    
}
