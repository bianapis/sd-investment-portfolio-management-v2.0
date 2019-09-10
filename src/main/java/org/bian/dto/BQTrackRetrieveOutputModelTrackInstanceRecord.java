package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQTrackRetrieveOutputModelTrackInstanceRecordInvestmentPortfolioSecuritySensitivity;

import javax.validation.Valid;
  
/**
 * BQTrackRetrieveOutputModelTrackInstanceRecord
 */
public class BQTrackRetrieveOutputModelTrackInstanceRecord   {
  private BQTrackRetrieveOutputModelTrackInstanceRecordInvestmentPortfolioSecuritySensitivity investmentPortfolioSecuritySensitivity = null;


  /**
   * Get investmentPortfolioSecuritySensitivity
   * @return investmentPortfolioSecuritySensitivity
  **/

  public BQTrackRetrieveOutputModelTrackInstanceRecordInvestmentPortfolioSecuritySensitivity getInvestmentPortfolioSecuritySensitivity() {
    return investmentPortfolioSecuritySensitivity;
  }

  public void setInvestmentPortfolioSecuritySensitivity(BQTrackRetrieveOutputModelTrackInstanceRecordInvestmentPortfolioSecuritySensitivity investmentPortfolioSecuritySensitivity) {
    this.investmentPortfolioSecuritySensitivity = investmentPortfolioSecuritySensitivity;
  }


}

