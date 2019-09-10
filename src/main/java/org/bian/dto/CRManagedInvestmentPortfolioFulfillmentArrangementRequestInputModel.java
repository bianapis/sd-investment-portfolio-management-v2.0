package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRManagedInvestmentPortfolioFulfillmentArrangementRequestInputModelManagedInvestmentPortfolioFulfillmentArrangementInstanceRecord;
import org.bian.dto.CRManagedInvestmentPortfolioFulfillmentArrangementRequestInputModelRequestRecordType;

import javax.validation.Valid;
  
/**
 * CRManagedInvestmentPortfolioFulfillmentArrangementRequestInputModel
 */
public class CRManagedInvestmentPortfolioFulfillmentArrangementRequestInputModel   {
  private String investmentPortfolioManagementServicingSessionReference = null;

  private String managedInvestmentPortfolioFulfillmentArrangementInstanceReference = null;

  private CRManagedInvestmentPortfolioFulfillmentArrangementRequestInputModelManagedInvestmentPortfolioFulfillmentArrangementInstanceRecord managedInvestmentPortfolioFulfillmentArrangementInstanceRecord = null;

  private Object managedInvestmentPortfolioFulfillmentArrangementRequestActionTaskRecord = null;

  private CRManagedInvestmentPortfolioFulfillmentArrangementRequestInputModelRequestRecordType requestRecordType = null;


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

  public CRManagedInvestmentPortfolioFulfillmentArrangementRequestInputModelManagedInvestmentPortfolioFulfillmentArrangementInstanceRecord getManagedInvestmentPortfolioFulfillmentArrangementInstanceRecord() {
    return managedInvestmentPortfolioFulfillmentArrangementInstanceRecord;
  }

  public void setManagedInvestmentPortfolioFulfillmentArrangementInstanceRecord(CRManagedInvestmentPortfolioFulfillmentArrangementRequestInputModelManagedInvestmentPortfolioFulfillmentArrangementInstanceRecord managedInvestmentPortfolioFulfillmentArrangementInstanceRecord) {
    this.managedInvestmentPortfolioFulfillmentArrangementInstanceRecord = managedInvestmentPortfolioFulfillmentArrangementInstanceRecord;
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
   * Get requestRecordType
   * @return requestRecordType
  **/

  public CRManagedInvestmentPortfolioFulfillmentArrangementRequestInputModelRequestRecordType getRequestRecordType() {
    return requestRecordType;
  }

  public void setRequestRecordType(CRManagedInvestmentPortfolioFulfillmentArrangementRequestInputModelRequestRecordType requestRecordType) {
    this.requestRecordType = requestRecordType;
  }


}

