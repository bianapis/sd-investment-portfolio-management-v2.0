package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQMarketOpportunityRetrieveInputModelMarketOpportunityInstanceReport
 */
public class BQMarketOpportunityRetrieveInputModelMarketOpportunityInstanceReport   {
  private String marketOpportunityInstanceReportReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return marketOpportunityInstanceReportReference
  **/

  public String getMarketOpportunityInstanceReportReference() {
    return marketOpportunityInstanceReportReference;
  }

  public void setMarketOpportunityInstanceReportReference(String marketOpportunityInstanceReportReference) {
    this.marketOpportunityInstanceReportReference = marketOpportunityInstanceReportReference;
  }


}

