//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.2 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2022.05.11 a las 08:15:52 AM COT 
//


package com.telefonica.soap.java.once.model.client.dto;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.telefonica.soap.java.once.model.client.dto package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ApfServiceException_QNAME = new QName("http://ws.endpoint.apf.scl.cl.amdocs.com/", "ApfServiceException");
    private final static QName _AltaPrepago_QNAME = new QName("http://ws.endpoint.apf.scl.cl.amdocs.com/", "altaPrepago");
    private final static QName _AltaPrepagoResponse_QNAME = new QName("http://ws.endpoint.apf.scl.cl.amdocs.com/", "altaPrepagoResponse");
    private final static QName _CleanServerCache_QNAME = new QName("http://ws.endpoint.apf.scl.cl.amdocs.com/", "cleanServerCache");
    private final static QName _CleanServerCacheResponse_QNAME = new QName("http://ws.endpoint.apf.scl.cl.amdocs.com/", "cleanServerCacheResponse");
    private final static QName _GetServiceStatus_QNAME = new QName("http://ws.endpoint.apf.scl.cl.amdocs.com/", "getServiceStatus");
    private final static QName _GetServiceStatusResponse_QNAME = new QName("http://ws.endpoint.apf.scl.cl.amdocs.com/", "getServiceStatusResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.telefonica.soap.java.once.model.client.dto
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ApfServiceException }
     * 
     */
    public ApfServiceException createApfServiceException() {
        return new ApfServiceException();
    }

    /**
     * Create an instance of {@link AltaPrepago }
     * 
     */
    public AltaPrepago createAltaPrepago() {
        return new AltaPrepago();
    }

    /**
     * Create an instance of {@link AltaPrepagoResponse }
     * 
     */
    public AltaPrepagoResponse createAltaPrepagoResponse() {
        return new AltaPrepagoResponse();
    }

    /**
     * Create an instance of {@link CleanServerCache }
     * 
     */
    public CleanServerCache createCleanServerCache() {
        return new CleanServerCache();
    }

    /**
     * Create an instance of {@link CleanServerCacheResponse }
     * 
     */
    public CleanServerCacheResponse createCleanServerCacheResponse() {
        return new CleanServerCacheResponse();
    }

    /**
     * Create an instance of {@link GetServiceStatus }
     * 
     */
    public GetServiceStatus createGetServiceStatus() {
        return new GetServiceStatus();
    }

    /**
     * Create an instance of {@link GetServiceStatusResponse }
     * 
     */
    public GetServiceStatusResponse createGetServiceStatusResponse() {
        return new GetServiceStatusResponse();
    }

    /**
     * Create an instance of {@link ApfRequest }
     * 
     */
    public ApfRequest createApfRequest() {
        return new ApfRequest();
    }

    /**
     * Create an instance of {@link ApfResponse }
     * 
     */
    public ApfResponse createApfResponse() {
        return new ApfResponse();
    }

    /**
     * Create an instance of {@link Response }
     * 
     */
    public Response createResponse() {
        return new Response();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ApfServiceException }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ApfServiceException }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.endpoint.apf.scl.cl.amdocs.com/", name = "ApfServiceException")
    public JAXBElement<ApfServiceException> createApfServiceException(ApfServiceException value) {
        return new JAXBElement<ApfServiceException>(_ApfServiceException_QNAME, ApfServiceException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AltaPrepago }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AltaPrepago }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.endpoint.apf.scl.cl.amdocs.com/", name = "altaPrepago")
    public JAXBElement<AltaPrepago> createAltaPrepago(AltaPrepago value) {
        return new JAXBElement<AltaPrepago>(_AltaPrepago_QNAME, AltaPrepago.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AltaPrepagoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AltaPrepagoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.endpoint.apf.scl.cl.amdocs.com/", name = "altaPrepagoResponse")
    public JAXBElement<AltaPrepagoResponse> createAltaPrepagoResponse(AltaPrepagoResponse value) {
        return new JAXBElement<AltaPrepagoResponse>(_AltaPrepagoResponse_QNAME, AltaPrepagoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CleanServerCache }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CleanServerCache }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.endpoint.apf.scl.cl.amdocs.com/", name = "cleanServerCache")
    public JAXBElement<CleanServerCache> createCleanServerCache(CleanServerCache value) {
        return new JAXBElement<CleanServerCache>(_CleanServerCache_QNAME, CleanServerCache.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CleanServerCacheResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CleanServerCacheResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.endpoint.apf.scl.cl.amdocs.com/", name = "cleanServerCacheResponse")
    public JAXBElement<CleanServerCacheResponse> createCleanServerCacheResponse(CleanServerCacheResponse value) {
        return new JAXBElement<CleanServerCacheResponse>(_CleanServerCacheResponse_QNAME, CleanServerCacheResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetServiceStatus }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetServiceStatus }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.endpoint.apf.scl.cl.amdocs.com/", name = "getServiceStatus")
    public JAXBElement<GetServiceStatus> createGetServiceStatus(GetServiceStatus value) {
        return new JAXBElement<GetServiceStatus>(_GetServiceStatus_QNAME, GetServiceStatus.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetServiceStatusResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetServiceStatusResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.endpoint.apf.scl.cl.amdocs.com/", name = "getServiceStatusResponse")
    public JAXBElement<GetServiceStatusResponse> createGetServiceStatusResponse(GetServiceStatusResponse value) {
        return new JAXBElement<GetServiceStatusResponse>(_GetServiceStatusResponse_QNAME, GetServiceStatusResponse.class, null, value);
    }

}
