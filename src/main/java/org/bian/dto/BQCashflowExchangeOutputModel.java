package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQCashflowExchangeOutputModel
 */
public class BQCashflowExchangeOutputModel   {
  private String cashflowExchangeActionTaskReference = null;

  private Object cashflowExchangeActionTaskRecord = null;

  private String cashflowExchangeActionResponse = null;

  private String cashflowInstanceStatus = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Cashflow instance exchange service call 
   * @return cashflowExchangeActionTaskReference
  **/

  public String getCashflowExchangeActionTaskReference() {
    return cashflowExchangeActionTaskReference;
  }

  public void setCashflowExchangeActionTaskReference(String cashflowExchangeActionTaskReference) {
    this.cashflowExchangeActionTaskReference = cashflowExchangeActionTaskReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the exchange action service response 
   * @return cashflowExchangeActionResponse
  **/

  public String getCashflowExchangeActionResponse() {
    return cashflowExchangeActionResponse;
  }

  public void setCashflowExchangeActionResponse(String cashflowExchangeActionResponse) {
    this.cashflowExchangeActionResponse = cashflowExchangeActionResponse;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Cashflow instance (e.g. accepted, rejected, verified) 
   * @return cashflowInstanceStatus
  **/

  public String getCashflowInstanceStatus() {
    return cashflowInstanceStatus;
  }

  public void setCashflowInstanceStatus(String cashflowInstanceStatus) {
    this.cashflowInstanceStatus = cashflowInstanceStatus;
  }


}

