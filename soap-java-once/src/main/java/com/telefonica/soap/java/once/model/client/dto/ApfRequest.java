//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.2 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2022.05.11 a las 08:15:52 AM COT 
//


package com.telefonica.soap.java.once.model.client.dto;

import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para apfRequest complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="apfRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="nomUsuaOra" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="nomCliente" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ape1Cliente" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ape2Cliente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="codTipIdentCliente" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="numIdentCliente" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="fecNacimiento" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="indSexo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="codEstadoCivil" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="indTipPersona" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="nomEmailCliente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fecAltaCliente" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="nomResponsable" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="codTipIdentResponsable" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="numIdentResponsable" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="telefono1" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="telefono2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="codRegion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="codProvincia" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="codCiudad" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="codComuna" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="nomCalle" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="numCalle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tipCalle" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="obsDireccion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="desDirec1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="desDirec2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="codOperadorDonante" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fecVentanaCambio" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="indTrxPortabilidad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="codEscenarioPortabilidad" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="codArticuloImei" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="numSerieImei" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="numSerieIcc" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="numCelular" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="codEstrato" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="fecAltaAbonado" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "apfRequest", propOrder = {
    "nomUsuaOra",
    "nomCliente",
    "ape1Cliente",
    "ape2Cliente",
    "codTipIdentCliente",
    "numIdentCliente",
    "fecNacimiento",
    "indSexo",
    "codEstadoCivil",
    "indTipPersona",
    "nomEmailCliente",
    "fecAltaCliente",
    "nomResponsable",
    "codTipIdentResponsable",
    "numIdentResponsable",
    "telefono1",
    "telefono2",
    "codRegion",
    "codProvincia",
    "codCiudad",
    "codComuna",
    "nomCalle",
    "numCalle",
    "tipCalle",
    "obsDireccion",
    "desDirec1",
    "desDirec2",
    "codOperadorDonante",
    "fecVentanaCambio",
    "indTrxPortabilidad",
    "codEscenarioPortabilidad",
    "codArticuloImei",
    "numSerieImei",
    "numSerieIcc",
    "numCelular",
    "codEstrato",
    "fecAltaAbonado"
})
@XmlRootElement(name = "apfRequest")
public class ApfRequest {

    @XmlElement(required = true)
    protected String nomUsuaOra;
    @XmlElement(required = true)
    protected String nomCliente;
    @XmlElement(required = true)
    protected String ape1Cliente;
    protected String ape2Cliente;
    @XmlElement(required = true)
    protected String codTipIdentCliente;
    @XmlElement(required = true)
    protected String numIdentCliente;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fecNacimiento;
    @XmlElement(required = true)
    protected String indSexo;
    @XmlElement(required = true)
    protected String codEstadoCivil;
    @XmlElement(required = true)
    protected String indTipPersona;
    protected String nomEmailCliente;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fecAltaCliente;
    protected String nomResponsable;
    protected String codTipIdentResponsable;
    protected String numIdentResponsable;
    @XmlElement(required = true)
    protected String telefono1;
    protected String telefono2;
    @XmlElement(required = true)
    protected String codRegion;
    @XmlElement(required = true)
    protected String codProvincia;
    @XmlElement(required = true)
    protected String codCiudad;
    @XmlElement(required = true)
    protected String codComuna;
    @XmlElement(required = true)
    protected String nomCalle;
    protected String numCalle;
    @XmlElement(required = true)
    protected String tipCalle;
    protected String obsDireccion;
    protected String desDirec1;
    protected String desDirec2;
    protected String codOperadorDonante;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fecVentanaCambio;
    protected String indTrxPortabilidad;
    protected Long codEscenarioPortabilidad;
    @XmlElement(required = true)
    protected String codArticuloImei;
    @XmlElement(required = true)
    protected String numSerieImei;
    @XmlElement(required = true)
    protected String numSerieIcc;
    protected long numCelular;
    @XmlElement(required = true)
    protected String codEstrato;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fecAltaAbonado;

