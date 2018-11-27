package com.ctrip.framework.apollo.portal.controller;

import com.ctrip.framework.apollo.portal.component.config.PortalConfig;
import com.ctrip.framework.apollo.portal.entity.vo.PageSetting;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PageSettingController {

  @Autowired
  private PortalConfig portalConfig;

  @RequestMapping(value = "/page-settings", method = RequestMethod.GET)
  public PageSetting getPageSetting() {
    PageSetting setting = new PageSetting();

    setting.setWikiAddress(portalConfig.wikiAddress());
    setting.setCanAppAdminCreatePrivateNamespace(portalConfig.canAppAdminCreatePrivateNamespace());

    return setting;
  }

}
