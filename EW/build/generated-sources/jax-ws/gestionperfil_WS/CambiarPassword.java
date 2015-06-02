
package gestionperfil_WS;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para cambiarPassword complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="cambiarPassword">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="emailUsuario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="viejaPassword" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nuevaPassword" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="repiteNuevaPassword" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cambiarPassword", propOrder = {
    "emailUsuario",
    "viejaPassword",
    "nuevaPassword",
    "repiteNuevaPassword"
})
public class CambiarPassword {

    protected String emailUsuario;
    protected String viejaPassword;
    protected String nuevaPassword;
    protected String repiteNuevaPassword;

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
     * Obtiene el valor de la propiedad viejaPassword.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getViejaPassword() {
        return viejaPassword;
    }

    /**
     * Define el valor de la propiedad viejaPassword.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setViejaPassword(String value) {
        this.viejaPassword = value;
    }

    /**
     * Obtiene el valor de la propiedad nuevaPassword.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNuevaPassword() {
        return nuevaPassword;
    }

    /**
     * Define el valor de la propiedad nuevaPassword.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNuevaPassword(String value) {
        this.nuevaPassword = value;
    }

    /**
     * Obtiene el valor de la propiedad repiteNuevaPassword.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRepiteNuevaPassword() {
        return repiteNuevaPassword;
    }

    /**
     * Define el valor de la propiedad repiteNuevaPassword.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRepiteNuevaPassword(String value) {
        this.repiteNuevaPassword = value;
    }

}
