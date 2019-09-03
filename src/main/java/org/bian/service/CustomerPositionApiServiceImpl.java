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
public class CustomerPositionApiServiceImpl implements CustomerPositionApiService {

	public SDCustomerPositionActivateOutputModel activate(SDCustomerPositionActivateInputModel request){
		return JsonReader.read("activate-SDCustomerPositionActivateOutputModel.json",new TypeReference<SDCustomerPositionActivateOutputModel>(){});
	}
	
	public BQCashflowCaptureOutputModel captureCashflow(String sdReferenceId, String crReferenceId, String bqReferenceId, BQCashflowCaptureInputModel request){
		return JsonReader.read("capture-BQCashflowCaptureOutputModel.json",new TypeReference<BQCashflowCaptureOutputModel>(){});
	}
	
	public BQCollateralCaptureOutputModel captureCollateral(String sdReferenceId, String crReferenceId, String bqReferenceId, BQCollateralCaptureInputModel request){
		return JsonReader.read("capture-BQCollateralCaptureOutputModel.json",new TypeReference<BQCollateralCaptureOutputModel>(){});
	}
	
	public BQCreditCaptureOutputModel captureCredit(String sdReferenceId, String crReferenceId, String bqReferenceId, BQCreditCaptureInputModel request){
		return JsonReader.read("capture-BQCreditCaptureOutputModel.json",new TypeReference<BQCreditCaptureOutputModel>(){});
	}
	
	public SDCustomerPositionConfigureOutputModel configure(String sdReferenceId, SDCustomerPositionConfigureInputModel request){
		return JsonReader.read("configure-SDCustomerPositionConfigureOutputModel.json",new TypeReference<SDCustomerPositionConfigureOutputModel>(){});
	}
	
	public CRCustomerPositionStateControlOutputModel control(String sdReferenceId, String crReferenceId, CRCustomerPositionStateControlInputModel request){
		return JsonReader.read("control-CRCustomerPositionStateControlOutputModel.json",new TypeReference<CRCustomerPositionStateControlOutputModel>(){});
	}
	
	public BQCashflowExchangeOutputModel exchangeCashflow(String sdReferenceId, String crReferenceId, String bqReferenceId, BQCashflowExchangeInputModel request){
		return JsonReader.read("exchange-BQCashflowExchangeOutputModel.json",new TypeReference<BQCashflowExchangeOutputModel>(){});
	}
	
	public BQCollateralExchangeOutputModel exchangeCollateral(String sdReferenceId, String crReferenceId, String bqReferenceId, BQCollateralExchangeInputModel request){
		return JsonReader.read("exchange-BQCollateralExchangeOutputModel.json",new TypeReference<BQCollateralExchangeOutputModel>(){});
	}
	
	public BQCreditExchangeOutputModel exchangeCredit(String sdReferenceId, String crReferenceId, String bqReferenceId, BQCreditExchangeInputModel request){
		return JsonReader.read("exchange-BQCreditExchangeOutputModel.json",new TypeReference<BQCreditExchangeOutputModel>(){});
	}
	
	public CRCustomerPositionStateExecuteOutputModel execute(String sdReferenceId, String crReferenceId, CRCustomerPositionStateExecuteInputModel request){
		return JsonReader.read("execute-CRCustomerPositionStateExecuteOutputModel.json",new TypeReference<CRCustomerPositionStateExecuteOutputModel>(){});
	}
	
	public SDCustomerPositionFeedbackOutputModel feedback(String sdReferenceId, SDCustomerPositionFeedbackInputModel request){
		return JsonReader.read("feedback-SDCustomerPositionFeedbackOutputModel.json",new TypeReference<SDCustomerPositionFeedbackOutputModel>(){});
	}
	
	public CRCustomerPositionStateInitiateOutputModel initiate(String sdReferenceId, CRCustomerPositionStateInitiateInputModel request){
		return JsonReader.read("initiate-CRCustomerPositionStateInitiateOutputModel.json",new TypeReference<CRCustomerPositionStateInitiateOutputModel>(){});
	}
	
	public CRCustomerPositionStateRequestOutputModel request(String sdReferenceId, String crReferenceId, CRCustomerPositionStateRequestInputModel request){
		return JsonReader.read("request-CRCustomerPositionStateRequestOutputModel.json",new TypeReference<CRCustomerPositionStateRequestOutputModel>(){});
	}
	
	public CRCustomerPositionStateRetrieveOutputModel retrieve(String sdReferenceId, String crReferenceId){
		return JsonReader.read("retrieve-CRCustomerPositionStateRetrieveOutputModel.json",new TypeReference<CRCustomerPositionStateRetrieveOutputModel>(){});
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
	
	public BQCashflowRetrieveOutputModel retrieveCashflow(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQCashflowRetrieveOutputModel.json",new TypeReference<BQCashflowRetrieveOutputModel>(){});
	}
	
	public BQCollateralRetrieveOutputModel retrieveCollateral(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQCollateralRetrieveOutputModel.json",new TypeReference<BQCollateralRetrieveOutputModel>(){});
	}
	
	public BQCreditRetrieveOutputModel retrieveCredit(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQCreditRetrieveOutputModel.json",new TypeReference<BQCreditRetrieveOutputModel>(){});
	}
	
	public SDCustomerPositionRetrieveOutputModel retrieveSD(String sdReferenceId){
		return JsonReader.read("retrieveSD-SDCustomerPositionRetrieveOutputModel.json",new TypeReference<SDCustomerPositionRetrieveOutputModel>(){});
	}
	
	public CRCustomerPositionStateUpdateOutputModel update(String sdReferenceId, String crReferenceId, CRCustomerPositionStateUpdateInputModel request){
		return JsonReader.read("update-CRCustomerPositionStateUpdateOutputModel.json",new TypeReference<CRCustomerPositionStateUpdateOutputModel>(){});
	}
	
}
