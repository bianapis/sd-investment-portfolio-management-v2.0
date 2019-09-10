package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQTrackRetrieveInputModelTrackInstanceAnalysis;
import org.bian.dto.BQTrackRetrieveInputModelTrackInstanceReport;

import javax.validation.Valid;
  
/**
 * BQTrackRetrieveInputModel
 */
public class BQTrackRetrieveInputModel   {
  private Object trackRetrieveActionTaskRecord = null;

  private String trackRetrieveActionRequest = null;

  private BQTrackRetrieveInputModelTrackInstanceReport trackInstanceReport = null;

  private BQTrackRetrieveInputModelTrackInstanceAnalysis trackInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return trackRetrieveActionTaskRecord
  **/

  public Object getTrackRetrieveActionTaskRecord() {
    return trackRetrieveActionTaskRecord;
  }

  public void setTrackRetrieveActionTaskRecord(Object trackRetrieveActionTaskRecord) {
    this.trackRetrieveActionTaskRecord = trackRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return trackRetrieveActionRequest
  **/

  public String getTrackRetrieveActionRequest() {
    return trackRetrieveActionRequest;
  }

  public void setTrackRetrieveActionRequest(String trackRetrieveActionRequest) {
    this.trackRetrieveActionRequest = trackRetrieveActionRequest;
  }


  /**
   * Get trackInstanceReport
   * @return trackInstanceReport
  **/

  public BQTrackRetrieveInputModelTrackInstanceReport getTrackInstanceReport() {
    return trackInstanceReport;
  }

  public void setTrackInstanceReport(BQTrackRetrieveInputModelTrackInstanceReport trackInstanceReport) {
    this.trackInstanceReport = trackInstanceReport;
  }


  /**
   * Get trackInstanceAnalysis
   * @return trackInstanceAnalysis
  **/

  public BQTrackRetrieveInputModelTrackInstanceAnalysis getTrackInstanceAnalysis() {
    return trackInstanceAnalysis;
  }

  public void setTrackInstanceAnalysis(BQTrackRetrieveInputModelTrackInstanceAnalysis trackInstanceAnalysis) {
    this.trackInstanceAnalysis = trackInstanceAnalysis;
  }


}

