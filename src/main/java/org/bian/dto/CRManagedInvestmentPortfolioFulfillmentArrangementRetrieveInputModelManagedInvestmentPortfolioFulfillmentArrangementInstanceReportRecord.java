package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRManagedInvestmentPortfolioFulfillmentArrangementRetrieveInputModelManagedInvestmentPortfolioFulfillmentArrangementInstanceReportRecord
 */
public class CRManagedInvestmentPortfolioFulfillmentArrangementRetrieveInputModelManagedInvestmentPortfolioFulfillmentArrangementInstanceReportRecord   {
  private String managedInvestmentPortfolioFulfillmentArrangementInstanceReportReference = null;

  private String managedInvestmentPortfolioFulfillmentArrangementInstanceReportType = null;

  private String managedInvestmentPortfolioFulfillmentArrangementInstanceReportParameters = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return managedInvestmentPortfolioFulfillmentArrangementInstanceReportReference
  **/

  public String getManagedInvestmentPortfolioFulfillmentArrangementInstanceReportReference() {
    return managedInvestmentPortfolioFulfillmentArrangementInstanceReportReference;
  }

  public void setManagedInvestmentPortfolioFulfillmentArrangementInstanceReportReference(String managedInvestmentPortfolioFulfillmentArrangementInstanceReportReference) {
    this.managedInvestmentPortfolioFulfillmentArrangementInstanceReportReference = managedInvestmentPortfolioFulfillmentArrangementInstanceReportReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return managedInvestmentPortfolioFulfillmentArrangementInstanceReportType
  **/

  public String getManagedInvestmentPortfolioFulfillmentArrangementInstanceReportType() {
    return managedInvestmentPortfolioFulfillmentArrangementInstanceReportType;
  }

  public void setManagedInvestmentPortfolioFulfillmentArrangementInstanceReportType(String managedInvestmentPortfolioFulfillmentArrangementInstanceReportType) {
    this.managedInvestmentPortfolioFulfillmentArrangementInstanceReportType = managedInvestmentPortfolioFulfillmentArrangementInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return managedInvestmentPortfolioFulfillmentArrangementInstanceReportParameters
  **/

  public String getManagedInvestmentPortfolioFulfillmentArrangementInstanceReportParameters() {
    return managedInvestmentPortfolioFulfillmentArrangementInstanceReportParameters;
  }

  public void setManagedInvestmentPortfolioFulfillmentArrangementInstanceReportParameters(String managedInvestmentPortfolioFulfillmentArrangementInstanceReportParameters) {
    this.managedInvestmentPortfolioFulfillmentArrangementInstanceReportParameters = managedInvestmentPortfolioFulfillmentArrangementInstanceReportParameters;
  }


}

