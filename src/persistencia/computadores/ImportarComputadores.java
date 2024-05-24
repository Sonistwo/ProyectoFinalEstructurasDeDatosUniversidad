package persistencia.computadores;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

import java.util.List;

import logica.entidades.equipos.Computador;

import logica.listas.listaComputadores;

public class ImportarComputadores {
    
    File archivo = new File("RegistroComputadores.txt");
    
    public void importarComputadores() throws IOException, ClassNotFoundException {
        
        try(ObjectInputStream paDentro = new ObjectInputStream(new FileInputStream(archivo))){
            
            listaComputadores.listaPCs = (List<Computador>) paDentro.readObject();
            
        }
        
    }
    
}
