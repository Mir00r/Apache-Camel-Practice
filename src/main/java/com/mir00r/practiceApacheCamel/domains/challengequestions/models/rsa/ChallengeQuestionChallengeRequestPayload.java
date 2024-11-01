
package com.mir00r.practiceApacheCamel.domains.challengequestions.models.rsa;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * This requests the results of the challenge question challenge method
 * 
 * &lt;p&gt;Java class for ChallengeQuestionChallengeRequestPayload complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="ChallengeQuestionChallengeRequestPayload"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="excludeQuestions" type="{http://ws.csd.rsa.com}ChallengeQuestionIdList" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="numberOfQuestion" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChallengeQuestionChallengeRequestPayload", propOrder = {
    "excludeQuestions",
    "numberOfQuestion"
})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
public class ChallengeQuestionChallengeRequestPayload {

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    protected ChallengeQuestionIdList excludeQuestions;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    protected Integer numberOfQuestion;

    /**
     * Gets the value of the excludeQuestions property.
     * 
     * @return
     *     possible object is
     *     {@link ChallengeQuestionIdList }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    public ChallengeQuestionIdList getExcludeQuestions() {
        return excludeQuestions;
    }

    /**
     * Sets the value of the excludeQuestions property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChallengeQuestionIdList }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    public void setExcludeQuestions(ChallengeQuestionIdList value) {
        this.excludeQuestions = value;
    }

    /**
     * Gets the value of the numberOfQuestion property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    public Integer getNumberOfQuestion() {
        return numberOfQuestion;
    }

    /**
     * Sets the value of the numberOfQuestion property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    public void setNumberOfQuestion(Integer value) {
        this.numberOfQuestion = value;
    }

}
