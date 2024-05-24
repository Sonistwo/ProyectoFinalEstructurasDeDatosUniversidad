package persistencia.estudiantesIng;

import logica.listas.listaIngenieria;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.File;

import java.io.IOException;
import java.io.FileNotFoundException;

public class ExportarIngenieros {
    
    File archivo = new File("RegistroIngenieros.txt");
    
    public void exportarIngenieros() throws IOException, FileNotFoundException {
        
        try(ObjectOutputStream paFuera = new ObjectOutputStream(new FileOutputStream(archivo))){
            
            paFuera.writeObject(listaIngenieria.listaIngenieros);
            
        }
        
    }
    
}
