package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQMarketOpportunityRetrieveOutputModelMarketOpportunityInstanceReport
 */
public class BQMarketOpportunityRetrieveOutputModelMarketOpportunityInstanceReport   {
  private Object marketOpportunityInstanceReportRecord = null;

  private String marketOpportunityInstanceReportType = null;

  private String marketOpportunityInstanceReportParameters = null;

  private Object marketOpportunityInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return marketOpportunityInstanceReportRecord
  **/

  public Object getMarketOpportunityInstanceReportRecord() {
    return marketOpportunityInstanceReportRecord;
  }

  public void setMarketOpportunityInstanceReportRecord(Object marketOpportunityInstanceReportRecord) {
    this.marketOpportunityInstanceReportRecord = marketOpportunityInstanceReportRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return marketOpportunityInstanceReportType
  **/

  public String getMarketOpportunityInstanceReportType() {
    return marketOpportunityInstanceReportType;
  }

  public void setMarketOpportunityInstanceReportType(String marketOpportunityInstanceReportType) {
    this.marketOpportunityInstanceReportType = marketOpportunityInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return marketOpportunityInstanceReportParameters
  **/

  public String getMarketOpportunityInstanceReportParameters() {
    return marketOpportunityInstanceReportParameters;
  }

  public void setMarketOpportunityInstanceReportParameters(String marketOpportunityInstanceReportParameters) {
    this.marketOpportunityInstanceReportParameters = marketOpportunityInstanceReportParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return marketOpportunityInstanceReport
  **/

  public Object getMarketOpportunityInstanceReport() {
    return marketOpportunityInstanceReport;
  }

  public void setMarketOpportunityInstanceReport(Object marketOpportunityInstanceReport) {
    this.marketOpportunityInstanceReport = marketOpportunityInstanceReport;
  }


}

