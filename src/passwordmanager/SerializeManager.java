/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package passwordmanager;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author mane1
 */
public class SerializeManager {
    
    
    public static boolean write(Object obj){
        
        FileOutputStream fos;
        ObjectOutputStream oos;

        try {
            
            fos = new FileOutputStream(System.getProperty("user.dir").concat("/store.pwd"));
            oos = new ObjectOutputStream(fos);
            oos.writeObject(obj);
            oos.close();
            
        } catch (FileNotFoundException e) {
        } catch (IOException ex) {
            Logger.getLogger(SerializeManager.class.getName()).log(Level.SEVERE, null, ex);
            return false;

        }
        
        return true;
    }
    
    public static Object read() {
        
        Object obj = null;
        FileInputStream fis;
        ObjectInputStream ois;
        
        try {
                        
            fis = new FileInputStream(System.getProperty("user.dir").concat("/store.pwd"));
            ois = new ObjectInputStream(fis);
            obj = ois.readObject();
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(SerializeManager.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(SerializeManager.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(SerializeManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return obj;

    }
}
