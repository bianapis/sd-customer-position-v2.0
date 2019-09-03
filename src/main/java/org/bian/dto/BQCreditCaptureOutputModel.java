package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQCreditCaptureOutputModelCreditInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQCreditCaptureOutputModel
 */
public class BQCreditCaptureOutputModel   {
  private BQCreditCaptureOutputModelCreditInstanceRecord creditInstanceRecord = null;

  private String creditCaptureActionTaskReference = null;

  private Object creditCaptureActionTaskRecord = null;

  private String creditCaptureRecordReference = null;

  private Object captureResponseRecord = null;


  /**
   * Get creditInstanceRecord
   * @return creditInstanceRecord
  **/

  public BQCreditCaptureOutputModelCreditInstanceRecord getCreditInstanceRecord() {
    return creditInstanceRecord;
  }

  public void setCreditInstanceRecord(BQCreditCaptureOutputModelCreditInstanceRecord creditInstanceRecord) {
    this.creditInstanceRecord = creditInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Credit instance capture service call 
   * @return creditCaptureActionTaskReference
  **/

  public String getCreditCaptureActionTaskReference() {
    return creditCaptureActionTaskReference;
  }

  public void setCreditCaptureActionTaskReference(String creditCaptureActionTaskReference) {
    this.creditCaptureActionTaskReference = creditCaptureActionTaskReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Credit structured input transaction/record 
   * @return creditCaptureRecordReference
  **/

  public String getCreditCaptureRecordReference() {
    return creditCaptureRecordReference;
  }

  public void setCreditCaptureRecordReference(String creditCaptureRecordReference) {
    this.creditCaptureRecordReference = creditCaptureRecordReference;
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

