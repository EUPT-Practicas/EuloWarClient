/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cliente_webservice;

/**
 *
 * @author FranciscoJavier
 */
public class ClienteGestionPerfil {
    
    public ClienteGestionPerfil(){
        
    }

    public Boolean cambiarPassword(java.lang.String emailUsuario, java.lang.String viejaPassword, java.lang.String nuevaPassword, java.lang.String repiteNuevaPassword) {
        gestionperfil_WS.GestionPerfilUsuario_Service service = new gestionperfil_WS.GestionPerfilUsuario_Service();
        gestionperfil_WS.GestionPerfilUsuario port = service.getGestionPerfilUsuarioPort();
        return port.cambiarPassword(emailUsuario, viejaPassword, nuevaPassword, repiteNuevaPassword);
    }

    public Boolean eliminarCuenta(java.lang.String emailUsuario, java.lang.String password) {
        gestionperfil_WS.GestionPerfilUsuario_Service service = new gestionperfil_WS.GestionPerfilUsuario_Service();
        gestionperfil_WS.GestionPerfilUsuario port = service.getGestionPerfilUsuarioPort();
        return port.eliminarCuenta(emailUsuario, password);
    }

    public Boolean restablecerPassword(java.lang.String emailUsuario) {
        gestionperfil_WS.GestionPerfilUsuario_Service service = new gestionperfil_WS.GestionPerfilUsuario_Service();
        gestionperfil_WS.GestionPerfilUsuario port = service.getGestionPerfilUsuarioPort();
        return port.restablecerPassword(emailUsuario);
    }
    
}
