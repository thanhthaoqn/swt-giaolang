/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.thanhthao.mathutil.test.core;

import com.thanhthao.mathutil.core.MathUtil;

import org.junit.Assert;
import org.junit.Test;

public class MathUtilityTest {

    // Đây là class sẽ sử dụng các hàm của thư viện/ framework JUnit 
    // để kiểm thử/ kiểm tra code chính - hàm tínhGiaiThua() bên 
    // class core.MathUtil 
    // viết code để test code chính bên kia 
    // có nhiều quy tắc đặt tên hàm kiểm thử 
    // nhưng thường nói lên mục đích của các case/ tình huống kiểm thử 
    // tình huống xài hàm theo kiểu thành công và thất bại 
    // hàm dưới đây là tình huống test hàm chạy thành công, trả về ngon 
    // ta sẽ xài hàm kiểu well - đưa 5!, 6!, hok chơi đưa -5!, 30!
    // @Test JUnit sẽ phối hợp với JVM để chạy hàm này 
    // @Test phía hậu trường chính là public static void main ()
    // Có nhiều @Test ứng với nhiều case khác nhau để kiểm thử hàm tính giai thừa 
    @Test
    public void testGetFactorialGivenRightArgumentReturnsWell() {
        int n = 0;  //test thử tình huống tử tế đầu vào, mày phải chạy đúng 
        long expected = 1;  // hy vọng 0!=1
        // long actual =; // gọi hàm cần test bên core/app chính/ code chính 
        long actual = MathUtil.getFactorial(n);

        // so sánh expected vs actual dùng framework 
        Assert.assertEquals(expected, actual);
        // Hàm giúp so sánh 2 giá trị nào đó có giống nhau không 
        // Nếu giống nhau -> thảy màu xanh 
        // Nếu không giống nhau  -> thảy mầu đỏ, hàm ý expected và actual không giống nhau 

        // Gộp thêm vài case thành công/ đưa đầu vào ngon!! hàm phải tính ngon
        Assert.assertEquals(1, MathUtil.getFactorial(1)); // tui muốn 1!==1
        Assert.assertEquals(2, MathUtil.getFactorial(2)); // tui muốn 2!==2
        Assert.assertEquals(6, MathUtil.getFactorial(3)); // tui muốn 3!==6
        Assert.assertEquals(24, MathUtil.getFactorial(4)); // tui muốn 4!==24
        Assert.assertEquals(120, MathUtil.getFactorial(5)); // tui muốn 5!==120
        Assert.assertEquals(120, MathUtil.getFactorial(6)); // tui muốn 6!==720
    }

    // hàm getF() ta thiết kế 2 tình huống xử lí 
    // 1. đưa data tử tế trong [0..20] -> tính đúng đc n! = done
    // 2. đưa data vào cà chớn, âm, >20; THIẾT KẾ CỦA HÀM NÉM RA NGOẠI LỆ 
    // TAO KÌ VỌNG NGOẠI LỆ XUẤT HIỆN KHI N < 0 || N > 20
    // rất mong ngoại lệ xuất hiện của n cá chớn này 
    // Nếu hàm nhận vào n<0 hoặc n > 20 và hàm ném ra ngoại lệ 
    // HÀM CHẠY ĐÚNG NHƯ THIẾT KẾ -> XANH PHẢI XUẤT HIỆN 
    // Nếu hàm nhận vào n < 0 hoặc n > 20 và hàm ném ra ngoại lê 
    // sure, HÀM CHẠY SAI THIẾT KẾ, SAI KÌ VỌNG, MÀU ĐỎ
    // TEST CASE:
    // input: -5
    // expected IllegalArgumentException xuất hiện 
    // tình huống bất thường, ngoại lệ, ngoài dự tính, dự liệu
    // là những thứ không thể đo lường so sánh theo kiểu value 
    // mà chỉ có thể do lường = cách chúng có xuất hiện hay không 
    // assertEquals() không dùng để so sánh 2 ngoại lệ 
    //       equals() là bằng nhau hay không trên value
    // MÀU ĐỎ, DO HÀM ĐÚNG LÀ CÓ NÉM NGOẠI LỆ THẬT SỰ 
    //         NHƯNG KHÔNG PHẢI LÀ NGOẠI LỆ NHƯ KÌ VỌNG - THỰC SỰ KÌ VỌNG SAI 
    //         KO PHẢI HÀM NÉM SAI 
//    @Test (expected = NumberFormatException.class)
//    public void testGetFactorialGivenWrongArgumentThrowsException() {
//        MathUtil.getFactorial(-5); // hàm @Test chạy, hay hàm getF() chạy 
//                                     // sẽ ném về ngoại lệ NumberFormat...
//    }
    @Test(expected = IllegalArgumentException.class)
    public void testGetFactorialGivenWrongArgumentThrowsException() {
        MathUtil.getFactorial(-5); // hàm @Test chạy, hay hàm getF() chạy 
        // sẽ ném về ngoại lệ NumberFormat...
    }

    // cách khác để bắt ngoại lệ xuất hiện, viết tự nhiên hơn 
    // xài lambda
    //Test case: hàm sẽ ném về ngoại lệ nếu nhận vào 21 
    // tui cần thấy màu xanh khi chơi với 21!
    @Test
    public void testGetFactorialGivenWrongArgumentThrowsException_LambdaVersion() {
//        Assert.assertThrows(tham số 1: loại ngoại lệ muốn so sánh,
//                            tham số 2: đoạn code chạy văng ra ngoại runnable)

        Assert.assertThrows(IllegalArgumentException.class,
                () -> MathUtil.getFactorial(-5)
        );
        //MathUtil.getFactorial(-5); // hàm @Test chạy, hay hàm getF() chạy 
        // sẽ ném về ngoại lệ NumberFormat...
    }

    //Bắt ngoại lê, xem hàm có ném về ngoại lệ hay không khi n cà chớn 
    // có ném, tức là hàm chạy đúng thiết kế -> xanh 
    @Test
    public void testGetFactorialGivenWrongArgumentThrowsException_TryCatch() {
        // chủ động kiểm soát ngoại lệ 
        try {
            MathUtil.getFactorial(-5);
        } catch (Exception e) {
            // Bắt try catch là JUnit sẽ ra màu xanh do đã chủ động kiểm soát ngoại lệ 
            // nhưng không chắc ngoại lệ mình cần có xuất hiện hay không 
            // có đoạn code kiểm soát đúng ngoại lệ IllegalArgumentException xuất hiện 
            Assert.assertEquals("Invalid agrument. N must be between 0..20",
                    e.getMessage());
        }

    }
}
