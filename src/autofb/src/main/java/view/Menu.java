package view;

import org.openqa.selenium.interactions.SendKeysAction;
import services.ReadCSVFile;
import utils.Random;
import vn.pvtt.auto.fb.Main;


import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    public static void show() throws InterruptedException {
        Main main = new Main();

        ArrayList arraylike = new ArrayList();
        arraylike = ReadCSVFile.read("C:\\MD2\\autofb\\src\\main\\java\\vn\\pvtt\\auto\\fb\\LinkLikeFb.csv");
        ArrayList arrayfollow = new ArrayList();
        arrayfollow = ReadCSVFile.read("C:\\MD2\\autofb\\src\\main\\java\\vn\\pvtt\\auto\\fb\\LinkFollowFb.csv");
        ArrayList arrayyeuthich = new ArrayList();
        arrayyeuthich = ReadCSVFile.read("C:\\MD2\\autofb\\src\\main\\java\\vn\\pvtt\\auto\\fb\\LinkLikeFb.csv");
        ArrayList arraythuongthuong = new ArrayList();
        arraythuongthuong = ReadCSVFile.read("C:\\MD2\\autofb\\src\\main\\java\\vn\\pvtt\\auto\\fb\\LinkLikeFb.csv");
        ArrayList arrayhaha = new ArrayList();
        arrayhaha = ReadCSVFile.read("C:\\MD2\\autofb\\src\\main\\java\\vn\\pvtt\\auto\\fb\\LinkLikeFb.csv");
        ArrayList arraybuon = new ArrayList();
        arraybuon = ReadCSVFile.read("C:\\MD2\\autofb\\src\\main\\java\\vn\\pvtt\\auto\\fb\\LinkLikeFb.csv");
        ArrayList arrayphanno = new ArrayList();
        arrayphanno = ReadCSVFile.read("C:\\MD2\\autofb\\src\\main\\java\\vn\\pvtt\\auto\\fb\\LinkLikeFb.csv");
        ArrayList arrayWow = new ArrayList();
        arrayWow = ReadCSVFile.read("C:\\MD2\\autofb\\src\\main\\java\\vn\\pvtt\\auto\\fb\\LinkLikeFb.csv");
        ArrayList<String> arraycomment = new ArrayList();
        arraycomment = ReadCSVFile.read("C:\\MD2\\autofb\\src\\main\\java\\vn\\pvtt\\auto\\fb\\comment.csv");
        System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
        int choice = -1;
        while (choice != 0) {
            Scanner scanner = new Scanner(System.in);
            System.out.println(" ----------------------- Tool Tự Tương Tác Facebook ----------------");
            System.out.println("| 1. Like Facebook                                                  |");
            System.out.println("| 2. Yêu Thích Facebook                                             |");
            System.out.println("| 3. Thương Thương Facebook                                         |");
            System.out.println("| 4. Haha Facebook                                                  |");
            System.out.println("| 5. Buồn Facebook                                                  |");
            System.out.println("| 6. Wow Facebook                                                   |");
            System.out.println("| 7. Phẫn Nộ Facebook                                               |");
            System.out.println("| 8. Follow Facebook                                                |");
            System.out.println("| 9. comment Facebook                                                |");
            System.out.println("| 10. Thoát                                                          |");
            System.out.println(" --------------------------- Cảm ơn Bạn đã Ghé ---------------------");
            System.out.print("Bạn Hãy Chọn : ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    main.init();
                    main.Account();
                    for (int i = 1; i < arraylike.size(); i++) {
                        main.Like((String) arraylike.get(i));
                    }
                    break;
                case 2:
                    main.init();
                    main.Account();
                    for (int i = 1; i < arrayyeuthich.size(); i++) {
                        main.yeuthichlike((String) arrayyeuthich.get(i));
                    }
                    break;
                case 3:
                    main.init();
                    main.Account();
                    for (int i = 1; i < arraythuongthuong.size(); i++) {
                        main.thuongthuonglike((String) arraythuongthuong.get(i));
                    }
                    break;
                case 4:
                    main.init();
                    main.Account();
                    for (int i = 1; i < arrayhaha.size(); i++) {
                        main.hahalike((String) arrayhaha.get(i));
                    }
                    break;
                case 5:
                    main.init();
                    main.Account();
                    for (int i = 1; i < arraybuon.size(); i++) {
                        main.Buonlike((String) arraybuon.get(i));
                    }
                    break;

                case 6:
                    main.init();
                    main.Account();
                    for (int i = 1; i < arrayWow.size(); i++) {
                        main.Wowlike((String) arrayWow.get(i));
                    }
                    break;
                case 7:
                    main.init();
                    main.Account();
                    for (int i = 1; i < arrayphanno.size(); i++) {
                        main.phannolike((String) arrayphanno.get(i));
                    }
                    break;
                case 8:
                    main.init();
                    main.Account();
                    for (int i = 0; i < arrayfollow.size(); i++) {
                        main.follow((String) arrayfollow.get(i));
                    }
                    break;
                case 9:
                    main.init();
                    main.Account();
                    main.comment("https://www.facebook.com/codegymhue/photos/a.1298663180575461/1301518510289928/", arraycomment.get(Random.randomIdxArr(arraycomment)));
                    break;
                case 10:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Mời Bạn Nhập Lại");
            }
        }
    }

}



