package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQTradeInitiationInitiateOutputModelTradeInitiationInstanceRecordInvestmentPortfolioTradeRequest;

import javax.validation.Valid;
  
/**
 * BQTradeInitiationInitiateOutputModelTradeInitiationInstanceRecord
 */
public class BQTradeInitiationInitiateOutputModelTradeInitiationInstanceRecord   {
  private BQTradeInitiationInitiateOutputModelTradeInitiationInstanceRecordInvestmentPortfolioTradeRequest investmentPortfolioTradeRequest = null;


  /**
   * Get investmentPortfolioTradeRequest
   * @return investmentPortfolioTradeRequest
  **/

  public BQTradeInitiationInitiateOutputModelTradeInitiationInstanceRecordInvestmentPortfolioTradeRequest getInvestmentPortfolioTradeRequest() {
    return investmentPortfolioTradeRequest;
  }

  public void setInvestmentPortfolioTradeRequest(BQTradeInitiationInitiateOutputModelTradeInitiationInstanceRecordInvestmentPortfolioTradeRequest investmentPortfolioTradeRequest) {
    this.investmentPortfolioTradeRequest = investmentPortfolioTradeRequest;
  }


}

