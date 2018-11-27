package com.ctrip.framework.apollo.common.http;

import org.springframework.http.HttpStatus;

public class RichResponseEntity<T>{

  private int code;
  private Object message;
  private T body;

  public static <T> RichResponseEntity<T> ok(T body){
    RichResponseEntity<T> richResponseEntity = new RichResponseEntity<>();
    richResponseEntity.message = HttpStatus.OK.getReasonPhrase();
    richResponseEntity.code = HttpStatus.OK.value();
    richResponseEntity.body = body;
    return richResponseEntity;
  }

  public static <T> RichResponseEntity<T> error(HttpStatus httpCode, Object message){
    RichResponseEntity<T> richResponseEntity = new RichResponseEntity<>();
    richResponseEntity.message = message;
    richResponseEntity.code = httpCode.value();
    return richResponseEntity;
  }

  public int getCode() {
    return code;
  }

  public Object getMessage() {
    return message;
  }

  public T getBody() {
    return body;
  }
}
