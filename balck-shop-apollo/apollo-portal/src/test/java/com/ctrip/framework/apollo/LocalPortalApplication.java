package com.ctrip.framework.apollo;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class LocalPortalApplication {
  public static void main(String[] args) {
    new SpringApplicationBuilder(LocalPortalApplication.class).run(args);
  }
}
