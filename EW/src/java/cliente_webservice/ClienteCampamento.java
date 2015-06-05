/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cliente_webservice;

import operacionesCampamento_WS.Campamento;

/**
 *
 * @author Sergio
 */
public class ClienteCampamento {

    public Campamento getCampamento(int idCampamento) {
        operacionesCampamento_WS.OperacionesCampamento_Service service = new operacionesCampamento_WS.OperacionesCampamento_Service();
        operacionesCampamento_WS.OperacionesCampamento port = service.getOperacionesCampamentoPort();
        return port.getCampamento(idCampamento);
    }

    public Boolean nuevoCampamento(java.lang.String emailUsuario) {
        operacionesCampamento_WS.OperacionesCampamento_Service service = new operacionesCampamento_WS.OperacionesCampamento_Service();
        operacionesCampamento_WS.OperacionesCampamento port = service.getOperacionesCampamentoPort();
        return port.nuevoCampamento(emailUsuario);
    }

    public java.util.List<java.lang.Object> obtenerCampamentos(java.lang.String emailUsuario) {
        operacionesCampamento_WS.OperacionesCampamento_Service service = new operacionesCampamento_WS.OperacionesCampamento_Service();
        operacionesCampamento_WS.OperacionesCampamento port = service.getOperacionesCampamentoPort();
        return port.obtenerCampamentos(emailUsuario);
    }
    
    
    
}
