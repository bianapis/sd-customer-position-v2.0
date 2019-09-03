package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQCreditExchangeOutputModel
 */
public class BQCreditExchangeOutputModel   {
  private String creditExchangeActionTaskReference = null;

  private Object creditExchangeActionTaskRecord = null;

  private String creditExchangeActionResponse = null;

  private String creditInstanceStatus = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Credit instance exchange service call 
   * @return creditExchangeActionTaskReference
  **/

  public String getCreditExchangeActionTaskReference() {
    return creditExchangeActionTaskReference;
  }

  public void setCreditExchangeActionTaskReference(String creditExchangeActionTaskReference) {
    this.creditExchangeActionTaskReference = creditExchangeActionTaskReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the exchange action service response 
   * @return creditExchangeActionResponse
  **/

  public String getCreditExchangeActionResponse() {
    return creditExchangeActionResponse;
  }

  public void setCreditExchangeActionResponse(String creditExchangeActionResponse) {
    this.creditExchangeActionResponse = creditExchangeActionResponse;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Credit instance (e.g. accepted, rejected, verified) 
   * @return creditInstanceStatus
  **/

  public String getCreditInstanceStatus() {
    return creditInstanceStatus;
  }

  public void setCreditInstanceStatus(String creditInstanceStatus) {
    this.creditInstanceStatus = creditInstanceStatus;
  }


}

