package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRManagedInvestmentPortfolioFulfillmentArrangementInitiateOutputModelManagedInvestmentPortfolioFulfillmentArrangementInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRManagedInvestmentPortfolioFulfillmentArrangementInitiateOutputModel
 */
public class CRManagedInvestmentPortfolioFulfillmentArrangementInitiateOutputModel   {
  private String managedInvestmentPortfolioFulfillmentArrangementInstanceReference = null;

  private String managedInvestmentPortfolioFulfillmentArrangementInitiateActionReference = null;

  private Object managedInvestmentPortfolioFulfillmentArrangementInitiateActionRecord = null;

  private String managedInvestmentPortfolioFulfillmentArrangementInstanceStatus = null;

  private CRManagedInvestmentPortfolioFulfillmentArrangementInitiateOutputModelManagedInvestmentPortfolioFulfillmentArrangementInstanceRecord managedInvestmentPortfolioFulfillmentArrangementInstanceRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an Initiate service call 
   * @return managedInvestmentPortfolioFulfillmentArrangementInitiateActionReference
  **/

  public String getManagedInvestmentPortfolioFulfillmentArrangementInitiateActionReference() {
    return managedInvestmentPortfolioFulfillmentArrangementInitiateActionReference;
  }

  public void setManagedInvestmentPortfolioFulfillmentArrangementInitiateActionReference(String managedInvestmentPortfolioFulfillmentArrangementInitiateActionReference) {
    this.managedInvestmentPortfolioFulfillmentArrangementInitiateActionReference = managedInvestmentPortfolioFulfillmentArrangementInitiateActionReference;
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

  public CRManagedInvestmentPortfolioFulfillmentArrangementInitiateOutputModelManagedInvestmentPortfolioFulfillmentArrangementInstanceRecord getManagedInvestmentPortfolioFulfillmentArrangementInstanceRecord() {
    return managedInvestmentPortfolioFulfillmentArrangementInstanceRecord;
  }

  public void setManagedInvestmentPortfolioFulfillmentArrangementInstanceRecord(CRManagedInvestmentPortfolioFulfillmentArrangementInitiateOutputModelManagedInvestmentPortfolioFulfillmentArrangementInstanceRecord managedInvestmentPortfolioFulfillmentArrangementInstanceRecord) {
    this.managedInvestmentPortfolioFulfillmentArrangementInstanceRecord = managedInvestmentPortfolioFulfillmentArrangementInstanceRecord;
  }


}

