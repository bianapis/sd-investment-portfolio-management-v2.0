package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRManagedInvestmentPortfolioFulfillmentArrangementRetrieveInputModelManagedInvestmentPortfolioFulfillmentArrangementInstanceAnalysis
 */
public class CRManagedInvestmentPortfolioFulfillmentArrangementRetrieveInputModelManagedInvestmentPortfolioFulfillmentArrangementInstanceAnalysis   {
  private String managedInvestmentPortfolioFulfillmentArrangementInstanceAnalysisReference = null;

  private String managedInvestmentPortfolioFulfillmentArrangementInstanceAnalysisReportType = null;

  private String managedInvestmentPortfolioFulfillmentArrangementInstanceAnalysisParameters = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return managedInvestmentPortfolioFulfillmentArrangementInstanceAnalysisReference
  **/

  public String getManagedInvestmentPortfolioFulfillmentArrangementInstanceAnalysisReference() {
    return managedInvestmentPortfolioFulfillmentArrangementInstanceAnalysisReference;
  }

  public void setManagedInvestmentPortfolioFulfillmentArrangementInstanceAnalysisReference(String managedInvestmentPortfolioFulfillmentArrangementInstanceAnalysisReference) {
    this.managedInvestmentPortfolioFulfillmentArrangementInstanceAnalysisReference = managedInvestmentPortfolioFulfillmentArrangementInstanceAnalysisReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return managedInvestmentPortfolioFulfillmentArrangementInstanceAnalysisParameters
  **/

  public String getManagedInvestmentPortfolioFulfillmentArrangementInstanceAnalysisParameters() {
    return managedInvestmentPortfolioFulfillmentArrangementInstanceAnalysisParameters;
  }

  public void setManagedInvestmentPortfolioFulfillmentArrangementInstanceAnalysisParameters(String managedInvestmentPortfolioFulfillmentArrangementInstanceAnalysisParameters) {
    this.managedInvestmentPortfolioFulfillmentArrangementInstanceAnalysisParameters = managedInvestmentPortfolioFulfillmentArrangementInstanceAnalysisParameters;
  }


}

