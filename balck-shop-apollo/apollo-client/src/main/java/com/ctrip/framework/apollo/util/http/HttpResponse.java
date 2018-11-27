package com.ctrip.framework.apollo.util.http;

/**
 * @author Jason Song(song_s@ctrip.com)
 */
public class HttpResponse<T> {
  private final int m_statusCode;
  private final T m_body;

  public HttpResponse(int statusCode, T body) {
    this.m_statusCode = statusCode;
    this.m_body = body;
  }

  public int getStatusCode() {
    return m_statusCode;
  }

  public T getBody() {
    return m_body;
  }
}
