
package operacionesRecursos_WS;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the operacionesRecursos_WS package. 
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

    private final static QName _ObtenerRecursosResponse_QNAME = new QName("http://webservices/", "obtenerRecursosResponse");
    private final static QName _RestarRecursosResponse_QNAME = new QName("http://webservices/", "restarRecursosResponse");
    private final static QName _SumarRecursos_QNAME = new QName("http://webservices/", "sumarRecursos");
    private final static QName _ObtenerRecursos_QNAME = new QName("http://webservices/", "obtenerRecursos");
    private final static QName _RestarRecursos_QNAME = new QName("http://webservices/", "restarRecursos");
    private final static QName _SumarRecursosResponse_QNAME = new QName("http://webservices/", "sumarRecursosResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: operacionesRecursos_WS
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SumarRecursosResponse }
     * 
     */
    public SumarRecursosResponse createSumarRecursosResponse() {
        return new SumarRecursosResponse();
    }

    /**
     * Create an instance of {@link RestarRecursos }
     * 
     */
    public RestarRecursos createRestarRecursos() {
        return new RestarRecursos();
    }

    /**
     * Create an instance of {@link ObtenerRecursos }
     * 
     */
    public ObtenerRecursos createObtenerRecursos() {
        return new ObtenerRecursos();
    }

    /**
     * Create an instance of {@link SumarRecursos }
     * 
     */
    public SumarRecursos createSumarRecursos() {
        return new SumarRecursos();
    }

    /**
     * Create an instance of {@link RestarRecursosResponse }
     * 
     */
    public RestarRecursosResponse createRestarRecursosResponse() {
        return new RestarRecursosResponse();
    }

    /**
     * Create an instance of {@link ObtenerRecursosResponse }
     * 
     */
    public ObtenerRecursosResponse createObtenerRecursosResponse() {
        return new ObtenerRecursosResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerRecursosResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices/", name = "obtenerRecursosResponse")
    public JAXBElement<ObtenerRecursosResponse> createObtenerRecursosResponse(ObtenerRecursosResponse value) {
        return new JAXBElement<ObtenerRecursosResponse>(_ObtenerRecursosResponse_QNAME, ObtenerRecursosResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RestarRecursosResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices/", name = "restarRecursosResponse")
    public JAXBElement<RestarRecursosResponse> createRestarRecursosResponse(RestarRecursosResponse value) {
        return new JAXBElement<RestarRecursosResponse>(_RestarRecursosResponse_QNAME, RestarRecursosResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SumarRecursos }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices/", name = "sumarRecursos")
    public JAXBElement<SumarRecursos> createSumarRecursos(SumarRecursos value) {
        return new JAXBElement<SumarRecursos>(_SumarRecursos_QNAME, SumarRecursos.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerRecursos }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices/", name = "obtenerRecursos")
    public JAXBElement<ObtenerRecursos> createObtenerRecursos(ObtenerRecursos value) {
        return new JAXBElement<ObtenerRecursos>(_ObtenerRecursos_QNAME, ObtenerRecursos.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RestarRecursos }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices/", name = "restarRecursos")
    public JAXBElement<RestarRecursos> createRestarRecursos(RestarRecursos value) {
        return new JAXBElement<RestarRecursos>(_RestarRecursos_QNAME, RestarRecursos.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SumarRecursosResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices/", name = "sumarRecursosResponse")
    public JAXBElement<SumarRecursosResponse> createSumarRecursosResponse(SumarRecursosResponse value) {
        return new JAXBElement<SumarRecursosResponse>(_SumarRecursosResponse_QNAME, SumarRecursosResponse.class, null, value);
    }

}
