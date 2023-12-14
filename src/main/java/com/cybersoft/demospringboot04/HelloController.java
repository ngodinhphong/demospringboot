package com.cybersoft.demospringboot04;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.lang.invoke.MethodHandles;

/**
 * Bước 1 (*): Định nghĩa đường dẫn
 * Bước 2 (*): Nhận các tham số mà người dùng (client) truyền lên để đem đi xử lý
 * Bước 3 (*): Kết nối được cơ sở dữ lệu
 * Bước 4 : Thực thi các câu truy vấn liên quan đến yêu cầu của chưc năng
 * Bước 5 : Trả kết quả ra giao diện
 */

//Controller: Dùng để đánh giấu cho Spring boot biết class này dùng để khai báo và định nghĩa đường dẫn
//@RequestMapping: Định nghĩa đường dẫn
@Controller
@RequestMapping("/hello")
public class HelloController {
    // Phương thức

    /**
     *
     * Đối với tham số dường dẫn nên viết thường toàn bộ
     *
     * Get : Tham số được truyền trực tiếp trên đường dẫn (URL)
     * - Clien: ?tên tham số = gia_tri_cua_tham_so&tên tham số = gia_tri_cua_tham_so&...
     * Ví dụ : http://localhost:8080/hello?hoten=Nguyen Van A
     *
     * - sever: quy định tham số @RequestParam Kiểu_dữ_liệu Tên_tham_số
     *
     * Post : Tham số truyền ngầm
     * - client: Phải truyền thông qua thẻ form hoặc tự code gọi đường đường dẫn với phương tiện Post
     * -server : giống như get
     */

    @GetMapping("/java")
    public String hellojava(@RequestParam(required = false) String loichao, @RequestParam int age) {
        //Hàm HelloJava sẻ xử lý logic code cho đường dẫn /hello/java
        System.out.println("Kiểm tra tham số " + loichao + " - tuổi nhân viên " + age);

        //Trả ra giao diện file hello.html (thymeleof hỗ trợ sẵn)
        return "hello";
    }

    // tạo đường dẫn có tên là /maytinh với yêu càu người dùng truyền lên 2 tham số
    // với tên tham số là soA và soB. Thực hiện phép tính tổng của soA và soB


    @PostMapping("/welcome")
    public String welcome(@RequestParam String tendangnhap, @RequestParam String matkhau){
        System.out.println("Tên đăng nhập: " + tendangnhap + " Mật khẩu: " + matkhau);
        System.out.println("Tên đăng nhập " + tendangnhap + " mât khẩu " + matkhau);

        return"welcome";
    }

    @GetMapping("/pathvarible/{hello}")
    public String pathvarible(@PathVariable String hello){
        System.out.println("kiểm tra " + hello);

        return "hello";
    }


}


