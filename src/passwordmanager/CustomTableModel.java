/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package passwordmanager;

import javax.swing.JPasswordField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author mane1
 */
public class CustomTableModel extends DefaultTableModel {

    public CustomTableModel() {
        super(new Object[]{"Sitio Web", "Contraseña", "Creado", "Modificado"}, 0);
    }
    

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        Class typeof = Object.class;
        return typeof;
    }

    @Override
    public boolean isCellEditable(int row, int column) {
        
        switch(column) {
            case 0:
                return true;
        }
        
        return false;//To change body of generated methods, choose Tools | Templates.
    }
    
    
}
