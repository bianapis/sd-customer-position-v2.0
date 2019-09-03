package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCustomerPositionStateRetrieveOutputModelCustomerPositionStateInstanceAnalysis;
import org.bian.dto.CRCustomerPositionStateRetrieveOutputModelCustomerPositionStateInstanceRecord;
import org.bian.dto.CRCustomerPositionStateRetrieveOutputModelCustomerPositionStateInstanceReportRecord;

import javax.validation.Valid;
  
/**
 * CRCustomerPositionStateRetrieveOutputModel
 */
public class CRCustomerPositionStateRetrieveOutputModel   {
  private CRCustomerPositionStateRetrieveOutputModelCustomerPositionStateInstanceRecord customerPositionStateInstanceRecord = null;

  private String customerPositionStateRetrieveActionTaskReference = null;

  private Object customerPositionStateRetrieveActionTaskRecord = null;

  private String customerPositionStateRetrieveActionResponse = null;

  private CRCustomerPositionStateRetrieveOutputModelCustomerPositionStateInstanceReportRecord customerPositionStateInstanceReportRecord = null;

  private CRCustomerPositionStateRetrieveOutputModelCustomerPositionStateInstanceAnalysis customerPositionStateInstanceAnalysis = null;


  /**
   * Get customerPositionStateInstanceRecord
   * @return customerPositionStateInstanceRecord
  **/

  public CRCustomerPositionStateRetrieveOutputModelCustomerPositionStateInstanceRecord getCustomerPositionStateInstanceRecord() {
    return customerPositionStateInstanceRecord;
  }

  public void setCustomerPositionStateInstanceRecord(CRCustomerPositionStateRetrieveOutputModelCustomerPositionStateInstanceRecord customerPositionStateInstanceRecord) {
    this.customerPositionStateInstanceRecord = customerPositionStateInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Customer Position State instance retrieve service call 
   * @return customerPositionStateRetrieveActionTaskReference
  **/

  public String getCustomerPositionStateRetrieveActionTaskReference() {
    return customerPositionStateRetrieveActionTaskReference;
  }

  public void setCustomerPositionStateRetrieveActionTaskReference(String customerPositionStateRetrieveActionTaskReference) {
    this.customerPositionStateRetrieveActionTaskReference = customerPositionStateRetrieveActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return customerPositionStateRetrieveActionTaskRecord
  **/

  public Object getCustomerPositionStateRetrieveActionTaskRecord() {
    return customerPositionStateRetrieveActionTaskRecord;
  }

  public void setCustomerPositionStateRetrieveActionTaskRecord(Object customerPositionStateRetrieveActionTaskRecord) {
    this.customerPositionStateRetrieveActionTaskRecord = customerPositionStateRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return customerPositionStateRetrieveActionResponse
  **/

  public String getCustomerPositionStateRetrieveActionResponse() {
    return customerPositionStateRetrieveActionResponse;
  }

  public void setCustomerPositionStateRetrieveActionResponse(String customerPositionStateRetrieveActionResponse) {
    this.customerPositionStateRetrieveActionResponse = customerPositionStateRetrieveActionResponse;
  }


  /**
   * Get customerPositionStateInstanceReportRecord
   * @return customerPositionStateInstanceReportRecord
  **/

  public CRCustomerPositionStateRetrieveOutputModelCustomerPositionStateInstanceReportRecord getCustomerPositionStateInstanceReportRecord() {
    return customerPositionStateInstanceReportRecord;
  }

  public void setCustomerPositionStateInstanceReportRecord(CRCustomerPositionStateRetrieveOutputModelCustomerPositionStateInstanceReportRecord customerPositionStateInstanceReportRecord) {
    this.customerPositionStateInstanceReportRecord = customerPositionStateInstanceReportRecord;
  }


  /**
   * Get customerPositionStateInstanceAnalysis
   * @return customerPositionStateInstanceAnalysis
  **/

  public CRCustomerPositionStateRetrieveOutputModelCustomerPositionStateInstanceAnalysis getCustomerPositionStateInstanceAnalysis() {
    return customerPositionStateInstanceAnalysis;
  }

  public void setCustomerPositionStateInstanceAnalysis(CRCustomerPositionStateRetrieveOutputModelCustomerPositionStateInstanceAnalysis customerPositionStateInstanceAnalysis) {
    this.customerPositionStateInstanceAnalysis = customerPositionStateInstanceAnalysis;
  }


}

