
package sdp.Xsd.Client.Volume;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the sdp.Xsd.Client.Volume package. 
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


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: sdp.Xsd.Client.Volume
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link RefundVolume }
     * 
     */
    public RefundVolume createRefundVolume() {
        return new RefundVolume();
    }

    /**
     * Create an instance of {@link Parameters }
     * 
     */
    public Parameters createParameters() {
        return new Parameters();
    }

    /**
     * Create an instance of {@link ChargeVolumeResponse }
     * 
     */
    public ChargeVolumeResponse createChargeVolumeResponse() {
        return new ChargeVolumeResponse();
    }

    /**
     * Create an instance of {@link ChargeVolume }
     * 
     */
    public ChargeVolume createChargeVolume() {
        return new ChargeVolume();
    }

    /**
     * Create an instance of {@link RefundVolumeResponse }
     * 
     */
    public RefundVolumeResponse createRefundVolumeResponse() {
        return new RefundVolumeResponse();
    }

}
