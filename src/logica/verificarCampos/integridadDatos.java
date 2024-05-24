package logica.verificarCampos;

public class integridadDatos {

    public boolean verificarEntero(String dato){
        try{
            Integer.parseInt(dato);
        } catch (NumberFormatException E){
            return false;
        }
        return true;
    }
    
    public boolean verificarFlotante(String dato) {
        try {
            Double.parseDouble(dato);
        } catch (NumberFormatException E) {
            return false;
        } 
        return true;
        
    }
    
    public boolean verificarSoloLetras(String dato){
        
        for(char caracter : dato.toCharArray()){
            if(Character.isDigit(caracter)){
                return false;
            }
        }
        
        return true;
        
    }

}
