package lab5bai2;

import java.util.Scanner;

public class MenuSinhVien {
    SinhVien sv = new SinhVien();

    public void Menu() {
        int choose = 0;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("===========MENU===========");
            System.out.println("1. Nhap danh sach ho ten");
            System.out.println("2. Xuat danh sach ho ten");
            System.out.println("3. Xuat danh sach ngau nhien");
            System.out.println("4. Sap xep giam dan va xuat danh sach");
            System.out.println("5. Tim va xoa ho ten nhap tu ban phim");
            System.out.println("6. Ket thuc");

            choose = sc.nextInt();
            switch (choose) {
                case 1:
                    sv.nhap();
                    break;
                case 2:
                    sv.xuat();
                    break;
                default:

            }
        } while (choose != 0);

    }
}