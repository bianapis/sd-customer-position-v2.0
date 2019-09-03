package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQCashflowCaptureInputModelCaptureRecordType;
import org.bian.dto.BQCashflowCaptureInputModelCashflowInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQCashflowCaptureInputModel
 */
public class BQCashflowCaptureInputModel   {
  private String customerPositionStateInstanceReference = null;

  private String cashflowInstanceReference = null;

  private BQCashflowCaptureInputModelCashflowInstanceRecord cashflowInstanceRecord = null;

  private Object cashflowCaptureActionTaskRecord = null;

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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Cashflow instance 
   * @return cashflowInstanceReference
  **/

  public String getCashflowInstanceReference() {
    return cashflowInstanceReference;
  }

  public void setCashflowInstanceReference(String cashflowInstanceReference) {
    this.cashflowInstanceReference = cashflowInstanceReference;
  }


  /**
   * Get cashflowInstanceRecord
   * @return cashflowInstanceRecord
  **/

  public BQCashflowCaptureInputModelCashflowInstanceRecord getCashflowInstanceRecord() {
    return cashflowInstanceRecord;
  }

  public void setCashflowInstanceRecord(BQCashflowCaptureInputModelCashflowInstanceRecord cashflowInstanceRecord) {
    this.cashflowInstanceRecord = cashflowInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The capture service call consolidated processing record 
   * @return cashflowCaptureActionTaskRecord
  **/

  public Object getCashflowCaptureActionTaskRecord() {
    return cashflowCaptureActionTaskRecord;
  }

  public void setCashflowCaptureActionTaskRecord(Object cashflowCaptureActionTaskRecord) {
    this.cashflowCaptureActionTaskRecord = cashflowCaptureActionTaskRecord;
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

