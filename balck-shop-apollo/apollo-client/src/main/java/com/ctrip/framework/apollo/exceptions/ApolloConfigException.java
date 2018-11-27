package com.ctrip.framework.apollo.exceptions;

/**
 * @author Jason Song(song_s@ctrip.com)
 */
public class ApolloConfigException extends RuntimeException {
  public ApolloConfigException(String message) {
    super(message);
  }

  public ApolloConfigException(String message, Throwable cause) {
    super(message, cause);
  }
}
