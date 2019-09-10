package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRManagedInvestmentPortfolioFulfillmentArrangementUpdateInputModelManagedInvestmentPortfolioFulfillmentArrangementInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRManagedInvestmentPortfolioFulfillmentArrangementUpdateInputModel
 */
public class CRManagedInvestmentPortfolioFulfillmentArrangementUpdateInputModel   {
  private String investmentPortfolioManagementServicingSessionReference = null;

  private String managedInvestmentPortfolioFulfillmentArrangementInstanceReference = null;

  private CRManagedInvestmentPortfolioFulfillmentArrangementUpdateInputModelManagedInvestmentPortfolioFulfillmentArrangementInstanceRecord managedInvestmentPortfolioFulfillmentArrangementInstanceRecord = null;

  private Object managedInvestmentPortfolioFulfillmentArrangementUpdateActionTaskRecord = null;

  private String updateActionRequest = null;


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
   * Get managedInvestmentPortfolioFulfillmentArrangementInstanceRecord
   * @return managedInvestmentPortfolioFulfillmentArrangementInstanceRecord
  **/

  public CRManagedInvestmentPortfolioFulfillmentArrangementUpdateInputModelManagedInvestmentPortfolioFulfillmentArrangementInstanceRecord getManagedInvestmentPortfolioFulfillmentArrangementInstanceRecord() {
    return managedInvestmentPortfolioFulfillmentArrangementInstanceRecord;
  }

  public void setManagedInvestmentPortfolioFulfillmentArrangementInstanceRecord(CRManagedInvestmentPortfolioFulfillmentArrangementUpdateInputModelManagedInvestmentPortfolioFulfillmentArrangementInstanceRecord managedInvestmentPortfolioFulfillmentArrangementInstanceRecord) {
    this.managedInvestmentPortfolioFulfillmentArrangementInstanceRecord = managedInvestmentPortfolioFulfillmentArrangementInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return managedInvestmentPortfolioFulfillmentArrangementUpdateActionTaskRecord
  **/

  public Object getManagedInvestmentPortfolioFulfillmentArrangementUpdateActionTaskRecord() {
    return managedInvestmentPortfolioFulfillmentArrangementUpdateActionTaskRecord;
  }

  public void setManagedInvestmentPortfolioFulfillmentArrangementUpdateActionTaskRecord(Object managedInvestmentPortfolioFulfillmentArrangementUpdateActionTaskRecord) {
    this.managedInvestmentPortfolioFulfillmentArrangementUpdateActionTaskRecord = managedInvestmentPortfolioFulfillmentArrangementUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the update action service request 
   * @return updateActionRequest
  **/

  public String getUpdateActionRequest() {
    return updateActionRequest;
  }

  public void setUpdateActionRequest(String updateActionRequest) {
    this.updateActionRequest = updateActionRequest;
  }


}

