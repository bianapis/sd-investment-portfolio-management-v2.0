package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQTrackRetrieveOutputModelTrackInstanceReport
 */
public class BQTrackRetrieveOutputModelTrackInstanceReport   {
  private Object trackInstanceReportRecord = null;

  private String trackInstanceReportType = null;

  private String trackInstanceReportParameters = null;

  private Object trackInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return trackInstanceReportRecord
  **/

  public Object getTrackInstanceReportRecord() {
    return trackInstanceReportRecord;
  }

  public void setTrackInstanceReportRecord(Object trackInstanceReportRecord) {
    this.trackInstanceReportRecord = trackInstanceReportRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return trackInstanceReportType
  **/

  public String getTrackInstanceReportType() {
    return trackInstanceReportType;
  }

  public void setTrackInstanceReportType(String trackInstanceReportType) {
    this.trackInstanceReportType = trackInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return trackInstanceReportParameters
  **/

  public String getTrackInstanceReportParameters() {
    return trackInstanceReportParameters;
  }

  public void setTrackInstanceReportParameters(String trackInstanceReportParameters) {
    this.trackInstanceReportParameters = trackInstanceReportParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return trackInstanceReport
  **/

  public Object getTrackInstanceReport() {
    return trackInstanceReport;
  }

  public void setTrackInstanceReport(Object trackInstanceReport) {
    this.trackInstanceReport = trackInstanceReport;
  }


}

