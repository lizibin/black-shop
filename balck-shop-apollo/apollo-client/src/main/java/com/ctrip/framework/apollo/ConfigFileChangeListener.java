package com.ctrip.framework.apollo;

import com.ctrip.framework.apollo.model.ConfigFileChangeEvent;

/**
 * @author Jason Song(song_s@ctrip.com)
 */
public interface ConfigFileChangeListener {
  /**
   * Invoked when there is any config change for the namespace.
   * @param changeEvent the event for this change
   */
  void onChange(ConfigFileChangeEvent changeEvent);
}
