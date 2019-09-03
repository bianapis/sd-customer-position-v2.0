package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCustomerPositionStateRequestInputModelCustomerPositionStateInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRCustomerPositionStateRequestOutputModel
 */
public class CRCustomerPositionStateRequestOutputModel   {
  private CRCustomerPositionStateRequestInputModelCustomerPositionStateInstanceRecord customerPositionStateInstanceRecord = null;

  private String customerPositionStateRequestActionTaskReference = null;

  private Object customerPositionStateRequestActionTaskRecord = null;

  private String requestRecordReference = null;

  private Object requestResponseRecord = null;


  /**
   * Get customerPositionStateInstanceRecord
   * @return customerPositionStateInstanceRecord
  **/

  public CRCustomerPositionStateRequestInputModelCustomerPositionStateInstanceRecord getCustomerPositionStateInstanceRecord() {
    return customerPositionStateInstanceRecord;
  }

  public void setCustomerPositionStateInstanceRecord(CRCustomerPositionStateRequestInputModelCustomerPositionStateInstanceRecord customerPositionStateInstanceRecord) {
    this.customerPositionStateInstanceRecord = customerPositionStateInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Customer Position State instance request service call 
   * @return customerPositionStateRequestActionTaskReference
  **/

  public String getCustomerPositionStateRequestActionTaskReference() {
    return customerPositionStateRequestActionTaskReference;
  }

  public void setCustomerPositionStateRequestActionTaskReference(String customerPositionStateRequestActionTaskReference) {
    this.customerPositionStateRequestActionTaskReference = customerPositionStateRequestActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The request service call consolidated processing record 
   * @return customerPositionStateRequestActionTaskRecord
  **/

  public Object getCustomerPositionStateRequestActionTaskRecord() {
    return customerPositionStateRequestActionTaskRecord;
  }

  public void setCustomerPositionStateRequestActionTaskRecord(Object customerPositionStateRequestActionTaskRecord) {
    this.customerPositionStateRequestActionTaskRecord = customerPositionStateRequestActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the service request record 
   * @return requestRecordReference
  **/

  public String getRequestRecordReference() {
    return requestRecordReference;
  }

  public void setRequestRecordReference(String requestRecordReference) {
    this.requestRecordReference = requestRecordReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the request action service response 
   * @return requestResponseRecord
  **/

  public Object getRequestResponseRecord() {
    return requestResponseRecord;
  }

  public void setRequestResponseRecord(Object requestResponseRecord) {
    this.requestResponseRecord = requestResponseRecord;
  }


}

