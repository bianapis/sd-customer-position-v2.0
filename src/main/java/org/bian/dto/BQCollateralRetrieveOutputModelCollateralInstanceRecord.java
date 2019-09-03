package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQCollateralRetrieveOutputModelCollateralInstanceRecordCollateralAssetAllocationInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQCollateralRetrieveOutputModelCollateralInstanceRecord
 */
public class BQCollateralRetrieveOutputModelCollateralInstanceRecord   {
  private BQCollateralRetrieveOutputModelCollateralInstanceRecordCollateralAssetAllocationInstanceRecord collateralAssetAllocationInstanceRecord = null;

  private Object customerCollateralPositionAnalysisRecord = null;


  /**
   * Get collateralAssetAllocationInstanceRecord
   * @return collateralAssetAllocationInstanceRecord
  **/

  public BQCollateralRetrieveOutputModelCollateralInstanceRecordCollateralAssetAllocationInstanceRecord getCollateralAssetAllocationInstanceRecord() {
    return collateralAssetAllocationInstanceRecord;
  }

  public void setCollateralAssetAllocationInstanceRecord(BQCollateralRetrieveOutputModelCollateralInstanceRecordCollateralAssetAllocationInstanceRecord collateralAssetAllocationInstanceRecord) {
    this.collateralAssetAllocationInstanceRecord = collateralAssetAllocationInstanceRecord;
  }


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

