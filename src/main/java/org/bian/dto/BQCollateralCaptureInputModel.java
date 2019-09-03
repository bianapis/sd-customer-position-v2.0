package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQCashflowCaptureInputModelCaptureRecordType;
import org.bian.dto.BQCollateralCaptureInputModelCollateralInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQCollateralCaptureInputModel
 */
public class BQCollateralCaptureInputModel   {
  private String customerPositionStateInstanceReference = null;

  private String collateralInstanceReference = null;

  private BQCollateralCaptureInputModelCollateralInstanceRecord collateralInstanceRecord = null;

  private Object collateralCaptureActionTaskRecord = null;

  private BQCashflowCaptureInputModelCaptureRecordType captureRecordType = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the parent Customer Position State instance 
   * @return customerPositionStateInstanceReference
  **/

  public String getCustomerPositionStateInstanceReference() {
    return customerPositionStateInstanceReference;
  }

  public void setCustomerPositionStateInstanceReference(String customerPositionStateInstanceReference) {
    this.customerPositionStateInstanceReference = customerPositionStateInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Collateral instance 
   * @return collateralInstanceReference
  **/

  public String getCollateralInstanceReference() {
    return collateralInstanceReference;
  }

  public void setCollateralInstanceReference(String collateralInstanceReference) {
    this.collateralInstanceReference = collateralInstanceReference;
  }


  /**
   * Get collateralInstanceRecord
   * @return collateralInstanceRecord
  **/

  public BQCollateralCaptureInputModelCollateralInstanceRecord getCollateralInstanceRecord() {
    return collateralInstanceRecord;
  }

  public void setCollateralInstanceRecord(BQCollateralCaptureInputModelCollateralInstanceRecord collateralInstanceRecord) {
    this.collateralInstanceRecord = collateralInstanceRecord;
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
   * Get captureRecordType
   * @return captureRecordType
  **/

  public BQCashflowCaptureInputModelCaptureRecordType getCaptureRecordType() {
    return captureRecordType;
  }

  public void setCaptureRecordType(BQCashflowCaptureInputModelCaptureRecordType captureRecordType) {
    this.captureRecordType = captureRecordType;
  }


}

