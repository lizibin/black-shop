package com.ctrip.framework.apollo.portal.spi;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface LogoutHandler {

  void logout(HttpServletRequest request, HttpServletResponse response);

}
