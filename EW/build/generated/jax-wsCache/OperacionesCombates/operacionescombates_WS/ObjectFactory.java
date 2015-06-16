
package operacionescombates_WS;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the operacionescombates_WS package. 
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

    private final static QName _ElegirRivalResponse_QNAME = new QName("http://webservices/", "elegirRivalResponse");
    private final static QName _SimularCombate_QNAME = new QName("http://webservices/", "simularCombate");
    private final static QName _ElegirRival_QNAME = new QName("http://webservices/", "elegirRival");
    private final static QName _SimularCombateResponse_QNAME = new QName("http://webservices/", "simularCombateResponse");
    private final static QName _Usuario_QNAME = new QName("http://webservices/", "usuario");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: operacionescombates_WS
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Usuario }
     * 
     */
    public Usuario createUsuario() {
        return new Usuario();
    }

    /**
     * Create an instance of {@link SimularCombateResponse }
     * 
     */
    public SimularCombateResponse createSimularCombateResponse() {
        return new SimularCombateResponse();
    }

    /**
     * Create an instance of {@link ElegirRival }
     * 
     */
    public ElegirRival createElegirRival() {
        return new ElegirRival();
    }

    /**
     * Create an instance of {@link SimularCombate }
     * 
     */
    public SimularCombate createSimularCombate() {
        return new SimularCombate();
    }

    /**
     * Create an instance of {@link ElegirRivalResponse }
     * 
     */
    public ElegirRivalResponse createElegirRivalResponse() {
        return new ElegirRivalResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ElegirRivalResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices/", name = "elegirRivalResponse")
    public JAXBElement<ElegirRivalResponse> createElegirRivalResponse(ElegirRivalResponse value) {
        return new JAXBElement<ElegirRivalResponse>(_ElegirRivalResponse_QNAME, ElegirRivalResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SimularCombate }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices/", name = "simularCombate")
    public JAXBElement<SimularCombate> createSimularCombate(SimularCombate value) {
        return new JAXBElement<SimularCombate>(_SimularCombate_QNAME, SimularCombate.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ElegirRival }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices/", name = "elegirRival")
    public JAXBElement<ElegirRival> createElegirRival(ElegirRival value) {
        return new JAXBElement<ElegirRival>(_ElegirRival_QNAME, ElegirRival.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SimularCombateResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices/", name = "simularCombateResponse")
    public JAXBElement<SimularCombateResponse> createSimularCombateResponse(SimularCombateResponse value) {
        return new JAXBElement<SimularCombateResponse>(_SimularCombateResponse_QNAME, SimularCombateResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Usuario }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices/", name = "usuario")
    public JAXBElement<Usuario> createUsuario(Usuario value) {
        return new JAXBElement<Usuario>(_Usuario_QNAME, Usuario.class, null, value);
    }

}
