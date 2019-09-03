package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQCashflowCaptureOutputModelCashflowInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQCashflowCaptureOutputModel
 */
public class BQCashflowCaptureOutputModel   {
  private BQCashflowCaptureOutputModelCashflowInstanceRecord cashflowInstanceRecord = null;

  private String cashflowCaptureActionTaskReference = null;

  private Object cashflowCaptureActionTaskRecord = null;

  private String cashflowCaptureRecordReference = null;

  private Object captureResponseRecord = null;


  /**
   * Get cashflowInstanceRecord
   * @return cashflowInstanceRecord
  **/

  public BQCashflowCaptureOutputModelCashflowInstanceRecord getCashflowInstanceRecord() {
    return cashflowInstanceRecord;
  }

  public void setCashflowInstanceRecord(BQCashflowCaptureOutputModelCashflowInstanceRecord cashflowInstanceRecord) {
    this.cashflowInstanceRecord = cashflowInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Cashflow instance capture service call 
   * @return cashflowCaptureActionTaskReference
  **/

  public String getCashflowCaptureActionTaskReference() {
    return cashflowCaptureActionTaskReference;
  }

  public void setCashflowCaptureActionTaskReference(String cashflowCaptureActionTaskReference) {
    this.cashflowCaptureActionTaskReference = cashflowCaptureActionTaskReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Cashflow structured input transaction/record 
   * @return cashflowCaptureRecordReference
  **/

  public String getCashflowCaptureRecordReference() {
    return cashflowCaptureRecordReference;
  }

  public void setCashflowCaptureRecordReference(String cashflowCaptureRecordReference) {
    this.cashflowCaptureRecordReference = cashflowCaptureRecordReference;
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

