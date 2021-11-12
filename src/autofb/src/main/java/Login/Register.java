package Login;

import repository.UserRepository;
import utils.CsvUtils;

import javax.naming.Name;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Register {
    public static void register() throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        System.out.println(" --------------- Nhap thong tin dang ky ---------------");
        System.out.print("| 1.Tài Khoản : ");
        String taikhoan = scanner.nextLine();
        System.out.print("| 2.Mật Khẩu : ");
        String matkhau = scanner.nextLine();
        if (UserRepository.getByName(taikhoan) != null) {
            System.out.println("Tai khoan da ton tai");
        } else {
            System.out.println("Ban da dang ky thanh cong");
            User newUser = new User(taikhoan, matkhau);
            UserRepository.userList.add(newUser);
            CsvUtils.write("C:\\MD2\\autofb\\Data\\RegisteredAccount.csv", UserRepository.userList);
        }
        System.out.println("----------------- Cảm Ơn Bạn Đã Ghé Tool --------------");
    }

}
