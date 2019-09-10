package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQTrackRetrieveInputModelTrackInstanceReport
 */
public class BQTrackRetrieveInputModelTrackInstanceReport   {
  private String trackInstanceReportReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return trackInstanceReportReference
  **/

  public String getTrackInstanceReportReference() {
    return trackInstanceReportReference;
  }

  public void setTrackInstanceReportReference(String trackInstanceReportReference) {
    this.trackInstanceReportReference = trackInstanceReportReference;
  }


}

