package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCustomerPositionStateRetrieveOutputModelCustomerPositionStateInstanceReportRecord
 */
public class CRCustomerPositionStateRetrieveOutputModelCustomerPositionStateInstanceReportRecord   {
  private String customerPositionStateInstanceReportData = null;

  private String customerPositionStateInstanceReportType = null;

  private Object customerPositionStateInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return customerPositionStateInstanceReportData
  **/

  public String getCustomerPositionStateInstanceReportData() {
    return customerPositionStateInstanceReportData;
  }

  public void setCustomerPositionStateInstanceReportData(String customerPositionStateInstanceReportData) {
    this.customerPositionStateInstanceReportData = customerPositionStateInstanceReportData;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return customerPositionStateInstanceReport
  **/

  public Object getCustomerPositionStateInstanceReport() {
    return customerPositionStateInstanceReport;
  }

  public void setCustomerPositionStateInstanceReport(Object customerPositionStateInstanceReport) {
    this.customerPositionStateInstanceReport = customerPositionStateInstanceReport;
  }


}

