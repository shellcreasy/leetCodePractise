/*
 * This file was automatically generated by EvoSuite
 * Sat Jan 04 07:38:10 GMT 2020
 */

package array;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import array.Intersect;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Intersect_ESTest extends Intersect_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Intersect intersect0 = new Intersect();
      int[] intArray0 = new int[2];
      intArray0[0] = 1;
      int[] intArray1 = new int[1];
      int[] intArray2 = intersect0.intersect(intArray1, intArray0);
      assertArrayEquals(new int[] {0}, intArray2);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Intersect intersect0 = new Intersect();
      int[] intArray0 = new int[2];
      int[] intArray1 = new int[0];
      int[] intArray2 = intersect0.intersect(intArray0, intArray1);
      assertEquals(0, intArray2.length);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Intersect intersect0 = new Intersect();
      int[] intArray0 = new int[2];
      // Undeclared exception!
      try { 
        intersect0.intersect((int[]) null, intArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("array.Intersect", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Intersect intersect0 = new Intersect();
      int[] intArray0 = new int[2];
      int[] intArray1 = intersect0.intersect(intArray0, intArray0);
      intArray0[1] = 1072;
      int[] intArray2 = intersect0.intersect(intArray0, intArray1);
      assertEquals(2, intArray1.length);
      assertEquals(1, intArray2.length);
  }
}
