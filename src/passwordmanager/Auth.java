/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package passwordmanager;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author mane1
 */
public class Auth implements Serializable {

    private static final long serialVersionUID = 1L;

    private String webSite;
    private String password;
    private String atCreated;
    private String atModified;

    public Auth() {
    }
    
    public String getWebSite() {
        return webSite;
    }

    public void setWebSite(String webSite) {
        this.webSite = webSite;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAtCreated() {
        return atCreated;
    }

    public void setAtCreated(String atCreated) {
        this.atCreated = atCreated;
    }

    public String getAtModified() {
        return atModified;
    }

    public void setAtModified(String atModified) {
        this.atModified = atModified;
    }

    
    
}
