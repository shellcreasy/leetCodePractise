/*
 * This file was automatically generated by EvoSuite
 * Sat Jan 04 07:42:58 GMT 2020
 */

package array;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import array.MaxProfit;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class MaxProfit_ESTest extends MaxProfit_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      int[] intArray0 = new int[12];
      intArray0[8] = 176;
      MaxProfit maxProfit0 = new MaxProfit();
      int int0 = maxProfit0.maxProfit(intArray0);
      assertEquals(176, int0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      MaxProfit maxProfit0 = new MaxProfit();
      // Undeclared exception!
      try { 
        maxProfit0.maxProfit((int[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("array.MaxProfit", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      MaxProfit maxProfit0 = new MaxProfit();
      int[] intArray0 = new int[2];
      intArray0[0] = (-141);
      int int0 = maxProfit0.maxProfit(intArray0);
      assertEquals(141, int0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      MaxProfit maxProfit0 = new MaxProfit();
      int[] intArray0 = new int[3];
      int int0 = maxProfit0.maxProfit(intArray0);
      assertEquals(0, int0);
  }
}