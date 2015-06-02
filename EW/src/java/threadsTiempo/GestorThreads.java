/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threadsTiempo;

import asignarRecursos_WS.Mina;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 *
 * @author FranciscoJavier
 */
public class GestorThreads {
    
    private static GestorThreads instancia = null;
    private ExecutorService poolThreads;
    
    private GestorThreads(){
        poolThreads = Executors.newFixedThreadPool(20);
    }
    
    public static GestorThreads getInstance(){
        if (instancia == null){
            instancia = new GestorThreads();
        }
        return instancia;
    }
    
    public void crearThreadRecursosMina(Mina m){
        poolThreads.execute(new RecursosMina(m));
    }
    
    public void crearThreadMejoraMina(int idMina){
        poolThreads.execute(new MejoraMina(idMina));
    }
    
}
