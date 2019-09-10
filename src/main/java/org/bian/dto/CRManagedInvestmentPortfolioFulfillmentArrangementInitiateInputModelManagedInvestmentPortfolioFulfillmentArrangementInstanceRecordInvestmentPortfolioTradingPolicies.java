package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRManagedInvestmentPortfolioFulfillmentArrangementInitiateInputModelManagedInvestmentPortfolioFulfillmentArrangementInstanceRecordInvestmentPortfolioTradingPolicies
 */
public class CRManagedInvestmentPortfolioFulfillmentArrangementInitiateInputModelManagedInvestmentPortfolioFulfillmentArrangementInstanceRecordInvestmentPortfolioTradingPolicies   {
  private String investmentPortfolioPolicyType = null;

  private String investmentPortfolioPolicyDescription = null;

  private String investmentPortfolioPolicyLimitsandConstraints = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The type of policy applied to the portfolio (e.g. risk appetite, allowed sectors/instrument types, timeframes) 
   * @return investmentPortfolioPolicyType
  **/

  public String getInvestmentPortfolioPolicyType() {
    return investmentPortfolioPolicyType;
  }

  public void setInvestmentPortfolioPolicyType(String investmentPortfolioPolicyType) {
    this.investmentPortfolioPolicyType = investmentPortfolioPolicyType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: A narrative explaining the interpretation of the portfolio policies as they govern trading decisions 
   * @return investmentPortfolioPolicyDescription
  **/

  public String getInvestmentPortfolioPolicyDescription() {
    return investmentPortfolioPolicyDescription;
  }

  public void setInvestmentPortfolioPolicyDescription(String investmentPortfolioPolicyDescription) {
    this.investmentPortfolioPolicyDescription = investmentPortfolioPolicyDescription;
  }


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

