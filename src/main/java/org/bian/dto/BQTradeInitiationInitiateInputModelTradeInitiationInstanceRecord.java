package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQTradeInitiationInitiateInputModelTradeInitiationInstanceRecordInvestmentPortfolioTradeRequest;

import javax.validation.Valid;
  
/**
 * BQTradeInitiationInitiateInputModelTradeInitiationInstanceRecord
 */
public class BQTradeInitiationInitiateInputModelTradeInitiationInstanceRecord   {
  private BQTradeInitiationInitiateInputModelTradeInitiationInstanceRecordInvestmentPortfolioTradeRequest investmentPortfolioTradeRequest = null;


  /**
   * Get investmentPortfolioTradeRequest
   * @return investmentPortfolioTradeRequest
  **/

  public BQTradeInitiationInitiateInputModelTradeInitiationInstanceRecordInvestmentPortfolioTradeRequest getInvestmentPortfolioTradeRequest() {
    return investmentPortfolioTradeRequest;
  }

  public void setInvestmentPortfolioTradeRequest(BQTradeInitiationInitiateInputModelTradeInitiationInstanceRecordInvestmentPortfolioTradeRequest investmentPortfolioTradeRequest) {
    this.investmentPortfolioTradeRequest = investmentPortfolioTradeRequest;
  }


}

