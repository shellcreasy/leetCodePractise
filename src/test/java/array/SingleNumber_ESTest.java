/*
 * This file was automatically generated by EvoSuite
 * Sat Jan 04 07:42:23 GMT 2020
 */

package array;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import array.SingleNumber;
import java.util.NoSuchElementException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class SingleNumber_ESTest extends SingleNumber_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      SingleNumber singleNumber0 = new SingleNumber();
      int[] intArray0 = new int[2];
      intArray0[0] = 16;
      int int0 = singleNumber0.singleNumber(intArray0);
      assertEquals(16, int0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      SingleNumber singleNumber0 = new SingleNumber();
      int[] intArray0 = new int[1];
      intArray0[0] = (-406);
      int int0 = singleNumber0.singleNumber(intArray0);
      assertEquals((-406), int0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      SingleNumber singleNumber0 = new SingleNumber();
      int[] intArray0 = new int[6];
      // Undeclared exception!
      try { 
        singleNumber0.singleNumber(intArray0);
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.HashMap$HashIterator", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      SingleNumber singleNumber0 = new SingleNumber();
      // Undeclared exception!
      try { 
        singleNumber0.singleNumber((int[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("array.SingleNumber", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      SingleNumber singleNumber0 = new SingleNumber();
      int[] intArray0 = new int[3];
      int int0 = singleNumber0.singleNumber(intArray0);
      assertEquals(0, int0);
  }
}
