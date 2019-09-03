package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQCashflowExchangeInputModelCashflowExchangeActionRequest;

import javax.validation.Valid;
  
/**
 * BQCashflowExchangeInputModel
 */
public class BQCashflowExchangeInputModel   {
  private String customerPositionStateInstanceReference = null;

  private String cashflowInstanceReference = null;

  private Object cashflowExchangeActionTaskRecord = null;

  private BQCashflowExchangeInputModelCashflowExchangeActionRequest cashflowExchangeActionRequest = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Cashflow instance 
   * @return cashflowInstanceReference
  **/

  public String getCashflowInstanceReference() {
    return cashflowInstanceReference;
  }

  public void setCashflowInstanceReference(String cashflowInstanceReference) {
    this.cashflowInstanceReference = cashflowInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The exchange service call consolidated processing record 
   * @return cashflowExchangeActionTaskRecord
  **/

  public Object getCashflowExchangeActionTaskRecord() {
    return cashflowExchangeActionTaskRecord;
  }

  public void setCashflowExchangeActionTaskRecord(Object cashflowExchangeActionTaskRecord) {
    this.cashflowExchangeActionTaskRecord = cashflowExchangeActionTaskRecord;
  }


  /**
   * Get cashflowExchangeActionRequest
   * @return cashflowExchangeActionRequest
  **/

  public BQCashflowExchangeInputModelCashflowExchangeActionRequest getCashflowExchangeActionRequest() {
    return cashflowExchangeActionRequest;
  }

  public void setCashflowExchangeActionRequest(BQCashflowExchangeInputModelCashflowExchangeActionRequest cashflowExchangeActionRequest) {
    this.cashflowExchangeActionRequest = cashflowExchangeActionRequest;
  }


}

