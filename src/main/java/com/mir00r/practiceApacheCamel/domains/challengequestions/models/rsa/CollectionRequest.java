
package com.mir00r.practiceApacheCamel.domains.challengequestions.models.rsa;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * This describes why a collection is being initiated and the reasons behind it
 * 
 * &lt;p&gt;Java class for CollectionRequest complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="CollectionRequest"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="collectionInitiator" type="{http://ws.csd.rsa.com}CollectionInitiator" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="collectionReason" type="{http://ws.csd.rsa.com}CollectionReason" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="forceCollection" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="orgCredentialList" type="{http://ws.csd.rsa.com}CredentialList" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CollectionRequest", propOrder = {
    "collectionInitiator",
    "collectionReason",
    "forceCollection",
    "orgCredentialList"
})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
public class CollectionRequest {

    @XmlSchemaType(name = "string")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    protected CollectionInitiator collectionInitiator;
    @XmlSchemaType(name = "string")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    protected CollectionReason collectionReason;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    protected Boolean forceCollection;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    protected CredentialList orgCredentialList;

    /**
     * Gets the value of the collectionInitiator property.
     * 
     * @return
     *     possible object is
     *     {@link CollectionInitiator }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    public CollectionInitiator getCollectionInitiator() {
        return collectionInitiator;
    }

    /**
     * Sets the value of the collectionInitiator property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollectionInitiator }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    public void setCollectionInitiator(CollectionInitiator value) {
        this.collectionInitiator = value;
    }

    /**
     * Gets the value of the collectionReason property.
     * 
     * @return
     *     possible object is
     *     {@link CollectionReason }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    public CollectionReason getCollectionReason() {
        return collectionReason;
    }

    /**
     * Sets the value of the collectionReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollectionReason }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    public void setCollectionReason(CollectionReason value) {
        this.collectionReason = value;
    }

    /**
     * Gets the value of the forceCollection property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    public Boolean isForceCollection() {
        return forceCollection;
    }

    /**
     * Sets the value of the forceCollection property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    public void setForceCollection(Boolean value) {
        this.forceCollection = value;
    }

    /**
     * Gets the value of the orgCredentialList property.
     * 
     * @return
     *     possible object is
     *     {@link CredentialList }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    public CredentialList getOrgCredentialList() {
        return orgCredentialList;
    }

    /**
     * Sets the value of the orgCredentialList property.
     * 
     * @param value
     *     allowed object is
     *     {@link CredentialList }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    public void setOrgCredentialList(CredentialList value) {
        this.orgCredentialList = value;
    }

}
