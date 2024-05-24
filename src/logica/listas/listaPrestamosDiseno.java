package logica.listas;

import java.io.Serializable;

import java.util.List;
import java.util.LinkedList;
import logica.entidades.equipos.TabletaGrafica;

import logica.entidades.prestamo.PrestamosDiseno;

public class listaPrestamosDiseno implements Serializable {
    
    public static List<PrestamosDiseno> prestamosDiseno = new LinkedList<>();
    
    public void anadirPrestamo(PrestamosDiseno p){
        prestamosDiseno.add(p);
    }
    
    public PrestamosDiseno obtenerPrestamoPorEstudiante(long cedula){
        for(PrestamosDiseno p : prestamosDiseno){
            if(p.getSolicitante().getCedula() == cedula){
                return p;
            }
        }
        
        return null;
        
    }
    
    public boolean estudiantePrestando(long cedula){
        for(PrestamosDiseno p : prestamosDiseno){
            if(p.getSolicitante().getCedula() == cedula){
                return true;
            }
        }
        
        return false;
        
    }
    
    public boolean tabletaYaPrestada(TabletaGrafica e){
        for(PrestamosDiseno p : prestamosDiseno){
            if(p.tabletPrestada(e)){
                return true;
            }
        }
        return false;
    }
    
    public List<PrestamosDiseno> copiarLista(){
        return prestamosDiseno;
    }
    
    public void importeLista(List<PrestamosDiseno> lista){
        prestamosDiseno = lista;
    }
    
}
