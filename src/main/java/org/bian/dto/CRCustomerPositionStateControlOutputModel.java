package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCustomerPositionStateControlOutputModel
 */
public class CRCustomerPositionStateControlOutputModel   {
  private String customerPositionStateControlActionTaskReference = null;

  private Object customerPositionStateControlActionTaskRecord = null;

  private String customerPositionStateControlActionResponse = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Customer Position State instance control processing service call 
   * @return customerPositionStateControlActionTaskReference
  **/

  public String getCustomerPositionStateControlActionTaskReference() {
    return customerPositionStateControlActionTaskReference;
  }

  public void setCustomerPositionStateControlActionTaskReference(String customerPositionStateControlActionTaskReference) {
    this.customerPositionStateControlActionTaskReference = customerPositionStateControlActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The processing control service call consolidated processing record 
   * @return customerPositionStateControlActionTaskRecord
  **/

  public Object getCustomerPositionStateControlActionTaskRecord() {
    return customerPositionStateControlActionTaskRecord;
  }

  public void setCustomerPositionStateControlActionTaskRecord(Object customerPositionStateControlActionTaskRecord) {
    this.customerPositionStateControlActionTaskRecord = customerPositionStateControlActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the control action service response 
   * @return customerPositionStateControlActionResponse
  **/

  public String getCustomerPositionStateControlActionResponse() {
    return customerPositionStateControlActionResponse;
  }

  public void setCustomerPositionStateControlActionResponse(String customerPositionStateControlActionResponse) {
    this.customerPositionStateControlActionResponse = customerPositionStateControlActionResponse;
  }


}

