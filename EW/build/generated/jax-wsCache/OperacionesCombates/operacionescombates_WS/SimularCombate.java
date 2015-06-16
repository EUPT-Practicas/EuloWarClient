
package operacionescombates_WS;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para simularCombate complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="simularCombate">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="emailAtacante" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="emailDefensor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "simularCombate", propOrder = {
    "emailAtacante",
    "emailDefensor"
})
public class SimularCombate {

    protected String emailAtacante;
    protected String emailDefensor;

    /**
     * Obtiene el valor de la propiedad emailAtacante.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmailAtacante() {
        return emailAtacante;
    }

    /**
     * Define el valor de la propiedad emailAtacante.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmailAtacante(String value) {
        this.emailAtacante = value;
    }

    /**
     * Obtiene el valor de la propiedad emailDefensor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmailDefensor() {
        return emailDefensor;
    }

    /**
     * Define el valor de la propiedad emailDefensor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmailDefensor(String value) {
        this.emailDefensor = value;
    }

}
