
package operacionesTropas_WS;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para getTropaAtaque complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="getTropaAtaque">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="emailUsuario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tipoTropa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getTropaAtaque", propOrder = {
    "emailUsuario",
    "tipoTropa"
})
public class GetTropaAtaque {

    protected String emailUsuario;
    protected String tipoTropa;

    /**
     * Obtiene el valor de la propiedad emailUsuario.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmailUsuario() {
        return emailUsuario;
    }

    /**
     * Define el valor de la propiedad emailUsuario.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmailUsuario(String value) {
        this.emailUsuario = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoTropa.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoTropa() {
        return tipoTropa;
    }

    /**
     * Define el valor de la propiedad tipoTropa.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoTropa(String value) {
        this.tipoTropa = value;
    }

}
