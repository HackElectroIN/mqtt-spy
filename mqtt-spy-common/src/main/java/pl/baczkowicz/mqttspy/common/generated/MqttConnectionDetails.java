//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.04.22 at 11:29:39 PM BST 
//


package pl.baczkowicz.mqttspy.common.generated;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.jvnet.jaxb2_commons.lang.CopyStrategy;
import org.jvnet.jaxb2_commons.lang.CopyTo;
import org.jvnet.jaxb2_commons.lang.Equals;
import org.jvnet.jaxb2_commons.lang.EqualsStrategy;
import org.jvnet.jaxb2_commons.lang.HashCode;
import org.jvnet.jaxb2_commons.lang.HashCodeStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBCopyStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBEqualsStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBHashCodeStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBToStringStrategy;
import org.jvnet.jaxb2_commons.lang.ToString;
import org.jvnet.jaxb2_commons.lang.ToStringStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;
import org.jvnet.jaxb2_commons.locator.util.LocatorUtils;
import pl.baczkowicz.spy.common.generated.UserCredentials;


/**
 * <p>Java class for MqttConnectionDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MqttConnectionDetails"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://baczkowicz.pl/mqtt-spy/common}ConnectionDetails"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ServerURI" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/&gt;
 *         &lt;element name="WebSocket" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ClientID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="UserCredentials" type="{http://baczkowicz.pl/spy/common}UserCredentials" minOccurs="0"/&gt;
 *         &lt;element name="LastWillAndTestament" type="{http://baczkowicz.pl/mqtt-spy/common}SimpleMqttMessage" minOccurs="0"/&gt;
 *         &lt;element name="CleanSession" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ConnectionTimeout" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="KeepAliveInterval" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="SSL" type="{http://baczkowicz.pl/mqtt-spy/common}SecureSocketSettings" minOccurs="0"/&gt;
 *         &lt;element name="ReconnectionSettings" type="{http://baczkowicz.pl/mqtt-spy/common}ReconnectionSettings" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MqttConnectionDetails", propOrder = {
    "serverURI",
    "webSocket",
    "clientID",
    "userCredentials",
    "lastWillAndTestament",
    "cleanSession",
    "connectionTimeout",
    "keepAliveInterval",
    "ssl",
    "reconnectionSettings"
})
public class MqttConnectionDetails
    extends ConnectionDetails
    implements Serializable, Cloneable, CopyTo, Equals, HashCode, ToString
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "ServerURI", required = true)
    protected List<String> serverURI;
    @XmlElement(name = "WebSocket")
    protected Boolean webSocket;
    @XmlElement(name = "ClientID", required = true)
    protected String clientID;
    @XmlElement(name = "UserCredentials")
    protected UserCredentials userCredentials;
    @XmlElement(name = "LastWillAndTestament")
    protected SimpleMqttMessage lastWillAndTestament;
    @XmlElement(name = "CleanSession")
    protected Boolean cleanSession;
    @XmlElement(name = "ConnectionTimeout")
    protected Integer connectionTimeout;
    @XmlElement(name = "KeepAliveInterval")
    protected Integer keepAliveInterval;
    @XmlElement(name = "SSL")
    protected SecureSocketSettings ssl;
    @XmlElement(name = "ReconnectionSettings")
    protected ReconnectionSettings reconnectionSettings;

    /**
     * Default no-arg constructor
     * 
     */
    public MqttConnectionDetails() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public MqttConnectionDetails(final String id, final String name, final ProtocolVersionEnum protocol, final List<String> serverURI, final Boolean webSocket, final String clientID, final UserCredentials userCredentials, final SimpleMqttMessage lastWillAndTestament, final Boolean cleanSession, final Integer connectionTimeout, final Integer keepAliveInterval, final SecureSocketSettings ssl, final ReconnectionSettings reconnectionSettings) {
        super(id, name, protocol);
        this.serverURI = serverURI;
        this.webSocket = webSocket;
        this.clientID = clientID;
        this.userCredentials = userCredentials;
        this.lastWillAndTestament = lastWillAndTestament;
        this.cleanSession = cleanSession;
        this.connectionTimeout = connectionTimeout;
        this.keepAliveInterval = keepAliveInterval;
        this.ssl = ssl;
        this.reconnectionSettings = reconnectionSettings;
    }

    /**
     * Gets the value of the serverURI property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the serverURI property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getServerURI().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getServerURI() {
        if (serverURI == null) {
            serverURI = new ArrayList<String>();
        }
        return this.serverURI;
    }

    /**
     * Gets the value of the webSocket property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWebSocket() {
        return webSocket;
    }

    /**
     * Sets the value of the webSocket property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWebSocket(Boolean value) {
        this.webSocket = value;
    }

    /**
     * Gets the value of the clientID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClientID() {
        return clientID;
    }

    /**
     * Sets the value of the clientID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClientID(String value) {
        this.clientID = value;
    }

    /**
     * Gets the value of the userCredentials property.
     * 
     * @return
     *     possible object is
     *     {@link UserCredentials }
     *     
     */
    public UserCredentials getUserCredentials() {
        return userCredentials;
    }

    /**
     * Sets the value of the userCredentials property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserCredentials }
     *     
     */
    public void setUserCredentials(UserCredentials value) {
        this.userCredentials = value;
    }

    /**
     * Gets the value of the lastWillAndTestament property.
     * 
     * @return
     *     possible object is
     *     {@link SimpleMqttMessage }
     *     
     */
    public SimpleMqttMessage getLastWillAndTestament() {
        return lastWillAndTestament;
    }

    /**
     * Sets the value of the lastWillAndTestament property.
     * 
     * @param value
     *     allowed object is
     *     {@link SimpleMqttMessage }
     *     
     */
    public void setLastWillAndTestament(SimpleMqttMessage value) {
        this.lastWillAndTestament = value;
    }

    /**
     * Gets the value of the cleanSession property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCleanSession() {
        return cleanSession;
    }

    /**
     * Sets the value of the cleanSession property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCleanSession(Boolean value) {
        this.cleanSession = value;
    }

    /**
     * Gets the value of the connectionTimeout property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getConnectionTimeout() {
        return connectionTimeout;
    }

    /**
     * Sets the value of the connectionTimeout property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setConnectionTimeout(Integer value) {
        this.connectionTimeout = value;
    }

    /**
     * Gets the value of the keepAliveInterval property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getKeepAliveInterval() {
        return keepAliveInterval;
    }

    /**
     * Sets the value of the keepAliveInterval property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setKeepAliveInterval(Integer value) {
        this.keepAliveInterval = value;
    }

    /**
     * Gets the value of the ssl property.
     * 
     * @return
     *     possible object is
     *     {@link SecureSocketSettings }
     *     
     */
    public SecureSocketSettings getSSL() {
        return ssl;
    }

    /**
     * Sets the value of the ssl property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecureSocketSettings }
     *     
     */
    public void setSSL(SecureSocketSettings value) {
        this.ssl = value;
    }

    /**
     * Gets the value of the reconnectionSettings property.
     * 
     * @return
     *     possible object is
     *     {@link ReconnectionSettings }
     *     
     */
    public ReconnectionSettings getReconnectionSettings() {
        return reconnectionSettings;
    }

    /**
     * Sets the value of the reconnectionSettings property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReconnectionSettings }
     *     
     */
    public void setReconnectionSettings(ReconnectionSettings value) {
        this.reconnectionSettings = value;
    }

    public String toString() {
        final ToStringStrategy strategy = JAXBToStringStrategy.INSTANCE;
        final StringBuilder buffer = new StringBuilder();
        append(null, buffer, strategy);
        return buffer.toString();
    }

    public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        strategy.appendStart(locator, this, buffer);
        appendFields(locator, buffer, strategy);
        strategy.appendEnd(locator, this, buffer);
        return buffer;
    }

    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        super.appendFields(locator, buffer, strategy);
        {
            List<String> theServerURI;
            theServerURI = (((this.serverURI!= null)&&(!this.serverURI.isEmpty()))?this.getServerURI():null);
            strategy.appendField(locator, this, "serverURI", buffer, theServerURI);
        }
        {
            Boolean theWebSocket;
            theWebSocket = this.isWebSocket();
            strategy.appendField(locator, this, "webSocket", buffer, theWebSocket);
        }
        {
            String theClientID;
            theClientID = this.getClientID();
            strategy.appendField(locator, this, "clientID", buffer, theClientID);
        }
        {
            UserCredentials theUserCredentials;
            theUserCredentials = this.getUserCredentials();
            strategy.appendField(locator, this, "userCredentials", buffer, theUserCredentials);
        }
        {
            SimpleMqttMessage theLastWillAndTestament;
            theLastWillAndTestament = this.getLastWillAndTestament();
            strategy.appendField(locator, this, "lastWillAndTestament", buffer, theLastWillAndTestament);
        }
        {
            Boolean theCleanSession;
            theCleanSession = this.isCleanSession();
            strategy.appendField(locator, this, "cleanSession", buffer, theCleanSession);
        }
        {
            Integer theConnectionTimeout;
            theConnectionTimeout = this.getConnectionTimeout();
            strategy.appendField(locator, this, "connectionTimeout", buffer, theConnectionTimeout);
        }
        {
            Integer theKeepAliveInterval;
            theKeepAliveInterval = this.getKeepAliveInterval();
            strategy.appendField(locator, this, "keepAliveInterval", buffer, theKeepAliveInterval);
        }
        {
            SecureSocketSettings theSSL;
            theSSL = this.getSSL();
            strategy.appendField(locator, this, "ssl", buffer, theSSL);
        }
        {
            ReconnectionSettings theReconnectionSettings;
            theReconnectionSettings = this.getReconnectionSettings();
            strategy.appendField(locator, this, "reconnectionSettings", buffer, theReconnectionSettings);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof MqttConnectionDetails)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final MqttConnectionDetails that = ((MqttConnectionDetails) object);
        {
            List<String> lhsServerURI;
            lhsServerURI = (((this.serverURI!= null)&&(!this.serverURI.isEmpty()))?this.getServerURI():null);
            List<String> rhsServerURI;
            rhsServerURI = (((that.serverURI!= null)&&(!that.serverURI.isEmpty()))?that.getServerURI():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "serverURI", lhsServerURI), LocatorUtils.property(thatLocator, "serverURI", rhsServerURI), lhsServerURI, rhsServerURI)) {
                return false;
            }
        }
        {
            Boolean lhsWebSocket;
            lhsWebSocket = this.isWebSocket();
            Boolean rhsWebSocket;
            rhsWebSocket = that.isWebSocket();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "webSocket", lhsWebSocket), LocatorUtils.property(thatLocator, "webSocket", rhsWebSocket), lhsWebSocket, rhsWebSocket)) {
                return false;
            }
        }
        {
            String lhsClientID;
            lhsClientID = this.getClientID();
            String rhsClientID;
            rhsClientID = that.getClientID();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "clientID", lhsClientID), LocatorUtils.property(thatLocator, "clientID", rhsClientID), lhsClientID, rhsClientID)) {
                return false;
            }
        }
        {
            UserCredentials lhsUserCredentials;
            lhsUserCredentials = this.getUserCredentials();
            UserCredentials rhsUserCredentials;
            rhsUserCredentials = that.getUserCredentials();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "userCredentials", lhsUserCredentials), LocatorUtils.property(thatLocator, "userCredentials", rhsUserCredentials), lhsUserCredentials, rhsUserCredentials)) {
                return false;
            }
        }
        {
            SimpleMqttMessage lhsLastWillAndTestament;
            lhsLastWillAndTestament = this.getLastWillAndTestament();
            SimpleMqttMessage rhsLastWillAndTestament;
            rhsLastWillAndTestament = that.getLastWillAndTestament();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "lastWillAndTestament", lhsLastWillAndTestament), LocatorUtils.property(thatLocator, "lastWillAndTestament", rhsLastWillAndTestament), lhsLastWillAndTestament, rhsLastWillAndTestament)) {
                return false;
            }
        }
        {
            Boolean lhsCleanSession;
            lhsCleanSession = this.isCleanSession();
            Boolean rhsCleanSession;
            rhsCleanSession = that.isCleanSession();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "cleanSession", lhsCleanSession), LocatorUtils.property(thatLocator, "cleanSession", rhsCleanSession), lhsCleanSession, rhsCleanSession)) {
                return false;
            }
        }
        {
            Integer lhsConnectionTimeout;
            lhsConnectionTimeout = this.getConnectionTimeout();
            Integer rhsConnectionTimeout;
            rhsConnectionTimeout = that.getConnectionTimeout();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "connectionTimeout", lhsConnectionTimeout), LocatorUtils.property(thatLocator, "connectionTimeout", rhsConnectionTimeout), lhsConnectionTimeout, rhsConnectionTimeout)) {
                return false;
            }
        }
        {
            Integer lhsKeepAliveInterval;
            lhsKeepAliveInterval = this.getKeepAliveInterval();
            Integer rhsKeepAliveInterval;
            rhsKeepAliveInterval = that.getKeepAliveInterval();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "keepAliveInterval", lhsKeepAliveInterval), LocatorUtils.property(thatLocator, "keepAliveInterval", rhsKeepAliveInterval), lhsKeepAliveInterval, rhsKeepAliveInterval)) {
                return false;
            }
        }
        {
            SecureSocketSettings lhsSSL;
            lhsSSL = this.getSSL();
            SecureSocketSettings rhsSSL;
            rhsSSL = that.getSSL();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "ssl", lhsSSL), LocatorUtils.property(thatLocator, "ssl", rhsSSL), lhsSSL, rhsSSL)) {
                return false;
            }
        }
        {
            ReconnectionSettings lhsReconnectionSettings;
            lhsReconnectionSettings = this.getReconnectionSettings();
            ReconnectionSettings rhsReconnectionSettings;
            rhsReconnectionSettings = that.getReconnectionSettings();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "reconnectionSettings", lhsReconnectionSettings), LocatorUtils.property(thatLocator, "reconnectionSettings", rhsReconnectionSettings), lhsReconnectionSettings, rhsReconnectionSettings)) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(Object object) {
        final EqualsStrategy strategy = JAXBEqualsStrategy.INSTANCE;
        return equals(null, null, object, strategy);
    }

    public int hashCode(ObjectLocator locator, HashCodeStrategy strategy) {
        int currentHashCode = super.hashCode(locator, strategy);
        {
            List<String> theServerURI;
            theServerURI = (((this.serverURI!= null)&&(!this.serverURI.isEmpty()))?this.getServerURI():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "serverURI", theServerURI), currentHashCode, theServerURI);
        }
        {
            Boolean theWebSocket;
            theWebSocket = this.isWebSocket();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "webSocket", theWebSocket), currentHashCode, theWebSocket);
        }
        {
            String theClientID;
            theClientID = this.getClientID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "clientID", theClientID), currentHashCode, theClientID);
        }
        {
            UserCredentials theUserCredentials;
            theUserCredentials = this.getUserCredentials();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "userCredentials", theUserCredentials), currentHashCode, theUserCredentials);
        }
        {
            SimpleMqttMessage theLastWillAndTestament;
            theLastWillAndTestament = this.getLastWillAndTestament();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "lastWillAndTestament", theLastWillAndTestament), currentHashCode, theLastWillAndTestament);
        }
        {
            Boolean theCleanSession;
            theCleanSession = this.isCleanSession();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "cleanSession", theCleanSession), currentHashCode, theCleanSession);
        }
        {
            Integer theConnectionTimeout;
            theConnectionTimeout = this.getConnectionTimeout();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "connectionTimeout", theConnectionTimeout), currentHashCode, theConnectionTimeout);
        }
        {
            Integer theKeepAliveInterval;
            theKeepAliveInterval = this.getKeepAliveInterval();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "keepAliveInterval", theKeepAliveInterval), currentHashCode, theKeepAliveInterval);
        }
        {
            SecureSocketSettings theSSL;
            theSSL = this.getSSL();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "ssl", theSSL), currentHashCode, theSSL);
        }
        {
            ReconnectionSettings theReconnectionSettings;
            theReconnectionSettings = this.getReconnectionSettings();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "reconnectionSettings", theReconnectionSettings), currentHashCode, theReconnectionSettings);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

    public Object clone() {
        return copyTo(createNewInstance());
    }

    public Object copyTo(Object target) {
        final CopyStrategy strategy = JAXBCopyStrategy.INSTANCE;
        return copyTo(null, target, strategy);
    }

    public Object copyTo(ObjectLocator locator, Object target, CopyStrategy strategy) {
        final Object draftCopy = ((target == null)?createNewInstance():target);
        super.copyTo(locator, draftCopy, strategy);
        if (draftCopy instanceof MqttConnectionDetails) {
            final MqttConnectionDetails copy = ((MqttConnectionDetails) draftCopy);
            if ((this.serverURI!= null)&&(!this.serverURI.isEmpty())) {
                List<String> sourceServerURI;
                sourceServerURI = (((this.serverURI!= null)&&(!this.serverURI.isEmpty()))?this.getServerURI():null);
                @SuppressWarnings("unchecked")
                List<String> copyServerURI = ((List<String> ) strategy.copy(LocatorUtils.property(locator, "serverURI", sourceServerURI), sourceServerURI));
                copy.serverURI = null;
                if (copyServerURI!= null) {
                    List<String> uniqueServerURIl = copy.getServerURI();
                    uniqueServerURIl.addAll(copyServerURI);
                }
            } else {
                copy.serverURI = null;
            }
            if (this.webSocket!= null) {
                Boolean sourceWebSocket;
                sourceWebSocket = this.isWebSocket();
                Boolean copyWebSocket = ((Boolean) strategy.copy(LocatorUtils.property(locator, "webSocket", sourceWebSocket), sourceWebSocket));
                copy.setWebSocket(copyWebSocket);
            } else {
                copy.webSocket = null;
            }
            if (this.clientID!= null) {
                String sourceClientID;
                sourceClientID = this.getClientID();
                String copyClientID = ((String) strategy.copy(LocatorUtils.property(locator, "clientID", sourceClientID), sourceClientID));
                copy.setClientID(copyClientID);
            } else {
                copy.clientID = null;
            }
            if (this.userCredentials!= null) {
                UserCredentials sourceUserCredentials;
                sourceUserCredentials = this.getUserCredentials();
                UserCredentials copyUserCredentials = ((UserCredentials) strategy.copy(LocatorUtils.property(locator, "userCredentials", sourceUserCredentials), sourceUserCredentials));
                copy.setUserCredentials(copyUserCredentials);
            } else {
                copy.userCredentials = null;
            }
            if (this.lastWillAndTestament!= null) {
                SimpleMqttMessage sourceLastWillAndTestament;
                sourceLastWillAndTestament = this.getLastWillAndTestament();
                SimpleMqttMessage copyLastWillAndTestament = ((SimpleMqttMessage) strategy.copy(LocatorUtils.property(locator, "lastWillAndTestament", sourceLastWillAndTestament), sourceLastWillAndTestament));
                copy.setLastWillAndTestament(copyLastWillAndTestament);
            } else {
                copy.lastWillAndTestament = null;
            }
            if (this.cleanSession!= null) {
                Boolean sourceCleanSession;
                sourceCleanSession = this.isCleanSession();
                Boolean copyCleanSession = ((Boolean) strategy.copy(LocatorUtils.property(locator, "cleanSession", sourceCleanSession), sourceCleanSession));
                copy.setCleanSession(copyCleanSession);
            } else {
                copy.cleanSession = null;
            }
            if (this.connectionTimeout!= null) {
                Integer sourceConnectionTimeout;
                sourceConnectionTimeout = this.getConnectionTimeout();
                Integer copyConnectionTimeout = ((Integer) strategy.copy(LocatorUtils.property(locator, "connectionTimeout", sourceConnectionTimeout), sourceConnectionTimeout));
                copy.setConnectionTimeout(copyConnectionTimeout);
            } else {
                copy.connectionTimeout = null;
            }
            if (this.keepAliveInterval!= null) {
                Integer sourceKeepAliveInterval;
                sourceKeepAliveInterval = this.getKeepAliveInterval();
                Integer copyKeepAliveInterval = ((Integer) strategy.copy(LocatorUtils.property(locator, "keepAliveInterval", sourceKeepAliveInterval), sourceKeepAliveInterval));
                copy.setKeepAliveInterval(copyKeepAliveInterval);
            } else {
                copy.keepAliveInterval = null;
            }
            if (this.ssl!= null) {
                SecureSocketSettings sourceSSL;
                sourceSSL = this.getSSL();
                SecureSocketSettings copySSL = ((SecureSocketSettings) strategy.copy(LocatorUtils.property(locator, "ssl", sourceSSL), sourceSSL));
                copy.setSSL(copySSL);
            } else {
                copy.ssl = null;
            }
            if (this.reconnectionSettings!= null) {
                ReconnectionSettings sourceReconnectionSettings;
                sourceReconnectionSettings = this.getReconnectionSettings();
                ReconnectionSettings copyReconnectionSettings = ((ReconnectionSettings) strategy.copy(LocatorUtils.property(locator, "reconnectionSettings", sourceReconnectionSettings), sourceReconnectionSettings));
                copy.setReconnectionSettings(copyReconnectionSettings);
            } else {
                copy.reconnectionSettings = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new MqttConnectionDetails();
    }

}
