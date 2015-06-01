
package operacionesminas_client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para recurso complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="recurso">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FKUsuario" type="{http://webservices/}usuario" minOccurs="0"/>
 *         &lt;element name="idRecurso" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="tipoRecurso" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "recurso", propOrder = {
    "fkUsuario",
    "idRecurso",
    "tipoRecurso",
    "unidades"
})
public class Recurso {

    @XmlElement(name = "FKUsuario")
    protected Usuario fkUsuario;
    protected Integer idRecurso;
    protected String tipoRecurso;
    protected int unidades;

    /**
     * Obtiene el valor de la propiedad fkUsuario.
     * 
     * @return
     *     possible object is
     *     {@link Usuario }
     *     
     */
    public Usuario getFKUsuario() {
        return fkUsuario;
    }

    /**
     * Define el valor de la propiedad fkUsuario.
     * 
     * @param value
     *     allowed object is
     *     {@link Usuario }
     *     
     */
    public void setFKUsuario(Usuario value) {
        this.fkUsuario = value;
    }

    /**
     * Obtiene el valor de la propiedad idRecurso.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdRecurso() {
        return idRecurso;
    }

    /**
     * Define el valor de la propiedad idRecurso.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdRecurso(Integer value) {
        this.idRecurso = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoRecurso.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoRecurso() {
        return tipoRecurso;
    }

    /**
     * Define el valor de la propiedad tipoRecurso.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoRecurso(String value) {
        this.tipoRecurso = value;
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
