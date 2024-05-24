package logica;

import persistencia.computadores.*;
import persistencia.tablets.*;
import persistencia.estudiantesDiseno.*;
import persistencia.estudiantesIng.*;
import persistencia.prestamosDiseno.*;
import persistencia.prestamosIngenieria.*;

import java.io.IOException;

public class Exportes {
    
    public void ExportarTodo(){
        
        try {
            new ExportarDisenadores().exportarDisenadores();
            new ExportarIngenieros().exportarIngenieros();
            new ExportarComputadores().exportarComputadoras();
            new ExportarTablets().exportarTablets();
            new ExportarPrestamosDis().exportarPrestamosDis();
            new ExportarPrestamosInge().exportarPrestamosInge();
        } catch(IOException E) {
            System.out.println("Ningún archivo para importar.\n" + E.toString());
        } 
        
    }
    
}
