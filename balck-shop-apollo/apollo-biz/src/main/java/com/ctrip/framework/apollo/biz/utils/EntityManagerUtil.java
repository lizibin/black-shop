package com.ctrip.framework.apollo.biz.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.orm.jpa.EntityManagerFactoryAccessor;
import org.springframework.orm.jpa.EntityManagerFactoryUtils;
import org.springframework.orm.jpa.EntityManagerHolder;
import org.springframework.stereotype.Component;
import org.springframework.transaction.support.TransactionSynchronizationManager;

/**
 * @author Jason Song(song_s@ctrip.com)
 */
@Component
public class EntityManagerUtil extends EntityManagerFactoryAccessor {
  private static final Logger logger = LoggerFactory.getLogger(EntityManagerUtil.class);
  /**
   * close the entity manager.
   * Use it with caution! This is only intended for use with async request, which Spring won't
   * close the entity manager until the async request is finished.
   */
  public void closeEntityManager() {
    EntityManagerHolder emHolder = (EntityManagerHolder)
        TransactionSynchronizationManager.getResource(getEntityManagerFactory());
    if (emHolder == null) {
      return;
    }
    logger.debug("Closing JPA EntityManager in EntityManagerUtil");
    EntityManagerFactoryUtils.closeEntityManager(emHolder.getEntityManager());
  }
}
