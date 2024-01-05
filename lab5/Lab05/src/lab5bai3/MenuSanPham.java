package lab5bai3;

import java.util.Scanner;

public class MenuSanPham {
    public void menu() {
        Scanner sc = new Scanner(System.in);
        AppQuanLySanPham appSp = new AppQuanLySanPham();

        do {

            System.out.println("----------------------------------");
            System.out.println("Menu chuc nang cua chuong trinh: ");
            System.out.println("1. Nhap danh sach san pham");
            System.out.println("2. Hien thi danh sach san pham");
            System.out.println("3. Sap xep danh sach giam dan");
            System.out.println("4. Tim va xoa san pham nhap tu ban phim");
            System.out.println("5. Tinh gia trung binh cua cac san pham");
            System.out.println("6. thoat chuong trinh");
            System.out.println("Lua chon cua ban: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    appSp.nhapSanPham();
                    break;
                case 2:
                    appSp.xuatSanPham();
                    break;

                case 3:
                    appSp.chucNang3();
                    break;
                case 4:
                    appSp.timVaXoaSanPham();
                    break;

                case 5:
                    appSp.xuatGiaTrungBinh();
                    break;

                case 6:
                    System.out.println("OUT and Finish Program LAB5_3!!!");
                    System.exit(0);
                    break;
            }
        } while (true);
    }

}
