/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.minhquang.mathutil.core;

/**
 *
 * @author kanat
 */
//class này sẽ chứa 1 loạt cá hàm static dùng để làm thư viện cho các nơi khác, class khác xài !!!!
public class MathUtility {
    public static final double PI = 3.14;
    //public const double PI = 3.14; //C# ko cần static mà vẫn giống vì có chữ const ~ final
    
    //hàm tính n! = 1.2.3....n
    // 5! = 1.2.3.4   .5 = 5! x 4
    // 5! = 1.2.3     .4 = 4! x 3
    // 5! = 1.2       .3 = 3! x 2
    // N! = N . (N-1)! đệ quy gọi lại chính mình với quy mô nhỏ hơn
    
        public static long getFactorial(int n){// n!
        if(n < 0 || n > 20) throw new IllegalArgumentException("Invalid n. n must be 0..20");
        
        if(n == 0 || n == 1) return 1;
        // Dung De Quy
        // Kỹ thuật kiểm thử gọi là : Regression testing 
        //                            Kiểm thử hồi quy - test lại những thứ đã từng test
        // Trong thực tế làm dự án, code của ta sẽ liên tục được chỉnh sửa
        // Vì 
        // fix bug thì phải sửa code, sửa hàm
        // thêm hàm, thêm tính năng
        // tối ưu hàm cũ, làm hàm cũ gọn hơn, dễ đọc hơn, chạy nhanh hơn
        // Nếu test = tay, bằng log, thì cực kì tốn tgian , mất sức
        // Nếu code của ta có sẵn test script = code kiểm thử
        // Ta chỉ việc run lại cái test script này
        // Nếu hàm sửa ngon, nó ra màu xanh
        // Nếu hàm sửa không ngon, nó ra màu đỏ
        // Nhờ test script ta verify lại 1 hàm rất nhanh -> kiểm thử lại
        // Thứ đã từng kiểm thử để đảm bảo nó còn ngon so với trước
        // Khi sửa được gọi là kiểm thử hồi quy - Regression Testing
        // Nhờ CI hồi quy liên tục
        
        // Bài này mình kiểm thử hồi quy
        
        
        return n * getFactorial(n-1);
        
    } 
    
//    public static long getFactorial(int n){
//        if(n < 0 || n > 20) throw new IllegalArgumentException("Invalid n. n must be 0..20");
//        
//        if(n == 0 || n == 1) return 1;
//        
//        long result = 1; //biến tích lũy, gom dồn việc nhân, biến con heo đất
//                         //acc /accmulation
//
//       //sống sót đến for, sure n = 2..20                  
//       for (int i = 2; i <= n; i++) result *= i;
//        
//        
//        return result;
//    } 
}
