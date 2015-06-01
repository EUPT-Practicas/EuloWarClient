
package operacionesminas_client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para mejorarMina complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="mejorarMina">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idMina" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "mejorarMina", propOrder = {
    "idMina"
})
public class MejorarMina {

    protected int idMina;

    /**
     * Obtiene el valor de la propiedad idMina.
     * 
     */
    public int getIdMina() {
        return idMina;
    }

    /**
     * Define el valor de la propiedad idMina.
     * 
     */
    public void setIdMina(int value) {
        this.idMina = value;
    }

}
