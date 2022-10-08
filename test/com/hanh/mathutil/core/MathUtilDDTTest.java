/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hanh.mathutil.core;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

/**
 *
 * @author Hoang Anh
 */
@RunWith(value = Parameterized.class)
public class MathUtilDDTTest {
    @Parameterized.Parameters
   public static Object[][] initData(){
       int a[]={5,10,15,20,25};
       int b[][]={{1,0},{1,1},{2,2},{6,3},{24,4},{120,5},{720,6}};
       int c[][]={{1,0},
                {1,1},
                {2,2},
                {6,3},
                {24,4},
                {120,5},
                {720,6}};
      return new Integer[][]{{1,0},
                            {1,1},
                            {2,2},
                            {6,3},
                            {24,4},
                            {120,5},
                            {720,6}};
   }
   //ta phai map 2 cot cua tung dong vao 2 dau ? cua ham so sanh
   ////Assert.assertEquals(2 ,MathUtil.getFactorial(???));
   //Assert.assertEquals(cot-0 ,MathUtil.getFactorial(cot-1));
   //map value tu mang vao 2 bien, nhoi 2 bien nay vao ham so sanh!!
   @Parameterized.Parameter(value = 0)
   public long expected;//map vao cot 0
   @Parameterized.Parameter(value = 1)
   public int n;//map vao cot 1
   @Test//fill data va goi ham so sanh
   public void testFactorialGivenRightArgumentReturnsWell(){
       assertEquals(expected ,MathUtil.getFactorial(n));
   }
}
