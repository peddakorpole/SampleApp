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
    "platform",
    "displayName",
    "impressions",
    "cost",
    "formattedCost",
    "percentageOnTotalBudget"
})
public class PlatformMetricsList {

    @JsonProperty("platform")
    private String platform;
    @JsonProperty("displayName")
    private String displayName;
    @JsonProperty("impressions")
    private Integer impressions;
    @JsonProperty("cost")
    private Double cost;
    @JsonProperty("formattedCost")
    private Double formattedCost;
    @JsonProperty("percentageOnTotalBudget")
    private Integer percentageOnTotalBudget;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("platform")
    public String getPlatform() {
        return platform;
    }

    @JsonProperty("platform")
    public void setPlatform(String platform) {
        this.platform = platform;
    }

    @JsonProperty("displayName")
    public String getDisplayName() {
        return displayName;
    }

    @JsonProperty("displayName")
    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    @JsonProperty("impressions")
    public Integer getImpressions() {
        return impressions;
    }

    @JsonProperty("impressions")
    public void setImpressions(Integer impressions) {
        this.impressions = impressions;
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
    public Double getFormattedCost() {
        return formattedCost;
    }

    @JsonProperty("formattedCost")
    public void setFormattedCost(Double formattedCost) {
        this.formattedCost = formattedCost;
    }

    @JsonProperty("percentageOnTotalBudget")
    public Integer getPercentageOnTotalBudget() {
        return percentageOnTotalBudget;
    }

    @JsonProperty("percentageOnTotalBudget")
    public void setPercentageOnTotalBudget(Integer percentageOnTotalBudget) {
        this.percentageOnTotalBudget = percentageOnTotalBudget;
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
