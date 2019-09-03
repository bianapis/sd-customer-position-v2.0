package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQCollateralCaptureInputModelCollateralInstanceRecordCollateralAssetAllocationInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQCollateralCaptureInputModelCollateralInstanceRecord
 */
public class BQCollateralCaptureInputModelCollateralInstanceRecord   {
  private BQCollateralCaptureInputModelCollateralInstanceRecordCollateralAssetAllocationInstanceRecord collateralAssetAllocationInstanceRecord = null;


  /**
   * Get collateralAssetAllocationInstanceRecord
   * @return collateralAssetAllocationInstanceRecord
  **/

  public BQCollateralCaptureInputModelCollateralInstanceRecordCollateralAssetAllocationInstanceRecord getCollateralAssetAllocationInstanceRecord() {
    return collateralAssetAllocationInstanceRecord;
  }

  public void setCollateralAssetAllocationInstanceRecord(BQCollateralCaptureInputModelCollateralInstanceRecordCollateralAssetAllocationInstanceRecord collateralAssetAllocationInstanceRecord) {
    this.collateralAssetAllocationInstanceRecord = collateralAssetAllocationInstanceRecord;
  }


}

