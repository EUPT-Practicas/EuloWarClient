/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threadsTiempo;

import cliente_webservice.ClienteTropas;
import java.util.Timer;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Sergio
 */
public class MejorarDefensa implements Runnable {
    
    private static final int TREINTA_MINUTOS = 30 * 60 * 1000;
    private static final int VEINTE_SEGUNDOS = 30 * 1000;
    
    private String emailUsuario;
    private Timer timer;
    private ClienteTropas ct;
    
    public MejorarDefensa (String emailUsuario){
        this.emailUsuario = emailUsuario;
        this.ct = new ClienteTropas();
    }
    
    public void mejorarDefensa (){
        ct.mejorarFabricaDefensiva(emailUsuario);
    }

    @Override
    public void run() {
                System.err.println("Mejorando Fabrica Defensiva: (30 minutos) -- " + emailUsuario);
        try {
            Thread.sleep(VEINTE_SEGUNDOS);
            mejorarDefensa();
        } catch (InterruptedException ex) {
            Logger.getLogger(MejoraMina.class.getName()).log(Level.SEVERE, null, ex);
        }    }
    
}
