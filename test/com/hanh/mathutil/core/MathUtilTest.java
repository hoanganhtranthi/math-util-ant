/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hanh.mathutil.core;

import junit.framework.Assert;
import org.junit.Test;

/**
 *
 * @author Hoang Anh
 */
public class MathUtilTest {
    @Test(expected = Exception.class)//ham getF() dc thiet ke tra ve con long neu n dua vao 0..20
    //ham getF() dc thiet ke nem ra exception neu ta dua nao n<0 || n>20
    //tuc la neu goi F(-5) thi cho goi se nhan ve exception ten la
    //illegalArgumentException
    //dua ca chon, nhan ngoai le!!
    //bat xem ham co dung nem ngoai le hat khong neu data ca chon
    //khi chay ham nay kiem tra xem co 1 ngoai le thuoc nhom/class IllegalArgumentException xuat hien hay khong
    //no xh=cach no dc new IllegalArgumentException o dau do
    // neu co xh, dung nhu thiet ke, mau xanh
    //ki vong xuat hien, du la exception, va xuat hien that, mau xanh
    public void testFactorialGivenWrongArgumentThrowsException(){
        MathUtil.getFactorial(-5);
    }
    @Test
    public void testFactorialGivenRightArgumentReturnsWell2(){
       // test case #4: kieim thu tinh huong 3! coi co dung khong
       Assert.assertEquals(6 ,MathUtil.getFactorial(3));
        // test case #5: kieim thu tinh huong 4! coi co dung khong
       Assert.assertEquals(24 ,MathUtil.getFactorial(4));
       // test case #6: kieim thu tinh huong 5! coi co dung khong
       Assert.assertEquals(120 ,MathUtil.getFactorial(5));
       // test case #7: kieim thu tinh huong 6! coi co dung khong
       Assert.assertEquals(720 ,MathUtil.getFactorial(6));
    }
   @Test//ten ham test bao ham luon y nghia test cai gi
    //quy uoc dan kiem thu
    //ham nay muon test ham giai thua khi dua tham so dung
    //phai tra ve dung
    //ky thuat viet code phai theo quy tac-CODING CONVENTION
    public void testFactorialGivenRightArgumentReturnsWell(){
       // test case #1: kieim thu tinh huong 0! coi co dung khong
       //n=0, hy vong ve expected=1;actual thuc te
       //ham chay tra ra may???
        long expected=1;
        long actual=MathUtil.getFactorial(0);//goi ham de xem actual la may
        //so sanh 2 gia tri coi tuong dong khong? co dung, khong bug
        //so sanh=sout() va dung mat de luan ket qua
        Assert.assertEquals(expected, actual);
         // test case #2: kieim thu tinh huong 0! coi co dung khong
       //n=1, hy vong ve expected=2;actual thuc te
       //ham chay tra ra may???
        expected=1;
        actual=MathUtil.getFactorial(1);//goi ham de xem actual la may
        //so sanh 2 gia tri coi tuong dong khong? co dung, khong bug
        //so sanh=sout() va dung mat de luan ket qua
        Assert.assertEquals(expected, actual);
        //test case #3: n=2; 2! expected=2?
        Assert.assertEquals(2 ,MathUtil.getFactorial(2));
    }
    @Test //dc goi la annotation, ki hieu, flag de danh dau doan code mang y nghia nao do. Va khi bien dich/complie code thi thu vien di kem 
            //no se tu dong generate them code cho minh tuy them @ vi du: @test thi thu vien JUnit nay import no se ngam ngam tu tao generate
    //ham nay thanh public static void main() va gui main() nay cho JVM
    //ki thuat dung thu vien, bi ep phai theo cu phap cua no qua nhung @, thu vien nay goi la framework
    //framwork la thu vien, nhung file .jar,.dll chua 1 dong class ben trong
    // ep ta phai xai theo cach cua no, theo dan khung code ma no quy uoc
    //dan khung,template, ta dien not code vao cho trong, bị điều khiển ở luồng code, generate dàn khung
    //thu vien-library, nhung file .jar .dll chua 1 dong class ben trong
    //ta thoai mai dung ham cua no theo cach cua ta,chu dong dieu khien luong code
    public void tryJUnitFirst(){
        
        Assert.assertEquals(69, 69);
    }
    
}
//class nay ta se viet cac doan code nhu binh thuong
//nhung code nay dung de test code chinh ben mathutil
//viet code de test code chinh, thi cai doan code test nay duoc goi ten la test script
//test script la nhung doan code dc viet ra de test code khac, code chinh
//nhung doan code nay se goi cac ham ben code chinh, so sanh gia tri tra ve cua ham chinh can test voi gia tri ki vong
//nhung doan code nay/test script nay se phai bao gom cac test case
//ben trong test script chua cac test case
//nhung test script/class nay se co test 5! 6! 7! -5!->test case


//quy tac choi xanh, do
//xanh khi tat cac cac test case deu xanh, tuc la tat ca expected==actual
//do chi can co 1 test case mau do, xem nhu ham toang/tach
//chi can co 1 expected != actual, xem nhu bo di het cac test case
// 1 thang gay sai cho tat ca
// ly do: ham da dung thi dung het cho cac case da dc neu ra
//chi can 1 su khong == nhau cua actual voi expected, ham khong on ve ket qua tra ve--> SAI
//khong the test het cac case(Nl2) nhung da test case nay thi phai dung case do
//noi them ve mau do:
//do xay ra khi co1 1 su khong bang nhau cua expected va actual
//ly do gi expected != actual
//co 2 ly do
//ly do 1: expected dung, minh tinh ben ngoai, bang tay khi chua co ham
//actual sai, tinh huong nay ham sai gay bug bug
//ly do 2: expected sai, thi test case khong nen dung


//DDT: Data Driven Testing
//tach bo data kiem thu ra 1 cho
//lat hoi nhoi/nap/fill/dien/feed data nay tuan tu vao cho kiem thu
//Vi du tach data da kiem thu o tren thanh
//1 0
//1 1
//2 2
//6 3
//24 4
//120 5
//720 6
//Assert.assertEquals(2 ,MathUtil.getFactorial(2));
//thay vi lenh so sanh goi viet cho tung case, ta bien lenh nay
//tro thanh tong quat,khong dien data cu the, ma se lay tu dau do
//Assert.assertEquals(2 ,MathUtil.getFactorial(???));
//?? nay se lay tu tap data o tren
//code gon hon, dep hon, kiem soat duoc du thieu cac case
//ki thuat tach code test ra khoa=i data cua no, lat hoi fill lai sau
//dc goi la ki thuat viet test case theo kieu tham so hoa parameterized
//hoac con goi la ddt-data driven testing
//viet kiem thu huong ve tach data rieng ra!!!