
package wsdl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="GetQuoteResult" type="{http://swanandmokashi.com}Quotes"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "getQuoteResult"
})
@XmlRootElement(name = "GetQuoteResponse")
public class GetQuoteResponse {

    @XmlElement(name = "GetQuoteResult", required = true)
    protected Quotes getQuoteResult;

    /**
     * Gets the value of the getQuoteResult property.
     * 
     * @return
     *     possible object is
     *     {@link Quotes }
     *     
     */
    public Quotes getGetQuoteResult() {
        return getQuoteResult;
    }

    /**
     * Sets the value of the getQuoteResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link Quotes }
     *     
     */
    public void setGetQuoteResult(Quotes value) {
        this.getQuoteResult = value;
    }

}
