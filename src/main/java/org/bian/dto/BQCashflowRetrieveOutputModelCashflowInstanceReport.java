package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQCashflowRetrieveOutputModelCashflowInstanceReport
 */
public class BQCashflowRetrieveOutputModelCashflowInstanceReport   {
  private Object cashflowInstanceReportRecord = null;

  private String cashflowInstanceReportType = null;

  private String cashflowInstanceReportParameters = null;

  private Object cashflowInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return cashflowInstanceReportRecord
  **/

  public Object getCashflowInstanceReportRecord() {
    return cashflowInstanceReportRecord;
  }

  public void setCashflowInstanceReportRecord(Object cashflowInstanceReportRecord) {
    this.cashflowInstanceReportRecord = cashflowInstanceReportRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return cashflowInstanceReportType
  **/

  public String getCashflowInstanceReportType() {
    return cashflowInstanceReportType;
  }

  public void setCashflowInstanceReportType(String cashflowInstanceReportType) {
    this.cashflowInstanceReportType = cashflowInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return cashflowInstanceReportParameters
  **/

  public String getCashflowInstanceReportParameters() {
    return cashflowInstanceReportParameters;
  }

  public void setCashflowInstanceReportParameters(String cashflowInstanceReportParameters) {
    this.cashflowInstanceReportParameters = cashflowInstanceReportParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return cashflowInstanceReport
  **/

  public Object getCashflowInstanceReport() {
    return cashflowInstanceReport;
  }

  public void setCashflowInstanceReport(Object cashflowInstanceReport) {
    this.cashflowInstanceReport = cashflowInstanceReport;
  }


}

