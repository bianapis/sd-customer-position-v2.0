package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQCreditRetrieveOutputModelCreditInstanceAnalysis;
import org.bian.dto.BQCreditRetrieveOutputModelCreditInstanceRecord;
import org.bian.dto.BQCreditRetrieveOutputModelCreditInstanceReport;
import org.bian.dto.BQCreditRetrieveOutputModelCustomerPositionStateInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQCreditRetrieveOutputModel
 */
public class BQCreditRetrieveOutputModel   {
  private BQCreditRetrieveOutputModelCustomerPositionStateInstanceRecord customerPositionStateInstanceRecord = null;

  private BQCreditRetrieveOutputModelCreditInstanceRecord creditInstanceRecord = null;

  private String creditRetrieveActionTaskReference = null;

  private Object creditRetrieveActionTaskRecord = null;

  private String creditRetrieveActionResponse = null;

  private BQCreditRetrieveOutputModelCreditInstanceReport creditInstanceReport = null;

  private BQCreditRetrieveOutputModelCreditInstanceAnalysis creditInstanceAnalysis = null;


  /**
   * Get customerPositionStateInstanceRecord
   * @return customerPositionStateInstanceRecord
  **/

  public BQCreditRetrieveOutputModelCustomerPositionStateInstanceRecord getCustomerPositionStateInstanceRecord() {
    return customerPositionStateInstanceRecord;
  }

  public void setCustomerPositionStateInstanceRecord(BQCreditRetrieveOutputModelCustomerPositionStateInstanceRecord customerPositionStateInstanceRecord) {
    this.customerPositionStateInstanceRecord = customerPositionStateInstanceRecord;
  }


  /**
   * Get creditInstanceRecord
   * @return creditInstanceRecord
  **/

  public BQCreditRetrieveOutputModelCreditInstanceRecord getCreditInstanceRecord() {
    return creditInstanceRecord;
  }

  public void setCreditInstanceRecord(BQCreditRetrieveOutputModelCreditInstanceRecord creditInstanceRecord) {
    this.creditInstanceRecord = creditInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Credit instance retrieve service call 
   * @return creditRetrieveActionTaskReference
  **/

  public String getCreditRetrieveActionTaskReference() {
    return creditRetrieveActionTaskReference;
  }

  public void setCreditRetrieveActionTaskReference(String creditRetrieveActionTaskReference) {
    this.creditRetrieveActionTaskReference = creditRetrieveActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return creditRetrieveActionTaskRecord
  **/

  public Object getCreditRetrieveActionTaskRecord() {
    return creditRetrieveActionTaskRecord;
  }

  public void setCreditRetrieveActionTaskRecord(Object creditRetrieveActionTaskRecord) {
    this.creditRetrieveActionTaskRecord = creditRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return creditRetrieveActionResponse
  **/

  public String getCreditRetrieveActionResponse() {
    return creditRetrieveActionResponse;
  }

  public void setCreditRetrieveActionResponse(String creditRetrieveActionResponse) {
    this.creditRetrieveActionResponse = creditRetrieveActionResponse;
  }


  /**
   * Get creditInstanceReport
   * @return creditInstanceReport
  **/

  public BQCreditRetrieveOutputModelCreditInstanceReport getCreditInstanceReport() {
    return creditInstanceReport;
  }

  public void setCreditInstanceReport(BQCreditRetrieveOutputModelCreditInstanceReport creditInstanceReport) {
    this.creditInstanceReport = creditInstanceReport;
  }


  /**
   * Get creditInstanceAnalysis
   * @return creditInstanceAnalysis
  **/

  public BQCreditRetrieveOutputModelCreditInstanceAnalysis getCreditInstanceAnalysis() {
    return creditInstanceAnalysis;
  }

  public void setCreditInstanceAnalysis(BQCreditRetrieveOutputModelCreditInstanceAnalysis creditInstanceAnalysis) {
    this.creditInstanceAnalysis = creditInstanceAnalysis;
  }


}

