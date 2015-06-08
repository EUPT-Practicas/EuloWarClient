/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cliente_webservice;

import operacionesTropas_WS.TropaAtaque;
import operacionesTropas_WS.TropaDefensa;

/**
 *
 * @author Sergio
 */
public class ClienteTropas {
    
    public ClienteTropas(){
        
    }

    public boolean agregarTropasDefensivas(java.lang.String email, java.lang.String tipo, int unidades) {
        operacionesTropas_WS.OperacionesTropas_Service service = new operacionesTropas_WS.OperacionesTropas_Service();
        operacionesTropas_WS.OperacionesTropas port = service.getOperacionesTropasPort();
        return port.agregarTropasDefensivas(email, tipo, unidades);
    }

    public boolean agregarTropasOfensivas(java.lang.String email, java.lang.String tipo, int unidades) {
        operacionesTropas_WS.OperacionesTropas_Service service = new operacionesTropas_WS.OperacionesTropas_Service();
        operacionesTropas_WS.OperacionesTropas port = service.getOperacionesTropasPort();
        return port.agregarTropasOfensivas(email, tipo, unidades);
    }

    public TropaAtaque getTropaAtaque(java.lang.String emailUsuario, java.lang.String tipoTropa) {
        operacionesTropas_WS.OperacionesTropas_Service service = new operacionesTropas_WS.OperacionesTropas_Service();
        operacionesTropas_WS.OperacionesTropas port = service.getOperacionesTropasPort();
        return port.getTropaAtaque(emailUsuario, tipoTropa);
    }

    public TropaDefensa getTropaDefensa(java.lang.String emailUsuario, java.lang.String tipoTropa) {
        operacionesTropas_WS.OperacionesTropas_Service service = new operacionesTropas_WS.OperacionesTropas_Service();
        operacionesTropas_WS.OperacionesTropas port = service.getOperacionesTropasPort();
        return port.getTropaDefensa(emailUsuario, tipoTropa);
    }

    public boolean mejorarFabricaDefensiva(java.lang.String email) {
        operacionesTropas_WS.OperacionesTropas_Service service = new operacionesTropas_WS.OperacionesTropas_Service();
        operacionesTropas_WS.OperacionesTropas port = service.getOperacionesTropasPort();
        return port.mejorarFabricaDefensiva(email);
    }

    public boolean mejorarFabricaOfensiva(java.lang.String email) {
        operacionesTropas_WS.OperacionesTropas_Service service = new operacionesTropas_WS.OperacionesTropas_Service();
        operacionesTropas_WS.OperacionesTropas port = service.getOperacionesTropasPort();
        return port.mejorarFabricaOfensiva(email);
    }

    public boolean mejorarTropaDefensiva(java.lang.String email, java.lang.String tipo) {
        operacionesTropas_WS.OperacionesTropas_Service service = new operacionesTropas_WS.OperacionesTropas_Service();
        operacionesTropas_WS.OperacionesTropas port = service.getOperacionesTropasPort();
        return port.mejorarTropaDefensiva(email, tipo);
    }

    public boolean mejorarTropaOfensiva(java.lang.String email, java.lang.String tipo) {
        operacionesTropas_WS.OperacionesTropas_Service service = new operacionesTropas_WS.OperacionesTropas_Service();
        operacionesTropas_WS.OperacionesTropas port = service.getOperacionesTropasPort();
        return port.mejorarTropaOfensiva(email, tipo);
    }

    public Integer getNivelFabricaAtaque(java.lang.String emailUsuario) {
        operacionesTropas_WS.OperacionesTropas_Service service = new operacionesTropas_WS.OperacionesTropas_Service();
        operacionesTropas_WS.OperacionesTropas port = service.getOperacionesTropasPort();
        return port.getNivelFabricaAtaque(emailUsuario);
    }

    public Integer getNivelFabricaDefensa(java.lang.String emailUsuario) {
        operacionesTropas_WS.OperacionesTropas_Service service = new operacionesTropas_WS.OperacionesTropas_Service();
        operacionesTropas_WS.OperacionesTropas port = service.getOperacionesTropasPort();
        return port.getNivelFabricaDefensa(emailUsuario);
    }
    
    
    
}
