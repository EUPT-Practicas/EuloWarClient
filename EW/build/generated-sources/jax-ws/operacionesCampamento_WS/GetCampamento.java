
package operacionesCampamento_WS;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para getCampamento complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="getCampamento">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idCampamento" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getCampamento", propOrder = {
    "idCampamento"
})
public class GetCampamento {

    protected int idCampamento;

    /**
     * Obtiene el valor de la propiedad idCampamento.
     * 
     */
    public int getIdCampamento() {
        return idCampamento;
    }

    /**
     * Define el valor de la propiedad idCampamento.
     * 
     */
    public void setIdCampamento(int value) {
        this.idCampamento = value;
    }

}
