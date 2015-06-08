
package operacionesTropas_WS;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para tropaAtaque complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="tropaAtaque">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FKTropaAtaqueCampamento" type="{http://webservices/}campamento" minOccurs="0"/>
 *         &lt;element name="FKTropaAtaqueFabricaOfensiva" type="{http://webservices/}fabricaOfensiva" minOccurs="0"/>
 *         &lt;element name="FKTropaAtaqueUsuario" type="{http://webservices/}usuario" minOccurs="0"/>
 *         &lt;element name="idTropaAtaque" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="nivelTropaAtaque" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="tipoTropaAtaque" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "tropaAtaque", propOrder = {
    "fkTropaAtaqueCampamento",
    "fkTropaAtaqueFabricaOfensiva",
    "fkTropaAtaqueUsuario",
    "idTropaAtaque",
    "nivelTropaAtaque",
    "tipoTropaAtaque",
    "unidades"
})
public class TropaAtaque {

    @XmlElement(name = "FKTropaAtaqueCampamento")
    protected Campamento fkTropaAtaqueCampamento;
    @XmlElement(name = "FKTropaAtaqueFabricaOfensiva")
    protected FabricaOfensiva fkTropaAtaqueFabricaOfensiva;
    @XmlElement(name = "FKTropaAtaqueUsuario")
    protected Usuario fkTropaAtaqueUsuario;
    protected Integer idTropaAtaque;
    protected Integer nivelTropaAtaque;
    protected String tipoTropaAtaque;
    protected int unidades;

    /**
     * Obtiene el valor de la propiedad fkTropaAtaqueCampamento.
     * 
     * @return
     *     possible object is
     *     {@link Campamento }
     *     
     */
    public Campamento getFKTropaAtaqueCampamento() {
        return fkTropaAtaqueCampamento;
    }

    /**
     * Define el valor de la propiedad fkTropaAtaqueCampamento.
     * 
     * @param value
     *     allowed object is
     *     {@link Campamento }
     *     
     */
    public void setFKTropaAtaqueCampamento(Campamento value) {
        this.fkTropaAtaqueCampamento = value;
    }

    /**
     * Obtiene el valor de la propiedad fkTropaAtaqueFabricaOfensiva.
     * 
     * @return
     *     possible object is
     *     {@link FabricaOfensiva }
     *     
     */
    public FabricaOfensiva getFKTropaAtaqueFabricaOfensiva() {
        return fkTropaAtaqueFabricaOfensiva;
    }

    /**
     * Define el valor de la propiedad fkTropaAtaqueFabricaOfensiva.
     * 
     * @param value
     *     allowed object is
     *     {@link FabricaOfensiva }
     *     
     */
    public void setFKTropaAtaqueFabricaOfensiva(FabricaOfensiva value) {
        this.fkTropaAtaqueFabricaOfensiva = value;
    }

    /**
     * Obtiene el valor de la propiedad fkTropaAtaqueUsuario.
     * 
     * @return
     *     possible object is
     *     {@link Usuario }
     *     
     */
    public Usuario getFKTropaAtaqueUsuario() {
        return fkTropaAtaqueUsuario;
    }

    /**
     * Define el valor de la propiedad fkTropaAtaqueUsuario.
     * 
     * @param value
     *     allowed object is
     *     {@link Usuario }
     *     
     */
    public void setFKTropaAtaqueUsuario(Usuario value) {
        this.fkTropaAtaqueUsuario = value;
    }

    /**
     * Obtiene el valor de la propiedad idTropaAtaque.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdTropaAtaque() {
        return idTropaAtaque;
    }

    /**
     * Define el valor de la propiedad idTropaAtaque.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdTropaAtaque(Integer value) {
        this.idTropaAtaque = value;
    }

    /**
     * Obtiene el valor de la propiedad nivelTropaAtaque.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNivelTropaAtaque() {
        return nivelTropaAtaque;
    }

    /**
     * Define el valor de la propiedad nivelTropaAtaque.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNivelTropaAtaque(Integer value) {
        this.nivelTropaAtaque = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoTropaAtaque.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoTropaAtaque() {
        return tipoTropaAtaque;
    }

    /**
     * Define el valor de la propiedad tipoTropaAtaque.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoTropaAtaque(String value) {
        this.tipoTropaAtaque = value;
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
