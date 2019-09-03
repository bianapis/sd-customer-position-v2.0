package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCustomerPositionStateRetrieveInputModelCustomerPositionStateInstanceAnalysis
 */
public class CRCustomerPositionStateRetrieveInputModelCustomerPositionStateInstanceAnalysis   {
  private String customerPositionStateInstanceAnalysisReference = null;

  private String customerPositionStateInstanceAnalysisReportType = null;

  private String customerPositionStateInstanceAnalysisParameters = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return customerPositionStateInstanceAnalysisReference
  **/

  public String getCustomerPositionStateInstanceAnalysisReference() {
    return customerPositionStateInstanceAnalysisReference;
  }

  public void setCustomerPositionStateInstanceAnalysisReference(String customerPositionStateInstanceAnalysisReference) {
    this.customerPositionStateInstanceAnalysisReference = customerPositionStateInstanceAnalysisReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return customerPositionStateInstanceAnalysisReportType
  **/

  public String getCustomerPositionStateInstanceAnalysisReportType() {
    return customerPositionStateInstanceAnalysisReportType;
  }

  public void setCustomerPositionStateInstanceAnalysisReportType(String customerPositionStateInstanceAnalysisReportType) {
    this.customerPositionStateInstanceAnalysisReportType = customerPositionStateInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return customerPositionStateInstanceAnalysisParameters
  **/

  public String getCustomerPositionStateInstanceAnalysisParameters() {
    return customerPositionStateInstanceAnalysisParameters;
  }

  public void setCustomerPositionStateInstanceAnalysisParameters(String customerPositionStateInstanceAnalysisParameters) {
    this.customerPositionStateInstanceAnalysisParameters = customerPositionStateInstanceAnalysisParameters;
  }


}

