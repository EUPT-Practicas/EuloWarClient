
package asignarRecursos_WS;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para mina complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="mina">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="deposito" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="FKMinaRecurso" type="{http://webservices/}recurso" minOccurs="0"/>
 *         &lt;element name="FKMinaUsuario" type="{http://webservices/}usuario" minOccurs="0"/>
 *         &lt;element name="idMina" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="nivelMina" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="tipoMina" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "mina", propOrder = {
    "deposito",
    "fkMinaRecurso",
    "fkMinaUsuario",
    "idMina",
    "nivelMina",
    "tipoMina"
})
public class Mina {

    protected int deposito;
    @XmlElement(name = "FKMinaRecurso")
    protected Recurso fkMinaRecurso;
    @XmlElement(name = "FKMinaUsuario")
    protected Usuario fkMinaUsuario;
    protected Integer idMina;
    protected int nivelMina;
    protected String tipoMina;

    /**
     * Obtiene el valor de la propiedad deposito.
     * 
     */
    public int getDeposito() {
        return deposito;
    }

    /**
     * Define el valor de la propiedad deposito.
     * 
     */
    public void setDeposito(int value) {
        this.deposito = value;
    }

    /**
     * Obtiene el valor de la propiedad fkMinaRecurso.
     * 
     * @return
     *     possible object is
     *     {@link Recurso }
     *     
     */
    public Recurso getFKMinaRecurso() {
        return fkMinaRecurso;
    }

    /**
     * Define el valor de la propiedad fkMinaRecurso.
     * 
     * @param value
     *     allowed object is
     *     {@link Recurso }
     *     
     */
    public void setFKMinaRecurso(Recurso value) {
        this.fkMinaRecurso = value;
    }

    /**
     * Obtiene el valor de la propiedad fkMinaUsuario.
     * 
     * @return
     *     possible object is
     *     {@link Usuario }
     *     
     */
    public Usuario getFKMinaUsuario() {
        return fkMinaUsuario;
    }

    /**
     * Define el valor de la propiedad fkMinaUsuario.
     * 
     * @param value
     *     allowed object is
     *     {@link Usuario }
     *     
     */
    public void setFKMinaUsuario(Usuario value) {
        this.fkMinaUsuario = value;
    }

    /**
     * Obtiene el valor de la propiedad idMina.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdMina() {
        return idMina;
    }

    /**
     * Define el valor de la propiedad idMina.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdMina(Integer value) {
        this.idMina = value;
    }

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

    /**
     * Obtiene el valor de la propiedad tipoMina.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoMina() {
        return tipoMina;
    }

    /**
     * Define el valor de la propiedad tipoMina.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoMina(String value) {
        this.tipoMina = value;
    }

}
