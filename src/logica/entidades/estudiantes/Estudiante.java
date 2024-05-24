package logica.entidades.estudiantes;

import java.io.Serializable;

public class Estudiante implements Serializable {

    private final long cedula;
    private final long serial;
    
    private String nombre;
    private String apellido;
    private String telefono;

    public Estudiante(long cedula, long serial, String nombre, String apellido, String telefono) {
        this.cedula = cedula;
        this.serial = serial;
        
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public long getCedula() {
        return cedula;
    }

    public long getSerial() {
        return serial;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getTelefono() {
        return telefono;
    }
    
    @Override
    public String toString(){
        String info = "Nombre: " + this.getNombre() + " " + this.getApellido() + ", Cédula: " + this.getCedula() + ", Serial: " + this.getSerial();
        return info;
    }

}
