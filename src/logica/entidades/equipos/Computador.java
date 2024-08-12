package logica.entidades.equipos;

import java.io.Serializable;

public class Computador extends Equipo implements Serializable {
    
    private String sistemaOperativo;
    private String procesador;

    public Computador(String sistemaOperativo, String procesador, String serial, String marca, double tamano, float precio) {
        super(serial, marca, tamano, precio);
        this.sistemaOperativo = sistemaOperativo;
        this.procesador = procesador;
    }

    public String getSistemaOperativo() {
        return sistemaOperativo;
    }

    public String getProcesador() {
        return procesador;
    }

    public void setSistemaOperativo(String sistemaOperativo) {
        this.sistemaOperativo = sistemaOperativo;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }
    
    @Override
    public String toString(){
        String info = super.toString() + "\n"
                + "Sistema operativo: " + this.getSistemaOperativo() + "\n"
                + "Procesador: " + this.procesador + ".";
        
        return info;
    }
    
}
