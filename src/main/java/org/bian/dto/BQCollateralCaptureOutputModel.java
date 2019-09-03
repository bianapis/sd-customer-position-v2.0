package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQCollateralCaptureOutputModelCollateralInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQCollateralCaptureOutputModel
 */
public class BQCollateralCaptureOutputModel   {
  private BQCollateralCaptureOutputModelCollateralInstanceRecord collateralInstanceRecord = null;

  private String collateralCaptureActionTaskReference = null;

  private Object collateralCaptureActionTaskRecord = null;

  private String collateralCaptureRecordReference = null;

  private Object captureResponseRecord = null;


  /**
   * Get collateralInstanceRecord
   * @return collateralInstanceRecord
  **/

  public BQCollateralCaptureOutputModelCollateralInstanceRecord getCollateralInstanceRecord() {
    return collateralInstanceRecord;
  }

  public void setCollateralInstanceRecord(BQCollateralCaptureOutputModelCollateralInstanceRecord collateralInstanceRecord) {
    this.collateralInstanceRecord = collateralInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Collateral instance capture service call 
   * @return collateralCaptureActionTaskReference
  **/

  public String getCollateralCaptureActionTaskReference() {
    return collateralCaptureActionTaskReference;
  }

  public void setCollateralCaptureActionTaskReference(String collateralCaptureActionTaskReference) {
    this.collateralCaptureActionTaskReference = collateralCaptureActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The capture service call consolidated processing record 
   * @return collateralCaptureActionTaskRecord
  **/

  public Object getCollateralCaptureActionTaskRecord() {
    return collateralCaptureActionTaskRecord;
  }

  public void setCollateralCaptureActionTaskRecord(Object collateralCaptureActionTaskRecord) {
    this.collateralCaptureActionTaskRecord = collateralCaptureActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Collateral structured input transaction/record 
   * @return collateralCaptureRecordReference
  **/

  public String getCollateralCaptureRecordReference() {
    return collateralCaptureRecordReference;
  }

  public void setCollateralCaptureRecordReference(String collateralCaptureRecordReference) {
    this.collateralCaptureRecordReference = collateralCaptureRecordReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the capture action service response 
   * @return captureResponseRecord
  **/

  public Object getCaptureResponseRecord() {
    return captureResponseRecord;
  }

  public void setCaptureResponseRecord(Object captureResponseRecord) {
    this.captureResponseRecord = captureResponseRecord;
  }


}

