package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQCashflowCaptureInputModelCashflowInstanceRecordProductInstanceReferenceProductFulfillmentArrangementInstanceReport;

import javax.validation.Valid;
  
/**
 * BQCashflowCaptureInputModelCashflowInstanceRecordProductInstanceReference
 */
public class BQCashflowCaptureInputModelCashflowInstanceRecordProductInstanceReference   {
  private String productFulfillmentArrangementInstanceReportType = null;

  private BQCashflowCaptureInputModelCashflowInstanceRecordProductInstanceReferenceProductFulfillmentArrangementInstanceReport productFulfillmentArrangementInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The types of product fulfillment reports available - in this case transaction details used for different measures or position analyses 
   * @return productFulfillmentArrangementInstanceReportType
  **/

  public String getProductFulfillmentArrangementInstanceReportType() {
    return productFulfillmentArrangementInstanceReportType;
  }

  public void setProductFulfillmentArrangementInstanceReportType(String productFulfillmentArrangementInstanceReportType) {
    this.productFulfillmentArrangementInstanceReportType = productFulfillmentArrangementInstanceReportType;
  }


  /**
   * Get productFulfillmentArrangementInstanceReport
   * @return productFulfillmentArrangementInstanceReport
  **/

  public BQCashflowCaptureInputModelCashflowInstanceRecordProductInstanceReferenceProductFulfillmentArrangementInstanceReport getProductFulfillmentArrangementInstanceReport() {
    return productFulfillmentArrangementInstanceReport;
  }

  public void setProductFulfillmentArrangementInstanceReport(BQCashflowCaptureInputModelCashflowInstanceRecordProductInstanceReferenceProductFulfillmentArrangementInstanceReport productFulfillmentArrangementInstanceReport) {
    this.productFulfillmentArrangementInstanceReport = productFulfillmentArrangementInstanceReport;
  }


}

