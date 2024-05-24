package logica.entidades.equipos;

import java.io.Serializable;

public class TabletaGrafica extends Equipo implements Serializable {
    
    private String almacenamiento;
    private float peso;

    public TabletaGrafica(String almacenamiento, float peso, long serial, String marca, double tamano, float precio) {
        super(serial, marca, tamano, precio);
        this.almacenamiento = almacenamiento;
        this.peso = peso;
    }

    public String getAlmacenamiento() {
        return almacenamiento;
    }

    public float getPeso() {
        return peso;
    }

    public void setAlmacenamiento(String almacenamiento) {
        this.almacenamiento = almacenamiento;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }
    
    public String toString(){
        
        String info = super.toString() + "\n"
                + "Almacenamiento: " + this.getAlmacenamiento() + "\n"
                + "Peso: " + this.getPeso() + " kg.";
        
        return info;
    }
    
}
