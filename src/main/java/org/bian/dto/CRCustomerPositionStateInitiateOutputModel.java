package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCustomerPositionStateInitiateOutputModelCustomerPositionStateInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRCustomerPositionStateInitiateOutputModel
 */
public class CRCustomerPositionStateInitiateOutputModel   {
  private String customerPositionStateInstanceReference = null;

  private String customerPositionStateInitiateActionReference = null;

  private Object customerPositionStateInitiateActionRecord = null;

  private String customerPositionStateInstanceStatus = null;

  private CRCustomerPositionStateInitiateOutputModelCustomerPositionStateInstanceRecord customerPositionStateInstanceRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an Initiate service call 
   * @return customerPositionStateInitiateActionReference
  **/

  public String getCustomerPositionStateInitiateActionReference() {
    return customerPositionStateInitiateActionReference;
  }

  public void setCustomerPositionStateInitiateActionReference(String customerPositionStateInitiateActionReference) {
    this.customerPositionStateInitiateActionReference = customerPositionStateInitiateActionReference;
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

  public CRCustomerPositionStateInitiateOutputModelCustomerPositionStateInstanceRecord getCustomerPositionStateInstanceRecord() {
    return customerPositionStateInstanceRecord;
  }

  public void setCustomerPositionStateInstanceRecord(CRCustomerPositionStateInitiateOutputModelCustomerPositionStateInstanceRecord customerPositionStateInstanceRecord) {
    this.customerPositionStateInstanceRecord = customerPositionStateInstanceRecord;
  }


}

