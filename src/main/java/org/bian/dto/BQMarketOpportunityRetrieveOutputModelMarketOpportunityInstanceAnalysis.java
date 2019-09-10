package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQMarketOpportunityRetrieveOutputModelMarketOpportunityInstanceAnalysis
 */
public class BQMarketOpportunityRetrieveOutputModelMarketOpportunityInstanceAnalysis   {
  private Object marketOpportunityInstanceAnalysisRecord = null;

  private String marketOpportunityInstanceAnalysisReportType = null;

  private String marketOpportunityInstanceAnalysisParameters = null;

  private Object marketOpportunityInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return marketOpportunityInstanceAnalysisRecord
  **/

  public Object getMarketOpportunityInstanceAnalysisRecord() {
    return marketOpportunityInstanceAnalysisRecord;
  }

  public void setMarketOpportunityInstanceAnalysisRecord(Object marketOpportunityInstanceAnalysisRecord) {
    this.marketOpportunityInstanceAnalysisRecord = marketOpportunityInstanceAnalysisRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return marketOpportunityInstanceAnalysisReportType
  **/

  public String getMarketOpportunityInstanceAnalysisReportType() {
    return marketOpportunityInstanceAnalysisReportType;
  }

  public void setMarketOpportunityInstanceAnalysisReportType(String marketOpportunityInstanceAnalysisReportType) {
    this.marketOpportunityInstanceAnalysisReportType = marketOpportunityInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return marketOpportunityInstanceAnalysisParameters
  **/

  public String getMarketOpportunityInstanceAnalysisParameters() {
    return marketOpportunityInstanceAnalysisParameters;
  }

  public void setMarketOpportunityInstanceAnalysisParameters(String marketOpportunityInstanceAnalysisParameters) {
    this.marketOpportunityInstanceAnalysisParameters = marketOpportunityInstanceAnalysisParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return marketOpportunityInstanceAnalysisReport
  **/

  public Object getMarketOpportunityInstanceAnalysisReport() {
    return marketOpportunityInstanceAnalysisReport;
  }

  public void setMarketOpportunityInstanceAnalysisReport(Object marketOpportunityInstanceAnalysisReport) {
    this.marketOpportunityInstanceAnalysisReport = marketOpportunityInstanceAnalysisReport;
  }


}

