package com.ctrip.framework.apollo.common.dto;


import java.util.Map;

public class ReleaseHistoryDTO extends BaseDTO{

  private long id;

  private String appId;

  private String clusterName;

  private String namespaceName;

  private String branchName;

  private long releaseId;

  private long previousReleaseId;

  private int operation;

  private Map<String, Object> operationContext;

  public ReleaseHistoryDTO(){}

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getAppId() {
    return appId;
  }

  public void setAppId(String appId) {
    this.appId = appId;
  }

  public String getClusterName() {
    return clusterName;
  }

  public void setClusterName(String clusterName) {
    this.clusterName = clusterName;
  }

  public String getNamespaceName() {
    return namespaceName;
  }

  public void setNamespaceName(String namespaceName) {
    this.namespaceName = namespaceName;
  }

  public String getBranchName() {
    return branchName;
  }

  public void setBranchName(String branchName) {
    this.branchName = branchName;
  }

  public long getReleaseId() {
    return releaseId;
  }

  public void setReleaseId(long releaseId) {
    this.releaseId = releaseId;
  }

  public long getPreviousReleaseId() {
    return previousReleaseId;
  }

  public void setPreviousReleaseId(long previousReleaseId) {
    this.previousReleaseId = previousReleaseId;
  }

  public int getOperation() {
    return operation;
  }

  public void setOperation(int operation) {
    this.operation = operation;
  }

  public Map<String, Object> getOperationContext() {
    return operationContext;
  }

  public void setOperationContext(Map<String, Object> operationContext) {
    this.operationContext = operationContext;
  }
}
