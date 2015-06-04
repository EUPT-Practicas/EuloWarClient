/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threadsTiempo;

import operacionesminas_client.Mina;
import cliente_webservice.ClienteRecursosMinas;
import java.util.Timer;
import java.util.TimerTask;
import java.util.logging.Level;
import java.util.logging.Logger;
import operacionesminas_client.NivelMina;

/**
 *
 * @author Sergio
 */
public class MejoraMina implements Runnable {
    
    private static final int TREINTA_MINUTOS = 30 * 60 * 1000;
    private static final int VEINTE_SEGUNDOS = 30 * 1000;

    private int idMina;
    private Timer timer;
    private ClienteRecursosMinas crm;

    public MejoraMina(int idMina) {
        this.idMina = idMina;
        this.crm = new ClienteRecursosMinas();
    }

    public void mejorarMina() {
        crm.mejorarMina(idMina);
    }

    @Override
    public void run() {
        System.err.println("Mejorando Mina: " + idMina + ", dentro de: 30minutos.");
        try {
            Thread.sleep(VEINTE_SEGUNDOS);
            mejorarMina();
        } catch (InterruptedException ex) {
            Logger.getLogger(MejoraMina.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
