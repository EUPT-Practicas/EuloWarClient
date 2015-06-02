/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cliente_webservice;

import operacionesminas_client.Mina;
import operacionesminas_client.NivelMina;

/**
 *
 * @author FranciscoJavier
 */
public class ClienteRecursosMinas {

    public boolean producirRecursos(int idMina) {
        operacionesminas_client.OperacionesMinas_Service service = new operacionesminas_client.OperacionesMinas_Service();
        operacionesminas_client.OperacionesMinas port = service.getOperacionesMinasPort();
        return port.producirRecursos(idMina);
    }
    
        public boolean mejorarMina(int idMina) {
        operacionesminas_client.OperacionesMinas_Service service = new operacionesminas_client.OperacionesMinas_Service();
        operacionesminas_client.OperacionesMinas port = service.getOperacionesMinasPort();
        return port.mejorarMina(idMina);
    }

    /*
    public boolean producirRecursos(int idMina) {
        operacionesminas_client.ProducirRecursosMina service = new operacionesminas_client.ProducirRecursosMina();
        operacionesminas_client.OperacionesMinas port = service.getOperacionesMinasPort();
        return port.producirRecursos(idMina);
    }
    
    

    public boolean mejorarMina(int idMina) {
        operacionesminas_client.ProducirRecursosMina service = new operacionesminas_client.ProducirRecursosMina();
        operacionesminas_client.OperacionesMinas port = service.getOperacionesMinasPort();
        return port.mejorarMina(idMina);
    }

    public Mina asignarMina(java.lang.String emailUsuario) {
        operacionesminas_client.ProducirRecursosMina service = new operacionesminas_client.ProducirRecursosMina();
        operacionesminas_client.OperacionesMinas port = service.getOperacionesMinasPort();
        return port.asignarMina(emailUsuario);
    }   

    public Integer obtenerRecursos(java.lang.String email) {
        operacionesRecursos_WS.OperacionesRecursos_Service service = new operacionesRecursos_WS.OperacionesRecursos_Service();
        operacionesRecursos_WS.OperacionesRecursos port = service.getOperacionesRecursosPort();
        return port.obtenerRecursos(email);
    }

    public String restarRecursos(int unidades, java.lang.String email) {
        operacionesRecursos_WS.OperacionesRecursos_Service service = new operacionesRecursos_WS.OperacionesRecursos_Service();
        operacionesRecursos_WS.OperacionesRecursos port = service.getOperacionesRecursosPort();
        return port.restarRecursos(unidades, email);
    }

    public boolean sumarRecursos(int unidades, java.lang.String email) {
        operacionesRecursos_WS.OperacionesRecursos_Service service = new operacionesRecursos_WS.OperacionesRecursos_Service();
        operacionesRecursos_WS.OperacionesRecursos port = service.getOperacionesRecursosPort();
        return port.sumarRecursos(unidades, email);
    }

    public java.util.List<java.lang.Object> obtenerMinas(java.lang.String email) {
        operacionesminas_client.ProducirRecursosMina service = new operacionesminas_client.ProducirRecursosMina();
        operacionesminas_client.OperacionesMinas port = service.getOperacionesMinasPort();
        return port.obtenerMinas(email);
    }

    public NivelMina obtenerNivelMina(int nivelMina) {
        operacionesminas_client.ProducirRecursosMina service = new operacionesminas_client.ProducirRecursosMina();
        operacionesminas_client.OperacionesMinas port = service.getOperacionesMinasPort();
        return port.obtenerNivelMina(nivelMina);
    }*/

    public Mina asignarMina(java.lang.String emailUsuario) {
        operacionesminas_client.OperacionesMinas_Service service = new operacionesminas_client.OperacionesMinas_Service();
        operacionesminas_client.OperacionesMinas port = service.getOperacionesMinasPort();
        return port.asignarMina(emailUsuario);
    }

    public Integer obtenerRecursos(java.lang.String email) {
        operacionesRecursos_WS.OperacionesRecursos_Service service = new operacionesRecursos_WS.OperacionesRecursos_Service();
        operacionesRecursos_WS.OperacionesRecursos port = service.getOperacionesRecursosPort();
        return port.obtenerRecursos(email);
    }

    public String restarRecursos(int unidades, java.lang.String email) {
        operacionesRecursos_WS.OperacionesRecursos_Service service = new operacionesRecursos_WS.OperacionesRecursos_Service();
        operacionesRecursos_WS.OperacionesRecursos port = service.getOperacionesRecursosPort();
        return port.restarRecursos(unidades, email);
    }

   public boolean sumarRecursos(int unidades, java.lang.String email) {
        operacionesRecursos_WS.OperacionesRecursos_Service service = new operacionesRecursos_WS.OperacionesRecursos_Service();
        operacionesRecursos_WS.OperacionesRecursos port = service.getOperacionesRecursosPort();
        return port.sumarRecursos(unidades, email);
    }

    public java.util.List<java.lang.Object> obtenerMinas(java.lang.String email) {
        operacionesminas_client.OperacionesMinas_Service service = new operacionesminas_client.OperacionesMinas_Service();
        operacionesminas_client.OperacionesMinas port = service.getOperacionesMinasPort();
        return port.obtenerMinas(email);
    }

    public NivelMina obtenerNivelMina(int nivelMina) {
        operacionesminas_client.OperacionesMinas_Service service = new operacionesminas_client.OperacionesMinas_Service();
        operacionesminas_client.OperacionesMinas port = service.getOperacionesMinasPort();
        return port.obtenerNivelMina(nivelMina);
    }

    public Mina getMina(int idMina) {
        operacionesminas_client.OperacionesMinas_Service service = new operacionesminas_client.OperacionesMinas_Service();
        operacionesminas_client.OperacionesMinas port = service.getOperacionesMinasPort();
        return port.getMina(idMina);
    }




}
