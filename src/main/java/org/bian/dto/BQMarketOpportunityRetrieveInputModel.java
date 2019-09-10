package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQMarketOpportunityRetrieveInputModelMarketOpportunityInstanceAnalysis;
import org.bian.dto.BQMarketOpportunityRetrieveInputModelMarketOpportunityInstanceReport;

import javax.validation.Valid;
  
/**
 * BQMarketOpportunityRetrieveInputModel
 */
public class BQMarketOpportunityRetrieveInputModel   {
  private Object marketOpportunityRetrieveActionTaskRecord = null;

  private String marketOpportunityRetrieveActionRequest = null;

  private BQMarketOpportunityRetrieveInputModelMarketOpportunityInstanceReport marketOpportunityInstanceReport = null;

  private BQMarketOpportunityRetrieveInputModelMarketOpportunityInstanceAnalysis marketOpportunityInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return marketOpportunityRetrieveActionTaskRecord
  **/

  public Object getMarketOpportunityRetrieveActionTaskRecord() {
    return marketOpportunityRetrieveActionTaskRecord;
  }

  public void setMarketOpportunityRetrieveActionTaskRecord(Object marketOpportunityRetrieveActionTaskRecord) {
    this.marketOpportunityRetrieveActionTaskRecord = marketOpportunityRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return marketOpportunityRetrieveActionRequest
  **/

  public String getMarketOpportunityRetrieveActionRequest() {
    return marketOpportunityRetrieveActionRequest;
  }

  public void setMarketOpportunityRetrieveActionRequest(String marketOpportunityRetrieveActionRequest) {
    this.marketOpportunityRetrieveActionRequest = marketOpportunityRetrieveActionRequest;
  }


  /**
   * Get marketOpportunityInstanceReport
   * @return marketOpportunityInstanceReport
  **/

  public BQMarketOpportunityRetrieveInputModelMarketOpportunityInstanceReport getMarketOpportunityInstanceReport() {
    return marketOpportunityInstanceReport;
  }

  public void setMarketOpportunityInstanceReport(BQMarketOpportunityRetrieveInputModelMarketOpportunityInstanceReport marketOpportunityInstanceReport) {
    this.marketOpportunityInstanceReport = marketOpportunityInstanceReport;
  }


  /**
   * Get marketOpportunityInstanceAnalysis
   * @return marketOpportunityInstanceAnalysis
  **/

  public BQMarketOpportunityRetrieveInputModelMarketOpportunityInstanceAnalysis getMarketOpportunityInstanceAnalysis() {
    return marketOpportunityInstanceAnalysis;
  }

  public void setMarketOpportunityInstanceAnalysis(BQMarketOpportunityRetrieveInputModelMarketOpportunityInstanceAnalysis marketOpportunityInstanceAnalysis) {
    this.marketOpportunityInstanceAnalysis = marketOpportunityInstanceAnalysis;
  }


}

