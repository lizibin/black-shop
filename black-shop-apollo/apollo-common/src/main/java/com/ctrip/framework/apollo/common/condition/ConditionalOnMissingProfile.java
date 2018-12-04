package com.ctrip.framework.apollo.common.condition;

import org.springframework.context.annotation.Conditional;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * {@link Conditional} that only matches when the specified profiles are inactive.
 *
 * @author Jason Song(song_s@ctrip.com)
 */
@Target({ ElementType.TYPE, ElementType.METHOD })
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Conditional(OnProfileCondition.class)
public @interface ConditionalOnMissingProfile {
  /**
   * The profiles that should be inactive
   * @return
   */
  String[] value() default {};
}
