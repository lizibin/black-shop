package com.ctrip.framework.apollo.portal.entity.vo;

import com.ctrip.framework.apollo.portal.entity.bo.UserInfo;

import java.util.Set;

public class AppRolesAssignedUsers {

  private String appId;
  private Set<UserInfo> masterUsers;

  public String getAppId() {
    return appId;
  }

  public void setAppId(String appId) {
    this.appId = appId;
  }

  public Set<UserInfo> getMasterUsers() {
    return masterUsers;
  }

  public void setMasterUsers(Set<UserInfo> masterUsers) {
    this.masterUsers = masterUsers;
  }
}
