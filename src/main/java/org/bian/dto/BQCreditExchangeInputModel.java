package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQCashflowExchangeInputModelCashflowExchangeActionRequest;

import javax.validation.Valid;
  
/**
 * BQCreditExchangeInputModel
 */
public class BQCreditExchangeInputModel   {
  private String customerPositionStateInstanceReference = null;

  private String creditInstanceReference = null;

  private Object creditExchangeActionTaskRecord = null;

  private BQCashflowExchangeInputModelCashflowExchangeActionRequest creditExchangeActionRequest = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the parent Customer Position State instance 
   * @return customerPositionStateInstanceReference
  **/

  public String getCustomerPositionStateInstanceReference() {
    return customerPositionStateInstanceReference;
  }

  public void setCustomerPositionStateInstanceReference(String customerPositionStateInstanceReference) {
    this.customerPositionStateInstanceReference = customerPositionStateInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Credit instance 
   * @return creditInstanceReference
  **/

  public String getCreditInstanceReference() {
    return creditInstanceReference;
  }

  public void setCreditInstanceReference(String creditInstanceReference) {
    this.creditInstanceReference = creditInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The exchange service call consolidated processing record 
   * @return creditExchangeActionTaskRecord
  **/

  public Object getCreditExchangeActionTaskRecord() {
    return creditExchangeActionTaskRecord;
  }

  public void setCreditExchangeActionTaskRecord(Object creditExchangeActionTaskRecord) {
    this.creditExchangeActionTaskRecord = creditExchangeActionTaskRecord;
  }


  /**
   * Get creditExchangeActionRequest
   * @return creditExchangeActionRequest
  **/

  public BQCashflowExchangeInputModelCashflowExchangeActionRequest getCreditExchangeActionRequest() {
    return creditExchangeActionRequest;
  }

  public void setCreditExchangeActionRequest(BQCashflowExchangeInputModelCashflowExchangeActionRequest creditExchangeActionRequest) {
    this.creditExchangeActionRequest = creditExchangeActionRequest;
  }


}

