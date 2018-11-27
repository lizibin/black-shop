package com.ctrip.framework.apollo.internals;

/**
 * @author Jason Song(song_s@ctrip.com)
 */
public interface Injector {

  /**
   * Returns the appropriate instance for the given injection type
   */
  <T> T getInstance(Class<T> clazz);

  /**
   * Returns the appropriate instance for the given injection type and name
   */
  <T> T getInstance(Class<T> clazz, String name);
}
