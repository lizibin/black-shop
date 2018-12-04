package com.ctrip.framework.apollo.common.utils;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * @author Jason Song(song_s@ctrip.com)
 */
public class InputValidatorTest {

  @Test
  public void testIsValidClusterNamespaceWithCorrectInput() throws Exception {
    String someValidInput = "a1-b2_c3.d4";
    assertTrue(InputValidator.isValidClusterNamespace(someValidInput));
  }

  @Test
  public void testIsValidClusterNamespaceWithInCorrectInput() throws Exception {
    String someInvalidInput = "中文123";
    assertFalse(InputValidator.isValidClusterNamespace(someInvalidInput));

    String anotherInvalidInput = "123@#{}";
    assertFalse(InputValidator.isValidClusterNamespace(anotherInvalidInput));
  }
}
