package com.ctrip.framework.apollo.portal.spi;

import com.ctrip.framework.apollo.portal.entity.bo.UserInfo;

/**
 * Get access to the user's information,
 * different companies should have a different implementation
 */
public interface UserInfoHolder {

  UserInfo getUser();

}
