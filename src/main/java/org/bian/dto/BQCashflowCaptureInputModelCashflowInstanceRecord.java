package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQCashflowCaptureInputModelCashflowInstanceRecordProductInstanceReference;

import javax.validation.Valid;
  
/**
 * BQCashflowCaptureInputModelCashflowInstanceRecord
 */
public class BQCashflowCaptureInputModelCashflowInstanceRecord   {
  private BQCashflowCaptureInputModelCashflowInstanceRecordProductInstanceReference productInstanceReference = null;


  /**
   * Get productInstanceReference
   * @return productInstanceReference
  **/

  public BQCashflowCaptureInputModelCashflowInstanceRecordProductInstanceReference getProductInstanceReference() {
    return productInstanceReference;
  }

  public void setProductInstanceReference(BQCashflowCaptureInputModelCashflowInstanceRecordProductInstanceReference productInstanceReference) {
    this.productInstanceReference = productInstanceReference;
  }


}

