
package com.mir00r.practiceApacheCamel.domains.challengequestions.models.rsa;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for QueryAuthStatusResponse complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="QueryAuthStatusResponse"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;extension base="{http://ws.csd.rsa.com}GenericResponse"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="credentialAuthStatusResponse" type="{http://ws.csd.rsa.com}CredentialAuthStatusResponse" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/extension&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QueryAuthStatusResponse", propOrder = {
    "credentialAuthStatusResponse"
})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
public class QueryAuthStatusResponse2
    extends GenericResponse
{

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    protected CredentialAuthStatusResponse credentialAuthStatusResponse;

    /**
     * Gets the value of the credentialAuthStatusResponse property.
     * 
     * @return
     *     possible object is
     *     {@link CredentialAuthStatusResponse }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    public CredentialAuthStatusResponse getCredentialAuthStatusResponse() {
        return credentialAuthStatusResponse;
    }

    /**
     * Sets the value of the credentialAuthStatusResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link CredentialAuthStatusResponse }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    public void setCredentialAuthStatusResponse(CredentialAuthStatusResponse value) {
        this.credentialAuthStatusResponse = value;
    }

}
