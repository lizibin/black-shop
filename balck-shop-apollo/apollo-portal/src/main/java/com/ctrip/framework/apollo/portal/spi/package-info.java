/**
 * This package defines common interfaces so that each company could provide their own implementations.<br/>
 * Currently we provide 2 implementations: Ctrip and Default.<br/>
 * Ctrip implementation will be activated only when spring.profiles.active = ctrip.
 * So if spring.profiles.active is not ctrip, the default implementation will be activated.
 * You may refer com.ctrip.framework.apollo.portal.spi.configuration.AuthConfiguration when providing your own implementation.
 *
 * @see com.ctrip.framework.apollo.portal.spi.configuration.AuthConfiguration
 */
package com.ctrip.framework.apollo.portal.spi;
