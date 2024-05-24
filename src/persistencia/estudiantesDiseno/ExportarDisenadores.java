package persistencia.estudiantesDiseno;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import logica.listas.listaDiseno;

public class ExportarDisenadores {
 
    File archivo = new File("RegistroDisenadores.txt");
    
    public void exportarDisenadores() throws IOException, FileNotFoundException {
        
        try(ObjectOutputStream paFuera = new ObjectOutputStream(new FileOutputStream(archivo))){
            
            paFuera.writeObject(listaDiseno.listaDisenadores);
            
        }
        
    }
    
}
