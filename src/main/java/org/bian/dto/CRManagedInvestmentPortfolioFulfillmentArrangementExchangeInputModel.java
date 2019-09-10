package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRManagedInvestmentPortfolioFulfillmentArrangementExchangeInputModelManagedInvestmentPortfolioFulfillmentArrangementExchangeActionRequest;

import javax.validation.Valid;
  
/**
 * CRManagedInvestmentPortfolioFulfillmentArrangementExchangeInputModel
 */
public class CRManagedInvestmentPortfolioFulfillmentArrangementExchangeInputModel   {
  private String investmentPortfolioManagementServicingSessionReference = null;

  private String managedInvestmentPortfolioFulfillmentArrangementInstanceReference = null;

  private Object managedInvestmentPortfolioFulfillmentArrangementExchangeActionTaskRecord = null;

  private CRManagedInvestmentPortfolioFulfillmentArrangementExchangeInputModelManagedInvestmentPortfolioFulfillmentArrangementExchangeActionRequest managedInvestmentPortfolioFulfillmentArrangementExchangeActionRequest = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the active servicing session 
   * @return investmentPortfolioManagementServicingSessionReference
  **/

  public String getInvestmentPortfolioManagementServicingSessionReference() {
    return investmentPortfolioManagementServicingSessionReference;
  }

  public void setInvestmentPortfolioManagementServicingSessionReference(String investmentPortfolioManagementServicingSessionReference) {
    this.investmentPortfolioManagementServicingSessionReference = investmentPortfolioManagementServicingSessionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Managed Investment Portfolio Fulfillment Arrangement instance 
   * @return managedInvestmentPortfolioFulfillmentArrangementInstanceReference
  **/

  public String getManagedInvestmentPortfolioFulfillmentArrangementInstanceReference() {
    return managedInvestmentPortfolioFulfillmentArrangementInstanceReference;
  }

  public void setManagedInvestmentPortfolioFulfillmentArrangementInstanceReference(String managedInvestmentPortfolioFulfillmentArrangementInstanceReference) {
    this.managedInvestmentPortfolioFulfillmentArrangementInstanceReference = managedInvestmentPortfolioFulfillmentArrangementInstanceReference;
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
   * Get managedInvestmentPortfolioFulfillmentArrangementExchangeActionRequest
   * @return managedInvestmentPortfolioFulfillmentArrangementExchangeActionRequest
  **/

  public CRManagedInvestmentPortfolioFulfillmentArrangementExchangeInputModelManagedInvestmentPortfolioFulfillmentArrangementExchangeActionRequest getManagedInvestmentPortfolioFulfillmentArrangementExchangeActionRequest() {
    return managedInvestmentPortfolioFulfillmentArrangementExchangeActionRequest;
  }

  public void setManagedInvestmentPortfolioFulfillmentArrangementExchangeActionRequest(CRManagedInvestmentPortfolioFulfillmentArrangementExchangeInputModelManagedInvestmentPortfolioFulfillmentArrangementExchangeActionRequest managedInvestmentPortfolioFulfillmentArrangementExchangeActionRequest) {
    this.managedInvestmentPortfolioFulfillmentArrangementExchangeActionRequest = managedInvestmentPortfolioFulfillmentArrangementExchangeActionRequest;
  }


}

