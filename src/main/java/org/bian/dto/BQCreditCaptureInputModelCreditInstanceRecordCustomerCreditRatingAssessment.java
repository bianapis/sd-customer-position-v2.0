package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQCreditCaptureInputModelCreditInstanceRecordCustomerCreditRatingAssessment
 */
public class BQCreditCaptureInputModelCreditInstanceRecordCustomerCreditRatingAssessment   {
  private String customerCreditRatingAssessmentType = null;

  private String customerCreditRatingNarrative = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Credit assessment type (e.g. consumer, small business, corporate) 
   * @return customerCreditRatingAssessmentType
  **/

  public String getCustomerCreditRatingAssessmentType() {
    return customerCreditRatingAssessmentType;
  }

  public void setCustomerCreditRatingAssessmentType(String customerCreditRatingAssessmentType) {
    this.customerCreditRatingAssessmentType = customerCreditRatingAssessmentType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The structured report outlining basis for the bank's rating 
   * @return customerCreditRatingNarrative
  **/

  public String getCustomerCreditRatingNarrative() {
    return customerCreditRatingNarrative;
  }

  public void setCustomerCreditRatingNarrative(String customerCreditRatingNarrative) {
    this.customerCreditRatingNarrative = customerCreditRatingNarrative;
  }


}

