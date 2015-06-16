
package operacionescombates_WS;

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
@WebServiceClient(name = "OperacionesCombates", targetNamespace = "http://webservices/", wsdlLocation = "http://localhost:8080/OperacionesCombates/OperacionesCombates?WSDL")
public class OperacionesCombates_Service
    extends Service
{

    private final static URL OPERACIONESCOMBATES_WSDL_LOCATION;
    private final static WebServiceException OPERACIONESCOMBATES_EXCEPTION;
    private final static QName OPERACIONESCOMBATES_QNAME = new QName("http://webservices/", "OperacionesCombates");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/OperacionesCombates/OperacionesCombates?WSDL");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        OPERACIONESCOMBATES_WSDL_LOCATION = url;
        OPERACIONESCOMBATES_EXCEPTION = e;
    }

    public OperacionesCombates_Service() {
        super(__getWsdlLocation(), OPERACIONESCOMBATES_QNAME);
    }

    public OperacionesCombates_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), OPERACIONESCOMBATES_QNAME, features);
    }

    public OperacionesCombates_Service(URL wsdlLocation) {
        super(wsdlLocation, OPERACIONESCOMBATES_QNAME);
    }

    public OperacionesCombates_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, OPERACIONESCOMBATES_QNAME, features);
    }

    public OperacionesCombates_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public OperacionesCombates_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns OperacionesCombates
     */
    @WebEndpoint(name = "OperacionesCombatesPort")
    public OperacionesCombates getOperacionesCombatesPort() {
        return super.getPort(new QName("http://webservices/", "OperacionesCombatesPort"), OperacionesCombates.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns OperacionesCombates
     */
    @WebEndpoint(name = "OperacionesCombatesPort")
    public OperacionesCombates getOperacionesCombatesPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://webservices/", "OperacionesCombatesPort"), OperacionesCombates.class, features);
    }

    private static URL __getWsdlLocation() {
        if (OPERACIONESCOMBATES_EXCEPTION!= null) {
            throw OPERACIONESCOMBATES_EXCEPTION;
        }
        return OPERACIONESCOMBATES_WSDL_LOCATION;
    }

}
