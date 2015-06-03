/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cliente_webservice;

import asignarRecursos_WS.Mina;
import clientes_WS.Usuario;

/**
 *
 * @author FranciscoJavier
 */
public class ClienteRegistroAuth {
    
    public ClienteRegistroAuth(){
        
    }

    public boolean comprobarLogin(java.lang.String nombreUsuario, java.lang.String password) {
        clientes_WS.ServiceRegistroAutenticacion_Service service = new clientes_WS.ServiceRegistroAutenticacion_Service();
        clientes_WS.ServiceRegistroAutenticacion port = service.getServiceRegistroAutenticacionPort();
        return port.comprobarLogin(nombreUsuario, password);
    }

    public boolean crearUsuario(java.lang.String email, java.lang.String nombreUsuario, java.lang.String password) {
        clientes_WS.ServiceRegistroAutenticacion_Service service = new clientes_WS.ServiceRegistroAutenticacion_Service();
        clientes_WS.ServiceRegistroAutenticacion port = service.getServiceRegistroAutenticacionPort();
        return port.crearUsuario(email, nombreUsuario, password);
    }

    public Mina asignarMina(java.lang.String emailUsuario) {
        asignarRecursos_WS.AsignarRecursosInicio_Service service = new asignarRecursos_WS.AsignarRecursosInicio_Service();
        asignarRecursos_WS.AsignarRecursosInicio port = service.getAsignarRecursosInicioPort();
        return port.asignarMina(emailUsuario);
    }

    public boolean asignarRecursos(java.lang.String email) {
        asignarRecursos_WS.AsignarRecursosInicio_Service service = new asignarRecursos_WS.AsignarRecursosInicio_Service();
        asignarRecursos_WS.AsignarRecursosInicio port = service.getAsignarRecursosInicioPort();
        return port.asignarRecursos(email);
    }

    public Usuario findUser(java.lang.String nomUsuario) {
        clientes_WS.ServiceRegistroAutenticacion_Service service = new clientes_WS.ServiceRegistroAutenticacion_Service();
        clientes_WS.ServiceRegistroAutenticacion port = service.getServiceRegistroAutenticacionPort();
        return port.findUser(nomUsuario);
    }

    public boolean existeUsuario(java.lang.String email) {
        clientes_WS.ServiceRegistroAutenticacion_Service service = new clientes_WS.ServiceRegistroAutenticacion_Service();
        clientes_WS.ServiceRegistroAutenticacion port = service.getServiceRegistroAutenticacionPort();
        return port.existeUsuario(email);
    }

    
  
}
