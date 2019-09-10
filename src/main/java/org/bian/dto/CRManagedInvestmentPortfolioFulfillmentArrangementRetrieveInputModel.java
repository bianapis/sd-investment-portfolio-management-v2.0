package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRManagedInvestmentPortfolioFulfillmentArrangementRetrieveInputModelManagedInvestmentPortfolioFulfillmentArrangementInstanceAnalysis;
import org.bian.dto.CRManagedInvestmentPortfolioFulfillmentArrangementRetrieveInputModelManagedInvestmentPortfolioFulfillmentArrangementInstanceReportRecord;

import javax.validation.Valid;
  
/**
 * CRManagedInvestmentPortfolioFulfillmentArrangementRetrieveInputModel
 */
public class CRManagedInvestmentPortfolioFulfillmentArrangementRetrieveInputModel   {
  private Object managedInvestmentPortfolioFulfillmentArrangementRetrieveActionTaskRecord = null;

  private String managedInvestmentPortfolioFulfillmentArrangementRetrieveActionRequest = null;

  private CRManagedInvestmentPortfolioFulfillmentArrangementRetrieveInputModelManagedInvestmentPortfolioFulfillmentArrangementInstanceReportRecord managedInvestmentPortfolioFulfillmentArrangementInstanceReportRecord = null;

  private CRManagedInvestmentPortfolioFulfillmentArrangementRetrieveInputModelManagedInvestmentPortfolioFulfillmentArrangementInstanceAnalysis managedInvestmentPortfolioFulfillmentArrangementInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return managedInvestmentPortfolioFulfillmentArrangementRetrieveActionTaskRecord
  **/

  public Object getManagedInvestmentPortfolioFulfillmentArrangementRetrieveActionTaskRecord() {
    return managedInvestmentPortfolioFulfillmentArrangementRetrieveActionTaskRecord;
  }

  public void setManagedInvestmentPortfolioFulfillmentArrangementRetrieveActionTaskRecord(Object managedInvestmentPortfolioFulfillmentArrangementRetrieveActionTaskRecord) {
    this.managedInvestmentPortfolioFulfillmentArrangementRetrieveActionTaskRecord = managedInvestmentPortfolioFulfillmentArrangementRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return managedInvestmentPortfolioFulfillmentArrangementRetrieveActionRequest
  **/

  public String getManagedInvestmentPortfolioFulfillmentArrangementRetrieveActionRequest() {
    return managedInvestmentPortfolioFulfillmentArrangementRetrieveActionRequest;
  }

  public void setManagedInvestmentPortfolioFulfillmentArrangementRetrieveActionRequest(String managedInvestmentPortfolioFulfillmentArrangementRetrieveActionRequest) {
    this.managedInvestmentPortfolioFulfillmentArrangementRetrieveActionRequest = managedInvestmentPortfolioFulfillmentArrangementRetrieveActionRequest;
  }


  /**
   * Get managedInvestmentPortfolioFulfillmentArrangementInstanceReportRecord
   * @return managedInvestmentPortfolioFulfillmentArrangementInstanceReportRecord
  **/

  public CRManagedInvestmentPortfolioFulfillmentArrangementRetrieveInputModelManagedInvestmentPortfolioFulfillmentArrangementInstanceReportRecord getManagedInvestmentPortfolioFulfillmentArrangementInstanceReportRecord() {
    return managedInvestmentPortfolioFulfillmentArrangementInstanceReportRecord;
  }

  public void setManagedInvestmentPortfolioFulfillmentArrangementInstanceReportRecord(CRManagedInvestmentPortfolioFulfillmentArrangementRetrieveInputModelManagedInvestmentPortfolioFulfillmentArrangementInstanceReportRecord managedInvestmentPortfolioFulfillmentArrangementInstanceReportRecord) {
    this.managedInvestmentPortfolioFulfillmentArrangementInstanceReportRecord = managedInvestmentPortfolioFulfillmentArrangementInstanceReportRecord;
  }


  /**
   * Get managedInvestmentPortfolioFulfillmentArrangementInstanceAnalysis
   * @return managedInvestmentPortfolioFulfillmentArrangementInstanceAnalysis
  **/

  public CRManagedInvestmentPortfolioFulfillmentArrangementRetrieveInputModelManagedInvestmentPortfolioFulfillmentArrangementInstanceAnalysis getManagedInvestmentPortfolioFulfillmentArrangementInstanceAnalysis() {
    return managedInvestmentPortfolioFulfillmentArrangementInstanceAnalysis;
  }

  public void setManagedInvestmentPortfolioFulfillmentArrangementInstanceAnalysis(CRManagedInvestmentPortfolioFulfillmentArrangementRetrieveInputModelManagedInvestmentPortfolioFulfillmentArrangementInstanceAnalysis managedInvestmentPortfolioFulfillmentArrangementInstanceAnalysis) {
    this.managedInvestmentPortfolioFulfillmentArrangementInstanceAnalysis = managedInvestmentPortfolioFulfillmentArrangementInstanceAnalysis;
  }


}

