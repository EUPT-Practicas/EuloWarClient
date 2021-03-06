
package operacionesTropas_WS;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.10-b140803.1500
 * Generated source version: 2.2
 * 
 */
@WebService(name = "OperacionesTropas", targetNamespace = "http://webservices/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface OperacionesTropas {


    /**
     * 
     * @param email
     * @param tipo
     * @param unidades
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "agregarTropasDefensivas", targetNamespace = "http://webservices/", className = "operacionesTropas_WS.AgregarTropasDefensivas")
    @ResponseWrapper(localName = "agregarTropasDefensivasResponse", targetNamespace = "http://webservices/", className = "operacionesTropas_WS.AgregarTropasDefensivasResponse")
    @Action(input = "http://webservices/OperacionesTropas/agregarTropasDefensivasRequest", output = "http://webservices/OperacionesTropas/agregarTropasDefensivasResponse")
    public boolean agregarTropasDefensivas(
        @WebParam(name = "email", targetNamespace = "")
        String email,
        @WebParam(name = "tipo", targetNamespace = "")
        String tipo,
        @WebParam(name = "unidades", targetNamespace = "")
        int unidades);

    /**
     * 
     * @param emailUsuario
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "eliminarTropasOfensivas", targetNamespace = "http://webservices/", className = "operacionesTropas_WS.EliminarTropasOfensivas")
    @ResponseWrapper(localName = "eliminarTropasOfensivasResponse", targetNamespace = "http://webservices/", className = "operacionesTropas_WS.EliminarTropasOfensivasResponse")
    @Action(input = "http://webservices/OperacionesTropas/eliminarTropasOfensivasRequest", output = "http://webservices/OperacionesTropas/eliminarTropasOfensivasResponse")
    public boolean eliminarTropasOfensivas(
        @WebParam(name = "emailUsuario", targetNamespace = "")
        String emailUsuario);

    /**
     * 
     * @param emailUsuario
     * @return
     *     returns java.lang.Integer
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getNivelFabricaAtaque", targetNamespace = "http://webservices/", className = "operacionesTropas_WS.GetNivelFabricaAtaque")
    @ResponseWrapper(localName = "getNivelFabricaAtaqueResponse", targetNamespace = "http://webservices/", className = "operacionesTropas_WS.GetNivelFabricaAtaqueResponse")
    @Action(input = "http://webservices/OperacionesTropas/getNivelFabricaAtaqueRequest", output = "http://webservices/OperacionesTropas/getNivelFabricaAtaqueResponse")
    public Integer getNivelFabricaAtaque(
        @WebParam(name = "emailUsuario", targetNamespace = "")
        String emailUsuario);

    /**
     * 
     * @param emailUsuario
     * @return
     *     returns java.lang.Integer
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getNivelFabricaDefensa", targetNamespace = "http://webservices/", className = "operacionesTropas_WS.GetNivelFabricaDefensa")
    @ResponseWrapper(localName = "getNivelFabricaDefensaResponse", targetNamespace = "http://webservices/", className = "operacionesTropas_WS.GetNivelFabricaDefensaResponse")
    @Action(input = "http://webservices/OperacionesTropas/getNivelFabricaDefensaRequest", output = "http://webservices/OperacionesTropas/getNivelFabricaDefensaResponse")
    public Integer getNivelFabricaDefensa(
        @WebParam(name = "emailUsuario", targetNamespace = "")
        String emailUsuario);

    /**
     * 
     * @param email
     * @param tipo
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "mejorarTropaOfensiva", targetNamespace = "http://webservices/", className = "operacionesTropas_WS.MejorarTropaOfensiva")
    @ResponseWrapper(localName = "mejorarTropaOfensivaResponse", targetNamespace = "http://webservices/", className = "operacionesTropas_WS.MejorarTropaOfensivaResponse")
    @Action(input = "http://webservices/OperacionesTropas/mejorarTropaOfensivaRequest", output = "http://webservices/OperacionesTropas/mejorarTropaOfensivaResponse")
    public boolean mejorarTropaOfensiva(
        @WebParam(name = "email", targetNamespace = "")
        String email,
        @WebParam(name = "tipo", targetNamespace = "")
        String tipo);

    /**
     * 
     * @param email
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "mejorarFabricaOfensiva", targetNamespace = "http://webservices/", className = "operacionesTropas_WS.MejorarFabricaOfensiva")
    @ResponseWrapper(localName = "mejorarFabricaOfensivaResponse", targetNamespace = "http://webservices/", className = "operacionesTropas_WS.MejorarFabricaOfensivaResponse")
    @Action(input = "http://webservices/OperacionesTropas/mejorarFabricaOfensivaRequest", output = "http://webservices/OperacionesTropas/mejorarFabricaOfensivaResponse")
    public boolean mejorarFabricaOfensiva(
        @WebParam(name = "email", targetNamespace = "")
        String email);

    /**
     * 
     * @param email
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "mejorarFabricaDefensiva", targetNamespace = "http://webservices/", className = "operacionesTropas_WS.MejorarFabricaDefensiva")
    @ResponseWrapper(localName = "mejorarFabricaDefensivaResponse", targetNamespace = "http://webservices/", className = "operacionesTropas_WS.MejorarFabricaDefensivaResponse")
    @Action(input = "http://webservices/OperacionesTropas/mejorarFabricaDefensivaRequest", output = "http://webservices/OperacionesTropas/mejorarFabricaDefensivaResponse")
    public boolean mejorarFabricaDefensiva(
        @WebParam(name = "email", targetNamespace = "")
        String email);

    /**
     * 
     * @param email
     * @param tipo
     * @param unidades
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "agregarTropasOfensivas", targetNamespace = "http://webservices/", className = "operacionesTropas_WS.AgregarTropasOfensivas")
    @ResponseWrapper(localName = "agregarTropasOfensivasResponse", targetNamespace = "http://webservices/", className = "operacionesTropas_WS.AgregarTropasOfensivasResponse")
    @Action(input = "http://webservices/OperacionesTropas/agregarTropasOfensivasRequest", output = "http://webservices/OperacionesTropas/agregarTropasOfensivasResponse")
    public boolean agregarTropasOfensivas(
        @WebParam(name = "email", targetNamespace = "")
        String email,
        @WebParam(name = "tipo", targetNamespace = "")
        String tipo,
        @WebParam(name = "unidades", targetNamespace = "")
        int unidades);

    /**
     * 
     * @param email
     * @param tipo
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "mejorarTropaDefensiva", targetNamespace = "http://webservices/", className = "operacionesTropas_WS.MejorarTropaDefensiva")
    @ResponseWrapper(localName = "mejorarTropaDefensivaResponse", targetNamespace = "http://webservices/", className = "operacionesTropas_WS.MejorarTropaDefensivaResponse")
    @Action(input = "http://webservices/OperacionesTropas/mejorarTropaDefensivaRequest", output = "http://webservices/OperacionesTropas/mejorarTropaDefensivaResponse")
    public boolean mejorarTropaDefensiva(
        @WebParam(name = "email", targetNamespace = "")
        String email,
        @WebParam(name = "tipo", targetNamespace = "")
        String tipo);

    /**
     * 
     * @param emailUsuario
     * @param tipoTropa
     * @return
     *     returns operacionesTropas_WS.TropaAtaque
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getTropaAtaque", targetNamespace = "http://webservices/", className = "operacionesTropas_WS.GetTropaAtaque")
    @ResponseWrapper(localName = "getTropaAtaqueResponse", targetNamespace = "http://webservices/", className = "operacionesTropas_WS.GetTropaAtaqueResponse")
    @Action(input = "http://webservices/OperacionesTropas/getTropaAtaqueRequest", output = "http://webservices/OperacionesTropas/getTropaAtaqueResponse")
    public TropaAtaque getTropaAtaque(
        @WebParam(name = "emailUsuario", targetNamespace = "")
        String emailUsuario,
        @WebParam(name = "tipoTropa", targetNamespace = "")
        String tipoTropa);

    /**
     * 
     * @param emailUsuario
     * @param tipoTropa
     * @return
     *     returns operacionesTropas_WS.TropaDefensa
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getTropaDefensa", targetNamespace = "http://webservices/", className = "operacionesTropas_WS.GetTropaDefensa")
    @ResponseWrapper(localName = "getTropaDefensaResponse", targetNamespace = "http://webservices/", className = "operacionesTropas_WS.GetTropaDefensaResponse")
    @Action(input = "http://webservices/OperacionesTropas/getTropaDefensaRequest", output = "http://webservices/OperacionesTropas/getTropaDefensaResponse")
    public TropaDefensa getTropaDefensa(
        @WebParam(name = "emailUsuario", targetNamespace = "")
        String emailUsuario,
        @WebParam(name = "tipoTropa", targetNamespace = "")
        String tipoTropa);

}
