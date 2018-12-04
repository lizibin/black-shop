package com.ctrip.framework.apollo.common.dto;

import java.util.Date;
import java.util.List;

/**
 * @author Jason Song(song_s@ctrip.com)
 */
public class InstanceDTO {
  private long id;

  private String appId;

  private String clusterName;

  private String dataCenter;

  private String ip;

  private List<InstanceConfigDTO> configs;

  private Date dataChangeCreatedTime;

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

  public String getDataCenter() {
    return dataCenter;
  }

  public void setDataCenter(String dataCenter) {
    this.dataCenter = dataCenter;
  }

  public String getIp() {
    return ip;
  }

  public void setIp(String ip) {
    this.ip = ip;
  }

  public List<InstanceConfigDTO> getConfigs() {
    return configs;
  }

  public void setConfigs(List<InstanceConfigDTO> configs) {
    this.configs = configs;
  }

  public Date getDataChangeCreatedTime() {
    return dataChangeCreatedTime;
  }

  public void setDataChangeCreatedTime(Date dataChangeCreatedTime) {
    this.dataChangeCreatedTime = dataChangeCreatedTime;
  }
}
