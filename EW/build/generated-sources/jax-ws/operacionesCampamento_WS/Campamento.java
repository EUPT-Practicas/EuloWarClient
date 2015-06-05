
package operacionesCampamento_WS;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para campamento complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="campamento">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FKCampamentoUsuario" type="{http://webservices/}usuario" minOccurs="0"/>
 *         &lt;element name="idCampamento" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="total" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="tropasAlmacenadas" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "campamento", propOrder = {
    "fkCampamentoUsuario",
    "idCampamento",
    "total",
    "tropasAlmacenadas"
})
public class Campamento {

    @XmlElement(name = "FKCampamentoUsuario")
    protected Usuario fkCampamentoUsuario;
    protected Integer idCampamento;
    protected Integer total;
    protected Integer tropasAlmacenadas;

    /**
     * Obtiene el valor de la propiedad fkCampamentoUsuario.
     * 
     * @return
     *     possible object is
     *     {@link Usuario }
     *     
     */
    public Usuario getFKCampamentoUsuario() {
        return fkCampamentoUsuario;
    }

    /**
     * Define el valor de la propiedad fkCampamentoUsuario.
     * 
     * @param value
     *     allowed object is
     *     {@link Usuario }
     *     
     */
    public void setFKCampamentoUsuario(Usuario value) {
        this.fkCampamentoUsuario = value;
    }

    /**
     * Obtiene el valor de la propiedad idCampamento.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdCampamento() {
        return idCampamento;
    }

    /**
     * Define el valor de la propiedad idCampamento.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdCampamento(Integer value) {
        this.idCampamento = value;
    }

    /**
     * Obtiene el valor de la propiedad total.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTotal() {
        return total;
    }

    /**
     * Define el valor de la propiedad total.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTotal(Integer value) {
        this.total = value;
    }

    /**
     * Obtiene el valor de la propiedad tropasAlmacenadas.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTropasAlmacenadas() {
        return tropasAlmacenadas;
    }

    /**
     * Define el valor de la propiedad tropasAlmacenadas.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTropasAlmacenadas(Integer value) {
        this.tropasAlmacenadas = value;
    }

}
