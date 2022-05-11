//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.2 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2022.05.11 a las 08:15:52 AM COT 
//


package com.telefonica.soap.java.once.model.client.dto;

import javax.xml.bind.annotation.*;


/**
 * <p>Clase Java para apfResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="apfResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="numEvento" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="codRetorno" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="msgRetorno" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="codCliente" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="codCiclo" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="codPlanTarif" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="numCelular" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="numSerieIcc" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="numSerieImei" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="numAbonado" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="numVenta" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="numTrx" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "apfResponse", propOrder = {
    "numEvento",
    "codRetorno",
    "msgRetorno",
    "codCliente",
    "codCiclo",
    "codPlanTarif",
    "numCelular",
    "numSerieIcc",
    "numSerieImei",
    "numAbonado",
    "numVenta",
    "numTrx"
})
@XmlRootElement(name = "apfResponse")
public class ApfResponse {

    protected long numEvento;
    protected int codRetorno;
    @XmlElement(required = true)
    protected String msgRetorno;
    protected long codCliente;
    protected int codCiclo;
    @XmlElement(required = true)
    protected String codPlanTarif;
    protected long numCelular;
    @XmlElement(required = true)
    protected String numSerieIcc;
    @XmlElement(required = true)
    protected String numSerieImei;
    protected long numAbonado;
    protected long numVenta;
    protected long numTrx;

    /**
     * Obtiene el valor de la propiedad numEvento.
     * 
     */
    public long getNumEvento() {
        return numEvento;
    }

    /**
     * Define el valor de la propiedad numEvento.
     * 
     */
    public void setNumEvento(long value) {
        this.numEvento = value;
    }

    /**
     * Obtiene el valor de la propiedad codRetorno.
     * 
     */
    public int getCodRetorno() {
        return codRetorno;
    }

    /**
     * Define el valor de la propiedad codRetorno.
     * 
     */
    public void setCodRetorno(int value) {
        this.codRetorno = value;
    }

    /**
     * Obtiene el valor de la propiedad msgRetorno.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMsgRetorno() {
        return msgRetorno;
    }

    /**
     * Define el valor de la propiedad msgRetorno.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMsgRetorno(String value) {
        this.msgRetorno = value;
    }

    /**
     * Obtiene el valor de la propiedad codCliente.
     * 
     */
    public long getCodCliente() {
        return codCliente;
    }

    /**
     * Define el valor de la propiedad codCliente.
     * 
     */
    public void setCodCliente(long value) {
        this.codCliente = value;
    }

    /**
     * Obtiene el valor de la propiedad codCiclo.
     * 
     */
    public int getCodCiclo() {
        return codCiclo;
    }

    /**
     * Define el valor de la propiedad codCiclo.
     * 
     */
    public void setCodCiclo(int value) {
        this.codCiclo = value;
    }

    /**
     * Obtiene el valor de la propiedad codPlanTarif.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodPlanTarif() {
        return codPlanTarif;
    }

    /**
     * Define el valor de la propiedad codPlanTarif.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodPlanTarif(String value) {
        this.codPlanTarif = value;
    }

    /**
     * Obtiene el valor de la propiedad numCelular.
     * 
     */
    public long getNumCelular() {
        return numCelular;
    }

    /**
     * Define el valor de la propiedad numCelular.
     * 
     */
    public void setNumCelular(long value) {
        this.numCelular = value;
    }

    /**
     * Obtiene el valor de la propiedad numSerieIcc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumSerieIcc() {
        return numSerieIcc;
    }

    /**
     * Define el valor de la propiedad numSerieIcc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumSerieIcc(String value) {
        this.numSerieIcc = value;
    }

    /**
     * Obtiene el valor de la propiedad numSerieImei.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumSerieImei() {
        return numSerieImei;
    }

    /**
     * Define el valor de la propiedad numSerieImei.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumSerieImei(String value) {
        this.numSerieImei = value;
    }

    /**
     * Obtiene el valor de la propiedad numAbonado.
     * 
     */
    public long getNumAbonado() {
        return numAbonado;
    }

    /**
     * Define el valor de la propiedad numAbonado.
     * 
     */
    public void setNumAbonado(long value) {
        this.numAbonado = value;
    }

    /**
     * Obtiene el valor de la propiedad numVenta.
     * 
     */
    public long getNumVenta() {
        return numVenta;
    }

    /**
     * Define el valor de la propiedad numVenta.
     * 
     */
    public void setNumVenta(long value) {
        this.numVenta = value;
    }

    /**
     * Obtiene el valor de la propiedad numTrx.
     * 
     */
    public long getNumTrx() {
        return numTrx;
    }

    /**
     * Define el valor de la propiedad numTrx.
     * 
     */
    public void setNumTrx(long value) {
        this.numTrx = value;
    }

}
