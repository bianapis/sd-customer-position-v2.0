package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQCashflowRetrieveInputModelCashflowInstanceAnalysis
 */
public class BQCashflowRetrieveInputModelCashflowInstanceAnalysis   {
  private String cashflowInstanceAnalysisReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return cashflowInstanceAnalysisReference
  **/

  public String getCashflowInstanceAnalysisReference() {
    return cashflowInstanceAnalysisReference;
  }

  public void setCashflowInstanceAnalysisReference(String cashflowInstanceAnalysisReference) {
    this.cashflowInstanceAnalysisReference = cashflowInstanceAnalysisReference;
  }


}

