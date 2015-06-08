
package operacionesTropas_WS;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para fabricaOfensiva complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="fabricaOfensiva">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FKFabricaOfensivaUsuario" type="{http://webservices/}usuario" minOccurs="0"/>
 *         &lt;element name="idFabricaOfensiva" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="nivelFabricaOfensiva" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "fabricaOfensiva", propOrder = {
    "fkFabricaOfensivaUsuario",
    "idFabricaOfensiva",
    "nivelFabricaOfensiva"
})
public class FabricaOfensiva {

    @XmlElement(name = "FKFabricaOfensivaUsuario")
    protected Usuario fkFabricaOfensivaUsuario;
    protected Integer idFabricaOfensiva;
    protected int nivelFabricaOfensiva;

    /**
     * Obtiene el valor de la propiedad fkFabricaOfensivaUsuario.
     * 
     * @return
     *     possible object is
     *     {@link Usuario }
     *     
     */
    public Usuario getFKFabricaOfensivaUsuario() {
        return fkFabricaOfensivaUsuario;
    }

    /**
     * Define el valor de la propiedad fkFabricaOfensivaUsuario.
     * 
     * @param value
     *     allowed object is
     *     {@link Usuario }
     *     
     */
    public void setFKFabricaOfensivaUsuario(Usuario value) {
        this.fkFabricaOfensivaUsuario = value;
    }

    /**
     * Obtiene el valor de la propiedad idFabricaOfensiva.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdFabricaOfensiva() {
        return idFabricaOfensiva;
    }

    /**
     * Define el valor de la propiedad idFabricaOfensiva.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdFabricaOfensiva(Integer value) {
        this.idFabricaOfensiva = value;
    }

    /**
     * Obtiene el valor de la propiedad nivelFabricaOfensiva.
     * 
     */
    public int getNivelFabricaOfensiva() {
        return nivelFabricaOfensiva;
    }

    /**
     * Define el valor de la propiedad nivelFabricaOfensiva.
     * 
     */
    public void setNivelFabricaOfensiva(int value) {
        this.nivelFabricaOfensiva = value;
    }

}
