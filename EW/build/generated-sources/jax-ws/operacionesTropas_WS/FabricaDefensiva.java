
package operacionesTropas_WS;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para fabricaDefensiva complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="fabricaDefensiva">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FKFabricaDefensivaUsuario" type="{http://webservices/}usuario" minOccurs="0"/>
 *         &lt;element name="idFabricaDefensiva" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="nivelFabricaDefensiva" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "fabricaDefensiva", propOrder = {
    "fkFabricaDefensivaUsuario",
    "idFabricaDefensiva",
    "nivelFabricaDefensiva"
})
public class FabricaDefensiva {

    @XmlElement(name = "FKFabricaDefensivaUsuario")
    protected Usuario fkFabricaDefensivaUsuario;
    protected Integer idFabricaDefensiva;
    protected int nivelFabricaDefensiva;

    /**
     * Obtiene el valor de la propiedad fkFabricaDefensivaUsuario.
     * 
     * @return
     *     possible object is
     *     {@link Usuario }
     *     
     */
    public Usuario getFKFabricaDefensivaUsuario() {
        return fkFabricaDefensivaUsuario;
    }

    /**
     * Define el valor de la propiedad fkFabricaDefensivaUsuario.
     * 
     * @param value
     *     allowed object is
     *     {@link Usuario }
     *     
     */
    public void setFKFabricaDefensivaUsuario(Usuario value) {
        this.fkFabricaDefensivaUsuario = value;
    }

    /**
     * Obtiene el valor de la propiedad idFabricaDefensiva.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdFabricaDefensiva() {
        return idFabricaDefensiva;
    }

    /**
     * Define el valor de la propiedad idFabricaDefensiva.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdFabricaDefensiva(Integer value) {
        this.idFabricaDefensiva = value;
    }

    /**
     * Obtiene el valor de la propiedad nivelFabricaDefensiva.
     * 
     */
    public int getNivelFabricaDefensiva() {
        return nivelFabricaDefensiva;
    }

    /**
     * Define el valor de la propiedad nivelFabricaDefensiva.
     * 
     */
    public void setNivelFabricaDefensiva(int value) {
        this.nivelFabricaDefensiva = value;
    }

}
