package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQTradeInitiationInitiateInputModelTradeInitiationInstanceRecord;
import org.bian.dto.BQTradeInitiationRequestInputModelManagedInvestmentPortfolioFulfillmentArrangementInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQTradeInitiationRequestOutputModel
 */
public class BQTradeInitiationRequestOutputModel   {
  private BQTradeInitiationRequestInputModelManagedInvestmentPortfolioFulfillmentArrangementInstanceRecord managedInvestmentPortfolioFulfillmentArrangementInstanceRecord = null;

  private BQTradeInitiationInitiateInputModelTradeInitiationInstanceRecord tradeInitiationInstanceRecord = null;

  private String tradeInitiationRequestActionTaskReference = null;

  private Object tradeInitiationRequestActionTaskRecord = null;

  private String tradeInitiationRequestRecordReference = null;

  private Object requestResponseRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Trade Initiation instance request service call 
   * @return tradeInitiationRequestActionTaskReference
  **/

  public String getTradeInitiationRequestActionTaskReference() {
    return tradeInitiationRequestActionTaskReference;
  }

  public void setTradeInitiationRequestActionTaskReference(String tradeInitiationRequestActionTaskReference) {
    this.tradeInitiationRequestActionTaskReference = tradeInitiationRequestActionTaskReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Trade Initiation service request record 
   * @return tradeInitiationRequestRecordReference
  **/

  public String getTradeInitiationRequestRecordReference() {
    return tradeInitiationRequestRecordReference;
  }

  public void setTradeInitiationRequestRecordReference(String tradeInitiationRequestRecordReference) {
    this.tradeInitiationRequestRecordReference = tradeInitiationRequestRecordReference;
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

