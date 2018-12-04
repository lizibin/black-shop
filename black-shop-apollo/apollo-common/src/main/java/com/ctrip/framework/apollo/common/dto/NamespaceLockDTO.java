package com.ctrip.framework.apollo.common.dto;

public class NamespaceLockDTO extends BaseDTO{

  private long namespaceId;

  public long getNamespaceId() {
    return namespaceId;
  }

  public void setNamespaceId(long namespaceId) {
    this.namespaceId = namespaceId;
  }
}
