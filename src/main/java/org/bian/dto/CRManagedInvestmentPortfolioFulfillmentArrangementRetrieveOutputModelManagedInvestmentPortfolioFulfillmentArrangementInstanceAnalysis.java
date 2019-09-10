package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRManagedInvestmentPortfolioFulfillmentArrangementRetrieveOutputModelManagedInvestmentPortfolioFulfillmentArrangementInstanceAnalysis
 */
public class CRManagedInvestmentPortfolioFulfillmentArrangementRetrieveOutputModelManagedInvestmentPortfolioFulfillmentArrangementInstanceAnalysis   {
  private String managedInvestmentPortfolioFulfillmentArrangementInstanceAnalysisData = null;

  private String managedInvestmentPortfolioFulfillmentArrangementInstanceAnalysisReportType = null;

  private Object managedInvestmentPortfolioFulfillmentArrangementInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return managedInvestmentPortfolioFulfillmentArrangementInstanceAnalysisData
  **/

  public String getManagedInvestmentPortfolioFulfillmentArrangementInstanceAnalysisData() {
    return managedInvestmentPortfolioFulfillmentArrangementInstanceAnalysisData;
  }

  public void setManagedInvestmentPortfolioFulfillmentArrangementInstanceAnalysisData(String managedInvestmentPortfolioFulfillmentArrangementInstanceAnalysisData) {
    this.managedInvestmentPortfolioFulfillmentArrangementInstanceAnalysisData = managedInvestmentPortfolioFulfillmentArrangementInstanceAnalysisData;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return managedInvestmentPortfolioFulfillmentArrangementInstanceAnalysisReportType
  **/

  public String getManagedInvestmentPortfolioFulfillmentArrangementInstanceAnalysisReportType() {
    return managedInvestmentPortfolioFulfillmentArrangementInstanceAnalysisReportType;
  }

  public void setManagedInvestmentPortfolioFulfillmentArrangementInstanceAnalysisReportType(String managedInvestmentPortfolioFulfillmentArrangementInstanceAnalysisReportType) {
    this.managedInvestmentPortfolioFulfillmentArrangementInstanceAnalysisReportType = managedInvestmentPortfolioFulfillmentArrangementInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return managedInvestmentPortfolioFulfillmentArrangementInstanceAnalysisReport
  **/

  public Object getManagedInvestmentPortfolioFulfillmentArrangementInstanceAnalysisReport() {
    return managedInvestmentPortfolioFulfillmentArrangementInstanceAnalysisReport;
  }

  public void setManagedInvestmentPortfolioFulfillmentArrangementInstanceAnalysisReport(Object managedInvestmentPortfolioFulfillmentArrangementInstanceAnalysisReport) {
    this.managedInvestmentPortfolioFulfillmentArrangementInstanceAnalysisReport = managedInvestmentPortfolioFulfillmentArrangementInstanceAnalysisReport;
  }


}

