package com.ctrip.framework.apollo.common.dto;

public class ReleaseDTO extends BaseDTO{
  private long id;

  private String releaseKey;

  private String name;

  private String appId;

  private String clusterName;

  private String namespaceName;

  private String configurations;

  private String comment;

  private boolean isAbandoned;

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getReleaseKey() {
    return releaseKey;
  }

  public void setReleaseKey(String releaseKey) {
    this.releaseKey = releaseKey;
  }

  public String getAppId() {
    return appId;
  }

  public String getClusterName() {
    return clusterName;
  }

  public String getComment() {
    return comment;
  }

  public String getConfigurations() {
    return configurations;
  }

  public String getName() {
    return name;
  }

  public String getNamespaceName() {
    return namespaceName;
  }

  public void setAppId(String appId) {
    this.appId = appId;
  }

  public void setClusterName(String clusterName) {
    this.clusterName = clusterName;
  }

  public void setComment(String comment) {
    this.comment = comment;
  }

  public void setConfigurations(String configurations) {
    this.configurations = configurations;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setNamespaceName(String namespaceName) {
    this.namespaceName = namespaceName;
  }

  public boolean isAbandoned() {
    return isAbandoned;
  }

  public void setAbandoned(boolean abandoned) {
    isAbandoned = abandoned;
  }
}
