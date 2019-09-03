package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQCollateralCaptureOutputModelCollateralInstanceRecord
 */
public class BQCollateralCaptureOutputModelCollateralInstanceRecord   {
  private Object customerCollateralPositionAnalysisRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The customer collateral position analysis - combines collateral valuation, allocation and associated product utilization) 
   * @return customerCollateralPositionAnalysisRecord
  **/

  public Object getCustomerCollateralPositionAnalysisRecord() {
    return customerCollateralPositionAnalysisRecord;
  }

  public void setCustomerCollateralPositionAnalysisRecord(Object customerCollateralPositionAnalysisRecord) {
    this.customerCollateralPositionAnalysisRecord = customerCollateralPositionAnalysisRecord;
  }


}

