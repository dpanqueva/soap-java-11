//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.2 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2022.05.11 a las 08:15:52 AM COT 
//


package com.telefonica.soap.java.once.model.client.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para altaPrepagoResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="altaPrepagoResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="apfResponse" type="{http://ws.endpoint.apf.scl.cl.amdocs.com/}apfResponse" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "altaPrepagoResponse", propOrder = {
    "apfResponse"
})
@XmlRootElement(name = "altaPrepagoResponse")
public class AltaPrepagoResponse {

    protected ApfResponse apfResponse;

    /**
     * Obtiene el valor de la propiedad apfResponse.
     * 
     * @return
     *     possible object is
     *     {@link ApfResponse }
     *     
     */
    public ApfResponse getApfResponse() {
        return apfResponse;
    }

    /**
     * Define el valor de la propiedad apfResponse.
     * 
     * @param value
     *     allowed object is
     *     {@link ApfResponse }
     *     
     */
    public void setApfResponse(ApfResponse value) {
        this.apfResponse = value;
    }

}
