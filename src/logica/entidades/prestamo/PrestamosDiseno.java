package logica.entidades.prestamo;

import java.io.Serializable;

import logica.entidades.estudiantes.*;
import logica.entidades.equipos.*;

import java.util.LinkedList;

public class PrestamosDiseno implements Serializable {
    
    private final Estudiante solicitante;
    private LinkedList<TabletaGrafica> equiposPrestados;
    
    public PrestamosDiseno(Estudiante solicitante){
        this.solicitante = solicitante;
        
        equiposPrestados = new LinkedList<>();
    }
    
    public void anadirTablet(TabletaGrafica e){
        equiposPrestados.add(e);
    }
    
    public boolean tabletPrestada(TabletaGrafica equipo){
        return equiposPrestados.contains(equipo);
    }
    
    public LinkedList<TabletaGrafica> obtenerEquiposPrestados(){
        return this.equiposPrestados;
    }

    public Estudiante getSolicitante() {
        return solicitante;
    }
    
    public void devolverTablet(long serial){
        for(TabletaGrafica tablet : equiposPrestados){
            if(tablet.getSerial() == serial){
                equiposPrestados.remove(tablet);
            }
        }
    }
    
}
