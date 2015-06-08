
package operacionesTropas_WS;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para tropaDefensa complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="tropaDefensa">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FKTropaDefensaCampamento" type="{http://webservices/}campamento" minOccurs="0"/>
 *         &lt;element name="FKTropaDefensaFabricaDefensiva" type="{http://webservices/}fabricaDefensiva" minOccurs="0"/>
 *         &lt;element name="FKTropaDefensaUsuario" type="{http://webservices/}usuario" minOccurs="0"/>
 *         &lt;element name="idTropaDefensa" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="nivelTropaDefensa" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="tipoTropaDefensa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="unidades" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tropaDefensa", propOrder = {
    "fkTropaDefensaCampamento",
    "fkTropaDefensaFabricaDefensiva",
    "fkTropaDefensaUsuario",
    "idTropaDefensa",
    "nivelTropaDefensa",
    "tipoTropaDefensa",
    "unidades"
})
public class TropaDefensa {

    @XmlElement(name = "FKTropaDefensaCampamento")
    protected Campamento fkTropaDefensaCampamento;
    @XmlElement(name = "FKTropaDefensaFabricaDefensiva")
    protected FabricaDefensiva fkTropaDefensaFabricaDefensiva;
    @XmlElement(name = "FKTropaDefensaUsuario")
    protected Usuario fkTropaDefensaUsuario;
    protected Integer idTropaDefensa;
    protected Integer nivelTropaDefensa;
    protected String tipoTropaDefensa;
    protected int unidades;

    /**
     * Obtiene el valor de la propiedad fkTropaDefensaCampamento.
     * 
     * @return
     *     possible object is
     *     {@link Campamento }
     *     
     */
    public Campamento getFKTropaDefensaCampamento() {
        return fkTropaDefensaCampamento;
    }

    /**
     * Define el valor de la propiedad fkTropaDefensaCampamento.
     * 
     * @param value
     *     allowed object is
     *     {@link Campamento }
     *     
     */
    public void setFKTropaDefensaCampamento(Campamento value) {
        this.fkTropaDefensaCampamento = value;
    }

    /**
     * Obtiene el valor de la propiedad fkTropaDefensaFabricaDefensiva.
     * 
     * @return
     *     possible object is
     *     {@link FabricaDefensiva }
     *     
     */
    public FabricaDefensiva getFKTropaDefensaFabricaDefensiva() {
        return fkTropaDefensaFabricaDefensiva;
    }

    /**
     * Define el valor de la propiedad fkTropaDefensaFabricaDefensiva.
     * 
     * @param value
     *     allowed object is
     *     {@link FabricaDefensiva }
     *     
     */
    public void setFKTropaDefensaFabricaDefensiva(FabricaDefensiva value) {
        this.fkTropaDefensaFabricaDefensiva = value;
    }

    /**
     * Obtiene el valor de la propiedad fkTropaDefensaUsuario.
     * 
     * @return
     *     possible object is
     *     {@link Usuario }
     *     
     */
    public Usuario getFKTropaDefensaUsuario() {
        return fkTropaDefensaUsuario;
    }

    /**
     * Define el valor de la propiedad fkTropaDefensaUsuario.
     * 
     * @param value
     *     allowed object is
     *     {@link Usuario }
     *     
     */
    public void setFKTropaDefensaUsuario(Usuario value) {
        this.fkTropaDefensaUsuario = value;
    }

    /**
     * Obtiene el valor de la propiedad idTropaDefensa.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdTropaDefensa() {
        return idTropaDefensa;
    }

    /**
     * Define el valor de la propiedad idTropaDefensa.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdTropaDefensa(Integer value) {
        this.idTropaDefensa = value;
    }

    /**
     * Obtiene el valor de la propiedad nivelTropaDefensa.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNivelTropaDefensa() {
        return nivelTropaDefensa;
    }

    /**
     * Define el valor de la propiedad nivelTropaDefensa.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNivelTropaDefensa(Integer value) {
        this.nivelTropaDefensa = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoTropaDefensa.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoTropaDefensa() {
        return tipoTropaDefensa;
    }

    /**
     * Define el valor de la propiedad tipoTropaDefensa.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoTropaDefensa(String value) {
        this.tipoTropaDefensa = value;
    }

    /**
     * Obtiene el valor de la propiedad unidades.
     * 
     */
    public int getUnidades() {
        return unidades;
    }

    /**
     * Define el valor de la propiedad unidades.
     * 
     */
    public void setUnidades(int value) {
        this.unidades = value;
    }

}
