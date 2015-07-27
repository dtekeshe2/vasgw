package za.co.ebridge.mscinterface.model;

import com.google.gson.Gson;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * david@tekeshe.com
 */

@Entity
@Table(name = "ss7_config")
public class SS7Config
{

    @Id
    @Column(name = "global_title")
    private String globalTitle;

    @Column(name = "destination_point_code")
    private Integer destinationPointCode;

    @Column(name = "server_name")
    private String serverName;

    @Column(name = "association_name")
    private String associationName;

    @Column(name = "ip_address")
    private String ipAddress;

    @Column(name = "port")
    private Integer port;

    @Column(name = "routing_context")
    private Integer routingContext;

    @Column(name = "network_indicator")
    private Integer networkIndicator;

    @Column(name = "service_indicator")
    private Integer serviceIndicator;

    @Column(name = "sub_system_number")
    private Integer subSystemNumber;

    @Column(name = "ip_channel_type")
    private String ipChannelType;

    // Default: SGW
    @Column(name = "functionality")
    private String functionality;

    @Column(name = "network_appearance")
    private Long networkAppearance;

    public SS7Config()
    {
    }

    public SS7Config( String globalTitle,
                      Integer destinationPointCode,
                      String serverName,
                      String associationName,
                      String ipAddress,
                      Integer port,
                      Integer routingContext,
                      Integer networkIndicator,
                      Integer serviceIndicator,
                      Integer subSystemNumber,
                      String ipChannelType,
                      String functionality,
                      Long networkAppearance)
    {
        this.globalTitle = globalTitle;
        this.destinationPointCode = destinationPointCode;
        this.serverName = serverName;
        this.associationName = associationName;
        this.ipAddress = ipAddress;
        this.port = port;
        this.routingContext = routingContext;
        this.networkIndicator = networkIndicator;
        this.serviceIndicator = serviceIndicator;
        this.subSystemNumber = subSystemNumber;
        this.ipChannelType = ipChannelType;
        this.functionality = functionality;
        this.networkAppearance = networkAppearance;
    }

    public String getGlobalTitle() {
        return globalTitle;
    }

    public void setGlobalTitle(String globalTitle) {
        this.globalTitle = globalTitle;
    }

    public Integer getDestinationPointCode() {
        return destinationPointCode;
    }

    public void setDestinationPointCode(Integer destinationPointCode) {
        this.destinationPointCode = destinationPointCode;
    }

    public String getServerName() {
        return serverName;
    }

    public void setServerName(String serverName) {
        this.serverName = serverName;
    }

    public String getAssociationName() {
        return associationName;
    }

    public void setAssociationName(String associationName) {
        this.associationName = associationName;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    public Integer getRoutingContext() {
        return routingContext;
    }

    public void setRoutingContext(Integer routingContext) {
        this.routingContext = routingContext;
    }

    public Integer getNetworkIndicator() {
        return networkIndicator;
    }

    public void setNetworkIndicator(Integer networkIndicator) {
        this.networkIndicator = networkIndicator;
    }

    public Integer getServiceIndicator() {
        return serviceIndicator;
    }

    public void setServiceIndicator(Integer serviceIndicator) {
        this.serviceIndicator = serviceIndicator;
    }

    public Integer getSubSystemNumber() {
        return subSystemNumber;
    }

    public void setSubSystemNumber(Integer subSystemNumber) {
        this.subSystemNumber = subSystemNumber;
    }

    public String getIpChannelType() {
        return ipChannelType;
    }

    public void setIpChannelType(String ipChannelType) {
        this.ipChannelType = ipChannelType;
    }

    public String getFunctionality() {
        return functionality;
    }

    public void setFunctionality(String functionality) {
        this.functionality = functionality;
    }

    public Long getNetworkAppearance() {
        return networkAppearance;
    }

    public void setNetworkAppearance(Long networkAppearance) {
        this.networkAppearance = networkAppearance;
    }

    public String toString() {
        return new Gson().toJson(this);
    }
}
