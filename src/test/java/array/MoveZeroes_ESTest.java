/*
 * This file was automatically generated by EvoSuite
 * Sat Jan 04 07:41:28 GMT 2020
 */

package array;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import array.MoveZeroes;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class MoveZeroes_ESTest extends MoveZeroes_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      MoveZeroes moveZeroes0 = new MoveZeroes();
      int[] intArray0 = new int[5];
      intArray0[1] = (-1);
      moveZeroes0.moveZeroes(intArray0);
      assertArrayEquals(new int[] {(-1), 0, 0, 0, 0}, intArray0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      MoveZeroes moveZeroes0 = new MoveZeroes();
      // Undeclared exception!
      try { 
        moveZeroes0.moveZeroes((int[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("array.MoveZeroes", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      MoveZeroes moveZeroes0 = new MoveZeroes();
      int[] intArray0 = new int[5];
      intArray0[0] = 899;
      moveZeroes0.moveZeroes(intArray0);
      assertArrayEquals(new int[] {899, 0, 0, 0, 0}, intArray0);
  }
}
