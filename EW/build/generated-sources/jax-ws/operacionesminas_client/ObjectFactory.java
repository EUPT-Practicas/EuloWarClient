
package operacionesminas_client;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the operacionesminas_client package. 
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
    private final static QName _ObtenerMinasResponse_QNAME = new QName("http://webservices/", "obtenerMinasResponse");
    private final static QName _ProducirRecursos_QNAME = new QName("http://webservices/", "producirRecursos");
    private final static QName _AsignarMina_QNAME = new QName("http://webservices/", "asignarMina");
    private final static QName _AsignarMinaResponse_QNAME = new QName("http://webservices/", "asignarMinaResponse");
    private final static QName _ObtenerNivelMina_QNAME = new QName("http://webservices/", "obtenerNivelMina");
    private final static QName _MejorarMinaResponse_QNAME = new QName("http://webservices/", "mejorarMinaResponse");
    private final static QName _ObtenerMinas_QNAME = new QName("http://webservices/", "obtenerMinas");
    private final static QName _Mina_QNAME = new QName("http://webservices/", "mina");
    private final static QName _MejorarMina_QNAME = new QName("http://webservices/", "mejorarMina");
    private final static QName _ProducirRecursosResponse_QNAME = new QName("http://webservices/", "producirRecursosResponse");
    private final static QName _Usuario_QNAME = new QName("http://webservices/", "usuario");
    private final static QName _NivelMina_QNAME = new QName("http://webservices/", "nivelMina");
    private final static QName _ObtenerNivelMinaResponse_QNAME = new QName("http://webservices/", "obtenerNivelMinaResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: operacionesminas_client
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
     * Create an instance of {@link ObtenerNivelMina }
     * 
     */
    public ObtenerNivelMina createObtenerNivelMina() {
        return new ObtenerNivelMina();
    }

    /**
     * Create an instance of {@link NivelMina }
     * 
     */
    public NivelMina createNivelMina() {
        return new NivelMina();
    }

    /**
     * Create an instance of {@link ObtenerNivelMinaResponse }
     * 
     */
    public ObtenerNivelMinaResponse createObtenerNivelMinaResponse() {
        return new ObtenerNivelMinaResponse();
    }

    /**
     * Create an instance of {@link ProducirRecursosResponse }
     * 
     */
    public ProducirRecursosResponse createProducirRecursosResponse() {
        return new ProducirRecursosResponse();
    }

    /**
     * Create an instance of {@link Usuario }
     * 
     */
    public Usuario createUsuario() {
        return new Usuario();
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
     * Create an instance of {@link MejorarMina }
     * 
     */
    public MejorarMina createMejorarMina() {
        return new MejorarMina();
    }

    /**
     * Create an instance of {@link ProducirRecursos }
     * 
     */
    public ProducirRecursos createProducirRecursos() {
        return new ProducirRecursos();
    }

    /**
     * Create an instance of {@link ObtenerMinas }
     * 
     */
    public ObtenerMinas createObtenerMinas() {
        return new ObtenerMinas();
    }

    /**
     * Create an instance of {@link ObtenerMinasResponse }
     * 
     */
    public ObtenerMinasResponse createObtenerMinasResponse() {
        return new ObtenerMinasResponse();
    }

    /**
     * Create an instance of {@link MejorarMinaResponse }
     * 
     */
    public MejorarMinaResponse createMejorarMinaResponse() {
        return new MejorarMinaResponse();
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerMinasResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices/", name = "obtenerMinasResponse")
    public JAXBElement<ObtenerMinasResponse> createObtenerMinasResponse(ObtenerMinasResponse value) {
        return new JAXBElement<ObtenerMinasResponse>(_ObtenerMinasResponse_QNAME, ObtenerMinasResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProducirRecursos }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices/", name = "producirRecursos")
    public JAXBElement<ProducirRecursos> createProducirRecursos(ProducirRecursos value) {
        return new JAXBElement<ProducirRecursos>(_ProducirRecursos_QNAME, ProducirRecursos.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link AsignarMinaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices/", name = "asignarMinaResponse")
    public JAXBElement<AsignarMinaResponse> createAsignarMinaResponse(AsignarMinaResponse value) {
        return new JAXBElement<AsignarMinaResponse>(_AsignarMinaResponse_QNAME, AsignarMinaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerNivelMina }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices/", name = "obtenerNivelMina")
    public JAXBElement<ObtenerNivelMina> createObtenerNivelMina(ObtenerNivelMina value) {
        return new JAXBElement<ObtenerNivelMina>(_ObtenerNivelMina_QNAME, ObtenerNivelMina.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MejorarMinaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices/", name = "mejorarMinaResponse")
    public JAXBElement<MejorarMinaResponse> createMejorarMinaResponse(MejorarMinaResponse value) {
        return new JAXBElement<MejorarMinaResponse>(_MejorarMinaResponse_QNAME, MejorarMinaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerMinas }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices/", name = "obtenerMinas")
    public JAXBElement<ObtenerMinas> createObtenerMinas(ObtenerMinas value) {
        return new JAXBElement<ObtenerMinas>(_ObtenerMinas_QNAME, ObtenerMinas.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link MejorarMina }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices/", name = "mejorarMina")
    public JAXBElement<MejorarMina> createMejorarMina(MejorarMina value) {
        return new JAXBElement<MejorarMina>(_MejorarMina_QNAME, MejorarMina.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProducirRecursosResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices/", name = "producirRecursosResponse")
    public JAXBElement<ProducirRecursosResponse> createProducirRecursosResponse(ProducirRecursosResponse value) {
        return new JAXBElement<ProducirRecursosResponse>(_ProducirRecursosResponse_QNAME, ProducirRecursosResponse.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link NivelMina }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices/", name = "nivelMina")
    public JAXBElement<NivelMina> createNivelMina(NivelMina value) {
        return new JAXBElement<NivelMina>(_NivelMina_QNAME, NivelMina.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerNivelMinaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices/", name = "obtenerNivelMinaResponse")
    public JAXBElement<ObtenerNivelMinaResponse> createObtenerNivelMinaResponse(ObtenerNivelMinaResponse value) {
        return new JAXBElement<ObtenerNivelMinaResponse>(_ObtenerNivelMinaResponse_QNAME, ObtenerNivelMinaResponse.class, null, value);
    }

}
