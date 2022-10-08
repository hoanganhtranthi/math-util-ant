/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hanh.mathutil.core;

/**
 *
 * @author Hoang Anh
 */
//ta se clone bộ thư viện/công cụ Math util của JDK
    //giả lập các hàm của class Math của JDK
    // những gỉ mà là công cụ dùng cho người khác, hàm khác,class khác thù thường sẽ được thiết kế là STATIC
    //STATIC là chấm trực tiếp qua tên clas, không có new
public class MathUtil {
    public static final double PI = 3.141592653589793;
    //ham tính n!=1.2.3..n
    //quy ước: không có giai thừa cho số âm, 0!=1!=1
    //21! vượt 18 số 0, vượt kiểu long
    //hàm của chúng ta design là: chỉ chấp nhận tính giai thừa của n từ 0 đến 20
    //<0 || >20 là không được
    public static long getFactorial(int n){
        if(n<0 || n>20)
            throw new IllegalArgumentException("Invalid n. n must be between 0...20");
        if(n==0||n==1) return 1;
        //đến đây thì chắc chắn n từ 2...20
        long product=1;//biến nhân tích lũy ( acc=accumulation)
        for (int i = 2; i <=n; i++) 
            product *=i;
        return product;
    }
}
//ki thuật lập trình mới( vẫn giữ nguyên những kiến thức lập trình đã có(
//1 plugin mới cho trình dộ của dev-viết code chú ý luôn/cam kat61 code có chất lượng 
//chất lượng không nói bằng miệng mà là nói bằng code
//kĩ thuật TDD-test driven development
//viết code và viết code để test code song song với nhau
//mỗi hàm developer viết ra phải viết ngay cái test case, phải viết ngay hành động
//kiểm thử hàm, để biết rằng hàm vừa viết chạy sai hay đúng