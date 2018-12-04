package com.ctrip.framework.apollo.biz.service;

import com.ctrip.framework.apollo.biz.AbstractIntegrationTest;
import com.ctrip.framework.apollo.common.entity.App;
import com.ctrip.framework.apollo.common.exception.ServiceException;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;

public class ClusterServiceTest extends AbstractIntegrationTest {

  @Autowired
  private AdminService adminService;

  @Autowired
  private ClusterService clusterService;

  @Test(expected = ServiceException.class)
  public void testCreateDuplicateCluster() {
    String appId = "someAppId";
    App app = new App();
    app.setAppId(appId);
    app.setName("someAppName");
    String owner = "someOwnerName";
    app.setOwnerName(owner);
    app.setOwnerEmail("someOwnerName@ctrip.com");
    app.setDataChangeCreatedBy(owner);
    app.setDataChangeLastModifiedBy(owner);
    app.setDataChangeCreatedTime(new Date());

    adminService.createNewApp(app);

    clusterService.createDefaultCluster(appId, owner);
  }
}
