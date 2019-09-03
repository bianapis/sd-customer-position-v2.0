package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCustomerPositionStateRetrieveOutputModelCustomerPositionStateInstanceRecord
 */
public class CRCustomerPositionStateRetrieveOutputModelCustomerPositionStateInstanceRecord   {
  private String customerReference = null;

  private Object customerProductServiceEligibilityInstanceRecord = null;

  private Object customerPositionStateRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the customer that the consolidated financial position represents 
   * @return customerReference
  **/

  public String getCustomerReference() {
    return customerReference;
  }

  public void setCustomerReference(String customerReference) {
    this.customerReference = customerReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: This is the customer's eligibility profile including in-force product terms for the customer - defining the measurement sources 
   * @return customerProductServiceEligibilityInstanceRecord
  **/

  public Object getCustomerProductServiceEligibilityInstanceRecord() {
    return customerProductServiceEligibilityInstanceRecord;
  }

  public void setCustomerProductServiceEligibilityInstanceRecord(Object customerProductServiceEligibilityInstanceRecord) {
    this.customerProductServiceEligibilityInstanceRecord = customerProductServiceEligibilityInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The consolidated position state that is tracked for the customer - combines analysis from all measures 
   * @return customerPositionStateRecord
  **/

  public Object getCustomerPositionStateRecord() {
    return customerPositionStateRecord;
  }

  public void setCustomerPositionStateRecord(Object customerPositionStateRecord) {
    this.customerPositionStateRecord = customerPositionStateRecord;
  }


}

