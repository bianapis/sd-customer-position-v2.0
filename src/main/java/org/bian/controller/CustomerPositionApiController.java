/**
 * @author Virtusa
 */
package org.bian.controller;

import java.util.List;
import org.bian.annotation.BianRestController;
import org.bian.annotation.BQ;
import org.bian.dto.BianRequest;
import org.bian.dto.BianResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.bian.dto.*;
import org.bian.service.*;
import org.bian.annotation.functionalpattern.Monitor;

@BianRestController
public class CustomerPositionApiController {

	@Autowired
	CustomerPositionApiService service;
	
	@Monitor.Activate
	public BianResponse<SDCustomerPositionActivateOutputModel> activate(@RequestBody BianRequest<SDCustomerPositionActivateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.activate(bianRequest.getData()));
	}
	
	@BQ("cashflow")
	@Monitor.Capture
	public BianResponse<BQCashflowCaptureOutputModel> captureCashflow(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQCashflowCaptureInputModel> bianRequest) {
		return BianResponse.forSuccess(service.captureCashflow(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("collateral")
	@Monitor.Capture
	public BianResponse<BQCollateralCaptureOutputModel> captureCollateral(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQCollateralCaptureInputModel> bianRequest) {
		return BianResponse.forSuccess(service.captureCollateral(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("credit")
	@Monitor.Capture
	public BianResponse<BQCreditCaptureOutputModel> captureCredit(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQCreditCaptureInputModel> bianRequest) {
		return BianResponse.forSuccess(service.captureCredit(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@Monitor.Configure
	public BianResponse<SDCustomerPositionConfigureOutputModel> configure(@PathVariable("sd-reference-id") String sdReferenceId, @RequestBody BianRequest<SDCustomerPositionConfigureInputModel> bianRequest) {
		return BianResponse.forSuccess(service.configure(sdReferenceId, bianRequest.getData()));
	}
	
	@Monitor.Control
	public BianResponse<CRCustomerPositionStateControlOutputModel> control(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRCustomerPositionStateControlInputModel> bianRequest) {
		return BianResponse.forSuccess(service.control(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@BQ("cashflow")
	@Monitor.Exchange
	public BianResponse<BQCashflowExchangeOutputModel> exchangeCashflow(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQCashflowExchangeInputModel> bianRequest) {
		return BianResponse.forSuccess(service.exchangeCashflow(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("collateral")
	@Monitor.Exchange
	public BianResponse<BQCollateralExchangeOutputModel> exchangeCollateral(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQCollateralExchangeInputModel> bianRequest) {
		return BianResponse.forSuccess(service.exchangeCollateral(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("credit")
	@Monitor.Exchange
	public BianResponse<BQCreditExchangeOutputModel> exchangeCredit(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQCreditExchangeInputModel> bianRequest) {
		return BianResponse.forSuccess(service.exchangeCredit(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@Monitor.Execute
	public BianResponse<CRCustomerPositionStateExecuteOutputModel> execute(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRCustomerPositionStateExecuteInputModel> bianRequest) {
		return BianResponse.forSuccess(service.execute(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@Monitor.Feedback
	public BianResponse<SDCustomerPositionFeedbackOutputModel> feedback(@PathVariable("sd-reference-id") String sdReferenceId, @RequestBody BianRequest<SDCustomerPositionFeedbackInputModel> bianRequest) {
		return BianResponse.forSuccess(service.feedback(sdReferenceId, bianRequest.getData()));
	}
	
	@Monitor.Initiate
	public BianResponse<CRCustomerPositionStateInitiateOutputModel> initiate(@PathVariable("sd-reference-id") String sdReferenceId, @RequestBody BianRequest<CRCustomerPositionStateInitiateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.initiate(sdReferenceId, bianRequest.getData()));
	}
	
	@Monitor.Request
	public BianResponse<CRCustomerPositionStateRequestOutputModel> request(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRCustomerPositionStateRequestInputModel> bianRequest) {
		return BianResponse.forSuccess(service.request(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@Monitor.Retrieve
	public BianResponse<CRCustomerPositionStateRetrieveOutputModel> retrieve(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId) {
		return BianResponse.forSuccess(service.retrieve(sdReferenceId, crReferenceId));
	}
	
	@Monitor.RetrieveBQIds
	public BianResponse<List<String>> retrieveBQIds(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("behavior-qualifier") String behaviorQualifier) {
		return BianResponse.forSuccess(service.retrieveBQIds(sdReferenceId, crReferenceId, behaviorQualifier));
	}
	
	@Monitor.RetrieveBQs
	public BianResponse<List<String>> retrieveBQs() {
		return BianResponse.forSuccess(service.retrieveBQs());
	}
	
	@Monitor.RetrieveRefIds
	public BianResponse<List<String>> retrieveRefIds(@PathVariable("sd-reference-id") String sdReferenceId) {
		return BianResponse.forSuccess(service.retrieveRefIds(sdReferenceId));
	}
	
	@BQ("cashflow")
	@Monitor.Retrieve
	public BianResponse<BQCashflowRetrieveOutputModel> retrieveCashflow(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveCashflow(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@BQ("collateral")
	@Monitor.Retrieve
	public BianResponse<BQCollateralRetrieveOutputModel> retrieveCollateral(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveCollateral(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@BQ("credit")
	@Monitor.Retrieve
	public BianResponse<BQCreditRetrieveOutputModel> retrieveCredit(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveCredit(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@Monitor.RetrieveSD
	public BianResponse<SDCustomerPositionRetrieveOutputModel> retrieveSD(@PathVariable("sd-reference-id") String sdReferenceId) {
		return BianResponse.forSuccess(service.retrieveSD(sdReferenceId));
	}
	
	@Monitor.Update
	public BianResponse<CRCustomerPositionStateUpdateOutputModel> update(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRCustomerPositionStateUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.update(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
}
