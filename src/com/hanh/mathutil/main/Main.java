/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hanh.mathutil.main;

import com.hanh.mathutil.core.MathUtil;

/**
 *
 * @author Hoang Anh
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        tryTDDFirst();
    }
    
    public static void tryTDDFirst(){
        //test case #1: tình huống xài hàm số 1;
//n=0: hy vọng hàm trả về expected=1;
//    actual value trà về bao nhiêu ?
           long expected=1;
           long actual=MathUtil.getFactorial(0);
           //so sánh 2 giá trị để biết hàm viết dúng hay không??
            //3 thứ này tổ hợp nên 1 thứ gọi là test case-tình huống xài hàm/xài app
            System.out.println("0! status | expected= "+expected +"|Actual= "+actual);
            //0! có ra được 1 hay không?
            //test case #2: tình huống xài hàm số 1;
//n=1: hy vọng hàm trả về expected=1;
//    actual value trà về bao nhiêu ?
            expected=1;
           actual=MathUtil.getFactorial(1);
            System.out.println("2! status | expected= "+expected +"|Actual= "+actual);
            //test case #3: tình huống xài hàm số 1;
//n=2: hy vọng hàm trả về expected=2;
//    actual value trà về bao nhiêu ?
 System.out.println("2! status | expected= 2 " +"|Actual= "+MathUtil.getFactorial(2));
        }
    }
    

