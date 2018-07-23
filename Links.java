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
    "forecastPackageUrl",
    "reservePackageUrl",
    "approvePackageUrl",
    "archivePackageUrl",
    "downloadPackageUrl"
})
public class Links {

    @JsonProperty("forecastPackageUrl")
    private String forecastPackageUrl;
    @JsonProperty("reservePackageUrl")
    private String reservePackageUrl;
    @JsonProperty("approvePackageUrl")
    private String approvePackageUrl;
    @JsonProperty("archivePackageUrl")
    private String archivePackageUrl;
    @JsonProperty("downloadPackageUrl")
    private String downloadPackageUrl;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("forecastPackageUrl")
    public String getForecastPackageUrl() {
        return forecastPackageUrl;
    }

    @JsonProperty("forecastPackageUrl")
    public void setForecastPackageUrl(String forecastPackageUrl) {
        this.forecastPackageUrl = forecastPackageUrl;
    }

    @JsonProperty("reservePackageUrl")
    public String getReservePackageUrl() {
        return reservePackageUrl;
    }

    @JsonProperty("reservePackageUrl")
    public void setReservePackageUrl(String reservePackageUrl) {
        this.reservePackageUrl = reservePackageUrl;
    }

    @JsonProperty("approvePackageUrl")
    public String getApprovePackageUrl() {
        return approvePackageUrl;
    }

    @JsonProperty("approvePackageUrl")
    public void setApprovePackageUrl(String approvePackageUrl) {
        this.approvePackageUrl = approvePackageUrl;
    }

    @JsonProperty("archivePackageUrl")
    public String getArchivePackageUrl() {
        return archivePackageUrl;
    }

    @JsonProperty("archivePackageUrl")
    public void setArchivePackageUrl(String archivePackageUrl) {
        this.archivePackageUrl = archivePackageUrl;
    }

    @JsonProperty("downloadPackageUrl")
    public String getDownloadPackageUrl() {
        return downloadPackageUrl;
    }

    @JsonProperty("downloadPackageUrl")
    public void setDownloadPackageUrl(String downloadPackageUrl) {
        this.downloadPackageUrl = downloadPackageUrl;
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
