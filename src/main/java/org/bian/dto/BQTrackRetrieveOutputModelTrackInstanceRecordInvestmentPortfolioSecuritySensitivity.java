package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQTrackRetrieveOutputModelTrackInstanceRecordInvestmentPortfolioSecuritySensitivity
 */
public class BQTrackRetrieveOutputModelTrackInstanceRecordInvestmentPortfolioSecuritySensitivity   {
  private String projectedValuation = null;

  private String projectedPortfolioImpact = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The expected value movement 
   * @return projectedValuation
  **/

  public String getProjectedValuation() {
    return projectedValuation;
  }

  public void setProjectedValuation(String projectedValuation) {
    this.projectedValuation = projectedValuation;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: An impact assessment of the projected movement on the investment portfolio - includes possible policy limit breaches 
   * @return projectedPortfolioImpact
  **/

  public String getProjectedPortfolioImpact() {
    return projectedPortfolioImpact;
  }

  public void setProjectedPortfolioImpact(String projectedPortfolioImpact) {
    this.projectedPortfolioImpact = projectedPortfolioImpact;
  }


}

