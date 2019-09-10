package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRManagedInvestmentPortfolioFulfillmentArrangementInitiateInputModelManagedInvestmentPortfolioFulfillmentArrangementInstanceRecordInvestmentPortfolioHoldings;
import org.bian.dto.CRManagedInvestmentPortfolioFulfillmentArrangementInitiateInputModelManagedInvestmentPortfolioFulfillmentArrangementInstanceRecordInvestmentPortfolioTradingPolicies;

import javax.validation.Valid;
  
/**
 * CRManagedInvestmentPortfolioFulfillmentArrangementExecuteOutputModelManagedInvestmentPortfolioFulfillmentArrangementInstanceRecord
 */
public class CRManagedInvestmentPortfolioFulfillmentArrangementExecuteOutputModelManagedInvestmentPortfolioFulfillmentArrangementInstanceRecord   {
  private CRManagedInvestmentPortfolioFulfillmentArrangementInitiateInputModelManagedInvestmentPortfolioFulfillmentArrangementInstanceRecordInvestmentPortfolioTradingPolicies investmentPortfolioTradingPolicies = null;

  private CRManagedInvestmentPortfolioFulfillmentArrangementInitiateInputModelManagedInvestmentPortfolioFulfillmentArrangementInstanceRecordInvestmentPortfolioHoldings investmentPortfolioHoldings = null;


  /**
   * Get investmentPortfolioTradingPolicies
   * @return investmentPortfolioTradingPolicies
  **/

  public CRManagedInvestmentPortfolioFulfillmentArrangementInitiateInputModelManagedInvestmentPortfolioFulfillmentArrangementInstanceRecordInvestmentPortfolioTradingPolicies getInvestmentPortfolioTradingPolicies() {
    return investmentPortfolioTradingPolicies;
  }

  public void setInvestmentPortfolioTradingPolicies(CRManagedInvestmentPortfolioFulfillmentArrangementInitiateInputModelManagedInvestmentPortfolioFulfillmentArrangementInstanceRecordInvestmentPortfolioTradingPolicies investmentPortfolioTradingPolicies) {
    this.investmentPortfolioTradingPolicies = investmentPortfolioTradingPolicies;
  }


  /**
   * Get investmentPortfolioHoldings
   * @return investmentPortfolioHoldings
  **/

  public CRManagedInvestmentPortfolioFulfillmentArrangementInitiateInputModelManagedInvestmentPortfolioFulfillmentArrangementInstanceRecordInvestmentPortfolioHoldings getInvestmentPortfolioHoldings() {
    return investmentPortfolioHoldings;
  }

  public void setInvestmentPortfolioHoldings(CRManagedInvestmentPortfolioFulfillmentArrangementInitiateInputModelManagedInvestmentPortfolioFulfillmentArrangementInstanceRecordInvestmentPortfolioHoldings investmentPortfolioHoldings) {
    this.investmentPortfolioHoldings = investmentPortfolioHoldings;
  }


}

