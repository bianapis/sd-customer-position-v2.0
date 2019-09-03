package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQCashflowExchangeInputModelCashflowExchangeActionRequest;

import javax.validation.Valid;
  
/**
 * BQCollateralExchangeInputModel
 */
public class BQCollateralExchangeInputModel   {
  private String customerPositionStateInstanceReference = null;

  private String collateralInstanceReference = null;

  private Object collateralExchangeActionTaskRecord = null;

  private BQCashflowExchangeInputModelCashflowExchangeActionRequest collateralExchangeActionRequest = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Collateral instance 
   * @return collateralInstanceReference
  **/

  public String getCollateralInstanceReference() {
    return collateralInstanceReference;
  }

  public void setCollateralInstanceReference(String collateralInstanceReference) {
    this.collateralInstanceReference = collateralInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The exchange service call consolidated processing record 
   * @return collateralExchangeActionTaskRecord
  **/

  public Object getCollateralExchangeActionTaskRecord() {
    return collateralExchangeActionTaskRecord;
  }

  public void setCollateralExchangeActionTaskRecord(Object collateralExchangeActionTaskRecord) {
    this.collateralExchangeActionTaskRecord = collateralExchangeActionTaskRecord;
  }


  /**
   * Get collateralExchangeActionRequest
   * @return collateralExchangeActionRequest
  **/

  public BQCashflowExchangeInputModelCashflowExchangeActionRequest getCollateralExchangeActionRequest() {
    return collateralExchangeActionRequest;
  }

  public void setCollateralExchangeActionRequest(BQCashflowExchangeInputModelCashflowExchangeActionRequest collateralExchangeActionRequest) {
    this.collateralExchangeActionRequest = collateralExchangeActionRequest;
  }


}

