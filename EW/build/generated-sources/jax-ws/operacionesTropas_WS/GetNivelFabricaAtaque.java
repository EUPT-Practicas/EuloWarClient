
package operacionesTropas_WS;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para getNivelFabricaAtaque complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="getNivelFabricaAtaque">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="emailUsuario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getNivelFabricaAtaque", propOrder = {
    "emailUsuario"
})
public class GetNivelFabricaAtaque {

    protected String emailUsuario;

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

}