    /**
     * Obtiene el valor de la propiedad nomUsuaOra.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomUsuaOra() {
        return nomUsuaOra;
    }

    /**
     * Define el valor de la propiedad nomUsuaOra.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomUsuaOra(String value) {
        this.nomUsuaOra = value;
    }

    /**
     * Obtiene el valor de la propiedad nomCliente.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomCliente() {
        return nomCliente;
    }

    /**
     * Define el valor de la propiedad nomCliente.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomCliente(String value) {
        this.nomCliente = value;
    }

    /**
     * Obtiene el valor de la propiedad ape1Cliente.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApe1Cliente() {
        return ape1Cliente;
    }

    /**
     * Define el valor de la propiedad ape1Cliente.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApe1Cliente(String value) {
        this.ape1Cliente = value;
    }

    /**
     * Obtiene el valor de la propiedad ape2Cliente.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApe2Cliente() {
        return ape2Cliente;
    }

    /**
     * Define el valor de la propiedad ape2Cliente.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApe2Cliente(String value) {
        this.ape2Cliente = value;
    }

    /**
     * Obtiene el valor de la propiedad codTipIdentCliente.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodTipIdentCliente() {
        return codTipIdentCliente;
    }

    /**
     * Define el valor de la propiedad codTipIdentCliente.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodTipIdentCliente(String value) {
        this.codTipIdentCliente = value;
    }

    /**
     * Obtiene el valor de la propiedad numIdentCliente.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumIdentCliente() {
        return numIdentCliente;
    }

    /**
     * Define el valor de la propiedad numIdentCliente.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumIdentCliente(String value) {
        this.numIdentCliente = value;
    }

    /**
     * Obtiene el valor de la propiedad fecNacimiento.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFecNacimiento() {
        return fecNacimiento;
    }

    /**
     * Define el valor de la propiedad fecNacimiento.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFecNacimiento(XMLGregorianCalendar value) {
        this.fecNacimiento = value;
    }

    /**
     * Obtiene el valor de la propiedad indSexo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndSexo() {
        return indSexo;
    }

    /**
     * Define el valor de la propiedad indSexo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndSexo(String value) {
        this.indSexo = value;
    }

    /**
     * Obtiene el valor de la propiedad codEstadoCivil.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodEstadoCivil() {
        return codEstadoCivil;
    }

    /**
     * Define el valor de la propiedad codEstadoCivil.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodEstadoCivil(String value) {
        this.codEstadoCivil = value;
    }

    /**
     * Obtiene el valor de la propiedad indTipPersona.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndTipPersona() {
        return indTipPersona;
    }

    /**
     * Define el valor de la propiedad indTipPersona.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndTipPersona(String value) {
        this.indTipPersona = value;
    }

    /**
     * Obtiene el valor de la propiedad nomEmailCliente.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomEmailCliente() {
        return nomEmailCliente;
    }

    /**
     * Define el valor de la propiedad nomEmailCliente.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomEmailCliente(String value) {
        this.nomEmailCliente = value;
    }

    /**
     * Obtiene el valor de la propiedad fecAltaCliente.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFecAltaCliente() {
        return fecAltaCliente;
    }

    /**
     * Define el valor de la propiedad fecAltaCliente.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFecAltaCliente(XMLGregorianCalendar value) {
        this.fecAltaCliente = value;
    }

    /**
     * Obtiene el valor de la propiedad nomResponsable.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomResponsable() {
        return nomResponsable;
    }

    /**
     * Define el valor de la propiedad nomResponsable.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomResponsable(String value) {
        this.nomResponsable = value;
    }

    /**
     * Obtiene el valor de la propiedad codTipIdentResponsable.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodTipIdentResponsable() {
        return codTipIdentResponsable;
    }

    /**
     * Define el valor de la propiedad codTipIdentResponsable.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodTipIdentResponsable(String value) {
        this.codTipIdentResponsable = value;
    }

    /**
     * Obtiene el valor de la propiedad numIdentResponsable.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumIdentResponsable() {
        return numIdentResponsable;
    }

    /**
     * Define el valor de la propiedad numIdentResponsable.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumIdentResponsable(String value) {
        this.numIdentResponsable = value;
    }

    /**
     * Obtiene el valor de la propiedad telefono1.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTelefono1() {
        return telefono1;
    }

    /**
     * Define el valor de la propiedad telefono1.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTelefono1(String value) {
        this.telefono1 = value;
    }

    /**
     * Obtiene el valor de la propiedad telefono2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTelefono2() {
        return telefono2;
    }

    /**
     * Define el valor de la propiedad telefono2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTelefono2(String value) {
        this.telefono2 = value;
    }

    /**
     * Obtiene el valor de la propiedad codRegion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodRegion() {
        return codRegion;
    }

    /**
     * Define el valor de la propiedad codRegion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodRegion(String value) {
        this.codRegion = value;
    }

    /**
     * Obtiene el valor de la propiedad codProvincia.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodProvincia() {
        return codProvincia;
    }

    /**
     * Define el valor de la propiedad codProvincia.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodProvincia(String value) {
        this.codProvincia = value;
    }

    /**
     * Obtiene el valor de la propiedad codCiudad.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodCiudad() {
        return codCiudad;
    }

    /**
     * Define el valor de la propiedad codCiudad.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodCiudad(String value) {
        this.codCiudad = value;
    }

    /**
     * Obtiene el valor de la propiedad codComuna.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodComuna() {
        return codComuna;
    }

    /**
     * Define el valor de la propiedad codComuna.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodComuna(String value) {
        this.codComuna = value;
    }

    /**
     * Obtiene el valor de la propiedad nomCalle.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomCalle() {
        return nomCalle;
    }

    /**
     * Define el valor de la propiedad nomCalle.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomCalle(String value) {
        this.nomCalle = value;
    }

    /**
     * Obtiene el valor de la propiedad numCalle.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumCalle() {
        return numCalle;
    }

    /**
     * Define el valor de la propiedad numCalle.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumCalle(String value) {
        this.numCalle = value;
    }

    /**
     * Obtiene el valor de la propiedad tipCalle.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipCalle() {
        return tipCalle;
    }

    /**
     * Define el valor de la propiedad tipCalle.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipCalle(String value) {
        this.tipCalle = value;
    }

    /**
     * Obtiene el valor de la propiedad obsDireccion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObsDireccion() {
        return obsDireccion;
    }

    /**
     * Define el valor de la propiedad obsDireccion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObsDireccion(String value) {
        this.obsDireccion = value;
    }

    /**
     * Obtiene el valor de la propiedad desDirec1.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDesDirec1() {
        return desDirec1;
    }

    /**
     * Define el valor de la propiedad desDirec1.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDesDirec1(String value) {
        this.desDirec1 = value;
    }

    /**
     * Obtiene el valor de la propiedad desDirec2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDesDirec2() {
        return desDirec2;
    }

    /**
     * Define el valor de la propiedad desDirec2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDesDirec2(String value) {
        this.desDirec2 = value;
    }

    /**
     * Obtiene el valor de la propiedad codOperadorDonante.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodOperadorDonante() {
        return codOperadorDonante;
    }

    /**
     * Define el valor de la propiedad codOperadorDonante.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodOperadorDonante(String value) {
        this.codOperadorDonante = value;
    }

    /**
     * Obtiene el valor de la propiedad fecVentanaCambio.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFecVentanaCambio() {
        return fecVentanaCambio;
    }

    /**
     * Define el valor de la propiedad fecVentanaCambio.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFecVentanaCambio(XMLGregorianCalendar value) {
        this.fecVentanaCambio = value;
    }

    /**
     * Obtiene el valor de la propiedad indTrxPortabilidad.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndTrxPortabilidad() {
        return indTrxPortabilidad;
    }

    /**
     * Define el valor de la propiedad indTrxPortabilidad.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndTrxPortabilidad(String value) {
        this.indTrxPortabilidad = value;
    }

    /**
     * Obtiene el valor de la propiedad codEscenarioPortabilidad.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCodEscenarioPortabilidad() {
        return codEscenarioPortabilidad;
    }

    /**
     * Define el valor de la propiedad codEscenarioPortabilidad.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCodEscenarioPortabilidad(Long value) {
        this.codEscenarioPortabilidad = value;
    }

    /**
     * Obtiene el valor de la propiedad codArticuloImei.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodArticuloImei() {
        return codArticuloImei;
    }

    /**
     * Define el valor de la propiedad codArticuloImei.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodArticuloImei(String value) {
        this.codArticuloImei = value;
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
     * Obtiene el valor de la propiedad codEstrato.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodEstrato() {
        return codEstrato;
    }

    /**
     * Define el valor de la propiedad codEstrato.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodEstrato(String value) {
        this.codEstrato = value;
    }

    /**
     * Obtiene el valor de la propiedad fecAltaAbonado.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFecAltaAbonado() {
        return fecAltaAbonado;
    }

    /**
     * Define el valor de la propiedad fecAltaAbonado.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFecAltaAbonado(XMLGregorianCalendar value) {
        this.fecAltaAbonado = value;
    }

}
