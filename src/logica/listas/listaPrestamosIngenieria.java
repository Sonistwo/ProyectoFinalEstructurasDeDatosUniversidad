package logica.listas;

import java.io.Serializable;

import java.util.List;
import java.util.LinkedList;

import logica.entidades.equipos.Computador;

import logica.entidades.prestamo.PrestamosIngenieria;

public class listaPrestamosIngenieria implements Serializable {
    
    public static List<PrestamosIngenieria> prestamosInge = new LinkedList<>();
    
    public void anadirPrestamo(PrestamosIngenieria p){
        prestamosInge.add(p);
    }
    
    public PrestamosIngenieria obtenerPrestamoPorEstudiante(long cedula){
        for(PrestamosIngenieria p : prestamosInge){
            if(p.getSolicitante().getCedula() == cedula){
                return p;
            }
        }
        
        return null;
        
    }
    
    public boolean estudiantePrestando(long cedula){
        for(PrestamosIngenieria p : prestamosInge){
            if(p.getSolicitante().getCedula() == cedula){
                return true;
            }
        }
        
        return false;
        
    }
    
    public boolean computadorYaPrestado(Computador e){
        for(PrestamosIngenieria p : prestamosInge){
            if(p.computadorPrestado(e)){
                return true;
            }
        }
        return false;
    }
    
    public List<PrestamosIngenieria> copiarLista(){
        return prestamosInge;
    }
    
    public void importeLista(List<PrestamosIngenieria> lista){
        prestamosInge = lista;
    }
    
}
