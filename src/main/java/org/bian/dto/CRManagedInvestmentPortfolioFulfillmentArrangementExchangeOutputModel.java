package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRManagedInvestmentPortfolioFulfillmentArrangementExchangeOutputModel
 */
public class CRManagedInvestmentPortfolioFulfillmentArrangementExchangeOutputModel   {
  private String managedInvestmentPortfolioFulfillmentArrangementExchangeActionTaskReference = null;

  private Object managedInvestmentPortfolioFulfillmentArrangementExchangeActionTaskRecord = null;

  private String managedInvestmentPortfolioFulfillmentArrangementExchangeActionResponse = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Managed Investment Portfolio Fulfillment Arrangement instance exchange service call 
   * @return managedInvestmentPortfolioFulfillmentArrangementExchangeActionTaskReference
  **/

  public String getManagedInvestmentPortfolioFulfillmentArrangementExchangeActionTaskReference() {
    return managedInvestmentPortfolioFulfillmentArrangementExchangeActionTaskReference;
  }

  public void setManagedInvestmentPortfolioFulfillmentArrangementExchangeActionTaskReference(String managedInvestmentPortfolioFulfillmentArrangementExchangeActionTaskReference) {
    this.managedInvestmentPortfolioFulfillmentArrangementExchangeActionTaskReference = managedInvestmentPortfolioFulfillmentArrangementExchangeActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The exchange service call consolidated processing record 
   * @return managedInvestmentPortfolioFulfillmentArrangementExchangeActionTaskRecord
  **/

  public Object getManagedInvestmentPortfolioFulfillmentArrangementExchangeActionTaskRecord() {
    return managedInvestmentPortfolioFulfillmentArrangementExchangeActionTaskRecord;
  }

  public void setManagedInvestmentPortfolioFulfillmentArrangementExchangeActionTaskRecord(Object managedInvestmentPortfolioFulfillmentArrangementExchangeActionTaskRecord) {
    this.managedInvestmentPortfolioFulfillmentArrangementExchangeActionTaskRecord = managedInvestmentPortfolioFulfillmentArrangementExchangeActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the exchange action service response 
   * @return managedInvestmentPortfolioFulfillmentArrangementExchangeActionResponse
  **/

  public String getManagedInvestmentPortfolioFulfillmentArrangementExchangeActionResponse() {
    return managedInvestmentPortfolioFulfillmentArrangementExchangeActionResponse;
  }

  public void setManagedInvestmentPortfolioFulfillmentArrangementExchangeActionResponse(String managedInvestmentPortfolioFulfillmentArrangementExchangeActionResponse) {
    this.managedInvestmentPortfolioFulfillmentArrangementExchangeActionResponse = managedInvestmentPortfolioFulfillmentArrangementExchangeActionResponse;
  }


}

