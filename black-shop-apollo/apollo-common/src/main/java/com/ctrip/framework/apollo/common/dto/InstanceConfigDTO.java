package com.ctrip.framework.apollo.common.dto;

import java.util.Date;

/**
 * @author Jason Song(song_s@ctrip.com)
 */
public class InstanceConfigDTO {
  private ReleaseDTO release;
  private Date releaseDeliveryTime;
  private Date dataChangeLastModifiedTime;

  public ReleaseDTO getRelease() {
    return release;
  }

  public void setRelease(ReleaseDTO release) {
    this.release = release;
  }

  public Date getDataChangeLastModifiedTime() {
    return dataChangeLastModifiedTime;
  }

  public void setDataChangeLastModifiedTime(Date dataChangeLastModifiedTime) {
    this.dataChangeLastModifiedTime = dataChangeLastModifiedTime;
  }

  public Date getReleaseDeliveryTime() {
    return releaseDeliveryTime;
  }

  public void setReleaseDeliveryTime(Date releaseDeliveryTime) {
    this.releaseDeliveryTime = releaseDeliveryTime;
  }
}
