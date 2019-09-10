package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRManagedInvestmentPortfolioFulfillmentArrangementInitiateInputModelManagedInvestmentPortfolioFulfillmentArrangementInstanceRecordInvestmentPortfolioHoldings
 */
public class CRManagedInvestmentPortfolioFulfillmentArrangementInitiateInputModelManagedInvestmentPortfolioFulfillmentArrangementInstanceRecordInvestmentPortfolioHoldings   {
  private String investmentPortfolioSecurityType = null;

  private String investmentPortfolioSecurityHolding = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The type of security held in the portfolio 
   * @return investmentPortfolioSecurityType
  **/

  public String getInvestmentPortfolioSecurityType() {
    return investmentPortfolioSecurityType;
  }

  public void setInvestmentPortfolioSecurityType(String investmentPortfolioSecurityType) {
    this.investmentPortfolioSecurityType = investmentPortfolioSecurityType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Record of past and projected and current holding for the security 
   * @return investmentPortfolioSecurityHolding
  **/

  public String getInvestmentPortfolioSecurityHolding() {
    return investmentPortfolioSecurityHolding;
  }

  public void setInvestmentPortfolioSecurityHolding(String investmentPortfolioSecurityHolding) {
    this.investmentPortfolioSecurityHolding = investmentPortfolioSecurityHolding;
  }


}

