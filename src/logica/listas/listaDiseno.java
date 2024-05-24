package logica.listas;

import java.io.Serializable;

import logica.entidades.estudiantes.EstDiseno;

import java.util.LinkedList;
import java.util.List;

public class listaDiseno implements Serializable{
    
    public static List<EstDiseno> listaDisenadores = new LinkedList<>();
    
    public void anadirEstudiante(EstDiseno E) {
        listaDisenadores.add(E);
    }
    
    public boolean existeEstudiante(long cedula, long serial){
        for(EstDiseno E : listaDisenadores){
              if(E.getCedula() == cedula && E.getSerial() == serial){
                  return true;
              }
          }
          
          return false;
    }
    
    public EstDiseno obtenerEstudiante(long cedula){
        for(EstDiseno E : listaDisenadores){
            if(E.getCedula() == cedula){
                return E;
            }
        }
        
        return null;
    }
    
    public void importeLista(List<EstDiseno> listaRegistrada){
       listaDisenadores = listaRegistrada;
    }
    
    public List<EstDiseno> copiarLista(){
        return listaDisenadores;
    }
    
}
