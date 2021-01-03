/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package passwordmanager;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author mane1
 */
public class AuthStorage implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    private ArrayList<Auth> store;

    public AuthStorage() {
        this.store = new ArrayList<>();
    }
    
    public AuthStorage(Auth authenticator) {
        this.store.add(authenticator);
    }

    public void add(Auth authenticator) {
        this.store.add(authenticator);
    }

    public void setData(ArrayList<Auth> store) {
        this.store = store;
    }

    public ArrayList<Auth> getData() {
        return store;
    }
    
    public int size() {
        return this.store.size();
    }
    
}
