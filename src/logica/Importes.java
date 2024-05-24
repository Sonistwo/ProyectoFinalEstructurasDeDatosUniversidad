package logica;

import persistencia.computadores.*;
import persistencia.tablets.*;
import persistencia.estudiantesDiseno.*;
import persistencia.estudiantesIng.*;
import persistencia.prestamosDiseno.*;
import persistencia.prestamosIngenieria.*;

import java.io.IOException;


public class Importes {

    public void ImportarTodo() {

        try {
            new ImportarDisenadores().importarDisenadores();
            new ImportarIngenieros().importarIngenierios();
            new ImportarComputadores().importarComputadores();
            new ImportarTablets().importarTablets();
            new ImportarPrestamosDis().importarPrestamos();
            new ImportarPrestamosInge().importarPrestamos();
        } catch(IOException E) {
            System.out.println("Ningún archivo para importar.\n" + E.toString());
        } catch(ClassNotFoundException E){
            System.out.println("Error interno crítico al importar:\n" + E.toString());
        }

    }

}
