package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRManagedInvestmentPortfolioFulfillmentArrangementExecuteOutputModelManagedInvestmentPortfolioFulfillmentArrangementInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRManagedInvestmentPortfolioFulfillmentArrangementExecuteOutputModel
 */
public class CRManagedInvestmentPortfolioFulfillmentArrangementExecuteOutputModel   {
  private CRManagedInvestmentPortfolioFulfillmentArrangementExecuteOutputModelManagedInvestmentPortfolioFulfillmentArrangementInstanceRecord managedInvestmentPortfolioFulfillmentArrangementInstanceRecord = null;

  private String managedInvestmentPortfolioFulfillmentArrangementExecuteActionTaskReference = null;

  private Object managedInvestmentPortfolioFulfillmentArrangementExecuteActionTaskRecord = null;

  private String executeRecordReference = null;

  private Object executeResponseRecord = null;


  /**
   * Get managedInvestmentPortfolioFulfillmentArrangementInstanceRecord
   * @return managedInvestmentPortfolioFulfillmentArrangementInstanceRecord
  **/

  public CRManagedInvestmentPortfolioFulfillmentArrangementExecuteOutputModelManagedInvestmentPortfolioFulfillmentArrangementInstanceRecord getManagedInvestmentPortfolioFulfillmentArrangementInstanceRecord() {
    return managedInvestmentPortfolioFulfillmentArrangementInstanceRecord;
  }

  public void setManagedInvestmentPortfolioFulfillmentArrangementInstanceRecord(CRManagedInvestmentPortfolioFulfillmentArrangementExecuteOutputModelManagedInvestmentPortfolioFulfillmentArrangementInstanceRecord managedInvestmentPortfolioFulfillmentArrangementInstanceRecord) {
    this.managedInvestmentPortfolioFulfillmentArrangementInstanceRecord = managedInvestmentPortfolioFulfillmentArrangementInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Managed Investment Portfolio Fulfillment Arrangement instance execute service call 
   * @return managedInvestmentPortfolioFulfillmentArrangementExecuteActionTaskReference
  **/

  public String getManagedInvestmentPortfolioFulfillmentArrangementExecuteActionTaskReference() {
    return managedInvestmentPortfolioFulfillmentArrangementExecuteActionTaskReference;
  }

  public void setManagedInvestmentPortfolioFulfillmentArrangementExecuteActionTaskReference(String managedInvestmentPortfolioFulfillmentArrangementExecuteActionTaskReference) {
    this.managedInvestmentPortfolioFulfillmentArrangementExecuteActionTaskReference = managedInvestmentPortfolioFulfillmentArrangementExecuteActionTaskReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the execute transaction/record 
   * @return executeRecordReference
  **/

  public String getExecuteRecordReference() {
    return executeRecordReference;
  }

  public void setExecuteRecordReference(String executeRecordReference) {
    this.executeRecordReference = executeRecordReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the execute action service response 
   * @return executeResponseRecord
  **/

  public Object getExecuteResponseRecord() {
    return executeResponseRecord;
  }

  public void setExecuteResponseRecord(Object executeResponseRecord) {
    this.executeResponseRecord = executeResponseRecord;
  }


}

