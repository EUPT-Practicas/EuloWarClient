/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilidades;

import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Fran
 */
public class EncriptaMD5 {
    
    public EncriptaMD5(){
        
    }
    
    public static String encriptarClave(String password, String semilla){
        String md5Clave = MD5(MD5(MD5(password).concat(MD5(semilla))));
        return md5Clave;
    }
    
    private static String MD5(String clave){
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            md.update(clave.getBytes("UTF-8"), 0, clave.length());
            byte[] bt = md.digest();
            BigInteger bi = new BigInteger(1, bt);
            String md5 = bi.toString(16);
            return md5;
        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(EncriptaMD5.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(EncriptaMD5.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
        
    }
    
}
