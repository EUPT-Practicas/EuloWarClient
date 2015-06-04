
package asignarRecursos_WS;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the asignarRecursos_WS package. 
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

    private final static QName _AsignarFabricasTropas_QNAME = new QName("http://webservices/", "asignarFabricasTropas");
    private final static QName _AsignarFabricasTropasResponse_QNAME = new QName("http://webservices/", "asignarFabricasTropasResponse");
    private final static QName _AsignarRecursos_QNAME = new QName("http://webservices/", "asignarRecursos");
    private final static QName _AsignarRecursosResponse_QNAME = new QName("http://webservices/", "asignarRecursosResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: asignarRecursos_WS
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AsignarRecursosResponse }
     * 
     */
    public AsignarRecursosResponse createAsignarRecursosResponse() {
        return new AsignarRecursosResponse();
    }

    /**
     * Create an instance of {@link AsignarRecursos }
     * 
     */
    public AsignarRecursos createAsignarRecursos() {
        return new AsignarRecursos();
    }

    /**
     * Create an instance of {@link AsignarFabricasTropasResponse }
     * 
     */
    public AsignarFabricasTropasResponse createAsignarFabricasTropasResponse() {
        return new AsignarFabricasTropasResponse();
    }

    /**
     * Create an instance of {@link AsignarFabricasTropas }
     * 
     */
    public AsignarFabricasTropas createAsignarFabricasTropas() {
        return new AsignarFabricasTropas();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AsignarFabricasTropas }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices/", name = "asignarFabricasTropas")
    public JAXBElement<AsignarFabricasTropas> createAsignarFabricasTropas(AsignarFabricasTropas value) {
        return new JAXBElement<AsignarFabricasTropas>(_AsignarFabricasTropas_QNAME, AsignarFabricasTropas.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AsignarFabricasTropasResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices/", name = "asignarFabricasTropasResponse")
    public JAXBElement<AsignarFabricasTropasResponse> createAsignarFabricasTropasResponse(AsignarFabricasTropasResponse value) {
        return new JAXBElement<AsignarFabricasTropasResponse>(_AsignarFabricasTropasResponse_QNAME, AsignarFabricasTropasResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AsignarRecursos }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices/", name = "asignarRecursos")
    public JAXBElement<AsignarRecursos> createAsignarRecursos(AsignarRecursos value) {
        return new JAXBElement<AsignarRecursos>(_AsignarRecursos_QNAME, AsignarRecursos.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AsignarRecursosResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices/", name = "asignarRecursosResponse")
    public JAXBElement<AsignarRecursosResponse> createAsignarRecursosResponse(AsignarRecursosResponse value) {
        return new JAXBElement<AsignarRecursosResponse>(_AsignarRecursosResponse_QNAME, AsignarRecursosResponse.class, null, value);
    }

}
