/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.bian.dto.*;
import org.bian.util.JsonReader;
import com.fasterxml.jackson.core.type.TypeReference;

@Service
public class InvestmentPortfolioManagementApiServiceImpl implements InvestmentPortfolioManagementApiService {

	public SDInvestmentPortfolioManagementActivateOutputModel activate(SDInvestmentPortfolioManagementActivateInputModel request){
		return JsonReader.read("activate-SDInvestmentPortfolioManagementActivateOutputModel.json",new TypeReference<SDInvestmentPortfolioManagementActivateOutputModel>(){});
	}
	
	public SDInvestmentPortfolioManagementConfigureOutputModel configure(String sdReferenceId, SDInvestmentPortfolioManagementConfigureInputModel request){
		return JsonReader.read("configure-SDInvestmentPortfolioManagementConfigureOutputModel.json",new TypeReference<SDInvestmentPortfolioManagementConfigureOutputModel>(){});
	}
	
	public CRManagedInvestmentPortfolioFulfillmentArrangementControlOutputModel control(String sdReferenceId, String crReferenceId, CRManagedInvestmentPortfolioFulfillmentArrangementControlInputModel request){
		return JsonReader.read("control-CRManagedInvestmentPortfolioFulfillmentArrangementControlOutputModel.json",new TypeReference<CRManagedInvestmentPortfolioFulfillmentArrangementControlOutputModel>(){});
	}
	
	public BQTradeInitiationExchangeOutputModel exchangeTradeinitiation(String sdReferenceId, String crReferenceId, String bqReferenceId, BQTradeInitiationExchangeInputModel request){
		return JsonReader.read("exchange-BQTradeInitiationExchangeOutputModel.json",new TypeReference<BQTradeInitiationExchangeOutputModel>(){});
	}
	
	public CRManagedInvestmentPortfolioFulfillmentArrangementExchangeOutputModel exchange(String sdReferenceId, String crReferenceId, CRManagedInvestmentPortfolioFulfillmentArrangementExchangeInputModel request){
		return JsonReader.read("exchange-CRManagedInvestmentPortfolioFulfillmentArrangementExchangeOutputModel.json",new TypeReference<CRManagedInvestmentPortfolioFulfillmentArrangementExchangeOutputModel>(){});
	}
	
	public CRManagedInvestmentPortfolioFulfillmentArrangementExecuteOutputModel execute(String sdReferenceId, String crReferenceId, CRManagedInvestmentPortfolioFulfillmentArrangementExecuteInputModel request){
		return JsonReader.read("execute-CRManagedInvestmentPortfolioFulfillmentArrangementExecuteOutputModel.json",new TypeReference<CRManagedInvestmentPortfolioFulfillmentArrangementExecuteOutputModel>(){});
	}
	
	public SDInvestmentPortfolioManagementFeedbackOutputModel feedback(String sdReferenceId, SDInvestmentPortfolioManagementFeedbackInputModel request){
		return JsonReader.read("feedback-SDInvestmentPortfolioManagementFeedbackOutputModel.json",new TypeReference<SDInvestmentPortfolioManagementFeedbackOutputModel>(){});
	}
	
	public CRManagedInvestmentPortfolioFulfillmentArrangementInitiateOutputModel initiate(String sdReferenceId, CRManagedInvestmentPortfolioFulfillmentArrangementInitiateInputModel request){
		return JsonReader.read("initiate-CRManagedInvestmentPortfolioFulfillmentArrangementInitiateOutputModel.json",new TypeReference<CRManagedInvestmentPortfolioFulfillmentArrangementInitiateOutputModel>(){});
	}
	
	public BQTradeInitiationInitiateOutputModel initiateTradeinitiation(String sdReferenceId, String crReferenceId, BQTradeInitiationInitiateInputModel request){
		return JsonReader.read("initiate-BQTradeInitiationInitiateOutputModel.json",new TypeReference<BQTradeInitiationInitiateOutputModel>(){});
	}
	
	public BQTradeInitiationRequestOutputModel requestTradeinitiation(String sdReferenceId, String crReferenceId, String bqReferenceId, BQTradeInitiationRequestInputModel request){
		return JsonReader.read("request-BQTradeInitiationRequestOutputModel.json",new TypeReference<BQTradeInitiationRequestOutputModel>(){});
	}
	
	public CRManagedInvestmentPortfolioFulfillmentArrangementRequestOutputModel request(String sdReferenceId, String crReferenceId, CRManagedInvestmentPortfolioFulfillmentArrangementRequestInputModel request){
		return JsonReader.read("request-CRManagedInvestmentPortfolioFulfillmentArrangementRequestOutputModel.json",new TypeReference<CRManagedInvestmentPortfolioFulfillmentArrangementRequestOutputModel>(){});
	}
	
	public CRManagedInvestmentPortfolioFulfillmentArrangementRetrieveOutputModel retrieve(String sdReferenceId, String crReferenceId){
		return JsonReader.read("retrieve-CRManagedInvestmentPortfolioFulfillmentArrangementRetrieveOutputModel.json",new TypeReference<CRManagedInvestmentPortfolioFulfillmentArrangementRetrieveOutputModel>(){});
	}
	
	public List<String> retrieveBQIds(String sdReferenceId, String crReferenceId, String behaviorQualifier){
		return JsonReader.read("retrieveBQIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveBQs(){
		return JsonReader.read("retrieveBQs-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveRefIds(String sdReferenceId){
		return JsonReader.read("retrieveRefIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public BQMarketOpportunityRetrieveOutputModel retrieveMarketopportunity(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQMarketOpportunityRetrieveOutputModel.json",new TypeReference<BQMarketOpportunityRetrieveOutputModel>(){});
	}
	
	public BQTrackRetrieveOutputModel retrieveTrack(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQTrackRetrieveOutputModel.json",new TypeReference<BQTrackRetrieveOutputModel>(){});
	}
	
	public BQTradeInitiationRetrieveOutputModel retrieveTradeinitiation(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQTradeInitiationRetrieveOutputModel.json",new TypeReference<BQTradeInitiationRetrieveOutputModel>(){});
	}
	
	public SDInvestmentPortfolioManagementRetrieveOutputModel retrieveSD(String sdReferenceId){
		return JsonReader.read("retrieveSD-SDInvestmentPortfolioManagementRetrieveOutputModel.json",new TypeReference<SDInvestmentPortfolioManagementRetrieveOutputModel>(){});
	}
	
	public CRManagedInvestmentPortfolioFulfillmentArrangementUpdateOutputModel update(String sdReferenceId, String crReferenceId, CRManagedInvestmentPortfolioFulfillmentArrangementUpdateInputModel request){
		return JsonReader.read("update-CRManagedInvestmentPortfolioFulfillmentArrangementUpdateOutputModel.json",new TypeReference<CRManagedInvestmentPortfolioFulfillmentArrangementUpdateOutputModel>(){});
	}
	
	public BQTradeInitiationUpdateOutputModel updateTradeinitiation(String sdReferenceId, String crReferenceId, String bqReferenceId, BQTradeInitiationUpdateInputModel request){
		return JsonReader.read("update-BQTradeInitiationUpdateOutputModel.json",new TypeReference<BQTradeInitiationUpdateOutputModel>(){});
	}
	
}
