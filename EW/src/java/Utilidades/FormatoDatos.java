/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilidades;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Sergio
 */
public class FormatoDatos {

    //Patron validacion correos electronicos
    private static final String PATRON_EMAIL = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
            + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";

    private static final String PATRON_PASSWORD = "[^\\s]{8,15}";

    public FormatoDatos() {

    }

    public static boolean validarEmail(String email) {
        Pattern patron = Pattern.compile(PATRON_EMAIL);
        Matcher matcher = patron.matcher(email);
        return matcher.matches();
    }

    public static boolean validarPassword(String password) {
        Pattern patron = Pattern.compile(PATRON_PASSWORD);
        Matcher matcher = patron.matcher(password);
        return matcher.matches();
    }

}
