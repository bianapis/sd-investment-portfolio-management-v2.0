package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRManagedInvestmentPortfolioFulfillmentArrangementInitiateInputModelManagedInvestmentPortfolioFulfillmentArrangementInstanceRecordInvestmentPortfolioHoldings;
import org.bian.dto.CRManagedInvestmentPortfolioFulfillmentArrangementInitiateInputModelManagedInvestmentPortfolioFulfillmentArrangementInstanceRecordInvestmentPortfolioTradingPolicies;

import javax.validation.Valid;
  
/**
 * CRManagedInvestmentPortfolioFulfillmentArrangementExecuteInputModelManagedInvestmentPortfolioFulfillmentArrangementInstanceRecord
 */
public class CRManagedInvestmentPortfolioFulfillmentArrangementExecuteInputModelManagedInvestmentPortfolioFulfillmentArrangementInstanceRecord   {
  private CRManagedInvestmentPortfolioFulfillmentArrangementInitiateInputModelManagedInvestmentPortfolioFulfillmentArrangementInstanceRecordInvestmentPortfolioTradingPolicies investmentPortfolioTradingPolicies = null;

  private String investmentPortfolioInstanceReference = null;

  private Object investmentPortfolioInstanceRecord = null;

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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the investment portfolio record of all holdings  
   * @return investmentPortfolioInstanceReference
  **/

  public String getInvestmentPortfolioInstanceReference() {
    return investmentPortfolioInstanceReference;
  }

  public void setInvestmentPortfolioInstanceReference(String investmentPortfolioInstanceReference) {
    this.investmentPortfolioInstanceReference = investmentPortfolioInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The record of the investment portfolio with the history and projected view of holdings (which may also include a history of valuation) 
   * @return investmentPortfolioInstanceRecord
  **/

  public Object getInvestmentPortfolioInstanceRecord() {
    return investmentPortfolioInstanceRecord;
  }

  public void setInvestmentPortfolioInstanceRecord(Object investmentPortfolioInstanceRecord) {
    this.investmentPortfolioInstanceRecord = investmentPortfolioInstanceRecord;
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

