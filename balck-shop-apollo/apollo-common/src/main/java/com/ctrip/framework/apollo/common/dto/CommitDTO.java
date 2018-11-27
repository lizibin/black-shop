package com.ctrip.framework.apollo.common.dto;

public class CommitDTO extends BaseDTO{

  private String changeSets;

  private String appId;

  private String clusterName;

  private String namespaceName;

  private String comment;

  public String getChangeSets() {
    return changeSets;
  }

  public void setChangeSets(String changeSets) {
    this.changeSets = changeSets;
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

  public String getComment() {
    return comment;
  }

  public void setComment(String comment) {
    this.comment = comment;
  }
}
