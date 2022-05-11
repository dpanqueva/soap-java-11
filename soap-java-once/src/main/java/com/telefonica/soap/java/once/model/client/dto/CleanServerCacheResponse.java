//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.2 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2022.05.11 a las 08:15:52 AM COT 
//


package com.telefonica.soap.java.once.model.client.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para cleanServerCacheResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="cleanServerCacheResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="appManagerResponse" type="{http://ws.endpoint.apf.scl.cl.amdocs.com/}response" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cleanServerCacheResponse", propOrder = {
    "appManagerResponse"
})
public class CleanServerCacheResponse {

    protected Response appManagerResponse;

    /**
     * Obtiene el valor de la propiedad appManagerResponse.
     * 
     * @return
     *     possible object is
     *     {@link Response }
     *     
     */
    public Response getAppManagerResponse() {
        return appManagerResponse;
    }

    /**
     * Define el valor de la propiedad appManagerResponse.
     * 
     * @param value
     *     allowed object is
     *     {@link Response }
     *     
     */
    public void setAppManagerResponse(Response value) {
        this.appManagerResponse = value;
    }

}
