package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCustomerPositionStateInitiateInputModelCustomerPositionStateInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRCustomerPositionStateInitiateInputModel
 */
public class CRCustomerPositionStateInitiateInputModel   {
  private String customerPositionServicingSessionReference = null;

  private Object customerPositionStateInitiateActionRecord = null;

  private String customerPositionStateInstanceStatus = null;

  private CRCustomerPositionStateInitiateInputModelCustomerPositionStateInstanceRecord customerPositionStateInstanceRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Initiate service call input and output record 
   * @return customerPositionStateInitiateActionRecord
  **/

  public Object getCustomerPositionStateInitiateActionRecord() {
    return customerPositionStateInitiateActionRecord;
  }

  public void setCustomerPositionStateInitiateActionRecord(Object customerPositionStateInitiateActionRecord) {
    this.customerPositionStateInitiateActionRecord = customerPositionStateInitiateActionRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Customer Position State instance (e.g. initialised, pending, active) 
   * @return customerPositionStateInstanceStatus
  **/

  public String getCustomerPositionStateInstanceStatus() {
    return customerPositionStateInstanceStatus;
  }

  public void setCustomerPositionStateInstanceStatus(String customerPositionStateInstanceStatus) {
    this.customerPositionStateInstanceStatus = customerPositionStateInstanceStatus;
  }


  /**
   * Get customerPositionStateInstanceRecord
   * @return customerPositionStateInstanceRecord
  **/

  public CRCustomerPositionStateInitiateInputModelCustomerPositionStateInstanceRecord getCustomerPositionStateInstanceRecord() {
    return customerPositionStateInstanceRecord;
  }

  public void setCustomerPositionStateInstanceRecord(CRCustomerPositionStateInitiateInputModelCustomerPositionStateInstanceRecord customerPositionStateInstanceRecord) {
    this.customerPositionStateInstanceRecord = customerPositionStateInstanceRecord;
  }


}

