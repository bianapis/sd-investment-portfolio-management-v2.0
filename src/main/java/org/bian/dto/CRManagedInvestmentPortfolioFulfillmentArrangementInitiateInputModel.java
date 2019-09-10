package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRManagedInvestmentPortfolioFulfillmentArrangementInitiateInputModelManagedInvestmentPortfolioFulfillmentArrangementInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRManagedInvestmentPortfolioFulfillmentArrangementInitiateInputModel
 */
public class CRManagedInvestmentPortfolioFulfillmentArrangementInitiateInputModel   {
  private String investmentPortfolioManagementServicingSessionReference = null;

  private Object managedInvestmentPortfolioFulfillmentArrangementInitiateActionRecord = null;

  private String managedInvestmentPortfolioFulfillmentArrangementInstanceStatus = null;

  private CRManagedInvestmentPortfolioFulfillmentArrangementInitiateInputModelManagedInvestmentPortfolioFulfillmentArrangementInstanceRecord managedInvestmentPortfolioFulfillmentArrangementInstanceRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Initiate service call input and output record 
   * @return managedInvestmentPortfolioFulfillmentArrangementInitiateActionRecord
  **/

  public Object getManagedInvestmentPortfolioFulfillmentArrangementInitiateActionRecord() {
    return managedInvestmentPortfolioFulfillmentArrangementInitiateActionRecord;
  }

  public void setManagedInvestmentPortfolioFulfillmentArrangementInitiateActionRecord(Object managedInvestmentPortfolioFulfillmentArrangementInitiateActionRecord) {
    this.managedInvestmentPortfolioFulfillmentArrangementInitiateActionRecord = managedInvestmentPortfolioFulfillmentArrangementInitiateActionRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Managed Investment Portfolio Fulfillment Arrangement instance (e.g. initialised, pending, active) 
   * @return managedInvestmentPortfolioFulfillmentArrangementInstanceStatus
  **/

  public String getManagedInvestmentPortfolioFulfillmentArrangementInstanceStatus() {
    return managedInvestmentPortfolioFulfillmentArrangementInstanceStatus;
  }

  public void setManagedInvestmentPortfolioFulfillmentArrangementInstanceStatus(String managedInvestmentPortfolioFulfillmentArrangementInstanceStatus) {
    this.managedInvestmentPortfolioFulfillmentArrangementInstanceStatus = managedInvestmentPortfolioFulfillmentArrangementInstanceStatus;
  }


  /**
   * Get managedInvestmentPortfolioFulfillmentArrangementInstanceRecord
   * @return managedInvestmentPortfolioFulfillmentArrangementInstanceRecord
  **/

  public CRManagedInvestmentPortfolioFulfillmentArrangementInitiateInputModelManagedInvestmentPortfolioFulfillmentArrangementInstanceRecord getManagedInvestmentPortfolioFulfillmentArrangementInstanceRecord() {
    return managedInvestmentPortfolioFulfillmentArrangementInstanceRecord;
  }

  public void setManagedInvestmentPortfolioFulfillmentArrangementInstanceRecord(CRManagedInvestmentPortfolioFulfillmentArrangementInitiateInputModelManagedInvestmentPortfolioFulfillmentArrangementInstanceRecord managedInvestmentPortfolioFulfillmentArrangementInstanceRecord) {
    this.managedInvestmentPortfolioFulfillmentArrangementInstanceRecord = managedInvestmentPortfolioFulfillmentArrangementInstanceRecord;
  }


}

