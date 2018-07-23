package com.example.model;



import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "channelName",
    "pageTypeName",
    "positionName",
    "rate",
    "formattedRate",
    "impressions",
    "rateType",
    "cost",
    "formattedCost",
    "tacticId",
    "lineItemId",
    "forecastStatus",
    "targetingTypes",
    "targetingValues"
})
public class Channel {

    @JsonProperty("channelName")
    private String channelName;
    @JsonProperty("pageTypeName")
    private String pageTypeName;
    @JsonProperty("positionName")
    private String positionName;
    @JsonProperty("rate")
    private Double rate;
    @JsonProperty("formattedRate")
    private Double formattedRate;
    @JsonProperty("impressions")
    private Integer impressions;
    @JsonProperty("rateType")
    private String rateType;
    @JsonProperty("cost")
    private Double cost;
    @JsonProperty("formattedCost")
    private Integer formattedCost;
    @JsonProperty("tacticId")
    private String tacticId;
    @JsonProperty("lineItemId")
    private String lineItemId;
    @JsonProperty("forecastStatus")
    private String forecastStatus;
    @JsonProperty("targetingTypes")
    private String targetingTypes;
    @JsonProperty("targetingValues")
    private String targetingValues;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("channelName")
    public String getChannelName() {
        return channelName;
    }

    @JsonProperty("channelName")
    public void setChannelName(String channelName) {
        this.channelName = channelName;
    }

    @JsonProperty("pageTypeName")
    public String getPageTypeName() {
        return pageTypeName;
    }

    @JsonProperty("pageTypeName")
    public void setPageTypeName(String pageTypeName) {
        this.pageTypeName = pageTypeName;
    }

    @JsonProperty("positionName")
    public String getPositionName() {
        return positionName;
    }

    @JsonProperty("positionName")
    public void setPositionName(String positionName) {
        this.positionName = positionName;
    }

    @JsonProperty("rate")
    public Double getRate() {
        return rate;
    }

    @JsonProperty("rate")
    public void setRate(Double rate) {
        this.rate = rate;
    }

    @JsonProperty("formattedRate")
    public Double getFormattedRate() {
        return formattedRate;
    }

    @JsonProperty("formattedRate")
    public void setFormattedRate(Double formattedRate) {
        this.formattedRate = formattedRate;
    }

    @JsonProperty("impressions")
    public Integer getImpressions() {
        return impressions;
    }

    @JsonProperty("impressions")
    public void setImpressions(Integer impressions) {
        this.impressions = impressions;
    }

    @JsonProperty("rateType")
    public String getRateType() {
        return rateType;
    }

    @JsonProperty("rateType")
    public void setRateType(String rateType) {
        this.rateType = rateType;
    }

    @JsonProperty("cost")
    public Double getCost() {
        return cost;
    }

    @JsonProperty("cost")
    public void setCost(Double cost) {
        this.cost = cost;
    }

    @JsonProperty("formattedCost")
    public Integer getFormattedCost() {
        return formattedCost;
    }

    @JsonProperty("formattedCost")
    public void setFormattedCost(Integer formattedCost) {
        this.formattedCost = formattedCost;
    }

    @JsonProperty("tacticId")
    public String getTacticId() {
        return tacticId;
    }

    @JsonProperty("tacticId")
    public void setTacticId(String tacticId) {
        this.tacticId = tacticId;
    }

    @JsonProperty("lineItemId")
    public String getLineItemId() {
        return lineItemId;
    }

    @JsonProperty("lineItemId")
    public void setLineItemId(String lineItemId) {
        this.lineItemId = lineItemId;
    }

    @JsonProperty("forecastStatus")
    public String getForecastStatus() {
        return forecastStatus;
    }

    @JsonProperty("forecastStatus")
    public void setForecastStatus(String forecastStatus) {
        this.forecastStatus = forecastStatus;
    }

    @JsonProperty("targetingTypes")
    public String getTargetingTypes() {
        return targetingTypes;
    }

    @JsonProperty("targetingTypes")
    public void setTargetingTypes(String targetingTypes) {
        this.targetingTypes = targetingTypes;
    }

    @JsonProperty("targetingValues")
    public String getTargetingValues() {
        return targetingValues;
    }

    @JsonProperty("targetingValues")
    public void setTargetingValues(String targetingValues) {
        this.targetingValues = targetingValues;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
