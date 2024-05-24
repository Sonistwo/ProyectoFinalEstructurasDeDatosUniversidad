package logica.verificarCampos;

public class camposVacios {
    
    public boolean sinVacios(String[] campos){
        for(Object dato : campos){
            if(dato.equals("")){
                return false;
            }
        }
        return true;
    }
    
    public boolean sinVacios(String campo){
        return campo.equals("");
    }
    
}
