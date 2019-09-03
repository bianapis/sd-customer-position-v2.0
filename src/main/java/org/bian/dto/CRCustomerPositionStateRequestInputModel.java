package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCustomerPositionStateRequestInputModelCustomerPositionStateInstanceRecord;
import org.bian.dto.CRCustomerPositionStateRequestInputModelRequestRecordType;

import javax.validation.Valid;
  
/**
 * CRCustomerPositionStateRequestInputModel
 */
public class CRCustomerPositionStateRequestInputModel   {
  private String customerPositionServicingSessionReference = null;

  private String customerPositionStateInstanceReference = null;

  private CRCustomerPositionStateRequestInputModelCustomerPositionStateInstanceRecord customerPositionStateInstanceRecord = null;

  private Object customerPositionStateRequestActionTaskRecord = null;

  private CRCustomerPositionStateRequestInputModelRequestRecordType requestRecordType = null;


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

  public CRCustomerPositionStateRequestInputModelCustomerPositionStateInstanceRecord getCustomerPositionStateInstanceRecord() {
    return customerPositionStateInstanceRecord;
  }

  public void setCustomerPositionStateInstanceRecord(CRCustomerPositionStateRequestInputModelCustomerPositionStateInstanceRecord customerPositionStateInstanceRecord) {
    this.customerPositionStateInstanceRecord = customerPositionStateInstanceRecord;
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
   * Get requestRecordType
   * @return requestRecordType
  **/

  public CRCustomerPositionStateRequestInputModelRequestRecordType getRequestRecordType() {
    return requestRecordType;
  }

  public void setRequestRecordType(CRCustomerPositionStateRequestInputModelRequestRecordType requestRecordType) {
    this.requestRecordType = requestRecordType;
  }


}

