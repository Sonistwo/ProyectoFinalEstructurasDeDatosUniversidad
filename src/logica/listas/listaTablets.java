package logica.listas;

import java.io.Serializable;

import logica.entidades.equipos.TabletaGrafica;

import java.util.Random;

import java.util.List;
import java.util.LinkedList;

public class listaTablets implements Serializable {
    
    public static List<TabletaGrafica> listaTabletas = new LinkedList<>();
    
    public void anadirTablet(TabletaGrafica pc){
        listaTabletas.add(pc);
    }
    
    public boolean existeTablet(String serial){
        for(TabletaGrafica tablet : listaTabletas){
            if(tablet.getSerial().equals(serial)){
                return true;
            }
        }
        
        return false;
        
    }
    
    public TabletaGrafica obtenerTablet(String serial){
        for(TabletaGrafica tablet : listaTabletas){
            if(tablet.getSerial().equals(serial)){
                return tablet;
            }
        }
        
        return null;
    }
    
    public TabletaGrafica obtenerRandom(){
        return listaTabletas.get(new Random().nextInt(listaTabletas.size()));
    }
    
    public void eliminarTablet(TabletaGrafica T){
        listaTabletas.remove(T);
    }
    
    public void importeLista(List<TabletaGrafica> listaNueva){
        listaTabletas =  listaNueva;
    }
    
    public List<TabletaGrafica> copiarLista(){
        return listaTabletas;
    }
    
}
