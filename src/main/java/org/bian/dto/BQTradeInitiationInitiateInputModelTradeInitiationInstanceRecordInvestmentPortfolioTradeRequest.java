package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQTradeInitiationInitiateInputModelTradeInitiationInstanceRecordInvestmentPortfolioTradeRequest
 */
public class BQTradeInitiationInitiateInputModelTradeInitiationInstanceRecordInvestmentPortfolioTradeRequest   {
  private String investmentPortfolioTradeSecurityType = null;

  private String investmentPortfolioTradeSecurityTradeDescription = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The type of security being traded 
   * @return investmentPortfolioTradeSecurityType
  **/

  public String getInvestmentPortfolioTradeSecurityType() {
    return investmentPortfolioTradeSecurityType;
  }

  public void setInvestmentPortfolioTradeSecurityType(String investmentPortfolioTradeSecurityType) {
    this.investmentPortfolioTradeSecurityType = investmentPortfolioTradeSecurityType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: A description of the trade, including all key trading details (e.g. amount/volume, pricing/terms, clearing and settlement dates) 
   * @return investmentPortfolioTradeSecurityTradeDescription
  **/

  public String getInvestmentPortfolioTradeSecurityTradeDescription() {
    return investmentPortfolioTradeSecurityTradeDescription;
  }

  public void setInvestmentPortfolioTradeSecurityTradeDescription(String investmentPortfolioTradeSecurityTradeDescription) {
    this.investmentPortfolioTradeSecurityTradeDescription = investmentPortfolioTradeSecurityTradeDescription;
  }


}

