/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.thanhthao.mathutil.main;

import com.thanhthao.mathutil.core.MathUtil;

/**
 *
 * @author thanh
 */
public class Main {

    public static void main(String[] args) {

        // Thử nghiệm hàm tính giai thừa coi chạy đúng như thiết kế hay không 
        // ta phải đưa các tình huống xử dụng hàm trong thực tế 
        // Ví dụ: -5 coi tính được không 
        //         0 coi tính mấy 
        //         20 coi tính mấy 
        //         21 coi tính mấy 
        // TEST CASE: Một tình huống hàm/app/màn hình/ tính năng được đưa vào sử dụng 
        // giả lập hành vi xài của ai đó!!!
        
        // TEST CASE: LÀ 1 TÌNH HUỐNG SỬ DỤNG, XÀI APP HAY XÀI HÀM MÀ NÓ BAO GỒM 
        // DATA ĐẦU VÀO CỤ THỂ NÀO ĐÓ 
        // OUTPUT ĐẦU RA ỨNG VỚI XỬ LÍ CỦA HÀM/ CHỨC NĂNG CỦA APP, DĨ NHIÊN DÙNG ĐẦU 
        // VÀO ĐỂ XỬ LÍ 
        // KÌ VỌNG: MONG HÀM SẼ TRẢ VỀ VALUE NÀO ĐÓ ỨNG VỚI INPUT Ở TRÊN 
        // SO SÁNH ĐỂ XEM KẾT QUẢ CÓ NHƯ KÌ VỌNG HAY KHÔNG 
        
        long expected = 120; // tao kì vọng hàm ói về 120 nếu tính 5!
        int n = 5;          // input
        long actual = MathUtil.getFactorial(n);
        System.out.println("5! = " + expected + " expected");
        System.out.println("5! = " + actual + " actual ");

    }
}
