package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQCashflowCaptureInputModelCashflowInstanceRecordProductInstanceReferenceProductFulfillmentArrangementInstanceReport
 */
public class BQCashflowCaptureInputModelCashflowInstanceRecordProductInstanceReferenceProductFulfillmentArrangementInstanceReport   {
  private String reportOptionsSelectionCriteria = null;

  private String reportPeriod = null;

  private String reportFormatTemplate = null;

  private Object report = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Defines content/transaction types to be included in the report extract 
   * @return reportOptionsSelectionCriteria
  **/

  public String getReportOptionsSelectionCriteria() {
    return reportOptionsSelectionCriteria;
  }

  public void setReportOptionsSelectionCriteria(String reportOptionsSelectionCriteria) {
    this.reportOptionsSelectionCriteria = reportOptionsSelectionCriteria;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The from-to dates covered by the report for analysis 
   * @return reportPeriod
  **/

  public String getReportPeriod() {
    return reportPeriod;
  }

  public void setReportPeriod(String reportPeriod) {
    this.reportPeriod = reportPeriod;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Defines presentation format 
   * @return reportFormatTemplate
  **/

  public String getReportFormatTemplate() {
    return reportFormatTemplate;
  }

  public void setReportFormatTemplate(String reportFormatTemplate) {
    this.reportFormatTemplate = reportFormatTemplate;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The requested product/service activity report used in the position measurements 
   * @return report
  **/

  public Object getReport() {
    return report;
  }

  public void setReport(Object report) {
    this.report = report;
  }


}

