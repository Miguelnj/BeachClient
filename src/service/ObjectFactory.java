
package service;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the service package. 
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

    private final static QName _KelvinToCelcius_QNAME = new QName("http://service/", "kelvinToCelcius");
    private final static QName _CelciusToKelvin_QNAME = new QName("http://service/", "celciusToKelvin");
    private final static QName _HelloResponse_QNAME = new QName("http://service/", "helloResponse");
    private final static QName _KelvinToCelciusResponse_QNAME = new QName("http://service/", "kelvinToCelciusResponse");
    private final static QName _Hello_QNAME = new QName("http://service/", "hello");
    private final static QName _CelciusToKelvinResponse_QNAME = new QName("http://service/", "celciusToKelvinResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link KelvinToCelciusResponse }
     * 
     */
    public KelvinToCelciusResponse createKelvinToCelciusResponse() {
        return new KelvinToCelciusResponse();
    }

    /**
     * Create an instance of {@link CelciusToKelvin }
     * 
     */
    public CelciusToKelvin createCelciusToKelvin() {
        return new CelciusToKelvin();
    }

    /**
     * Create an instance of {@link HelloResponse }
     * 
     */
    public HelloResponse createHelloResponse() {
        return new HelloResponse();
    }

    /**
     * Create an instance of {@link KelvinToCelcius }
     * 
     */
    public KelvinToCelcius createKelvinToCelcius() {
        return new KelvinToCelcius();
    }

    /**
     * Create an instance of {@link CelciusToKelvinResponse }
     * 
     */
    public CelciusToKelvinResponse createCelciusToKelvinResponse() {
        return new CelciusToKelvinResponse();
    }

    /**
     * Create an instance of {@link Hello }
     * 
     */
    public Hello createHello() {
        return new Hello();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link KelvinToCelcius }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "kelvinToCelcius")
    public JAXBElement<KelvinToCelcius> createKelvinToCelcius(KelvinToCelcius value) {
        return new JAXBElement<KelvinToCelcius>(_KelvinToCelcius_QNAME, KelvinToCelcius.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CelciusToKelvin }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "celciusToKelvin")
    public JAXBElement<CelciusToKelvin> createCelciusToKelvin(CelciusToKelvin value) {
        return new JAXBElement<CelciusToKelvin>(_CelciusToKelvin_QNAME, CelciusToKelvin.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HelloResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "helloResponse")
    public JAXBElement<HelloResponse> createHelloResponse(HelloResponse value) {
        return new JAXBElement<HelloResponse>(_HelloResponse_QNAME, HelloResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link KelvinToCelciusResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "kelvinToCelciusResponse")
    public JAXBElement<KelvinToCelciusResponse> createKelvinToCelciusResponse(KelvinToCelciusResponse value) {
        return new JAXBElement<KelvinToCelciusResponse>(_KelvinToCelciusResponse_QNAME, KelvinToCelciusResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Hello }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "hello")
    public JAXBElement<Hello> createHello(Hello value) {
        return new JAXBElement<Hello>(_Hello_QNAME, Hello.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CelciusToKelvinResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "celciusToKelvinResponse")
    public JAXBElement<CelciusToKelvinResponse> createCelciusToKelvinResponse(CelciusToKelvinResponse value) {
        return new JAXBElement<CelciusToKelvinResponse>(_CelciusToKelvinResponse_QNAME, CelciusToKelvinResponse.class, null, value);
    }

}
