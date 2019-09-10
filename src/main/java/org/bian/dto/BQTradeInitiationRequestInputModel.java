package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQTradeInitiationInitiateInputModelTradeInitiationInstanceRecord;
import org.bian.dto.BQTradeInitiationRequestInputModelManagedInvestmentPortfolioFulfillmentArrangementInstanceRecord;
import org.bian.dto.CRManagedInvestmentPortfolioFulfillmentArrangementRequestInputModelRequestRecordType;

import javax.validation.Valid;
  
/**
 * BQTradeInitiationRequestInputModel
 */
public class BQTradeInitiationRequestInputModel   {
  private BQTradeInitiationRequestInputModelManagedInvestmentPortfolioFulfillmentArrangementInstanceRecord managedInvestmentPortfolioFulfillmentArrangementInstanceRecord = null;

  private String managedInvestmentPortfolioFulfillmentArrangementInstanceReference = null;

  private String tradeInitiationInstanceReference = null;

  private BQTradeInitiationInitiateInputModelTradeInitiationInstanceRecord tradeInitiationInstanceRecord = null;

  private Object tradeInitiationRequestActionTaskRecord = null;

  private CRManagedInvestmentPortfolioFulfillmentArrangementRequestInputModelRequestRecordType requestRecordType = null;


  /**
   * Get managedInvestmentPortfolioFulfillmentArrangementInstanceRecord
   * @return managedInvestmentPortfolioFulfillmentArrangementInstanceRecord
  **/

  public BQTradeInitiationRequestInputModelManagedInvestmentPortfolioFulfillmentArrangementInstanceRecord getManagedInvestmentPortfolioFulfillmentArrangementInstanceRecord() {
    return managedInvestmentPortfolioFulfillmentArrangementInstanceRecord;
  }

  public void setManagedInvestmentPortfolioFulfillmentArrangementInstanceRecord(BQTradeInitiationRequestInputModelManagedInvestmentPortfolioFulfillmentArrangementInstanceRecord managedInvestmentPortfolioFulfillmentArrangementInstanceRecord) {
    this.managedInvestmentPortfolioFulfillmentArrangementInstanceRecord = managedInvestmentPortfolioFulfillmentArrangementInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the parent Managed Investment Portfolio Fulfillment Arrangement instance 
   * @return managedInvestmentPortfolioFulfillmentArrangementInstanceReference
  **/

  public String getManagedInvestmentPortfolioFulfillmentArrangementInstanceReference() {
    return managedInvestmentPortfolioFulfillmentArrangementInstanceReference;
  }

  public void setManagedInvestmentPortfolioFulfillmentArrangementInstanceReference(String managedInvestmentPortfolioFulfillmentArrangementInstanceReference) {
    this.managedInvestmentPortfolioFulfillmentArrangementInstanceReference = managedInvestmentPortfolioFulfillmentArrangementInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Trade Initiation instance 
   * @return tradeInitiationInstanceReference
  **/

  public String getTradeInitiationInstanceReference() {
    return tradeInitiationInstanceReference;
  }

  public void setTradeInitiationInstanceReference(String tradeInitiationInstanceReference) {
    this.tradeInitiationInstanceReference = tradeInitiationInstanceReference;
  }


  /**
   * Get tradeInitiationInstanceRecord
   * @return tradeInitiationInstanceRecord
  **/

  public BQTradeInitiationInitiateInputModelTradeInitiationInstanceRecord getTradeInitiationInstanceRecord() {
    return tradeInitiationInstanceRecord;
  }

  public void setTradeInitiationInstanceRecord(BQTradeInitiationInitiateInputModelTradeInitiationInstanceRecord tradeInitiationInstanceRecord) {
    this.tradeInitiationInstanceRecord = tradeInitiationInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The request service call consolidated processing record 
   * @return tradeInitiationRequestActionTaskRecord
  **/

  public Object getTradeInitiationRequestActionTaskRecord() {
    return tradeInitiationRequestActionTaskRecord;
  }

  public void setTradeInitiationRequestActionTaskRecord(Object tradeInitiationRequestActionTaskRecord) {
    this.tradeInitiationRequestActionTaskRecord = tradeInitiationRequestActionTaskRecord;
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

