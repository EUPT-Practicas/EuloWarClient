
package clientes_WS;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the clientes_WS package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _FindUserResponse_QNAME = new QName("http://webservices/", "findUserResponse");
    private final static QName _ComprobarLoginResponse_QNAME = new QName("http://webservices/", "comprobarLoginResponse");
    private final static QName _FindUser_QNAME = new QName("http://webservices/", "findUser");
    private final static QName _ExisteUsuario_QNAME = new QName("http://webservices/", "existeUsuario");
    private final static QName _ComprobarLogin_QNAME = new QName("http://webservices/", "comprobarLogin");
    private final static QName _CrearUsuario_QNAME = new QName("http://webservices/", "crearUsuario");
    private final static QName _CrearUsuarioResponse_QNAME = new QName("http://webservices/", "crearUsuarioResponse");
    private final static QName _Usuario_QNAME = new QName("http://webservices/", "usuario");
    private final static QName _ExisteUsuarioResponse_QNAME = new QName("http://webservices/", "existeUsuarioResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: clientes_WS
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ExisteUsuarioResponse }
     * 
     */
    public ExisteUsuarioResponse createExisteUsuarioResponse() {
        return new ExisteUsuarioResponse();
    }

    /**
     * Create an instance of {@link Usuario }
     * 
     */
    public Usuario createUsuario() {
        return new Usuario();
    }

    /**
     * Create an instance of {@link CrearUsuarioResponse }
     * 
     */
    public CrearUsuarioResponse createCrearUsuarioResponse() {
        return new CrearUsuarioResponse();
    }

    /**
     * Create an instance of {@link ComprobarLogin }
     * 
     */
    public ComprobarLogin createComprobarLogin() {
        return new ComprobarLogin();
    }

    /**
     * Create an instance of {@link CrearUsuario }
     * 
     */
    public CrearUsuario createCrearUsuario() {
        return new CrearUsuario();
    }

    /**
     * Create an instance of {@link FindUser }
     * 
     */
    public FindUser createFindUser() {
        return new FindUser();
    }

    /**
     * Create an instance of {@link ExisteUsuario }
     * 
     */
    public ExisteUsuario createExisteUsuario() {
        return new ExisteUsuario();
    }

    /**
     * Create an instance of {@link ComprobarLoginResponse }
     * 
     */
    public ComprobarLoginResponse createComprobarLoginResponse() {
        return new ComprobarLoginResponse();
    }

    /**
     * Create an instance of {@link FindUserResponse }
     * 
     */
    public FindUserResponse createFindUserResponse() {
        return new FindUserResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindUserResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices/", name = "findUserResponse")
    public JAXBElement<FindUserResponse> createFindUserResponse(FindUserResponse value) {
        return new JAXBElement<FindUserResponse>(_FindUserResponse_QNAME, FindUserResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ComprobarLoginResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices/", name = "comprobarLoginResponse")
    public JAXBElement<ComprobarLoginResponse> createComprobarLoginResponse(ComprobarLoginResponse value) {
        return new JAXBElement<ComprobarLoginResponse>(_ComprobarLoginResponse_QNAME, ComprobarLoginResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindUser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices/", name = "findUser")
    public JAXBElement<FindUser> createFindUser(FindUser value) {
        return new JAXBElement<FindUser>(_FindUser_QNAME, FindUser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExisteUsuario }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices/", name = "existeUsuario")
    public JAXBElement<ExisteUsuario> createExisteUsuario(ExisteUsuario value) {
        return new JAXBElement<ExisteUsuario>(_ExisteUsuario_QNAME, ExisteUsuario.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ComprobarLogin }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices/", name = "comprobarLogin")
    public JAXBElement<ComprobarLogin> createComprobarLogin(ComprobarLogin value) {
        return new JAXBElement<ComprobarLogin>(_ComprobarLogin_QNAME, ComprobarLogin.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CrearUsuario }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices/", name = "crearUsuario")
    public JAXBElement<CrearUsuario> createCrearUsuario(CrearUsuario value) {
        return new JAXBElement<CrearUsuario>(_CrearUsuario_QNAME, CrearUsuario.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CrearUsuarioResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices/", name = "crearUsuarioResponse")
    public JAXBElement<CrearUsuarioResponse> createCrearUsuarioResponse(CrearUsuarioResponse value) {
        return new JAXBElement<CrearUsuarioResponse>(_CrearUsuarioResponse_QNAME, CrearUsuarioResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Usuario }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices/", name = "usuario")
    public JAXBElement<Usuario> createUsuario(Usuario value) {
        return new JAXBElement<Usuario>(_Usuario_QNAME, Usuario.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExisteUsuarioResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices/", name = "existeUsuarioResponse")
    public JAXBElement<ExisteUsuarioResponse> createExisteUsuarioResponse(ExisteUsuarioResponse value) {
        return new JAXBElement<ExisteUsuarioResponse>(_ExisteUsuarioResponse_QNAME, ExisteUsuarioResponse.class, null, value);
    }

}
