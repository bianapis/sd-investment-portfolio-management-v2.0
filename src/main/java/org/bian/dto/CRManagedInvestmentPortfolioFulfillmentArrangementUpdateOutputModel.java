package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRManagedInvestmentPortfolioFulfillmentArrangementUpdateInputModelManagedInvestmentPortfolioFulfillmentArrangementInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRManagedInvestmentPortfolioFulfillmentArrangementUpdateOutputModel
 */
public class CRManagedInvestmentPortfolioFulfillmentArrangementUpdateOutputModel   {
  private CRManagedInvestmentPortfolioFulfillmentArrangementUpdateInputModelManagedInvestmentPortfolioFulfillmentArrangementInstanceRecord managedInvestmentPortfolioFulfillmentArrangementInstanceRecord = null;

  private String managedInvestmentPortfolioFulfillmentArrangementUpdateActionTaskReference = null;

  private Object managedInvestmentPortfolioFulfillmentArrangementUpdateActionTaskRecord = null;

  private Object updateResponseRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an update service call 
   * @return managedInvestmentPortfolioFulfillmentArrangementUpdateActionTaskReference
  **/

  public String getManagedInvestmentPortfolioFulfillmentArrangementUpdateActionTaskReference() {
    return managedInvestmentPortfolioFulfillmentArrangementUpdateActionTaskReference;
  }

  public void setManagedInvestmentPortfolioFulfillmentArrangementUpdateActionTaskReference(String managedInvestmentPortfolioFulfillmentArrangementUpdateActionTaskReference) {
    this.managedInvestmentPortfolioFulfillmentArrangementUpdateActionTaskReference = managedInvestmentPortfolioFulfillmentArrangementUpdateActionTaskReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the Update action service response 
   * @return updateResponseRecord
  **/

  public Object getUpdateResponseRecord() {
    return updateResponseRecord;
  }

  public void setUpdateResponseRecord(Object updateResponseRecord) {
    this.updateResponseRecord = updateResponseRecord;
  }


}

