package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRManagedInvestmentPortfolioFulfillmentArrangementExecuteOutputModelManagedInvestmentPortfolioFulfillmentArrangementInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRManagedInvestmentPortfolioFulfillmentArrangementRequestOutputModel
 */
public class CRManagedInvestmentPortfolioFulfillmentArrangementRequestOutputModel   {
  private CRManagedInvestmentPortfolioFulfillmentArrangementExecuteOutputModelManagedInvestmentPortfolioFulfillmentArrangementInstanceRecord managedInvestmentPortfolioFulfillmentArrangementInstanceRecord = null;

  private String managedInvestmentPortfolioFulfillmentArrangementRequestActionTaskReference = null;

  private Object managedInvestmentPortfolioFulfillmentArrangementRequestActionTaskRecord = null;

  private String requestRecordReference = null;

  private Object requestResponseRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Managed Investment Portfolio Fulfillment Arrangement instance request service call 
   * @return managedInvestmentPortfolioFulfillmentArrangementRequestActionTaskReference
  **/

  public String getManagedInvestmentPortfolioFulfillmentArrangementRequestActionTaskReference() {
    return managedInvestmentPortfolioFulfillmentArrangementRequestActionTaskReference;
  }

  public void setManagedInvestmentPortfolioFulfillmentArrangementRequestActionTaskReference(String managedInvestmentPortfolioFulfillmentArrangementRequestActionTaskReference) {
    this.managedInvestmentPortfolioFulfillmentArrangementRequestActionTaskReference = managedInvestmentPortfolioFulfillmentArrangementRequestActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The request service call consolidated processing record 
   * @return managedInvestmentPortfolioFulfillmentArrangementRequestActionTaskRecord
  **/

  public Object getManagedInvestmentPortfolioFulfillmentArrangementRequestActionTaskRecord() {
    return managedInvestmentPortfolioFulfillmentArrangementRequestActionTaskRecord;
  }

  public void setManagedInvestmentPortfolioFulfillmentArrangementRequestActionTaskRecord(Object managedInvestmentPortfolioFulfillmentArrangementRequestActionTaskRecord) {
    this.managedInvestmentPortfolioFulfillmentArrangementRequestActionTaskRecord = managedInvestmentPortfolioFulfillmentArrangementRequestActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the service request record 
   * @return requestRecordReference
  **/

  public String getRequestRecordReference() {
    return requestRecordReference;
  }

  public void setRequestRecordReference(String requestRecordReference) {
    this.requestRecordReference = requestRecordReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the request action service response 
   * @return requestResponseRecord
  **/

  public Object getRequestResponseRecord() {
    return requestResponseRecord;
  }

  public void setRequestResponseRecord(Object requestResponseRecord) {
    this.requestResponseRecord = requestResponseRecord;
  }


}

