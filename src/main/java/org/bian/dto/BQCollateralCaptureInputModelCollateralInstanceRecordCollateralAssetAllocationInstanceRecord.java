package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQCollateralCaptureInputModelCollateralInstanceRecordCollateralAssetAllocationInstanceRecord
 */
public class BQCollateralCaptureInputModelCollateralInstanceRecordCollateralAssetAllocationInstanceRecord   {
  private String customerReference = null;

  private String collateralAssetType = null;

  private String collateralAssetReference = null;

  private String collateralAssetDescription = null;

  private String collateralAssetAdministrationInstanceReference = null;

  private String collateralAssetStatus = null;

  private String collateralAssetValuation = null;

  private String collateralAssetAllocationProfile = null;

  private String collateralAssetValuationDate = null;

  private String collateralAssetLoantoValueRatio = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the title owner of the collateral asset 
   * @return customerReference
  **/

  public String getCustomerReference() {
    return customerReference;
  }

  public void setCustomerReference(String customerReference) {
    this.customerReference = customerReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The type of asset (e.g. building, machinery, inventory, financial instrument, art) 
   * @return collateralAssetType
  **/

  public String getCollateralAssetType() {
    return collateralAssetType;
  }

  public void setCollateralAssetType(String collateralAssetType) {
    this.collateralAssetType = collateralAssetType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the collateral item (e.g. address, account reference) 
   * @return collateralAssetReference
  **/

  public String getCollateralAssetReference() {
    return collateralAssetReference;
  }

  public void setCollateralAssetReference(String collateralAssetReference) {
    this.collateralAssetReference = collateralAssetReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Description of significant details and properties of the asset 
   * @return collateralAssetDescription
  **/

  public String getCollateralAssetDescription() {
    return collateralAssetDescription;
  }

  public void setCollateralAssetDescription(String collateralAssetDescription) {
    this.collateralAssetDescription = collateralAssetDescription;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the administration record of the asset item 
   * @return collateralAssetAdministrationInstanceReference
  **/

  public String getCollateralAssetAdministrationInstanceReference() {
    return collateralAssetAdministrationInstanceReference;
  }

  public void setCollateralAssetAdministrationInstanceReference(String collateralAssetAdministrationInstanceReference) {
    this.collateralAssetAdministrationInstanceReference = collateralAssetAdministrationInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: A general status indicator for the asset (can cover multiple properties as needed) 
   * @return collateralAssetStatus
  **/

  public String getCollateralAssetStatus() {
    return collateralAssetStatus;
  }

  public void setCollateralAssetStatus(String collateralAssetStatus) {
    this.collateralAssetStatus = collateralAssetStatus;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The current and historical valuation of the asset 
   * @return collateralAssetValuation
  **/

  public String getCollateralAssetValuation() {
    return collateralAssetValuation;
  }

  public void setCollateralAssetValuation(String collateralAssetValuation) {
    this.collateralAssetValuation = collateralAssetValuation;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: A record of past and current allocations of the collateral asset  
   * @return collateralAssetAllocationProfile
  **/

  public String getCollateralAssetAllocationProfile() {
    return collateralAssetAllocationProfile;
  }

  public void setCollateralAssetAllocationProfile(String collateralAssetAllocationProfile) {
    this.collateralAssetAllocationProfile = collateralAssetAllocationProfile;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::DateTime  general-info: The date of the last valuation (and next planned valuation) 
   * @return collateralAssetValuationDate
  **/

  public String getCollateralAssetValuationDate() {
    return collateralAssetValuationDate;
  }

  public void setCollateralAssetValuationDate(String collateralAssetValuationDate) {
    this.collateralAssetValuationDate = collateralAssetValuationDate;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The ratio of the valuation that can be used as collateral (depends on liquidity, title, etc.) 
   * @return collateralAssetLoantoValueRatio
  **/

  public String getCollateralAssetLoantoValueRatio() {
    return collateralAssetLoantoValueRatio;
  }

  public void setCollateralAssetLoantoValueRatio(String collateralAssetLoantoValueRatio) {
    this.collateralAssetLoantoValueRatio = collateralAssetLoantoValueRatio;
  }


}

