package logica.listas;

import java.io.Serializable;

import logica.entidades.equipos.Computador;

import java.util.Random;

import java.util.List;
import java.util.LinkedList;

public class listaComputadores implements Serializable {
    
    public static List<Computador> listaPCs = new LinkedList<>();
    
    public void anadirPC(Computador pc){
        listaPCs.add(pc);
    }
    
    public boolean existePC(String serial){
        for(Computador pc : listaPCs){
            if(pc.getSerial().equals(serial)){
                return true;
            }
        }
        
        return false;
        
    }
    
    public Computador obtenerPC(String serial){
        for(Computador pc : listaPCs){
            if(pc.getSerial().equals(serial)){
                return pc;
            }
        }
        
        return null;
    }
    
    public void eliminarPC(Computador C){
        listaPCs.remove(C);
    }
    
    public Computador obtenerRandom(){
        return listaPCs.get(new Random().nextInt(listaPCs.size()));
    }
    
    public void importeLista(List<Computador> listaNueva){
        listaPCs = listaNueva;
    }
    
    public List<Computador> copiarLista(){
        return listaPCs;
    }

}
