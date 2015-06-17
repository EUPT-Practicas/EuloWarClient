
package operacionesCampamento_WS;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the operacionesCampamento_WS package. 
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

    private final static QName _ObtenerCampamentosResponse_QNAME = new QName("http://webservices/", "obtenerCampamentosResponse");
    private final static QName _ReiniciarCampamentos_QNAME = new QName("http://webservices/", "reiniciarCampamentos");
    private final static QName _NuevoCampamentoResponse_QNAME = new QName("http://webservices/", "nuevoCampamentoResponse");
    private final static QName _Campamento_QNAME = new QName("http://webservices/", "campamento");
    private final static QName _AgregarTropasCampamentoResponse_QNAME = new QName("http://webservices/", "agregarTropasCampamentoResponse");
    private final static QName _NuevoCampamento_QNAME = new QName("http://webservices/", "nuevoCampamento");
    private final static QName _AgregarTropasCampamento_QNAME = new QName("http://webservices/", "agregarTropasCampamento");
    private final static QName _Usuario_QNAME = new QName("http://webservices/", "usuario");
    private final static QName _GetCampamento_QNAME = new QName("http://webservices/", "getCampamento");
    private final static QName _ReiniciarCampamentosResponse_QNAME = new QName("http://webservices/", "reiniciarCampamentosResponse");
    private final static QName _GetCampamentoResponse_QNAME = new QName("http://webservices/", "getCampamentoResponse");
    private final static QName _ObtenerCampamentos_QNAME = new QName("http://webservices/", "obtenerCampamentos");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: operacionesCampamento_WS
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ObtenerCampamentos }
     * 
     */
    public ObtenerCampamentos createObtenerCampamentos() {
        return new ObtenerCampamentos();
    }

    /**
     * Create an instance of {@link GetCampamentoResponse }
     * 
     */
    public GetCampamentoResponse createGetCampamentoResponse() {
        return new GetCampamentoResponse();
    }

    /**
     * Create an instance of {@link ReiniciarCampamentosResponse }
     * 
     */
    public ReiniciarCampamentosResponse createReiniciarCampamentosResponse() {
        return new ReiniciarCampamentosResponse();
    }

    /**
     * Create an instance of {@link GetCampamento }
     * 
     */
    public GetCampamento createGetCampamento() {
        return new GetCampamento();
    }

    /**
     * Create an instance of {@link Usuario }
     * 
     */
    public Usuario createUsuario() {
        return new Usuario();
    }

    /**
     * Create an instance of {@link AgregarTropasCampamento }
     * 
     */
    public AgregarTropasCampamento createAgregarTropasCampamento() {
        return new AgregarTropasCampamento();
    }

    /**
     * Create an instance of {@link AgregarTropasCampamentoResponse }
     * 
     */
    public AgregarTropasCampamentoResponse createAgregarTropasCampamentoResponse() {
        return new AgregarTropasCampamentoResponse();
    }

    /**
     * Create an instance of {@link NuevoCampamento }
     * 
     */
    public NuevoCampamento createNuevoCampamento() {
        return new NuevoCampamento();
    }

    /**
     * Create an instance of {@link Campamento }
     * 
     */
    public Campamento createCampamento() {
        return new Campamento();
    }

    /**
     * Create an instance of {@link ReiniciarCampamentos }
     * 
     */
    public ReiniciarCampamentos createReiniciarCampamentos() {
        return new ReiniciarCampamentos();
    }

    /**
     * Create an instance of {@link NuevoCampamentoResponse }
     * 
     */
    public NuevoCampamentoResponse createNuevoCampamentoResponse() {
        return new NuevoCampamentoResponse();
    }

    /**
     * Create an instance of {@link ObtenerCampamentosResponse }
     * 
     */
    public ObtenerCampamentosResponse createObtenerCampamentosResponse() {
        return new ObtenerCampamentosResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerCampamentosResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices/", name = "obtenerCampamentosResponse")
    public JAXBElement<ObtenerCampamentosResponse> createObtenerCampamentosResponse(ObtenerCampamentosResponse value) {
        return new JAXBElement<ObtenerCampamentosResponse>(_ObtenerCampamentosResponse_QNAME, ObtenerCampamentosResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReiniciarCampamentos }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices/", name = "reiniciarCampamentos")
    public JAXBElement<ReiniciarCampamentos> createReiniciarCampamentos(ReiniciarCampamentos value) {
        return new JAXBElement<ReiniciarCampamentos>(_ReiniciarCampamentos_QNAME, ReiniciarCampamentos.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NuevoCampamentoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices/", name = "nuevoCampamentoResponse")
    public JAXBElement<NuevoCampamentoResponse> createNuevoCampamentoResponse(NuevoCampamentoResponse value) {
        return new JAXBElement<NuevoCampamentoResponse>(_NuevoCampamentoResponse_QNAME, NuevoCampamentoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Campamento }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices/", name = "campamento")
    public JAXBElement<Campamento> createCampamento(Campamento value) {
        return new JAXBElement<Campamento>(_Campamento_QNAME, Campamento.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AgregarTropasCampamentoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices/", name = "agregarTropasCampamentoResponse")
    public JAXBElement<AgregarTropasCampamentoResponse> createAgregarTropasCampamentoResponse(AgregarTropasCampamentoResponse value) {
        return new JAXBElement<AgregarTropasCampamentoResponse>(_AgregarTropasCampamentoResponse_QNAME, AgregarTropasCampamentoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NuevoCampamento }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices/", name = "nuevoCampamento")
    public JAXBElement<NuevoCampamento> createNuevoCampamento(NuevoCampamento value) {
        return new JAXBElement<NuevoCampamento>(_NuevoCampamento_QNAME, NuevoCampamento.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AgregarTropasCampamento }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices/", name = "agregarTropasCampamento")
    public JAXBElement<AgregarTropasCampamento> createAgregarTropasCampamento(AgregarTropasCampamento value) {
        return new JAXBElement<AgregarTropasCampamento>(_AgregarTropasCampamento_QNAME, AgregarTropasCampamento.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCampamento }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices/", name = "getCampamento")
    public JAXBElement<GetCampamento> createGetCampamento(GetCampamento value) {
        return new JAXBElement<GetCampamento>(_GetCampamento_QNAME, GetCampamento.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReiniciarCampamentosResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices/", name = "reiniciarCampamentosResponse")
    public JAXBElement<ReiniciarCampamentosResponse> createReiniciarCampamentosResponse(ReiniciarCampamentosResponse value) {
        return new JAXBElement<ReiniciarCampamentosResponse>(_ReiniciarCampamentosResponse_QNAME, ReiniciarCampamentosResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCampamentoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices/", name = "getCampamentoResponse")
    public JAXBElement<GetCampamentoResponse> createGetCampamentoResponse(GetCampamentoResponse value) {
        return new JAXBElement<GetCampamentoResponse>(_GetCampamentoResponse_QNAME, GetCampamentoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerCampamentos }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices/", name = "obtenerCampamentos")
    public JAXBElement<ObtenerCampamentos> createObtenerCampamentos(ObtenerCampamentos value) {
        return new JAXBElement<ObtenerCampamentos>(_ObtenerCampamentos_QNAME, ObtenerCampamentos.class, null, value);
    }

}
