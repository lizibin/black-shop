package com.ctrip.framework.apollo.configservice.service.config;

import com.ctrip.framework.apollo.biz.entity.Release;
import com.ctrip.framework.apollo.biz.message.ReleaseMessageListener;
import com.ctrip.framework.apollo.core.dto.ApolloNotificationMessages;

/**
 * @author Jason Song(song_s@ctrip.com)
 */
public interface ConfigService extends ReleaseMessageListener {

  /**
   * Load config
   *
   * @param clientAppId the client's app id
   * @param clientIp the client ip
   * @param configAppId the requested config's app id
   * @param configClusterName the requested config's cluster name
   * @param configNamespace the requested config's namespace name
   * @param dataCenter the client data center
   * @param clientMessages the messages received in client side
   * @return the Release
   */
  Release loadConfig(String clientAppId, String clientIp, String configAppId, String
      configClusterName, String configNamespace, String dataCenter, ApolloNotificationMessages clientMessages);
}
