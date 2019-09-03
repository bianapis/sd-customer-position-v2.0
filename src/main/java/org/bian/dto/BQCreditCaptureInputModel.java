package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQCashflowCaptureInputModelCaptureRecordType;
import org.bian.dto.BQCreditCaptureInputModelCreditInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQCreditCaptureInputModel
 */
public class BQCreditCaptureInputModel   {
  private String customerPositionStateInstanceReference = null;

  private String creditInstanceReference = null;

  private BQCreditCaptureInputModelCreditInstanceRecord creditInstanceRecord = null;

  private Object creditCaptureActionTaskRecord = null;

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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Credit instance 
   * @return creditInstanceReference
  **/

  public String getCreditInstanceReference() {
    return creditInstanceReference;
  }

  public void setCreditInstanceReference(String creditInstanceReference) {
    this.creditInstanceReference = creditInstanceReference;
  }


  /**
   * Get creditInstanceRecord
   * @return creditInstanceRecord
  **/

  public BQCreditCaptureInputModelCreditInstanceRecord getCreditInstanceRecord() {
    return creditInstanceRecord;
  }

  public void setCreditInstanceRecord(BQCreditCaptureInputModelCreditInstanceRecord creditInstanceRecord) {
    this.creditInstanceRecord = creditInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The capture service call consolidated processing record 
   * @return creditCaptureActionTaskRecord
  **/

  public Object getCreditCaptureActionTaskRecord() {
    return creditCaptureActionTaskRecord;
  }

  public void setCreditCaptureActionTaskRecord(Object creditCaptureActionTaskRecord) {
    this.creditCaptureActionTaskRecord = creditCaptureActionTaskRecord;
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

