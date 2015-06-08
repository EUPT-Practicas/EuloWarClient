
package operacionesTropas_WS;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.10-b140803.1500
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "OperacionesTropas", targetNamespace = "http://webservices/", wsdlLocation = "http://localhost:8080/OperacionesTropas/OperacionesTropas?WSDL")
public class OperacionesTropas_Service
    extends Service
{

    private final static URL OPERACIONESTROPAS_WSDL_LOCATION;
    private final static WebServiceException OPERACIONESTROPAS_EXCEPTION;
    private final static QName OPERACIONESTROPAS_QNAME = new QName("http://webservices/", "OperacionesTropas");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/OperacionesTropas/OperacionesTropas?WSDL");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        OPERACIONESTROPAS_WSDL_LOCATION = url;
        OPERACIONESTROPAS_EXCEPTION = e;
    }

    public OperacionesTropas_Service() {
        super(__getWsdlLocation(), OPERACIONESTROPAS_QNAME);
    }

    public OperacionesTropas_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), OPERACIONESTROPAS_QNAME, features);
    }

    public OperacionesTropas_Service(URL wsdlLocation) {
        super(wsdlLocation, OPERACIONESTROPAS_QNAME);
    }

    public OperacionesTropas_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, OPERACIONESTROPAS_QNAME, features);
    }

    public OperacionesTropas_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public OperacionesTropas_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns OperacionesTropas
     */
    @WebEndpoint(name = "OperacionesTropasPort")
    public OperacionesTropas getOperacionesTropasPort() {
        return super.getPort(new QName("http://webservices/", "OperacionesTropasPort"), OperacionesTropas.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns OperacionesTropas
     */
    @WebEndpoint(name = "OperacionesTropasPort")
    public OperacionesTropas getOperacionesTropasPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://webservices/", "OperacionesTropasPort"), OperacionesTropas.class, features);
    }

    private static URL __getWsdlLocation() {
        if (OPERACIONESTROPAS_EXCEPTION!= null) {
            throw OPERACIONESTROPAS_EXCEPTION;
        }
        return OPERACIONESTROPAS_WSDL_LOCATION;
    }

}