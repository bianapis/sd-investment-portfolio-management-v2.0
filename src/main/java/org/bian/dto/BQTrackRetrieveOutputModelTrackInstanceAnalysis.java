package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQTrackRetrieveOutputModelTrackInstanceAnalysis
 */
public class BQTrackRetrieveOutputModelTrackInstanceAnalysis   {
  private Object trackInstanceAnalysisRecord = null;

  private String trackInstanceAnalysisReportType = null;

  private String trackInstanceAnalysisParameters = null;

  private Object trackInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return trackInstanceAnalysisRecord
  **/

  public Object getTrackInstanceAnalysisRecord() {
    return trackInstanceAnalysisRecord;
  }

  public void setTrackInstanceAnalysisRecord(Object trackInstanceAnalysisRecord) {
    this.trackInstanceAnalysisRecord = trackInstanceAnalysisRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return trackInstanceAnalysisReportType
  **/

  public String getTrackInstanceAnalysisReportType() {
    return trackInstanceAnalysisReportType;
  }

  public void setTrackInstanceAnalysisReportType(String trackInstanceAnalysisReportType) {
    this.trackInstanceAnalysisReportType = trackInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return trackInstanceAnalysisParameters
  **/

  public String getTrackInstanceAnalysisParameters() {
    return trackInstanceAnalysisParameters;
  }

  public void setTrackInstanceAnalysisParameters(String trackInstanceAnalysisParameters) {
    this.trackInstanceAnalysisParameters = trackInstanceAnalysisParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return trackInstanceAnalysisReport
  **/

  public Object getTrackInstanceAnalysisReport() {
    return trackInstanceAnalysisReport;
  }

  public void setTrackInstanceAnalysisReport(Object trackInstanceAnalysisReport) {
    this.trackInstanceAnalysisReport = trackInstanceAnalysisReport;
  }


}

