//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.2 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2022.05.11 a las 08:15:52 AM COT 
//


package com.telefonica.soap.java.once.model.client.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para response complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="response"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="numEvento" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="codRetorno" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="msgRetorno" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "response", propOrder = {
    "numEvento",
    "codRetorno",
    "msgRetorno"
})
public class Response {

    protected int numEvento;
    protected int codRetorno;
    @XmlElement(required = true)
    protected String msgRetorno;

    /**
     * Obtiene el valor de la propiedad numEvento.
     * 
     */
    public int getNumEvento() {
        return numEvento;
    }

    /**
     * Define el valor de la propiedad numEvento.
     * 
     */
    public void setNumEvento(int value) {
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

}
