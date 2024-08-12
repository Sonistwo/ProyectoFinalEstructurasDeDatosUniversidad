package logica.entidades.equipos;

import java.io.Serializable;

public class Equipo implements Serializable {

    private String serial;
    private String marca;
    private double tamano;
    private float precio;

    public Equipo(String serial, String marca, double tamano, float precio) {
        this.serial = serial;
        this.marca = marca;
        this.tamano = tamano;
        this.precio = precio;
    }

    public String getSerial() {
        return serial;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getTamano() {
        return tamano;
    }

    public void setTamano(double tamano) {
        this.tamano = tamano;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        String info = "Marca: " + this.getMarca() + "\n"
                + "Serial: " + this.getSerial() + "\n"
                + "Tamaño: " + this.getTamano() + " pulgadas\n"
                + "Precio: $" + this.getPrecio() + " COP.";

        return info;
    }

}
