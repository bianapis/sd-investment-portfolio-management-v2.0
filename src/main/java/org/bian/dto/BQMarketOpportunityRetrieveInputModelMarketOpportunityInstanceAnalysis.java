package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQMarketOpportunityRetrieveInputModelMarketOpportunityInstanceAnalysis
 */
public class BQMarketOpportunityRetrieveInputModelMarketOpportunityInstanceAnalysis   {
  private String marketOpportunityInstanceAnalysisReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return marketOpportunityInstanceAnalysisReference
  **/

  public String getMarketOpportunityInstanceAnalysisReference() {
    return marketOpportunityInstanceAnalysisReference;
  }

  public void setMarketOpportunityInstanceAnalysisReference(String marketOpportunityInstanceAnalysisReference) {
    this.marketOpportunityInstanceAnalysisReference = marketOpportunityInstanceAnalysisReference;
  }


}

