package gui.modelado;

import javax.swing.table.DefaultTableModel;

public class ModeloTabla extends DefaultTableModel {
    
    @Override
    public boolean isCellEditable(int x, int y){
        return false;
    }
    
}
