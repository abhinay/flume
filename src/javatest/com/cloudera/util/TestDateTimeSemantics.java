/**
 * Licensed to Cloudera, Inc. under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  Cloudera, Inc. licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.cloudera.util;

import java.text.DateFormat;
import java.util.Locale;
import java.util.TimeZone;

import junit.framework.TestCase;

/**
 * Sandbox for testing some date time related things.
 */
public class TestDateTimeSemantics extends TestCase {
  public void testDateFormatLocals() {
    Locale[] locales = DateFormat.getAvailableLocales();
    for (Locale l : locales) {
      System.out.println(l);
    }
  }

  public void testTimeZone() {
    TimeZone tz = TimeZone.getTimeZone("GMT");
    System.out.println(tz);

  }

}
