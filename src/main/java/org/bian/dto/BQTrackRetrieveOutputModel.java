package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQTrackRetrieveOutputModelManagedInvestmentPortfolioFulfillmentArrangementInstanceRecord;
import org.bian.dto.BQTrackRetrieveOutputModelTrackInstanceAnalysis;
import org.bian.dto.BQTrackRetrieveOutputModelTrackInstanceRecord;
import org.bian.dto.BQTrackRetrieveOutputModelTrackInstanceReport;

import javax.validation.Valid;
  
/**
 * BQTrackRetrieveOutputModel
 */
public class BQTrackRetrieveOutputModel   {
  private BQTrackRetrieveOutputModelManagedInvestmentPortfolioFulfillmentArrangementInstanceRecord managedInvestmentPortfolioFulfillmentArrangementInstanceRecord = null;

  private BQTrackRetrieveOutputModelTrackInstanceRecord trackInstanceRecord = null;

  private String trackRetrieveActionTaskReference = null;

  private Object trackRetrieveActionTaskRecord = null;

  private String trackRetrieveActionResponse = null;

  private BQTrackRetrieveOutputModelTrackInstanceReport trackInstanceReport = null;

  private BQTrackRetrieveOutputModelTrackInstanceAnalysis trackInstanceAnalysis = null;


  /**
   * Get managedInvestmentPortfolioFulfillmentArrangementInstanceRecord
   * @return managedInvestmentPortfolioFulfillmentArrangementInstanceRecord
  **/

  public BQTrackRetrieveOutputModelManagedInvestmentPortfolioFulfillmentArrangementInstanceRecord getManagedInvestmentPortfolioFulfillmentArrangementInstanceRecord() {
    return managedInvestmentPortfolioFulfillmentArrangementInstanceRecord;
  }

  public void setManagedInvestmentPortfolioFulfillmentArrangementInstanceRecord(BQTrackRetrieveOutputModelManagedInvestmentPortfolioFulfillmentArrangementInstanceRecord managedInvestmentPortfolioFulfillmentArrangementInstanceRecord) {
    this.managedInvestmentPortfolioFulfillmentArrangementInstanceRecord = managedInvestmentPortfolioFulfillmentArrangementInstanceRecord;
  }


  /**
   * Get trackInstanceRecord
   * @return trackInstanceRecord
  **/

  public BQTrackRetrieveOutputModelTrackInstanceRecord getTrackInstanceRecord() {
    return trackInstanceRecord;
  }

  public void setTrackInstanceRecord(BQTrackRetrieveOutputModelTrackInstanceRecord trackInstanceRecord) {
    this.trackInstanceRecord = trackInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Track instance retrieve service call 
   * @return trackRetrieveActionTaskReference
  **/

  public String getTrackRetrieveActionTaskReference() {
    return trackRetrieveActionTaskReference;
  }

  public void setTrackRetrieveActionTaskReference(String trackRetrieveActionTaskReference) {
    this.trackRetrieveActionTaskReference = trackRetrieveActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return trackRetrieveActionTaskRecord
  **/

  public Object getTrackRetrieveActionTaskRecord() {
    return trackRetrieveActionTaskRecord;
  }

  public void setTrackRetrieveActionTaskRecord(Object trackRetrieveActionTaskRecord) {
    this.trackRetrieveActionTaskRecord = trackRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return trackRetrieveActionResponse
  **/

  public String getTrackRetrieveActionResponse() {
    return trackRetrieveActionResponse;
  }

  public void setTrackRetrieveActionResponse(String trackRetrieveActionResponse) {
    this.trackRetrieveActionResponse = trackRetrieveActionResponse;
  }


  /**
   * Get trackInstanceReport
   * @return trackInstanceReport
  **/

  public BQTrackRetrieveOutputModelTrackInstanceReport getTrackInstanceReport() {
    return trackInstanceReport;
  }

  public void setTrackInstanceReport(BQTrackRetrieveOutputModelTrackInstanceReport trackInstanceReport) {
    this.trackInstanceReport = trackInstanceReport;
  }


  /**
   * Get trackInstanceAnalysis
   * @return trackInstanceAnalysis
  **/

  public BQTrackRetrieveOutputModelTrackInstanceAnalysis getTrackInstanceAnalysis() {
    return trackInstanceAnalysis;
  }

  public void setTrackInstanceAnalysis(BQTrackRetrieveOutputModelTrackInstanceAnalysis trackInstanceAnalysis) {
    this.trackInstanceAnalysis = trackInstanceAnalysis;
  }


}

