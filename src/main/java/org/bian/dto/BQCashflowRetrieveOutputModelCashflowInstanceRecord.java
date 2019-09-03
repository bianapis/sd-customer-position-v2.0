package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQCashflowCaptureInputModelCashflowInstanceRecordProductInstanceReference;

import javax.validation.Valid;
  
/**
 * BQCashflowRetrieveOutputModelCashflowInstanceRecord
 */
public class BQCashflowRetrieveOutputModelCashflowInstanceRecord   {
  private BQCashflowCaptureInputModelCashflowInstanceRecordProductInstanceReference productInstanceReference = null;

  private Object customerCashflowPositionAnalysisRecord = null;


  /**
   * Get productInstanceReference
   * @return productInstanceReference
  **/

  public BQCashflowCaptureInputModelCashflowInstanceRecordProductInstanceReference getProductInstanceReference() {
    return productInstanceReference;
  }

  public void setProductInstanceReference(BQCashflowCaptureInputModelCashflowInstanceRecordProductInstanceReference productInstanceReference) {
    this.productInstanceReference = productInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The customer cashflow analysis - past, current position and projected cash flows as derived from all active product/service activity reports  
   * @return customerCashflowPositionAnalysisRecord
  **/

  public Object getCustomerCashflowPositionAnalysisRecord() {
    return customerCashflowPositionAnalysisRecord;
  }

  public void setCustomerCashflowPositionAnalysisRecord(Object customerCashflowPositionAnalysisRecord) {
    this.customerCashflowPositionAnalysisRecord = customerCashflowPositionAnalysisRecord;
  }


}

