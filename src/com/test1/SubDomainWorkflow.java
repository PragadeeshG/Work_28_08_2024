package com.test1;

public class SubDomainWorkflow {
	private Integer workflowCode;
	private String workflowType;
	private String refId;
	private String screenId;
	private Integer crId;
	private Integer fileUploadId;
	private Integer requestedBy;
	private String requestedFor;
	private String changeRemarks;
	private String changeDescription;
	private String creationDate;
	private String modifiedDate;
	private String entityState;

	public SubDomainWorkflow() {

	}

	public SubDomainWorkflow(Integer workflowCode, String workflowType, String refId, String screenId, Integer crId,
			Integer fileUploadId, Integer requestedBy, String requestedFor, String changeRemarks,
			String changeDescription, String creationDate, String modifiedDate, String entityState) {
		super();
		this.workflowCode = workflowCode;
		this.workflowType = workflowType;
		this.refId = refId;
		this.screenId = screenId;
		this.crId = crId;
		this.fileUploadId = fileUploadId;
		this.requestedBy = requestedBy;
		this.requestedFor = requestedFor;
		this.changeRemarks = changeRemarks;
		this.changeDescription = changeDescription;
		this.creationDate = creationDate;
		this.modifiedDate = modifiedDate;
		this.entityState = entityState;
	}

	public Integer getWorkflowCode() {
		return workflowCode;
	}

	public void setWorkflowCode(Integer workflowCode) {
		this.workflowCode = workflowCode;
	}

	public String getWorkflowType() {
		return workflowType;
	}

	public void setWorkflowType(String workflowType) {
		this.workflowType = workflowType;
	}

	public String getRefId() {
		return refId;
	}

	public void setRefId(String refId) {
		this.refId = refId;
	}

	public String getScreenId() {
		return screenId;
	}

	public void setScreenId(String screenId) {
		this.screenId = screenId;
	}

	public Integer getCrId() {
		return crId;
	}

	public void setCrId(Integer crId) {
		this.crId = crId;
	}

	public Integer getFileUploadId() {
		return fileUploadId;
	}

	public void setFileUploadId(Integer fileUploadId) {
		this.fileUploadId = fileUploadId;
	}

	public Integer getRequestedBy() {
		return requestedBy;
	}

	public void setRequestedBy(Integer requestedBy) {
		this.requestedBy = requestedBy;
	}

	public String getRequestedFor() {
		return requestedFor;
	}

	public void setRequestedFor(String requestedFor) {
		this.requestedFor = requestedFor;
	}

	public String getChangeRemarks() {
		return changeRemarks;
	}

	public void setChangeRemarks(String changeRemarks) {
		this.changeRemarks = changeRemarks;
	}

	public String getChangeDescription() {
		return changeDescription;
	}

	public void setChangeDescription(String changeDescription) {
		this.changeDescription = changeDescription;
	}

	public String getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(String creationDate) {
		this.creationDate = creationDate;
	}

	public String getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(String modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	public String getEntityState() {
		return entityState;
	}

	public void setEntityState(String entityState) {
		this.entityState = entityState;
	}

}
