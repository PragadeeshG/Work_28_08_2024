package com.test1;

public class SubDomainAccountResponse {
	private Integer subDomainId;
	private String subDomainOwner;
	private boolean activeAccount;
	private Integer subDomainTypeId;
	private String subDomainType;
	private String subDomainStatus;
	private Integer subDomainDescription;
	private Integer authorizerCount;
	private String authCountry;
	private Integer authRegionCode;
	private String exceptions;
	private String status;
	private String remarks;

	public SubDomainAccountResponse() {

	}

	public SubDomainAccountResponse(Integer subDomainId, String subDomainOwner, boolean activeAccount,
			Integer subDomainTypeId, String subDomainType, String subDomainStatus, Integer subDomainDescription,
			Integer authorizerCount, String authCountry, Integer authRegionCode, String exceptions, String status,
			String remarks) {
		super();
		this.subDomainId = subDomainId;
		this.subDomainOwner = subDomainOwner;
		this.activeAccount = activeAccount;
		this.subDomainTypeId = subDomainTypeId;
		this.subDomainType = subDomainType;
		this.subDomainStatus = subDomainStatus;
		this.subDomainDescription = subDomainDescription;
		this.authorizerCount = authorizerCount;
		this.authCountry = authCountry;
		this.authRegionCode = authRegionCode;
		this.exceptions = exceptions;
		this.status = status;
		this.remarks = remarks;
	}

	public Integer getSubDomainId() {
		return subDomainId;
	}

	public void setSubDomainId(Integer subDomainId) {
		this.subDomainId = subDomainId;
	}

	public String getSubDomainOwner() {
		return subDomainOwner;
	}

	public void setSubDomainOwner(String subDomainOwner) {
		this.subDomainOwner = subDomainOwner;
	}

	public boolean isActiveAccount() {
		return activeAccount;
	}

	public void setActiveAccount(boolean activeAccount) {
		this.activeAccount = activeAccount;
	}

	public Integer getSubDomainTypeId() {
		return subDomainTypeId;
	}

	public void setSubDomainTypeId(Integer subDomainTypeId) {
		this.subDomainTypeId = subDomainTypeId;
	}

	public String getSubDomainType() {
		return subDomainType;
	}

	public void setSubDomainType(String subDomainType) {
		this.subDomainType = subDomainType;
	}

	public String getSubDomainStatus() {
		return subDomainStatus;
	}

	public void setSubDomainStatus(String subDomainStatus) {
		this.subDomainStatus = subDomainStatus;
	}

	public Integer getSubDomainDescription() {
		return subDomainDescription;
	}

	public void setSubDomainDescription(Integer subDomainDescription) {
		this.subDomainDescription = subDomainDescription;
	}

	public Integer getAuthorizerCount() {
		return authorizerCount;
	}

	public void setAuthorizerCount(Integer authorizerCount) {
		this.authorizerCount = authorizerCount;
	}

	public String getAuthCountry() {
		return authCountry;
	}

	public void setAuthCountry(String authCountry) {
		this.authCountry = authCountry;
	}

	public Integer getAuthRegionCode() {
		return authRegionCode;
	}

	public void setAuthRegionCode(Integer authRegionCode) {
		this.authRegionCode = authRegionCode;
	}

	public String getExceptions() {
		return exceptions;
	}

	public void setExceptions(String exceptions) {
		this.exceptions = exceptions;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

}
