
package com.mir00r.practiceApacheCamel.domains.challengequestions.models.rsa;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


/**
 * This type returns the image category
 * 
 * &lt;p&gt;Java class for SiteToUserBrowseResponse complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="SiteToUserBrowseResponse"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="browsableImages" type="{http://ws.csd.rsa.com}BrowsableImages" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="browseableImageCategories" type="{http://ws.csd.rsa.com}Category" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="favoriteImages" type="{http://ws.csd.rsa.com}BrowsableImages" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SiteToUserBrowseResponse", propOrder = {
    "browsableImages",
    "browseableImageCategories",
    "favoriteImages"
})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
public class SiteToUserBrowseResponse {

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    protected BrowsableImages browsableImages;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    protected List<Category> browseableImageCategories;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    protected BrowsableImages favoriteImages;

    /**
     * Gets the value of the browsableImages property.
     * 
     * @return
     *     possible object is
     *     {@link BrowsableImages }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    public BrowsableImages getBrowsableImages() {
        return browsableImages;
    }

    /**
     * Sets the value of the browsableImages property.
     * 
     * @param value
     *     allowed object is
     *     {@link BrowsableImages }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    public void setBrowsableImages(BrowsableImages value) {
        this.browsableImages = value;
    }

    /**
     * Gets the value of the browseableImageCategories property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the browseableImageCategories property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getBrowseableImageCategories().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link Category }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    public List<Category> getBrowseableImageCategories() {
        if (browseableImageCategories == null) {
            browseableImageCategories = new ArrayList<Category>();
        }
        return this.browseableImageCategories;
    }

    /**
     * Gets the value of the favoriteImages property.
     * 
     * @return
     *     possible object is
     *     {@link BrowsableImages }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    public BrowsableImages getFavoriteImages() {
        return favoriteImages;
    }

    /**
     * Sets the value of the favoriteImages property.
     * 
     * @param value
     *     allowed object is
     *     {@link BrowsableImages }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    public void setFavoriteImages(BrowsableImages value) {
        this.favoriteImages = value;
    }

}
