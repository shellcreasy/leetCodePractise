/*
 * This file was automatically generated by EvoSuite
 * Sat Jan 04 07:37:03 GMT 2020
 */

package string;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import string.CountAndSay;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class CountAndSay_ESTest extends CountAndSay_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      CountAndSay countAndSay0 = new CountAndSay();
      int int0 = 0;
      int int1 = 3305;
      countAndSay0.countAndSay(3305);
      // Undeclared exception!
      countAndSay0.countAndSay(0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      CountAndSay countAndSay0 = new CountAndSay();
      // Undeclared exception!
      countAndSay0.countAndSay((-1));
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      CountAndSay countAndSay0 = new CountAndSay();
      int int0 = 30;
      // Undeclared exception!
      countAndSay0.countAndSay(30);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      CountAndSay countAndSay0 = new CountAndSay();
      int int0 = (-1);
      // Undeclared exception!
      countAndSay0.countAndSay((-1));
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      CountAndSay countAndSay0 = new CountAndSay();
      countAndSay0.countAndSay(1);
      countAndSay0.countAndSay(1);
      countAndSay0.countAndSay(1);
      countAndSay0.countAndSay(1);
      countAndSay0.countAndSay(1);
      countAndSay0.countAndSay(1);
      countAndSay0.countAndSay(1);
      countAndSay0.countAndSay(1);
      int int0 = (-4355);
      // Undeclared exception!
      countAndSay0.countAndSay((-4355));
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      CountAndSay countAndSay0 = new CountAndSay();
      int int0 = 1752;
      countAndSay0.countAndSay(1752);
      countAndSay0.countAndSay(1752);
      countAndSay0.countAndSay(1752);
      countAndSay0.countAndSay(1962);
      countAndSay0.countAndSay(1752);
      int int1 = (-1);
      // Undeclared exception!
      countAndSay0.countAndSay((-884));
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      CountAndSay countAndSay0 = new CountAndSay();
      // Undeclared exception!
      countAndSay0.countAndSay(0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      CountAndSay countAndSay0 = new CountAndSay();
      int int0 = (-1073);
      // Undeclared exception!
      countAndSay0.countAndSay((-1073));
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      CountAndSay countAndSay0 = new CountAndSay();
      int int0 = 0;
      // Undeclared exception!
      countAndSay0.countAndSay(0);
  }

  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      CountAndSay countAndSay0 = new CountAndSay();
      int int0 = 2023;
      countAndSay0.countAndSay(2023);
      countAndSay0.countAndSay(168);
      countAndSay0.countAndSay(2023);
      countAndSay0.countAndSay(2023);
      countAndSay0.countAndSay(2844);
      countAndSay0.countAndSay(2023);
      countAndSay0.countAndSay(2844);
      countAndSay0.countAndSay(2844);
      int int1 = (-2931);
      // Undeclared exception!
      countAndSay0.countAndSay(0);
  }
}