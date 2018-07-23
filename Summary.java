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
    "salesforceId",
    "flightName",
    "objective",
    "category",
    "budget",
    "formattedBudget",
    "totalCost",
    "formattedTotalCost",
    "totalImpressions",
    "advertiser",
    "status",
    "flightStartDate",
    "flightEndDate"
})
public class Summary {

    @JsonProperty("salesforceId")
    private String salesforceId;
    @JsonProperty("flightName")
    private String flightName;
    @JsonProperty("objective")
    private String objective;
    @JsonProperty("category")
    private String category;
    @JsonProperty("budget")
    private Integer budget;
    @JsonProperty("formattedBudget")
    private Integer formattedBudget;
    @JsonProperty("totalCost")
    private Double totalCost;
    @JsonProperty("formattedTotalCost")
    private Double formattedTotalCost;
    @JsonProperty("totalImpressions")
    private Integer totalImpressions;
    @JsonProperty("advertiser")
    private String advertiser;
    @JsonProperty("status")
    private String status;
    @JsonProperty("flightStartDate")
    private String flightStartDate;
    @JsonProperty("flightEndDate")
    private String flightEndDate;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("salesforceId")
    public String getSalesforceId() {
        return salesforceId;
    }

    @JsonProperty("salesforceId")
    public void setSalesforceId(String salesforceId) {
        this.salesforceId = salesforceId;
    }

    @JsonProperty("flightName")
    public String getFlightName() {
        return flightName;
    }

    @JsonProperty("flightName")
    public void setFlightName(String flightName) {
        this.flightName = flightName;
    }

    @JsonProperty("objective")
    public String getObjective() {
        return objective;
    }

    @JsonProperty("objective")
    public void setObjective(String objective) {
        this.objective = objective;
    }

    @JsonProperty("category")
    public String getCategory() {
        return category;
    }

    @JsonProperty("category")
    public void setCategory(String category) {
        this.category = category;
    }

    @JsonProperty("budget")
    public Integer getBudget() {
        return budget;
    }

    @JsonProperty("budget")
    public void setBudget(Integer budget) {
        this.budget = budget;
    }

    @JsonProperty("formattedBudget")
    public Integer getFormattedBudget() {
        return formattedBudget;
    }

    @JsonProperty("formattedBudget")
    public void setFormattedBudget(Integer formattedBudget) {
        this.formattedBudget = formattedBudget;
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

    @JsonProperty("totalImpressions")
    public Integer getTotalImpressions() {
        return totalImpressions;
    }

    @JsonProperty("totalImpressions")
    public void setTotalImpressions(Integer totalImpressions) {
        this.totalImpressions = totalImpressions;
    }

    @JsonProperty("advertiser")
    public String getAdvertiser() {
        return advertiser;
    }

    @JsonProperty("advertiser")
    public void setAdvertiser(String advertiser) {
        this.advertiser = advertiser;
    }

    @JsonProperty("status")
    public String getStatus() {
        return status;
    }

    @JsonProperty("status")
    public void setStatus(String status) {
        this.status = status;
    }

    @JsonProperty("flightStartDate")
    public String getFlightStartDate() {
        return flightStartDate;
    }

    @JsonProperty("flightStartDate")
    public void setFlightStartDate(String flightStartDate) {
        this.flightStartDate = flightStartDate;
    }

    @JsonProperty("flightEndDate")
    public String getFlightEndDate() {
        return flightEndDate;
    }

    @JsonProperty("flightEndDate")
    public void setFlightEndDate(String flightEndDate) {
        this.flightEndDate = flightEndDate;
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
