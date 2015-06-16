/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cliente_webservice;

import operacionescombates_WS.Usuario;

/**
 *
 * @author FranciscoJavier
 */
public class ClienteCombates {
    
    public ClienteCombates(){
        
    }

    public Usuario elegirRival(java.lang.String email) {
        operacionescombates_WS.OperacionesCombates_Service service = new operacionescombates_WS.OperacionesCombates_Service();
        operacionescombates_WS.OperacionesCombates port = service.getOperacionesCombatesPort();
        return port.elegirRival(email);
    }

    public Usuario simularCombate(java.lang.String emailAtacante, java.lang.String emailDefensor) {
        operacionescombates_WS.OperacionesCombates_Service service = new operacionescombates_WS.OperacionesCombates_Service();
        operacionescombates_WS.OperacionesCombates port = service.getOperacionesCombatesPort();
        return port.simularCombate(emailAtacante, emailDefensor);
    }
       
}
