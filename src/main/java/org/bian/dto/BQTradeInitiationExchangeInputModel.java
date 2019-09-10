package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQTradeInitiationExchangeInputModelManagedInvestmentPortfolioFulfillmentArrangementInstanceRecord;
import org.bian.dto.BQTradeInitiationInitiateInputModelTradeInitiationInstanceRecord;
import org.bian.dto.CRManagedInvestmentPortfolioFulfillmentArrangementExchangeInputModelManagedInvestmentPortfolioFulfillmentArrangementExchangeActionRequest;

import javax.validation.Valid;
  
/**
 * BQTradeInitiationExchangeInputModel
 */
public class BQTradeInitiationExchangeInputModel   {
  private BQTradeInitiationExchangeInputModelManagedInvestmentPortfolioFulfillmentArrangementInstanceRecord managedInvestmentPortfolioFulfillmentArrangementInstanceRecord = null;

  private String managedInvestmentPortfolioFulfillmentArrangementInstanceReference = null;

  private String tradeInitiationInstanceReference = null;

  private BQTradeInitiationInitiateInputModelTradeInitiationInstanceRecord tradeInitiationInstanceRecord = null;

  private Object tradeInitiationExchangeActionTaskRecord = null;

  private CRManagedInvestmentPortfolioFulfillmentArrangementExchangeInputModelManagedInvestmentPortfolioFulfillmentArrangementExchangeActionRequest tradeInitiationExchangeActionRequest = null;


  /**
   * Get managedInvestmentPortfolioFulfillmentArrangementInstanceRecord
   * @return managedInvestmentPortfolioFulfillmentArrangementInstanceRecord
  **/

  public BQTradeInitiationExchangeInputModelManagedInvestmentPortfolioFulfillmentArrangementInstanceRecord getManagedInvestmentPortfolioFulfillmentArrangementInstanceRecord() {
    return managedInvestmentPortfolioFulfillmentArrangementInstanceRecord;
  }

  public void setManagedInvestmentPortfolioFulfillmentArrangementInstanceRecord(BQTradeInitiationExchangeInputModelManagedInvestmentPortfolioFulfillmentArrangementInstanceRecord managedInvestmentPortfolioFulfillmentArrangementInstanceRecord) {
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The exchange service call consolidated processing record 
   * @return tradeInitiationExchangeActionTaskRecord
  **/

  public Object getTradeInitiationExchangeActionTaskRecord() {
    return tradeInitiationExchangeActionTaskRecord;
  }

  public void setTradeInitiationExchangeActionTaskRecord(Object tradeInitiationExchangeActionTaskRecord) {
    this.tradeInitiationExchangeActionTaskRecord = tradeInitiationExchangeActionTaskRecord;
  }


  /**
   * Get tradeInitiationExchangeActionRequest
   * @return tradeInitiationExchangeActionRequest
  **/

  public CRManagedInvestmentPortfolioFulfillmentArrangementExchangeInputModelManagedInvestmentPortfolioFulfillmentArrangementExchangeActionRequest getTradeInitiationExchangeActionRequest() {
    return tradeInitiationExchangeActionRequest;
  }

  public void setTradeInitiationExchangeActionRequest(CRManagedInvestmentPortfolioFulfillmentArrangementExchangeInputModelManagedInvestmentPortfolioFulfillmentArrangementExchangeActionRequest tradeInitiationExchangeActionRequest) {
    this.tradeInitiationExchangeActionRequest = tradeInitiationExchangeActionRequest;
  }


}

