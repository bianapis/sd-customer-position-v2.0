package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCustomerPositionStateExecuteInputModelCustomerPositionStateInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRCustomerPositionStateExecuteOutputModel
 */
public class CRCustomerPositionStateExecuteOutputModel   {
  private CRCustomerPositionStateExecuteInputModelCustomerPositionStateInstanceRecord customerPositionStateInstanceRecord = null;

  private String customerPositionStateExecuteActionTaskReference = null;

  private Object customerPositionStateExecuteActionTaskRecord = null;

  private String executeRecordReference = null;

  private Object executeResponseRecord = null;


  /**
   * Get customerPositionStateInstanceRecord
   * @return customerPositionStateInstanceRecord
  **/

  public CRCustomerPositionStateExecuteInputModelCustomerPositionStateInstanceRecord getCustomerPositionStateInstanceRecord() {
    return customerPositionStateInstanceRecord;
  }

  public void setCustomerPositionStateInstanceRecord(CRCustomerPositionStateExecuteInputModelCustomerPositionStateInstanceRecord customerPositionStateInstanceRecord) {
    this.customerPositionStateInstanceRecord = customerPositionStateInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Customer Position State instance execute service call 
   * @return customerPositionStateExecuteActionTaskReference
  **/

  public String getCustomerPositionStateExecuteActionTaskReference() {
    return customerPositionStateExecuteActionTaskReference;
  }

  public void setCustomerPositionStateExecuteActionTaskReference(String customerPositionStateExecuteActionTaskReference) {
    this.customerPositionStateExecuteActionTaskReference = customerPositionStateExecuteActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The execute service call consolidated processing record 
   * @return customerPositionStateExecuteActionTaskRecord
  **/

  public Object getCustomerPositionStateExecuteActionTaskRecord() {
    return customerPositionStateExecuteActionTaskRecord;
  }

  public void setCustomerPositionStateExecuteActionTaskRecord(Object customerPositionStateExecuteActionTaskRecord) {
    this.customerPositionStateExecuteActionTaskRecord = customerPositionStateExecuteActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the execute transaction/record 
   * @return executeRecordReference
  **/

  public String getExecuteRecordReference() {
    return executeRecordReference;
  }

  public void setExecuteRecordReference(String executeRecordReference) {
    this.executeRecordReference = executeRecordReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the execute action service response 
   * @return executeResponseRecord
  **/

  public Object getExecuteResponseRecord() {
    return executeResponseRecord;
  }

  public void setExecuteResponseRecord(Object executeResponseRecord) {
    this.executeResponseRecord = executeResponseRecord;
  }


}

