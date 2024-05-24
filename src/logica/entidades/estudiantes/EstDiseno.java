package logica.entidades.estudiantes;

import java.io.Serializable;

public class EstDiseno extends Estudiante implements Serializable {
    
    private String modalidadEstudio;
    private int cantidadAsignaturas;
    
    public EstDiseno(long cedula, long serial, String nombre, String apellido, String telefono, String modalidadEstudio, int cantidadAsignaturas) {
        super(cedula, serial, nombre, apellido, telefono);
        this.modalidadEstudio = modalidadEstudio;
        this.cantidadAsignaturas = cantidadAsignaturas;
    }

    public String getModalidadEstudio() {
        return modalidadEstudio;
    }

    public void setModalidadEstudio(String modalidadEstudio) {
        this.modalidadEstudio = modalidadEstudio;
    }

    public int getCantidadAsignaturas() {
        return cantidadAsignaturas;
    }

    public void setCantidadAsignaturas(int cantidadAsignaturas) {
        this.cantidadAsignaturas = cantidadAsignaturas;
    }
    
    
    
}
