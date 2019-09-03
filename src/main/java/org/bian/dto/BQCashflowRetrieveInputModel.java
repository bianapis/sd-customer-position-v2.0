package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQCashflowRetrieveInputModelCashflowInstanceAnalysis;
import org.bian.dto.BQCashflowRetrieveInputModelCashflowInstanceReport;

import javax.validation.Valid;
  
/**
 * BQCashflowRetrieveInputModel
 */
public class BQCashflowRetrieveInputModel   {
  private Object cashflowRetrieveActionTaskRecord = null;

  private String cashflowRetrieveActionRequest = null;

  private BQCashflowRetrieveInputModelCashflowInstanceReport cashflowInstanceReport = null;

  private BQCashflowRetrieveInputModelCashflowInstanceAnalysis cashflowInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return cashflowRetrieveActionTaskRecord
  **/

  public Object getCashflowRetrieveActionTaskRecord() {
    return cashflowRetrieveActionTaskRecord;
  }

  public void setCashflowRetrieveActionTaskRecord(Object cashflowRetrieveActionTaskRecord) {
    this.cashflowRetrieveActionTaskRecord = cashflowRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return cashflowRetrieveActionRequest
  **/

  public String getCashflowRetrieveActionRequest() {
    return cashflowRetrieveActionRequest;
  }

  public void setCashflowRetrieveActionRequest(String cashflowRetrieveActionRequest) {
    this.cashflowRetrieveActionRequest = cashflowRetrieveActionRequest;
  }


  /**
   * Get cashflowInstanceReport
   * @return cashflowInstanceReport
  **/

  public BQCashflowRetrieveInputModelCashflowInstanceReport getCashflowInstanceReport() {
    return cashflowInstanceReport;
  }

  public void setCashflowInstanceReport(BQCashflowRetrieveInputModelCashflowInstanceReport cashflowInstanceReport) {
    this.cashflowInstanceReport = cashflowInstanceReport;
  }


  /**
   * Get cashflowInstanceAnalysis
   * @return cashflowInstanceAnalysis
  **/

  public BQCashflowRetrieveInputModelCashflowInstanceAnalysis getCashflowInstanceAnalysis() {
    return cashflowInstanceAnalysis;
  }

  public void setCashflowInstanceAnalysis(BQCashflowRetrieveInputModelCashflowInstanceAnalysis cashflowInstanceAnalysis) {
    this.cashflowInstanceAnalysis = cashflowInstanceAnalysis;
  }


}

