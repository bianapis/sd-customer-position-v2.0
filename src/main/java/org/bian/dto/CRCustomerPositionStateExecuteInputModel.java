package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCustomerPositionStateExecuteInputModelCustomerPositionStateInstanceRecord;
import org.bian.dto.CRCustomerPositionStateExecuteInputModelExecuteRecordType;

import javax.validation.Valid;
  
/**
 * CRCustomerPositionStateExecuteInputModel
 */
public class CRCustomerPositionStateExecuteInputModel   {
  private String customerPositionServicingSessionReference = null;

  private String customerPositionStateInstanceReference = null;

  private CRCustomerPositionStateExecuteInputModelCustomerPositionStateInstanceRecord customerPositionStateInstanceRecord = null;

  private Object customerPositionStateExecuteActionTaskRecord = null;

  private CRCustomerPositionStateExecuteInputModelExecuteRecordType executeRecordType = null;


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

  public CRCustomerPositionStateExecuteInputModelCustomerPositionStateInstanceRecord getCustomerPositionStateInstanceRecord() {
    return customerPositionStateInstanceRecord;
  }

  public void setCustomerPositionStateInstanceRecord(CRCustomerPositionStateExecuteInputModelCustomerPositionStateInstanceRecord customerPositionStateInstanceRecord) {
    this.customerPositionStateInstanceRecord = customerPositionStateInstanceRecord;
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
   * Get executeRecordType
   * @return executeRecordType
  **/

  public CRCustomerPositionStateExecuteInputModelExecuteRecordType getExecuteRecordType() {
    return executeRecordType;
  }

  public void setExecuteRecordType(CRCustomerPositionStateExecuteInputModelExecuteRecordType executeRecordType) {
    this.executeRecordType = executeRecordType;
  }


}

