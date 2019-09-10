package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQMarketOpportunityRetrieveOutputModelManagedInvestmentPortfolioFulfillmentArrangementInstanceRecord;
import org.bian.dto.BQMarketOpportunityRetrieveOutputModelMarketOpportunityInstanceAnalysis;
import org.bian.dto.BQMarketOpportunityRetrieveOutputModelMarketOpportunityInstanceReport;

import javax.validation.Valid;
  
/**
 * BQMarketOpportunityRetrieveOutputModel
 */
public class BQMarketOpportunityRetrieveOutputModel   {
  private BQMarketOpportunityRetrieveOutputModelManagedInvestmentPortfolioFulfillmentArrangementInstanceRecord managedInvestmentPortfolioFulfillmentArrangementInstanceRecord = null;

  private String marketOpportunityRetrieveActionTaskReference = null;

  private Object marketOpportunityRetrieveActionTaskRecord = null;

  private String marketOpportunityRetrieveActionResponse = null;

  private BQMarketOpportunityRetrieveOutputModelMarketOpportunityInstanceReport marketOpportunityInstanceReport = null;

  private BQMarketOpportunityRetrieveOutputModelMarketOpportunityInstanceAnalysis marketOpportunityInstanceAnalysis = null;


  /**
   * Get managedInvestmentPortfolioFulfillmentArrangementInstanceRecord
   * @return managedInvestmentPortfolioFulfillmentArrangementInstanceRecord
  **/

  public BQMarketOpportunityRetrieveOutputModelManagedInvestmentPortfolioFulfillmentArrangementInstanceRecord getManagedInvestmentPortfolioFulfillmentArrangementInstanceRecord() {
    return managedInvestmentPortfolioFulfillmentArrangementInstanceRecord;
  }

  public void setManagedInvestmentPortfolioFulfillmentArrangementInstanceRecord(BQMarketOpportunityRetrieveOutputModelManagedInvestmentPortfolioFulfillmentArrangementInstanceRecord managedInvestmentPortfolioFulfillmentArrangementInstanceRecord) {
    this.managedInvestmentPortfolioFulfillmentArrangementInstanceRecord = managedInvestmentPortfolioFulfillmentArrangementInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Market Opportunity instance retrieve service call 
   * @return marketOpportunityRetrieveActionTaskReference
  **/

  public String getMarketOpportunityRetrieveActionTaskReference() {
    return marketOpportunityRetrieveActionTaskReference;
  }

  public void setMarketOpportunityRetrieveActionTaskReference(String marketOpportunityRetrieveActionTaskReference) {
    this.marketOpportunityRetrieveActionTaskReference = marketOpportunityRetrieveActionTaskReference;
  }


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return marketOpportunityRetrieveActionResponse
  **/

  public String getMarketOpportunityRetrieveActionResponse() {
    return marketOpportunityRetrieveActionResponse;
  }

  public void setMarketOpportunityRetrieveActionResponse(String marketOpportunityRetrieveActionResponse) {
    this.marketOpportunityRetrieveActionResponse = marketOpportunityRetrieveActionResponse;
  }


  /**
   * Get marketOpportunityInstanceReport
   * @return marketOpportunityInstanceReport
  **/

  public BQMarketOpportunityRetrieveOutputModelMarketOpportunityInstanceReport getMarketOpportunityInstanceReport() {
    return marketOpportunityInstanceReport;
  }

  public void setMarketOpportunityInstanceReport(BQMarketOpportunityRetrieveOutputModelMarketOpportunityInstanceReport marketOpportunityInstanceReport) {
    this.marketOpportunityInstanceReport = marketOpportunityInstanceReport;
  }


  /**
   * Get marketOpportunityInstanceAnalysis
   * @return marketOpportunityInstanceAnalysis
  **/

  public BQMarketOpportunityRetrieveOutputModelMarketOpportunityInstanceAnalysis getMarketOpportunityInstanceAnalysis() {
    return marketOpportunityInstanceAnalysis;
  }

  public void setMarketOpportunityInstanceAnalysis(BQMarketOpportunityRetrieveOutputModelMarketOpportunityInstanceAnalysis marketOpportunityInstanceAnalysis) {
    this.marketOpportunityInstanceAnalysis = marketOpportunityInstanceAnalysis;
  }


}

