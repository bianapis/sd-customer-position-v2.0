package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQCreditCaptureInputModelCreditInstanceRecordCustomerCreditRatingAssessment;

import javax.validation.Valid;
  
/**
 * BQCreditCaptureInputModelCreditInstanceRecord
 */
public class BQCreditCaptureInputModelCreditInstanceRecord   {
  private BQCreditCaptureInputModelCreditInstanceRecordCustomerCreditRatingAssessment customerCreditRatingAssessment = null;


  /**
   * Get customerCreditRatingAssessment
   * @return customerCreditRatingAssessment
  **/

  public BQCreditCaptureInputModelCreditInstanceRecordCustomerCreditRatingAssessment getCustomerCreditRatingAssessment() {
    return customerCreditRatingAssessment;
  }

  public void setCustomerCreditRatingAssessment(BQCreditCaptureInputModelCreditInstanceRecordCustomerCreditRatingAssessment customerCreditRatingAssessment) {
    this.customerCreditRatingAssessment = customerCreditRatingAssessment;
  }


}

