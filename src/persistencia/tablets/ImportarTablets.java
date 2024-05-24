package persistencia.tablets;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

import java.util.List;

import logica.entidades.equipos.TabletaGrafica;

import logica.listas.listaTablets;

public class ImportarTablets {
    
    File archivo = new File("RegistroTablets.txt");
    
    public void importarTablets() throws IOException, ClassNotFoundException {
        
        try(ObjectInputStream paDentro = new ObjectInputStream(new FileInputStream(archivo))){
            
            listaTablets.listaTabletas = (List<TabletaGrafica>) paDentro.readObject();
            
        }
        
    }
    
}
