package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRManagedInvestmentPortfolioFulfillmentArrangementControlInputModelManagedInvestmentPortfolioFulfillmentArrangementControlActionRequest;

import javax.validation.Valid;
  
/**
 * CRManagedInvestmentPortfolioFulfillmentArrangementControlInputModel
 */
public class CRManagedInvestmentPortfolioFulfillmentArrangementControlInputModel   {
  private String investmentPortfolioManagementServicingSessionReference = null;

  private String managedInvestmentPortfolioFulfillmentArrangementInstanceReference = null;

  private Object managedInvestmentPortfolioFulfillmentArrangementControlActionTaskRecord = null;

  private CRManagedInvestmentPortfolioFulfillmentArrangementControlInputModelManagedInvestmentPortfolioFulfillmentArrangementControlActionRequest managedInvestmentPortfolioFulfillmentArrangementControlActionRequest = null;


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
   * Get managedInvestmentPortfolioFulfillmentArrangementControlActionRequest
   * @return managedInvestmentPortfolioFulfillmentArrangementControlActionRequest
  **/

  public CRManagedInvestmentPortfolioFulfillmentArrangementControlInputModelManagedInvestmentPortfolioFulfillmentArrangementControlActionRequest getManagedInvestmentPortfolioFulfillmentArrangementControlActionRequest() {
    return managedInvestmentPortfolioFulfillmentArrangementControlActionRequest;
  }

  public void setManagedInvestmentPortfolioFulfillmentArrangementControlActionRequest(CRManagedInvestmentPortfolioFulfillmentArrangementControlInputModelManagedInvestmentPortfolioFulfillmentArrangementControlActionRequest managedInvestmentPortfolioFulfillmentArrangementControlActionRequest) {
    this.managedInvestmentPortfolioFulfillmentArrangementControlActionRequest = managedInvestmentPortfolioFulfillmentArrangementControlActionRequest;
  }


}

