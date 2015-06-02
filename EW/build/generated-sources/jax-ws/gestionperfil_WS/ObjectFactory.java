
package gestionperfil_WS;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the gestionperfil_WS package. 
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

    private final static QName _RestablecerPassword_QNAME = new QName("http://webservices/", "restablecerPassword");
    private final static QName _RestablecerPasswordResponse_QNAME = new QName("http://webservices/", "restablecerPasswordResponse");
    private final static QName _EliminarCuentaResponse_QNAME = new QName("http://webservices/", "eliminarCuentaResponse");
    private final static QName _CambiarPasswordResponse_QNAME = new QName("http://webservices/", "cambiarPasswordResponse");
    private final static QName _CambiarPassword_QNAME = new QName("http://webservices/", "cambiarPassword");
    private final static QName _HelloResponse_QNAME = new QName("http://webservices/", "helloResponse");
    private final static QName _EliminarCuenta_QNAME = new QName("http://webservices/", "eliminarCuenta");
    private final static QName _Hello_QNAME = new QName("http://webservices/", "hello");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: gestionperfil_WS
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Hello }
     * 
     */
    public Hello createHello() {
        return new Hello();
    }

    /**
     * Create an instance of {@link EliminarCuenta }
     * 
     */
    public EliminarCuenta createEliminarCuenta() {
        return new EliminarCuenta();
    }

    /**
     * Create an instance of {@link CambiarPasswordResponse }
     * 
     */
    public CambiarPasswordResponse createCambiarPasswordResponse() {
        return new CambiarPasswordResponse();
    }

    /**
     * Create an instance of {@link HelloResponse }
     * 
     */
    public HelloResponse createHelloResponse() {
        return new HelloResponse();
    }

    /**
     * Create an instance of {@link CambiarPassword }
     * 
     */
    public CambiarPassword createCambiarPassword() {
        return new CambiarPassword();
    }

    /**
     * Create an instance of {@link RestablecerPasswordResponse }
     * 
     */
    public RestablecerPasswordResponse createRestablecerPasswordResponse() {
        return new RestablecerPasswordResponse();
    }

    /**
     * Create an instance of {@link EliminarCuentaResponse }
     * 
     */
    public EliminarCuentaResponse createEliminarCuentaResponse() {
        return new EliminarCuentaResponse();
    }

    /**
     * Create an instance of {@link RestablecerPassword }
     * 
     */
    public RestablecerPassword createRestablecerPassword() {
        return new RestablecerPassword();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RestablecerPassword }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices/", name = "restablecerPassword")
    public JAXBElement<RestablecerPassword> createRestablecerPassword(RestablecerPassword value) {
        return new JAXBElement<RestablecerPassword>(_RestablecerPassword_QNAME, RestablecerPassword.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RestablecerPasswordResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices/", name = "restablecerPasswordResponse")
    public JAXBElement<RestablecerPasswordResponse> createRestablecerPasswordResponse(RestablecerPasswordResponse value) {
        return new JAXBElement<RestablecerPasswordResponse>(_RestablecerPasswordResponse_QNAME, RestablecerPasswordResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EliminarCuentaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices/", name = "eliminarCuentaResponse")
    public JAXBElement<EliminarCuentaResponse> createEliminarCuentaResponse(EliminarCuentaResponse value) {
        return new JAXBElement<EliminarCuentaResponse>(_EliminarCuentaResponse_QNAME, EliminarCuentaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CambiarPasswordResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices/", name = "cambiarPasswordResponse")
    public JAXBElement<CambiarPasswordResponse> createCambiarPasswordResponse(CambiarPasswordResponse value) {
        return new JAXBElement<CambiarPasswordResponse>(_CambiarPasswordResponse_QNAME, CambiarPasswordResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CambiarPassword }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices/", name = "cambiarPassword")
    public JAXBElement<CambiarPassword> createCambiarPassword(CambiarPassword value) {
        return new JAXBElement<CambiarPassword>(_CambiarPassword_QNAME, CambiarPassword.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HelloResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices/", name = "helloResponse")
    public JAXBElement<HelloResponse> createHelloResponse(HelloResponse value) {
        return new JAXBElement<HelloResponse>(_HelloResponse_QNAME, HelloResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EliminarCuenta }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices/", name = "eliminarCuenta")
    public JAXBElement<EliminarCuenta> createEliminarCuenta(EliminarCuenta value) {
        return new JAXBElement<EliminarCuenta>(_EliminarCuenta_QNAME, EliminarCuenta.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Hello }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices/", name = "hello")
    public JAXBElement<Hello> createHello(Hello value) {
        return new JAXBElement<Hello>(_Hello_QNAME, Hello.class, null, value);
    }

}
