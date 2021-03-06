/*
 * This file was automatically generated by EvoSuite
 * Sat Jan 04 07:43:09 GMT 2020
 */

package string;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import string.StrStr;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class StrStr_ESTest extends StrStr_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      int int0 = StrStr.strStr(",Jc}UFX--^", ",Jc}UFX--^");
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      int int0 = StrStr.strStr(",Jc}UFX--^", "c");
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      // Undeclared exception!
      try { 
        StrStr.strStr((String) null, "");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("string.StrStr", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      StrStr strStr0 = new StrStr();
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      int int0 = StrStr.strStr("EPyu", "5>$2\"=HbHgm}PV:+Qz");
      assertEquals((-1), int0);
  }
}
