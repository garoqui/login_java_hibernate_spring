
package webservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the webservice package. 
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

    private final static QName _Valido_QNAME = new QName("http://Webservice/", "Valido");
    private final static QName _ValidoResponse_QNAME = new QName("http://Webservice/", "ValidoResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: webservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ValidoResponse }
     * 
     */
    public ValidoResponse createValidoResponse() {
        return new ValidoResponse();
    }

    /**
     * Create an instance of {@link Valido }
     * 
     */
    public Valido createValido() {
        return new Valido();
    }

    /**
     * Create an instance of {@link Usuarios }
     * 
     */
    public Usuarios createUsuarios() {
        return new Usuarios();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Valido }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Webservice/", name = "Valido")
    public JAXBElement<Valido> createValido(Valido value) {
        return new JAXBElement<Valido>(_Valido_QNAME, Valido.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValidoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Webservice/", name = "ValidoResponse")
    public JAXBElement<ValidoResponse> createValidoResponse(ValidoResponse value) {
        return new JAXBElement<ValidoResponse>(_ValidoResponse_QNAME, ValidoResponse.class, null, value);
    }

}
