package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCustomerPositionStateRetrieveInputModelCustomerPositionStateInstanceAnalysis;
import org.bian.dto.CRCustomerPositionStateRetrieveInputModelCustomerPositionStateInstanceReportRecord;

import javax.validation.Valid;
  
/**
 * CRCustomerPositionStateRetrieveInputModel
 */
public class CRCustomerPositionStateRetrieveInputModel   {
  private Object customerPositionStateRetrieveActionTaskRecord = null;

  private String customerPositionStateRetrieveActionRequest = null;

  private CRCustomerPositionStateRetrieveInputModelCustomerPositionStateInstanceReportRecord customerPositionStateInstanceReportRecord = null;

  private CRCustomerPositionStateRetrieveInputModelCustomerPositionStateInstanceAnalysis customerPositionStateInstanceAnalysis = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return customerPositionStateRetrieveActionRequest
  **/

  public String getCustomerPositionStateRetrieveActionRequest() {
    return customerPositionStateRetrieveActionRequest;
  }

  public void setCustomerPositionStateRetrieveActionRequest(String customerPositionStateRetrieveActionRequest) {
    this.customerPositionStateRetrieveActionRequest = customerPositionStateRetrieveActionRequest;
  }


  /**
   * Get customerPositionStateInstanceReportRecord
   * @return customerPositionStateInstanceReportRecord
  **/

  public CRCustomerPositionStateRetrieveInputModelCustomerPositionStateInstanceReportRecord getCustomerPositionStateInstanceReportRecord() {
    return customerPositionStateInstanceReportRecord;
  }

  public void setCustomerPositionStateInstanceReportRecord(CRCustomerPositionStateRetrieveInputModelCustomerPositionStateInstanceReportRecord customerPositionStateInstanceReportRecord) {
    this.customerPositionStateInstanceReportRecord = customerPositionStateInstanceReportRecord;
  }


  /**
   * Get customerPositionStateInstanceAnalysis
   * @return customerPositionStateInstanceAnalysis
  **/

  public CRCustomerPositionStateRetrieveInputModelCustomerPositionStateInstanceAnalysis getCustomerPositionStateInstanceAnalysis() {
    return customerPositionStateInstanceAnalysis;
  }

  public void setCustomerPositionStateInstanceAnalysis(CRCustomerPositionStateRetrieveInputModelCustomerPositionStateInstanceAnalysis customerPositionStateInstanceAnalysis) {
    this.customerPositionStateInstanceAnalysis = customerPositionStateInstanceAnalysis;
  }


}

