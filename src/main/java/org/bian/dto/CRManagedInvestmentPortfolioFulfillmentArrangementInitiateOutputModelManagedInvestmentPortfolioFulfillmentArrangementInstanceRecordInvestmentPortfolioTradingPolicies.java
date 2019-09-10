package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRManagedInvestmentPortfolioFulfillmentArrangementInitiateOutputModelManagedInvestmentPortfolioFulfillmentArrangementInstanceRecordInvestmentPortfolioTradingPolicies
 */
public class CRManagedInvestmentPortfolioFulfillmentArrangementInitiateOutputModelManagedInvestmentPortfolioFulfillmentArrangementInstanceRecordInvestmentPortfolioTradingPolicies   {
  private String investmentPortfolioPolicyLimitsandConstraints = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Specific trading constraints (e.g. stocks or sectors that are out of bounds and acceptable risk levels) 
   * @return investmentPortfolioPolicyLimitsandConstraints
  **/

  public String getInvestmentPortfolioPolicyLimitsandConstraints() {
    return investmentPortfolioPolicyLimitsandConstraints;
  }

  public void setInvestmentPortfolioPolicyLimitsandConstraints(String investmentPortfolioPolicyLimitsandConstraints) {
    this.investmentPortfolioPolicyLimitsandConstraints = investmentPortfolioPolicyLimitsandConstraints;
  }


}

