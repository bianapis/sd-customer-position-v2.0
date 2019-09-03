package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQCashflowRetrieveOutputModelCashflowInstanceAnalysis;
import org.bian.dto.BQCashflowRetrieveOutputModelCashflowInstanceRecord;
import org.bian.dto.BQCashflowRetrieveOutputModelCashflowInstanceReport;
import org.bian.dto.BQCashflowRetrieveOutputModelCustomerPositionStateInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQCashflowRetrieveOutputModel
 */
public class BQCashflowRetrieveOutputModel   {
  private BQCashflowRetrieveOutputModelCustomerPositionStateInstanceRecord customerPositionStateInstanceRecord = null;

  private BQCashflowRetrieveOutputModelCashflowInstanceRecord cashflowInstanceRecord = null;

  private String cashflowRetrieveActionTaskReference = null;

  private Object cashflowRetrieveActionTaskRecord = null;

  private String cashflowRetrieveActionResponse = null;

  private BQCashflowRetrieveOutputModelCashflowInstanceReport cashflowInstanceReport = null;

  private BQCashflowRetrieveOutputModelCashflowInstanceAnalysis cashflowInstanceAnalysis = null;


  /**
   * Get customerPositionStateInstanceRecord
   * @return customerPositionStateInstanceRecord
  **/

  public BQCashflowRetrieveOutputModelCustomerPositionStateInstanceRecord getCustomerPositionStateInstanceRecord() {
    return customerPositionStateInstanceRecord;
  }

  public void setCustomerPositionStateInstanceRecord(BQCashflowRetrieveOutputModelCustomerPositionStateInstanceRecord customerPositionStateInstanceRecord) {
    this.customerPositionStateInstanceRecord = customerPositionStateInstanceRecord;
  }


  /**
   * Get cashflowInstanceRecord
   * @return cashflowInstanceRecord
  **/

  public BQCashflowRetrieveOutputModelCashflowInstanceRecord getCashflowInstanceRecord() {
    return cashflowInstanceRecord;
  }

  public void setCashflowInstanceRecord(BQCashflowRetrieveOutputModelCashflowInstanceRecord cashflowInstanceRecord) {
    this.cashflowInstanceRecord = cashflowInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Cashflow instance retrieve service call 
   * @return cashflowRetrieveActionTaskReference
  **/

  public String getCashflowRetrieveActionTaskReference() {
    return cashflowRetrieveActionTaskReference;
  }

  public void setCashflowRetrieveActionTaskReference(String cashflowRetrieveActionTaskReference) {
    this.cashflowRetrieveActionTaskReference = cashflowRetrieveActionTaskReference;
  }


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return cashflowRetrieveActionResponse
  **/

  public String getCashflowRetrieveActionResponse() {
    return cashflowRetrieveActionResponse;
  }

  public void setCashflowRetrieveActionResponse(String cashflowRetrieveActionResponse) {
    this.cashflowRetrieveActionResponse = cashflowRetrieveActionResponse;
  }


  /**
   * Get cashflowInstanceReport
   * @return cashflowInstanceReport
  **/

  public BQCashflowRetrieveOutputModelCashflowInstanceReport getCashflowInstanceReport() {
    return cashflowInstanceReport;
  }

  public void setCashflowInstanceReport(BQCashflowRetrieveOutputModelCashflowInstanceReport cashflowInstanceReport) {
    this.cashflowInstanceReport = cashflowInstanceReport;
  }


  /**
   * Get cashflowInstanceAnalysis
   * @return cashflowInstanceAnalysis
  **/

  public BQCashflowRetrieveOutputModelCashflowInstanceAnalysis getCashflowInstanceAnalysis() {
    return cashflowInstanceAnalysis;
  }

  public void setCashflowInstanceAnalysis(BQCashflowRetrieveOutputModelCashflowInstanceAnalysis cashflowInstanceAnalysis) {
    this.cashflowInstanceAnalysis = cashflowInstanceAnalysis;
  }


}

