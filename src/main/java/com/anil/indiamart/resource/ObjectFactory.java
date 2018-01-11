
package com.anil.indiamart.resource;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.anil.indiamart.resource package. 
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

    private final static QName _GetProductDetails_QNAME = new QName("http://resource.indiamart.anil.com/", "getProductDetails");
    private final static QName _GetProduct_QNAME = new QName("http://resource.indiamart.anil.com/", "getProduct");
    private final static QName _GetProductResponse_QNAME = new QName("http://resource.indiamart.anil.com/", "getProductResponse");
    private final static QName _GetProductDetailsResponse_QNAME = new QName("http://resource.indiamart.anil.com/", "getProductDetailsResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.anil.indiamart.resource
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetProduct }
     * 
     */
    public GetProduct createGetProduct() {
        return new GetProduct();
    }

    /**
     * Create an instance of {@link GetProductDetails }
     * 
     */
    public GetProductDetails createGetProductDetails() {
        return new GetProductDetails();
    }

    /**
     * Create an instance of {@link GetProductResponse }
     * 
     */
    public GetProductResponse createGetProductResponse() {
        return new GetProductResponse();
    }

    /**
     * Create an instance of {@link GetProductDetailsResponse }
     * 
     */
    public GetProductDetailsResponse createGetProductDetailsResponse() {
        return new GetProductDetailsResponse();
    }

    /**
     * Create an instance of {@link Product }
     * 
     */
    public Product createProduct() {
        return new Product();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetProductDetails }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://resource.indiamart.anil.com/", name = "getProductDetails")
    public JAXBElement<GetProductDetails> createGetProductDetails(GetProductDetails value) {
        return new JAXBElement<GetProductDetails>(_GetProductDetails_QNAME, GetProductDetails.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetProduct }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://resource.indiamart.anil.com/", name = "getProduct")
    public JAXBElement<GetProduct> createGetProduct(GetProduct value) {
        return new JAXBElement<GetProduct>(_GetProduct_QNAME, GetProduct.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetProductResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://resource.indiamart.anil.com/", name = "getProductResponse")
    public JAXBElement<GetProductResponse> createGetProductResponse(GetProductResponse value) {
        return new JAXBElement<GetProductResponse>(_GetProductResponse_QNAME, GetProductResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetProductDetailsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://resource.indiamart.anil.com/", name = "getProductDetailsResponse")
    public JAXBElement<GetProductDetailsResponse> createGetProductDetailsResponse(GetProductDetailsResponse value) {
        return new JAXBElement<GetProductDetailsResponse>(_GetProductDetailsResponse_QNAME, GetProductDetailsResponse.class, null, value);
    }

}
