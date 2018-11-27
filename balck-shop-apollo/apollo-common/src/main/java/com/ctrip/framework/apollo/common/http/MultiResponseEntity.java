package com.ctrip.framework.apollo.common.http;

import org.springframework.http.HttpStatus;

import java.util.LinkedList;
import java.util.List;

/**
 * 一个Response中包含多个ResponseEntity
 */
public class MultiResponseEntity<T> {

  private int code;

  private List<RichResponseEntity<T>> entities = new LinkedList<>();

  private MultiResponseEntity(HttpStatus httpCode) {
    this.code = httpCode.value();
  }

  public static <T> MultiResponseEntity<T> instance(HttpStatus statusCode) {
    return new MultiResponseEntity<>(statusCode);
  }

  public static <T> MultiResponseEntity<T> ok() {
    return new MultiResponseEntity<>(HttpStatus.OK);
  }

  public void addResponseEntity(RichResponseEntity<T> responseEntity) {
    if (responseEntity == null){
      throw new IllegalArgumentException("sub response entity can not be null");
    }
    entities.add(responseEntity);

  }

}
