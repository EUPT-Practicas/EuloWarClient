
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

    private final static QName _Recurso_QNAME = new QName("http://webservices/", "recurso");
    private final static QName _AsignarMina_QNAME = new QName("http://webservices/", "asignarMina");
    private final static QName _Mina_QNAME = new QName("http://webservices/", "mina");
    private final static QName _AsignarRecursos_QNAME = new QName("http://webservices/", "asignarRecursos");
    private final static QName _Usuario_QNAME = new QName("http://webservices/", "usuario");
    private final static QName _AsignarRecursosResponse_QNAME = new QName("http://webservices/", "asignarRecursosResponse");
    private final static QName _AsignarMinaResponse_QNAME = new QName("http://webservices/", "asignarMinaResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: asignarRecursos_WS
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AsignarMinaResponse }
     * 
     */
    public AsignarMinaResponse createAsignarMinaResponse() {
        return new AsignarMinaResponse();
    }

    /**
     * Create an instance of {@link AsignarRecursosResponse }
     * 
     */
    public AsignarRecursosResponse createAsignarRecursosResponse() {
        return new AsignarRecursosResponse();
    }

    /**
     * Create an instance of {@link Usuario }
     * 
     */
    public Usuario createUsuario() {
        return new Usuario();
    }

    /**
     * Create an instance of {@link AsignarRecursos }
     * 
     */
    public AsignarRecursos createAsignarRecursos() {
        return new AsignarRecursos();
    }

    /**
     * Create an instance of {@link AsignarMina }
     * 
     */
    public AsignarMina createAsignarMina() {
        return new AsignarMina();
    }

    /**
     * Create an instance of {@link Mina }
     * 
     */
    public Mina createMina() {
        return new Mina();
    }

    /**
     * Create an instance of {@link Recurso }
     * 
     */
    public Recurso createRecurso() {
        return new Recurso();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Recurso }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices/", name = "recurso")
    public JAXBElement<Recurso> createRecurso(Recurso value) {
        return new JAXBElement<Recurso>(_Recurso_QNAME, Recurso.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AsignarMina }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices/", name = "asignarMina")
    public JAXBElement<AsignarMina> createAsignarMina(AsignarMina value) {
        return new JAXBElement<AsignarMina>(_AsignarMina_QNAME, AsignarMina.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Mina }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices/", name = "mina")
    public JAXBElement<Mina> createMina(Mina value) {
        return new JAXBElement<Mina>(_Mina_QNAME, Mina.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link Usuario }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices/", name = "usuario")
    public JAXBElement<Usuario> createUsuario(Usuario value) {
        return new JAXBElement<Usuario>(_Usuario_QNAME, Usuario.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AsignarRecursosResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices/", name = "asignarRecursosResponse")
    public JAXBElement<AsignarRecursosResponse> createAsignarRecursosResponse(AsignarRecursosResponse value) {
        return new JAXBElement<AsignarRecursosResponse>(_AsignarRecursosResponse_QNAME, AsignarRecursosResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AsignarMinaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices/", name = "asignarMinaResponse")
    public JAXBElement<AsignarMinaResponse> createAsignarMinaResponse(AsignarMinaResponse value) {
        return new JAXBElement<AsignarMinaResponse>(_AsignarMinaResponse_QNAME, AsignarMinaResponse.class, null, value);
    }

}
