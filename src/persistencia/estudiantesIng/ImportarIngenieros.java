package persistencia.estudiantesIng;

import logica.listas.listaIngenieria;

import java.util.List;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.File;

import java.io.IOException;

import logica.entidades.estudiantes.EstIngenieria;

public class ImportarIngenieros {

    File archivo = new File("RegistroIngenieros.txt");
    
    public void importarIngenierios() throws IOException, ClassNotFoundException {
        
        try(ObjectInputStream paDentro = new ObjectInputStream(new FileInputStream(archivo))){
            
            listaIngenieria.listaIngenieros = (List<EstIngenieria>) paDentro.readObject();
            
        }
        
    }
    
}
