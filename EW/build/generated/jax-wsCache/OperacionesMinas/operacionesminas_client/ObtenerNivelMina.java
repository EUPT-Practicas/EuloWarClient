
package operacionesminas_client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para obtenerNivelMina complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="obtenerNivelMina">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="nivelMina" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "obtenerNivelMina", propOrder = {
    "nivelMina"
})
public class ObtenerNivelMina {

    protected int nivelMina;

    /**
     * Obtiene el valor de la propiedad nivelMina.
     * 
     */
    public int getNivelMina() {
        return nivelMina;
    }

    /**
     * Define el valor de la propiedad nivelMina.
     * 
     */
    public void setNivelMina(int value) {
        this.nivelMina = value;
    }

}
