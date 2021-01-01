/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package passwordmanager;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author mane1
 */
public class BuildKeyStrings {

    public static char[] GenerateAlphabetic(int length) {
        
        char[] caracter = new char[length];

        try {
            
            Random random = SecureRandom.getInstanceStrong();
            
            int j;
            
            for ( int i=0; i<length; i++) {
                
                j = random.nextInt(90 - 65) + 65;
                caracter[i] = (char) (j);	
            }
            
        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(BuildKeyStrings.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return caracter;

    }
    
    public static char[] GenerateRandomCaracter(int length) {
        
        char[] caracter = new char[length];

        try {
            
            Random random = SecureRandom.getInstanceStrong();
            
            int j;
            
            for ( int i=0; i < length; i++) {
                
                j = random.nextInt(122 - 33) + 33;
                caracter[i] = (char) ( j );	
            }
            
        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(BuildKeyStrings.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return caracter;

    }
    
    public static String GenerateNumeric(int length) {
        
        StringBuilder string = new StringBuilder();
        
        try {
            
            Random random = SecureRandom.getInstanceStrong();
            
            int j;
            
            for (int i = 0; i < length; i++) {
                j = random.nextInt(9);
                string.append(j);
            }
            
        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(BuildKeyStrings.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return string.toString();

    }
    
    
    public static void main(String[] args) {
        System.out.println(GenerateAlphabetic(26));
    }
}

