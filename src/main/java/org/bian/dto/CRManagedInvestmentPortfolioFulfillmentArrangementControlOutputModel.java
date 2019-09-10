package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRManagedInvestmentPortfolioFulfillmentArrangementControlOutputModel
 */
public class CRManagedInvestmentPortfolioFulfillmentArrangementControlOutputModel   {
  private String managedInvestmentPortfolioFulfillmentArrangementControlActionTaskReference = null;

  private Object managedInvestmentPortfolioFulfillmentArrangementControlActionTaskRecord = null;

  private String managedInvestmentPortfolioFulfillmentArrangementControlActionResponse = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Managed Investment Portfolio Fulfillment Arrangement instance control processing service call 
   * @return managedInvestmentPortfolioFulfillmentArrangementControlActionTaskReference
  **/

  public String getManagedInvestmentPortfolioFulfillmentArrangementControlActionTaskReference() {
    return managedInvestmentPortfolioFulfillmentArrangementControlActionTaskReference;
  }

  public void setManagedInvestmentPortfolioFulfillmentArrangementControlActionTaskReference(String managedInvestmentPortfolioFulfillmentArrangementControlActionTaskReference) {
    this.managedInvestmentPortfolioFulfillmentArrangementControlActionTaskReference = managedInvestmentPortfolioFulfillmentArrangementControlActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The processing control service call consolidated processing record 
   * @return managedInvestmentPortfolioFulfillmentArrangementControlActionTaskRecord
  **/

  public Object getManagedInvestmentPortfolioFulfillmentArrangementControlActionTaskRecord() {
    return managedInvestmentPortfolioFulfillmentArrangementControlActionTaskRecord;
  }

  public void setManagedInvestmentPortfolioFulfillmentArrangementControlActionTaskRecord(Object managedInvestmentPortfolioFulfillmentArrangementControlActionTaskRecord) {
    this.managedInvestmentPortfolioFulfillmentArrangementControlActionTaskRecord = managedInvestmentPortfolioFulfillmentArrangementControlActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the control action service response 
   * @return managedInvestmentPortfolioFulfillmentArrangementControlActionResponse
  **/

  public String getManagedInvestmentPortfolioFulfillmentArrangementControlActionResponse() {
    return managedInvestmentPortfolioFulfillmentArrangementControlActionResponse;
  }

  public void setManagedInvestmentPortfolioFulfillmentArrangementControlActionResponse(String managedInvestmentPortfolioFulfillmentArrangementControlActionResponse) {
    this.managedInvestmentPortfolioFulfillmentArrangementControlActionResponse = managedInvestmentPortfolioFulfillmentArrangementControlActionResponse;
  }


}

