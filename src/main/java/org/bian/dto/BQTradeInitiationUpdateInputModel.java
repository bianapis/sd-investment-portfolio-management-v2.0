package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQTradeInitiationInitiateInputModelTradeInitiationInstanceRecord;
import org.bian.dto.BQTradeInitiationUpdateInputModelManagedInvestmentPortfolioFulfillmentArrangementInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQTradeInitiationUpdateInputModel
 */
public class BQTradeInitiationUpdateInputModel   {
  private BQTradeInitiationUpdateInputModelManagedInvestmentPortfolioFulfillmentArrangementInstanceRecord managedInvestmentPortfolioFulfillmentArrangementInstanceRecord = null;

  private String managedInvestmentPortfolioFulfillmentArrangementInstanceReference = null;

  private String tradeInitiationInstanceReference = null;

  private BQTradeInitiationInitiateInputModelTradeInitiationInstanceRecord tradeInitiationInstanceRecord = null;

  private Object tradeInitiationUpdateActionTaskRecord = null;

  private String tradeInitiationUpdateActionRequest = null;


  /**
   * Get managedInvestmentPortfolioFulfillmentArrangementInstanceRecord
   * @return managedInvestmentPortfolioFulfillmentArrangementInstanceRecord
  **/

  public BQTradeInitiationUpdateInputModelManagedInvestmentPortfolioFulfillmentArrangementInstanceRecord getManagedInvestmentPortfolioFulfillmentArrangementInstanceRecord() {
    return managedInvestmentPortfolioFulfillmentArrangementInstanceRecord;
  }

  public void setManagedInvestmentPortfolioFulfillmentArrangementInstanceRecord(BQTradeInitiationUpdateInputModelManagedInvestmentPortfolioFulfillmentArrangementInstanceRecord managedInvestmentPortfolioFulfillmentArrangementInstanceRecord) {
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return tradeInitiationUpdateActionTaskRecord
  **/

  public Object getTradeInitiationUpdateActionTaskRecord() {
    return tradeInitiationUpdateActionTaskRecord;
  }

  public void setTradeInitiationUpdateActionTaskRecord(Object tradeInitiationUpdateActionTaskRecord) {
    this.tradeInitiationUpdateActionTaskRecord = tradeInitiationUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the update action service request 
   * @return tradeInitiationUpdateActionRequest
  **/

  public String getTradeInitiationUpdateActionRequest() {
    return tradeInitiationUpdateActionRequest;
  }

  public void setTradeInitiationUpdateActionRequest(String tradeInitiationUpdateActionRequest) {
    this.tradeInitiationUpdateActionRequest = tradeInitiationUpdateActionRequest;
  }


}

