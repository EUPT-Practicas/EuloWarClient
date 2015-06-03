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

/**
 *
 * @author FranciscoJavier
 */
public class RecursosMina implements Runnable {

    private static final int DIEZ_MINUTOS = 10 * 60 * 1000;
    private Mina mina;
    private Timer timer;

    public RecursosMina(Mina mina) {
        this.mina = mina;
    }

    public void actualizarRecursos() {
        TimerTask timerTask = new TimerTask() {
            @Override
            public void run() {
                ClienteRecursosMinas crm = new ClienteRecursosMinas();
                crm.producirRecursos(mina.getIdMina());
//                System.out.println("voy a llamar al endpoint");
//                RecursosEndpoint endpoint = new RecursosEndpoint();
//                endpoint.obtenerRecursos(mina.getFKMinaUsuario().getEmail());
            }
        };
        timer = new Timer();
        // Dentro de 0 milisegundos, avísame cada x  milisegundos
        timer.scheduleAtFixedRate(timerTask, 0, 5000);
    }

    @Override
    public void run() {
        System.out.println("mina de: " + mina.getFKMinaUsuario());
        actualizarRecursos();
    }

}
