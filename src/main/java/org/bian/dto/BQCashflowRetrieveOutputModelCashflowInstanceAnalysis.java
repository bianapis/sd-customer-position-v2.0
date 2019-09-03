package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQCashflowRetrieveOutputModelCashflowInstanceAnalysis
 */
public class BQCashflowRetrieveOutputModelCashflowInstanceAnalysis   {
  private Object cashflowInstanceAnalysisRecord = null;

  private String cashflowInstanceAnalysisReportType = null;

  private String cashflowInstanceAnalysisParameters = null;

  private Object cashflowInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return cashflowInstanceAnalysisRecord
  **/

  public Object getCashflowInstanceAnalysisRecord() {
    return cashflowInstanceAnalysisRecord;
  }

  public void setCashflowInstanceAnalysisRecord(Object cashflowInstanceAnalysisRecord) {
    this.cashflowInstanceAnalysisRecord = cashflowInstanceAnalysisRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return cashflowInstanceAnalysisReportType
  **/

  public String getCashflowInstanceAnalysisReportType() {
    return cashflowInstanceAnalysisReportType;
  }

  public void setCashflowInstanceAnalysisReportType(String cashflowInstanceAnalysisReportType) {
    this.cashflowInstanceAnalysisReportType = cashflowInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return cashflowInstanceAnalysisParameters
  **/

  public String getCashflowInstanceAnalysisParameters() {
    return cashflowInstanceAnalysisParameters;
  }

  public void setCashflowInstanceAnalysisParameters(String cashflowInstanceAnalysisParameters) {
    this.cashflowInstanceAnalysisParameters = cashflowInstanceAnalysisParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return cashflowInstanceAnalysisReport
  **/

  public Object getCashflowInstanceAnalysisReport() {
    return cashflowInstanceAnalysisReport;
  }

  public void setCashflowInstanceAnalysisReport(Object cashflowInstanceAnalysisReport) {
    this.cashflowInstanceAnalysisReport = cashflowInstanceAnalysisReport;
  }


}

