/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.bian.dto.*;

public interface CustomerPositionApiService {

	SDCustomerPositionActivateOutputModel activate(SDCustomerPositionActivateInputModel request);
	
	BQCashflowCaptureOutputModel captureCashflow(String sdReferenceId, String crReferenceId, String bqReferenceId, BQCashflowCaptureInputModel request);
	
	BQCollateralCaptureOutputModel captureCollateral(String sdReferenceId, String crReferenceId, String bqReferenceId, BQCollateralCaptureInputModel request);
	
	BQCreditCaptureOutputModel captureCredit(String sdReferenceId, String crReferenceId, String bqReferenceId, BQCreditCaptureInputModel request);
	
	SDCustomerPositionConfigureOutputModel configure(String sdReferenceId, SDCustomerPositionConfigureInputModel request);
	
	CRCustomerPositionStateControlOutputModel control(String sdReferenceId, String crReferenceId, CRCustomerPositionStateControlInputModel request);
	
	BQCashflowExchangeOutputModel exchangeCashflow(String sdReferenceId, String crReferenceId, String bqReferenceId, BQCashflowExchangeInputModel request);
	
	BQCollateralExchangeOutputModel exchangeCollateral(String sdReferenceId, String crReferenceId, String bqReferenceId, BQCollateralExchangeInputModel request);
	
	BQCreditExchangeOutputModel exchangeCredit(String sdReferenceId, String crReferenceId, String bqReferenceId, BQCreditExchangeInputModel request);
	
	CRCustomerPositionStateExecuteOutputModel execute(String sdReferenceId, String crReferenceId, CRCustomerPositionStateExecuteInputModel request);
	
	SDCustomerPositionFeedbackOutputModel feedback(String sdReferenceId, SDCustomerPositionFeedbackInputModel request);
	
	CRCustomerPositionStateInitiateOutputModel initiate(String sdReferenceId, CRCustomerPositionStateInitiateInputModel request);
	
	CRCustomerPositionStateRequestOutputModel request(String sdReferenceId, String crReferenceId, CRCustomerPositionStateRequestInputModel request);
	
	CRCustomerPositionStateRetrieveOutputModel retrieve(String sdReferenceId, String crReferenceId);
	
	List<String> retrieveBQIds(String sdReferenceId, String crReferenceId, String behaviorQualifier);
	
	List<String> retrieveBQs();
	
	List<String> retrieveRefIds(String sdReferenceId);
	
	BQCashflowRetrieveOutputModel retrieveCashflow(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	BQCollateralRetrieveOutputModel retrieveCollateral(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	BQCreditRetrieveOutputModel retrieveCredit(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	SDCustomerPositionRetrieveOutputModel retrieveSD(String sdReferenceId);
	
	CRCustomerPositionStateUpdateOutputModel update(String sdReferenceId, String crReferenceId, CRCustomerPositionStateUpdateInputModel request);
	
}
