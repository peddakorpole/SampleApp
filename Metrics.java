package com.example.model;



import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "totalImpressions",
    "totalCost",
    "formattedTotalCost",
    "platformMetricsList"
})
public class Metrics {

    @JsonProperty("totalImpressions")
    private Integer totalImpressions;
    @JsonProperty("totalCost")
    private Double totalCost;
    @JsonProperty("formattedTotalCost")
    private Double formattedTotalCost;
    @JsonProperty("platformMetricsList")
    private List<PlatformMetricsList> platformMetricsList = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("totalImpressions")
    public Integer getTotalImpressions() {
        return totalImpressions;
    }

    @JsonProperty("totalImpressions")
    public void setTotalImpressions(Integer totalImpressions) {
        this.totalImpressions = totalImpressions;
    }

    @JsonProperty("totalCost")
    public Double getTotalCost() {
        return totalCost;
    }

    @JsonProperty("totalCost")
    public void setTotalCost(Double totalCost) {
        this.totalCost = totalCost;
    }

    @JsonProperty("formattedTotalCost")
    public Double getFormattedTotalCost() {
        return formattedTotalCost;
    }

    @JsonProperty("formattedTotalCost")
    public void setFormattedTotalCost(Double formattedTotalCost) {
        this.formattedTotalCost = formattedTotalCost;
    }

    @JsonProperty("platformMetricsList")
    public List<PlatformMetricsList> getPlatformMetricsList() {
        return platformMetricsList;
    }

    @JsonProperty("platformMetricsList")
    public void setPlatformMetricsList(List<PlatformMetricsList> platformMetricsList) {
        this.platformMetricsList = platformMetricsList;
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
