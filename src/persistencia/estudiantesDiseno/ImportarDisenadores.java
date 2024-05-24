package persistencia.estudiantesDiseno;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

import java.util.List;

import logica.entidades.estudiantes.EstDiseno;

import logica.listas.listaDiseno;

public class ImportarDisenadores {
    
    File archivo = new File("RegistroDisenadores.txt");   
    
    public void importarDisenadores() throws IOException, ClassNotFoundException {
        
        try(ObjectInputStream paDentro = new ObjectInputStream(new FileInputStream(archivo))){
            
            listaDiseno.listaDisenadores = (List<EstDiseno>) paDentro.readObject();
            
        }
        
    }
    
}
