
package us.kbase.kbmsuite;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * <p>Original spec-file type: CheckMLineageWf_withFilter_Result</p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("com.googlecode.jsonschema2pojo")
@JsonPropertyOrder({
    "report_name",
    "report_ref",
    "binned_contig_obj_ref"
})
public class CheckMLineageWfWithFilterResult {

    @JsonProperty("report_name")
    private String reportName;
    @JsonProperty("report_ref")
    private String reportRef;
    @JsonProperty("binned_contig_obj_ref")
    private String binnedContigObjRef;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("report_name")
    public String getReportName() {
        return reportName;
    }

    @JsonProperty("report_name")
    public void setReportName(String reportName) {
        this.reportName = reportName;
    }

    public CheckMLineageWfWithFilterResult withReportName(String reportName) {
        this.reportName = reportName;
        return this;
    }

    @JsonProperty("report_ref")
    public String getReportRef() {
        return reportRef;
    }

    @JsonProperty("report_ref")
    public void setReportRef(String reportRef) {
        this.reportRef = reportRef;
    }

    public CheckMLineageWfWithFilterResult withReportRef(String reportRef) {
        this.reportRef = reportRef;
        return this;
    }

    @JsonProperty("binned_contig_obj_ref")
    public String getBinnedContigObjRef() {
        return binnedContigObjRef;
    }

    @JsonProperty("binned_contig_obj_ref")
    public void setBinnedContigObjRef(String binnedContigObjRef) {
        this.binnedContigObjRef = binnedContigObjRef;
    }

    public CheckMLineageWfWithFilterResult withBinnedContigObjRef(String binnedContigObjRef) {
        this.binnedContigObjRef = binnedContigObjRef;
        return this;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperties(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        return ((((((((("CheckMLineageWfWithFilterResult"+" [reportName=")+ reportName)+", reportRef=")+ reportRef)+", binnedContigObjRef=")+ binnedContigObjRef)+", additionalProperties=")+ additionalProperties)+"]");
    }

}
