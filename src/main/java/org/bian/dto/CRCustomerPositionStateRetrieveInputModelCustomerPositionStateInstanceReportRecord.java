package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCustomerPositionStateRetrieveInputModelCustomerPositionStateInstanceReportRecord
 */
public class CRCustomerPositionStateRetrieveInputModelCustomerPositionStateInstanceReportRecord   {
  private String customerPositionStateInstanceReportReference = null;

  private String customerPositionStateInstanceReportType = null;

  private String customerPositionStateInstanceReportParameters = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return customerPositionStateInstanceReportReference
  **/

  public String getCustomerPositionStateInstanceReportReference() {
    return customerPositionStateInstanceReportReference;
  }

  public void setCustomerPositionStateInstanceReportReference(String customerPositionStateInstanceReportReference) {
    this.customerPositionStateInstanceReportReference = customerPositionStateInstanceReportReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return customerPositionStateInstanceReportType
  **/

  public String getCustomerPositionStateInstanceReportType() {
    return customerPositionStateInstanceReportType;
  }

  public void setCustomerPositionStateInstanceReportType(String customerPositionStateInstanceReportType) {
    this.customerPositionStateInstanceReportType = customerPositionStateInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return customerPositionStateInstanceReportParameters
  **/

  public String getCustomerPositionStateInstanceReportParameters() {
    return customerPositionStateInstanceReportParameters;
  }

  public void setCustomerPositionStateInstanceReportParameters(String customerPositionStateInstanceReportParameters) {
    this.customerPositionStateInstanceReportParameters = customerPositionStateInstanceReportParameters;
  }


}

