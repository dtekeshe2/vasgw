package com.ebridgevas.ussd.menu.model;

import com.ebridgevas.commons.dto.PayloadDTO;
import com.google.gson.Gson;

public class NodeData
        implements Comparable<NodeData>
{
    private final String nodeId;
    private String headerText;
    private String subHeaderText;
    private String description;
    private String nodeProcessorName;
    private PayloadDTO payload;

    public NodeData(String nodeId)
    {
        this.nodeId = nodeId;
    }

    public NodeData(
            String nodeId,
            String headerText,
            String subHeaderText,
            String description,
            String nodeProcessorName,
            String payload)
    {
        this.nodeId = nodeId;
        this.headerText = headerText;
        this.subHeaderText = subHeaderText;
        this.description = description;
        this.nodeProcessorName = nodeProcessorName;

        this.payload = parse(payload);
    }

    public String getNodeId()
    {
        return nodeId;
    }

    public String getHeaderText()
    {
        return headerText;
    }

    public void setHeaderText(String headerText)
    {
        this.headerText = headerText;
    }

    public String getSubHeaderText()
    {
        return subHeaderText;
    }

    public void setSubHeaderText(String subHeaderText)
    {
        this.subHeaderText = subHeaderText;
    }

    public String getDescription()
    {
        return description;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }

    public String getNodeProcessorName()
    {
        return nodeProcessorName;
    }

    public void setNodeProcessorName(String nodeProcessorName)
    {
        this.nodeProcessorName = nodeProcessorName;
    }

    public PayloadDTO getPayload()
    {
        return payload;
    }

    public void setPayload(String payload)
    {
        this.payload = parse(payload);
    }

    @Override
    public int compareTo(NodeData o)
    {
        return this.nodeId.compareTo(o.nodeId);
    }

    private PayloadDTO parse(String json)
    {
        String edited = json.replaceAll("\\{", "");
        edited = edited.replaceAll("\\}", "");
        edited = edited.replaceAll("[^\\[\\],]+", "\"$0\"");
        edited = edited.replaceAll(":", "\":\"");
        edited = "{" + edited + "}";
        return new Gson().fromJson(edited, PayloadDTO.class);
    }
}
