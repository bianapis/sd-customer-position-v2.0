package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCustomerPositionStateControlInputModelCustomerPositionStateControlActionRequest;

import javax.validation.Valid;
  
/**
 * CRCustomerPositionStateControlInputModel
 */
public class CRCustomerPositionStateControlInputModel   {
  private String customerPositionServicingSessionReference = null;

  private String customerPositionStateInstanceReference = null;

  private Object customerPositionStateControlActionTaskRecord = null;

  private CRCustomerPositionStateControlInputModelCustomerPositionStateControlActionRequest customerPositionStateControlActionRequest = null;


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
   * Get customerPositionStateControlActionRequest
   * @return customerPositionStateControlActionRequest
  **/

  public CRCustomerPositionStateControlInputModelCustomerPositionStateControlActionRequest getCustomerPositionStateControlActionRequest() {
    return customerPositionStateControlActionRequest;
  }

  public void setCustomerPositionStateControlActionRequest(CRCustomerPositionStateControlInputModelCustomerPositionStateControlActionRequest customerPositionStateControlActionRequest) {
    this.customerPositionStateControlActionRequest = customerPositionStateControlActionRequest;
  }


}

