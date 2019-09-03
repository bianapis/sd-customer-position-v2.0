package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCustomerPositionStateRetrieveOutputModelCustomerPositionStateInstanceAnalysis
 */
public class CRCustomerPositionStateRetrieveOutputModelCustomerPositionStateInstanceAnalysis   {
  private String customerPositionStateInstanceAnalysisData = null;

  private String customerPositionStateInstanceAnalysisReportType = null;

  private Object customerPositionStateInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return customerPositionStateInstanceAnalysisData
  **/

  public String getCustomerPositionStateInstanceAnalysisData() {
    return customerPositionStateInstanceAnalysisData;
  }

  public void setCustomerPositionStateInstanceAnalysisData(String customerPositionStateInstanceAnalysisData) {
    this.customerPositionStateInstanceAnalysisData = customerPositionStateInstanceAnalysisData;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return customerPositionStateInstanceAnalysisReport
  **/

  public Object getCustomerPositionStateInstanceAnalysisReport() {
    return customerPositionStateInstanceAnalysisReport;
  }

  public void setCustomerPositionStateInstanceAnalysisReport(Object customerPositionStateInstanceAnalysisReport) {
    this.customerPositionStateInstanceAnalysisReport = customerPositionStateInstanceAnalysisReport;
  }


}

