package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCustomerPositionStateUpdateInputModelCustomerPositionStateInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRCustomerPositionStateUpdateOutputModel
 */
public class CRCustomerPositionStateUpdateOutputModel   {
  private CRCustomerPositionStateUpdateInputModelCustomerPositionStateInstanceRecord customerPositionStateInstanceRecord = null;

  private String customerPositionStateUpdateActionTaskReference = null;

  private Object customerPositionStateUpdateActionTaskRecord = null;

  private Object updateResponseRecord = null;


  /**
   * Get customerPositionStateInstanceRecord
   * @return customerPositionStateInstanceRecord
  **/

  public CRCustomerPositionStateUpdateInputModelCustomerPositionStateInstanceRecord getCustomerPositionStateInstanceRecord() {
    return customerPositionStateInstanceRecord;
  }

  public void setCustomerPositionStateInstanceRecord(CRCustomerPositionStateUpdateInputModelCustomerPositionStateInstanceRecord customerPositionStateInstanceRecord) {
    this.customerPositionStateInstanceRecord = customerPositionStateInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an update service call 
   * @return customerPositionStateUpdateActionTaskReference
  **/

  public String getCustomerPositionStateUpdateActionTaskReference() {
    return customerPositionStateUpdateActionTaskReference;
  }

  public void setCustomerPositionStateUpdateActionTaskReference(String customerPositionStateUpdateActionTaskReference) {
    this.customerPositionStateUpdateActionTaskReference = customerPositionStateUpdateActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return customerPositionStateUpdateActionTaskRecord
  **/

  public Object getCustomerPositionStateUpdateActionTaskRecord() {
    return customerPositionStateUpdateActionTaskRecord;
  }

  public void setCustomerPositionStateUpdateActionTaskRecord(Object customerPositionStateUpdateActionTaskRecord) {
    this.customerPositionStateUpdateActionTaskRecord = customerPositionStateUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the Update action service response 
   * @return updateResponseRecord
  **/

  public Object getUpdateResponseRecord() {
    return updateResponseRecord;
  }

  public void setUpdateResponseRecord(Object updateResponseRecord) {
    this.updateResponseRecord = updateResponseRecord;
  }


}

