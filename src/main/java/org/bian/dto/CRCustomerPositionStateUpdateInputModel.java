package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCustomerPositionStateUpdateInputModelCustomerPositionStateInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRCustomerPositionStateUpdateInputModel
 */
public class CRCustomerPositionStateUpdateInputModel   {
  private String customerPositionServicingSessionReference = null;

  private String customerPositionStateInstanceReference = null;

  private CRCustomerPositionStateUpdateInputModelCustomerPositionStateInstanceRecord customerPositionStateInstanceRecord = null;

  private Object customerPositionStateUpdateActionTaskRecord = null;

  private String updateActionRequest = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the active servicing session 
   * @return customerPositionServicingSessionReference
  **/

  public String getCustomerPositionServicingSessionReference() {
    return customerPositionServicingSessionReference;
  }

  public void setCustomerPositionServicingSessionReference(String customerPositionServicingSessionReference) {
    this.customerPositionServicingSessionReference = customerPositionServicingSessionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Customer Position State instance 
   * @return customerPositionStateInstanceReference
  **/

  public String getCustomerPositionStateInstanceReference() {
    return customerPositionStateInstanceReference;
  }

  public void setCustomerPositionStateInstanceReference(String customerPositionStateInstanceReference) {
    this.customerPositionStateInstanceReference = customerPositionStateInstanceReference;
  }


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the update action service request 
   * @return updateActionRequest
  **/

  public String getUpdateActionRequest() {
    return updateActionRequest;
  }

  public void setUpdateActionRequest(String updateActionRequest) {
    this.updateActionRequest = updateActionRequest;
  }


}

