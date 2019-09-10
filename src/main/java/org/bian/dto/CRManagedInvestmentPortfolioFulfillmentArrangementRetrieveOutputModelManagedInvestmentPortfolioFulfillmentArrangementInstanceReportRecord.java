package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRManagedInvestmentPortfolioFulfillmentArrangementRetrieveOutputModelManagedInvestmentPortfolioFulfillmentArrangementInstanceReportRecord
 */
public class CRManagedInvestmentPortfolioFulfillmentArrangementRetrieveOutputModelManagedInvestmentPortfolioFulfillmentArrangementInstanceReportRecord   {
  private String managedInvestmentPortfolioFulfillmentArrangementInstanceReportData = null;

  private String managedInvestmentPortfolioFulfillmentArrangementInstanceReportType = null;

  private Object managedInvestmentPortfolioFulfillmentArrangementInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return managedInvestmentPortfolioFulfillmentArrangementInstanceReportData
  **/

  public String getManagedInvestmentPortfolioFulfillmentArrangementInstanceReportData() {
    return managedInvestmentPortfolioFulfillmentArrangementInstanceReportData;
  }

  public void setManagedInvestmentPortfolioFulfillmentArrangementInstanceReportData(String managedInvestmentPortfolioFulfillmentArrangementInstanceReportData) {
    this.managedInvestmentPortfolioFulfillmentArrangementInstanceReportData = managedInvestmentPortfolioFulfillmentArrangementInstanceReportData;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return managedInvestmentPortfolioFulfillmentArrangementInstanceReport
  **/

  public Object getManagedInvestmentPortfolioFulfillmentArrangementInstanceReport() {
    return managedInvestmentPortfolioFulfillmentArrangementInstanceReport;
  }

  public void setManagedInvestmentPortfolioFulfillmentArrangementInstanceReport(Object managedInvestmentPortfolioFulfillmentArrangementInstanceReport) {
    this.managedInvestmentPortfolioFulfillmentArrangementInstanceReport = managedInvestmentPortfolioFulfillmentArrangementInstanceReport;
  }


}

