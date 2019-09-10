/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.bian.dto.*;

public interface InvestmentPortfolioManagementApiService {

	SDInvestmentPortfolioManagementActivateOutputModel activate(SDInvestmentPortfolioManagementActivateInputModel request);
	
	SDInvestmentPortfolioManagementConfigureOutputModel configure(String sdReferenceId, SDInvestmentPortfolioManagementConfigureInputModel request);
	
	CRManagedInvestmentPortfolioFulfillmentArrangementControlOutputModel control(String sdReferenceId, String crReferenceId, CRManagedInvestmentPortfolioFulfillmentArrangementControlInputModel request);
	
	BQTradeInitiationExchangeOutputModel exchangeTradeinitiation(String sdReferenceId, String crReferenceId, String bqReferenceId, BQTradeInitiationExchangeInputModel request);
	
	CRManagedInvestmentPortfolioFulfillmentArrangementExchangeOutputModel exchange(String sdReferenceId, String crReferenceId, CRManagedInvestmentPortfolioFulfillmentArrangementExchangeInputModel request);
	
	CRManagedInvestmentPortfolioFulfillmentArrangementExecuteOutputModel execute(String sdReferenceId, String crReferenceId, CRManagedInvestmentPortfolioFulfillmentArrangementExecuteInputModel request);
	
	SDInvestmentPortfolioManagementFeedbackOutputModel feedback(String sdReferenceId, SDInvestmentPortfolioManagementFeedbackInputModel request);
	
	CRManagedInvestmentPortfolioFulfillmentArrangementInitiateOutputModel initiate(String sdReferenceId, CRManagedInvestmentPortfolioFulfillmentArrangementInitiateInputModel request);
	
	BQTradeInitiationInitiateOutputModel initiateTradeinitiation(String sdReferenceId, String crReferenceId, BQTradeInitiationInitiateInputModel request);
	
	BQTradeInitiationRequestOutputModel requestTradeinitiation(String sdReferenceId, String crReferenceId, String bqReferenceId, BQTradeInitiationRequestInputModel request);
	
	CRManagedInvestmentPortfolioFulfillmentArrangementRequestOutputModel request(String sdReferenceId, String crReferenceId, CRManagedInvestmentPortfolioFulfillmentArrangementRequestInputModel request);
	
	CRManagedInvestmentPortfolioFulfillmentArrangementRetrieveOutputModel retrieve(String sdReferenceId, String crReferenceId);
	
	List<String> retrieveBQIds(String sdReferenceId, String crReferenceId, String behaviorQualifier);
	
	List<String> retrieveBQs();
	
	List<String> retrieveRefIds(String sdReferenceId);
	
	BQMarketOpportunityRetrieveOutputModel retrieveMarketopportunity(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	BQTrackRetrieveOutputModel retrieveTrack(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	BQTradeInitiationRetrieveOutputModel retrieveTradeinitiation(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	SDInvestmentPortfolioManagementRetrieveOutputModel retrieveSD(String sdReferenceId);
	
	CRManagedInvestmentPortfolioFulfillmentArrangementUpdateOutputModel update(String sdReferenceId, String crReferenceId, CRManagedInvestmentPortfolioFulfillmentArrangementUpdateInputModel request);
	
	BQTradeInitiationUpdateOutputModel updateTradeinitiation(String sdReferenceId, String crReferenceId, String bqReferenceId, BQTradeInitiationUpdateInputModel request);
	
}
