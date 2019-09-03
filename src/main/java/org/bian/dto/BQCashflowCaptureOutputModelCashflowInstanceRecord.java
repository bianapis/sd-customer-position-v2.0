package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQCashflowCaptureOutputModelCashflowInstanceRecord
 */
public class BQCashflowCaptureOutputModelCashflowInstanceRecord   {
  private Object customerCashflowPositionAnalysisRecord = null;


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

