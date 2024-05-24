package logica.entidades.estudiantes;

import java.io.Serializable;

public class EstIngenieria extends Estudiante implements Serializable {
    
    private short numeroSemestre;
    private float promedioAcumulado;

    public EstIngenieria(short numeroSemestre, float promedioAcumulado, long cedula, long serial, String nombre, String apellido, String telefono) {
        super(cedula, serial, nombre, apellido, telefono);
        this.numeroSemestre = numeroSemestre;
        this.promedioAcumulado = promedioAcumulado;
    }

    public short getNumeroSemestre() {
        return numeroSemestre;
    }

    public void setNumeroSemestre(short numeroSemestre) {
        this.numeroSemestre = numeroSemestre;
    }

    public float getPromedioAcumulado() {
        return promedioAcumulado;
    }

    public void setPromedioAcumulado(float promedioAcumulado) {
        this.promedioAcumulado = promedioAcumulado;
    }
    
    
    
}
