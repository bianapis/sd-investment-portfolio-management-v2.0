package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRManagedInvestmentPortfolioFulfillmentArrangementExecuteInputModelExecuteRecordType;
import org.bian.dto.CRManagedInvestmentPortfolioFulfillmentArrangementExecuteInputModelManagedInvestmentPortfolioFulfillmentArrangementInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRManagedInvestmentPortfolioFulfillmentArrangementExecuteInputModel
 */
public class CRManagedInvestmentPortfolioFulfillmentArrangementExecuteInputModel   {
  private String investmentPortfolioManagementServicingSessionReference = null;

  private String managedInvestmentPortfolioFulfillmentArrangementInstanceReference = null;

  private CRManagedInvestmentPortfolioFulfillmentArrangementExecuteInputModelManagedInvestmentPortfolioFulfillmentArrangementInstanceRecord managedInvestmentPortfolioFulfillmentArrangementInstanceRecord = null;

  private Object managedInvestmentPortfolioFulfillmentArrangementExecuteActionTaskRecord = null;

  private CRManagedInvestmentPortfolioFulfillmentArrangementExecuteInputModelExecuteRecordType executeRecordType = null;


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

  public CRManagedInvestmentPortfolioFulfillmentArrangementExecuteInputModelManagedInvestmentPortfolioFulfillmentArrangementInstanceRecord getManagedInvestmentPortfolioFulfillmentArrangementInstanceRecord() {
    return managedInvestmentPortfolioFulfillmentArrangementInstanceRecord;
  }

  public void setManagedInvestmentPortfolioFulfillmentArrangementInstanceRecord(CRManagedInvestmentPortfolioFulfillmentArrangementExecuteInputModelManagedInvestmentPortfolioFulfillmentArrangementInstanceRecord managedInvestmentPortfolioFulfillmentArrangementInstanceRecord) {
    this.managedInvestmentPortfolioFulfillmentArrangementInstanceRecord = managedInvestmentPortfolioFulfillmentArrangementInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The execute service call consolidated processing record 
   * @return managedInvestmentPortfolioFulfillmentArrangementExecuteActionTaskRecord
  **/

  public Object getManagedInvestmentPortfolioFulfillmentArrangementExecuteActionTaskRecord() {
    return managedInvestmentPortfolioFulfillmentArrangementExecuteActionTaskRecord;
  }

  public void setManagedInvestmentPortfolioFulfillmentArrangementExecuteActionTaskRecord(Object managedInvestmentPortfolioFulfillmentArrangementExecuteActionTaskRecord) {
    this.managedInvestmentPortfolioFulfillmentArrangementExecuteActionTaskRecord = managedInvestmentPortfolioFulfillmentArrangementExecuteActionTaskRecord;
  }


  /**
   * Get executeRecordType
   * @return executeRecordType
  **/

  public CRManagedInvestmentPortfolioFulfillmentArrangementExecuteInputModelExecuteRecordType getExecuteRecordType() {
    return executeRecordType;
  }

  public void setExecuteRecordType(CRManagedInvestmentPortfolioFulfillmentArrangementExecuteInputModelExecuteRecordType executeRecordType) {
    this.executeRecordType = executeRecordType;
  }


}

