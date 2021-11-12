package Login;

import repository.UserRepository;
import utils.CsvUtils;

import java.awt.*;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class MenuLogin {
    public static void main(String[] args) throws IOException, InterruptedException {
        List<String> read = CsvUtils.read("C:\\MD2\\autofb\\Data\\RegisteredAccount.csv");
        for (String str : read) {
            String arr[] = str.split(",");
            User user = new User(arr[0],arr[1]);
            UserRepository.userList.add(user);
        }
        int choice = -1;
        while (choice != 0) {
            Scanner scanner = new Scanner(System.in);
            System.out.println(" -------------------- Tool Thanh Tân   ------------------- ");
            System.out.println("| 1.Đăng Nhập                                            |");
            System.out.println("| 2.Đăng Ký                                              |");
            System.out.println("| 3.Thoát                                                |");
            System.out.println(" -------------------- Cảm Ơn bạn ----------------------- ");
            choice = scanner.nextInt();

            switch (choice){
                case 1:
                   Login.login();
                    break;
                case 2:
                    Register.register();
                    break;
                case 3:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Mời Bạn Nhập Lại");
            }
        }
    }
}
