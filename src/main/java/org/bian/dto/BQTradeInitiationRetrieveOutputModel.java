package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQTradeInitiationInitiateInputModelTradeInitiationInstanceRecord;
import org.bian.dto.BQTradeInitiationRetrieveOutputModelManagedInvestmentPortfolioFulfillmentArrangementInstanceRecord;
import org.bian.dto.BQTradeInitiationRetrieveOutputModelTradeInitiationInstanceAnalysis;
import org.bian.dto.BQTradeInitiationRetrieveOutputModelTradeInitiationInstanceReport;

import javax.validation.Valid;
  
/**
 * BQTradeInitiationRetrieveOutputModel
 */
public class BQTradeInitiationRetrieveOutputModel   {
  private BQTradeInitiationRetrieveOutputModelManagedInvestmentPortfolioFulfillmentArrangementInstanceRecord managedInvestmentPortfolioFulfillmentArrangementInstanceRecord = null;

  private BQTradeInitiationInitiateInputModelTradeInitiationInstanceRecord tradeInitiationInstanceRecord = null;

  private String tradeInitiationRetrieveActionTaskReference = null;

  private Object tradeInitiationRetrieveActionTaskRecord = null;

  private String tradeInitiationRetrieveActionResponse = null;

  private BQTradeInitiationRetrieveOutputModelTradeInitiationInstanceReport tradeInitiationInstanceReport = null;

  private BQTradeInitiationRetrieveOutputModelTradeInitiationInstanceAnalysis tradeInitiationInstanceAnalysis = null;


  /**
   * Get managedInvestmentPortfolioFulfillmentArrangementInstanceRecord
   * @return managedInvestmentPortfolioFulfillmentArrangementInstanceRecord
  **/

  public BQTradeInitiationRetrieveOutputModelManagedInvestmentPortfolioFulfillmentArrangementInstanceRecord getManagedInvestmentPortfolioFulfillmentArrangementInstanceRecord() {
    return managedInvestmentPortfolioFulfillmentArrangementInstanceRecord;
  }

  public void setManagedInvestmentPortfolioFulfillmentArrangementInstanceRecord(BQTradeInitiationRetrieveOutputModelManagedInvestmentPortfolioFulfillmentArrangementInstanceRecord managedInvestmentPortfolioFulfillmentArrangementInstanceRecord) {
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Trade Initiation instance retrieve service call 
   * @return tradeInitiationRetrieveActionTaskReference
  **/

  public String getTradeInitiationRetrieveActionTaskReference() {
    return tradeInitiationRetrieveActionTaskReference;
  }

  public void setTradeInitiationRetrieveActionTaskReference(String tradeInitiationRetrieveActionTaskReference) {
    this.tradeInitiationRetrieveActionTaskReference = tradeInitiationRetrieveActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return tradeInitiationRetrieveActionTaskRecord
  **/

  public Object getTradeInitiationRetrieveActionTaskRecord() {
    return tradeInitiationRetrieveActionTaskRecord;
  }

  public void setTradeInitiationRetrieveActionTaskRecord(Object tradeInitiationRetrieveActionTaskRecord) {
    this.tradeInitiationRetrieveActionTaskRecord = tradeInitiationRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return tradeInitiationRetrieveActionResponse
  **/

  public String getTradeInitiationRetrieveActionResponse() {
    return tradeInitiationRetrieveActionResponse;
  }

  public void setTradeInitiationRetrieveActionResponse(String tradeInitiationRetrieveActionResponse) {
    this.tradeInitiationRetrieveActionResponse = tradeInitiationRetrieveActionResponse;
  }


  /**
   * Get tradeInitiationInstanceReport
   * @return tradeInitiationInstanceReport
  **/

  public BQTradeInitiationRetrieveOutputModelTradeInitiationInstanceReport getTradeInitiationInstanceReport() {
    return tradeInitiationInstanceReport;
  }

  public void setTradeInitiationInstanceReport(BQTradeInitiationRetrieveOutputModelTradeInitiationInstanceReport tradeInitiationInstanceReport) {
    this.tradeInitiationInstanceReport = tradeInitiationInstanceReport;
  }


  /**
   * Get tradeInitiationInstanceAnalysis
   * @return tradeInitiationInstanceAnalysis
  **/

  public BQTradeInitiationRetrieveOutputModelTradeInitiationInstanceAnalysis getTradeInitiationInstanceAnalysis() {
    return tradeInitiationInstanceAnalysis;
  }

  public void setTradeInitiationInstanceAnalysis(BQTradeInitiationRetrieveOutputModelTradeInitiationInstanceAnalysis tradeInitiationInstanceAnalysis) {
    this.tradeInitiationInstanceAnalysis = tradeInitiationInstanceAnalysis;
  }


}

