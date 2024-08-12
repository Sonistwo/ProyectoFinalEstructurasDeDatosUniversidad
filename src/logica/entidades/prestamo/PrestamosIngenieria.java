package logica.entidades.prestamo;

import java.io.Serializable;

import logica.entidades.estudiantes.*;
import logica.entidades.equipos.*;

import java.util.LinkedList;

public class PrestamosIngenieria implements Serializable {
    
    private final Estudiante solicitante;
    private LinkedList<Computador> equiposPrestados;
    
    public PrestamosIngenieria(Estudiante solicitante){
        this.solicitante = solicitante;
        
        equiposPrestados = new LinkedList<>();
    }
    
    public void anadirComputador(Computador e){
        equiposPrestados.add(e);
    }
    
    public boolean computadorPrestado(Computador equipo){
        return equiposPrestados.contains(equipo);
    }
    
    public LinkedList<Computador> obtenerEquiposPrestados(){
        return this.equiposPrestados;
    }

    public Estudiante getSolicitante() {
        return solicitante;
    }
    
    public void devolverComputador(String serial){
        for(Computador pc : equiposPrestados){
            if(pc.getSerial().equals(serial)){
                equiposPrestados.remove(pc);
            }
        }
    }
    
}
