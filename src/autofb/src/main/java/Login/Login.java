package Login;

import repository.UserRepository;

import java.awt.*;
import java.util.Scanner;

public class Login {

    public static void login() throws InterruptedException {
        Menu menu = new Menu();
        Scanner scanner = new Scanner(System.in);
        System.out.println(" -------------------- Đăng Nhập  ------------------- ");
        System.out.print("| 1.Tài Khoản : ");
        String account = scanner.next();
        System.out.print("| 2.Mật Khẩu :  ");
        String password = scanner.next();
        System.out.println(" -------------------- Cảm Ơn bạn -------------------");
        if (checkLogin(account, password)) {
            view.Menu.show();
        } else {
            System.out.println(" Tài Khoản Không Tồn Tại ");
            System.out.println(" Bạn Hãy Đăng Ký Để Sử Dụng");
        }
    }

    public static boolean checkLogin(String account, String password) {
        for (int i = 0; i < UserRepository.userList.size(); i++) {
            if (UserRepository.userList.get(i).getName().equals(account) && UserRepository.userList.get(i).getPassword().equals(password)) {
                return true;
            }
        }
        return false;
    }
}
