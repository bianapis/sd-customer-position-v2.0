package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCustomerPositionStateInitiateOutputModelCustomerPositionStateInstanceRecord
 */
public class CRCustomerPositionStateInitiateOutputModelCustomerPositionStateInstanceRecord   {
  private Object customerPositionStateRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The consolidated position state that is tracked for the customer - combines analysis from all measures 
   * @return customerPositionStateRecord
  **/

  public Object getCustomerPositionStateRecord() {
    return customerPositionStateRecord;
  }

  public void setCustomerPositionStateRecord(Object customerPositionStateRecord) {
    this.customerPositionStateRecord = customerPositionStateRecord;
  }


}

