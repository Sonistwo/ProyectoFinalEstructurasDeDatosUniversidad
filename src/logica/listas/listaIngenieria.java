package logica.listas;

import java.io.Serializable;

import logica.entidades.estudiantes.EstIngenieria;

import java.util.List;
import java.util.LinkedList;

public class listaIngenieria implements Serializable {
    
    public static List<EstIngenieria> listaIngenieros = new LinkedList<>();
    
    public void anadirEstudiante(EstIngenieria E){
        listaIngenieros.add(E);
    }
    
    public boolean existeEstudiante(long cedula, long serial){
          for(EstIngenieria E : listaIngenieros){
              if(E.getCedula() == cedula && E.getSerial() == serial){
                  return true;
              }
          }
          
          return false;
    }
    
    public EstIngenieria obtenerEstudiante(long cedula){
        for(EstIngenieria E : listaIngenieros){
            if(E.getCedula() == cedula){
                return E;
            }
        }
        
        return null;
        
    }
    
    public void importeLista(List<EstIngenieria> listaRegistrada){
       listaIngenieros = listaRegistrada;
    }
    
    public List<EstIngenieria> copiarLista(){
        return listaIngenieros;
    }
    
}
