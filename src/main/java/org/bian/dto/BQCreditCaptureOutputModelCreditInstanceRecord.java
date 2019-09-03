package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQCreditCaptureOutputModelCreditInstanceRecord
 */
public class BQCreditCaptureOutputModelCreditInstanceRecord   {
  private Object customerCreditPositionAnalysisRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The customer credit position analysis - combines credit assessment with product/service available balance/utilized credit position analysis  
   * @return customerCreditPositionAnalysisRecord
  **/

  public Object getCustomerCreditPositionAnalysisRecord() {
    return customerCreditPositionAnalysisRecord;
  }

  public void setCustomerCreditPositionAnalysisRecord(Object customerCreditPositionAnalysisRecord) {
    this.customerCreditPositionAnalysisRecord = customerCreditPositionAnalysisRecord;
  }


}

